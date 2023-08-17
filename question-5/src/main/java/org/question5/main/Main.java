package org.question5.main;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Projections;
import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.question5.documents.Address;
import org.question5.documents.Person;

import static com.mongodb.client.model.Filters.eq;

public class Main {
  public static void main(String[] args) {

    String uri = "mongodb://localhost:27017";
    try (MongoClient mongoClient = MongoClients.create(uri)) {
      MongoDatabase database = mongoClient.getDatabase("spring");

      //Creating addresses
      MongoCollection<Document> persons =
              database.getCollection("persons");
      try {
        InsertOneResult result = persons.insertOne(
                new Person()
                        .append("_id", new ObjectId())
                        .append("name", "Iury de Mattos")
                        .append("age", "27")
                        .append("phone", "+5542999254823")
                        .append("height", 1.83)
                        .append("email", "iury.mattos.pb@compass.com.br")
                        .append("cpf", "09834667930")
                        .append("birthday", "1995-11-07")
                        .append("address",
                                new Address()
                                        .append("zip", "84015030")
                                        .append("street", "Rua Paranágua, 5")
                                        .append("complement", "Bloco 1, AP32")
                                        .append("neighborhood", "Vila Estrela")
                                        .append("city", "Ponta Grossa")
                                        .append("state", "Paraná")
                                        .append("country", "Brazil")
                        )

        );
        System.out.println("Success! Inserted document id: " + result.getInsertedId());
      } catch (MongoException me) {
        System.err.println("Unable to insert due to an error: " + me);
      }
      /*
      //POST
      MongoCollection<Document> collection = database.getCollection("persons");
      try {
        InsertOneResult result = collection.insertOne(new Document()
                .append("_id", new ObjectId())
                .append("name", "Iury")
                .append("hobbies", Arrays.asList("Play WoW", "Guitar", "Programming")));
        System.out.println("Success! Inserted document id: " + result.getInsertedId());
      } catch (MongoException me) {
        System.err.println("Unable to insert due to an error: " + me);
      }
*/
      //GET
      MongoCollection<Document> collection = database.getCollection("persons");
      Bson projectionFields = Projections.fields(
              Projections.include("name", "address"));

      Document doc = collection.find(
                      eq("name", "Iury de Mattos"))
              .projection(projectionFields)
              .first();

      if (doc == null) {
        System.out.println("No results found.");
      } else {
        System.out.println(doc.toJson());
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }
}