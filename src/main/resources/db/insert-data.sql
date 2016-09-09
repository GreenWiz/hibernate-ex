INSERT INTO car VALUES (1, 'A001AA99');
INSERT INTO car VALUES (2, 'T128AP39');
INSERT INTO car VALUES (3, 'X118OX43');
INSERT INTO car VALUES (4, 'T001TA39');

INSERT INTO users VALUES (1, 'mkyong', 'mkyong@gmail.com' ,1);
INSERT INTO users VALUES (2, 'alex', 'alex@yahoo.com',2);
INSERT INTO users VALUES (3, 'joel', 'joel@gmail.com',3);
INSERT INTO users VALUES (4, 'lol', 'joel@gmail.com',4);

INSERT INTO country VALUES (1, 'china');
INSERT INTO country VALUES (2, 'australia');

INSERT INTO app VALUES (1, 'cherno', 'title1');
INSERT INTO app VALUES (2, 'sovetsk', 'title2');

INSERT INTO datafile VALUES (1, 'one', load_file('c:\Users\iokishev.NII-PS\projects\hibernate-example\src\main\resources\db\data.xml'));
INSERT INTO datafile VALUES (2, 'two', load_file('c:\Users\iokishev.NII-PS\projects\hibernate-example\src\main\resources\db\data.xml'));

