CREATE TABLE car (
  id         INTEGER PRIMARY KEY,
  plate VARCHAR(30)
);

CREATE TABLE users (
  id         INTEGER PRIMARY KEY,
  name VARCHAR(30),
  email  VARCHAR(50),
  car_id INTEGER FOREIGN KEY REFERENCES car(id)
);

CREATE TABLE country (
  id         INTEGER PRIMARY KEY,
  country VARCHAR(30)
);

CREATE TABLE app (
  id         INTEGER PRIMARY KEY,
  name VARCHAR(30),
  title VARCHAR(30)
);

CREATE TABLE datafile (
  id         INTEGER PRIMARY KEY,
  name VARCHAR(30),
  data BLOB
);



