package org.question5.documents;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonId;

public class Address extends Document {
  @BsonId
  private String id;
  private String street;
  private String complement;
  private String neighborhood;
  private String city;
  private String state;
  private String country;
}
