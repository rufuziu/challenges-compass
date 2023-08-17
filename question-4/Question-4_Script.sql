DROP TABLE Person;

DROP TABLE Address;



CREATE TABLE Address (
  addressId SERIAL PRIMARY KEY ,
  zip VARCHAR(16) NOT NULL,
  street VARCHAR(128) NOT NULL,
  complement VARCHAR(64) ,
  neighborhood VARCHAR(32) NOT NULL,
  city VARCHAR(16) NOT NULL,
  state VARCHAR(16) NOT NULL,
  country VARCHAR(32) NOT NULL
);

CREATE TABLE Person (
  person_id SERIAL PRIMARY Key ,
  name VARCHAR(64) NOT NULL,
  age INTEGER ,
  phone VARCHAR(16) ,
  height DECIMAL(1,2) ,
  email VARCHAR(128) NOT NULL ,
  cpf VARCHAR(11) NOT NULL ,
  birthday DATE NOT NULL ,
  address_id INTEGER REFERENCES Address(addressId)
);