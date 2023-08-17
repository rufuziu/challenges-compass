package org.question5.documents;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonId;

import java.util.Date;

public class Person extends Document {
  @BsonId
  private String id;
  private String name;
  private int age;
  private String phone;
  private float height;
  private String email;
  private String cpf;
  private Date birthday;
  private Address address;
}
