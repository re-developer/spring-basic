DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id                   INT AUTO_INCREMENT  PRIMARY KEY,
    userid               VARCHAR(128) NOT NULL,
    name                 VARCHAR(128) NOT NULL,
    birth                VARCHAR(8)   NOT NULL,
    password             VARCHAR(256) NOT NULL,
    since                DATE         NOT NULL,
    date_of_modification DATE         NOT NULL
);

INSERT INTO user (userid, name, birth, password, since, date_of_modification) VALUES ('dev001', '이뚜엉', '20201019', 'qwer432!', now(), now());
INSERT INTO user (userid, name, birth, password, since, date_of_modification) VALUES ('dev002', '이뚜엉', '20201019', 'qwer432!', now(), now());
INSERT INTO user (userid, name, birth, password, since, date_of_modification) VALUES ('dev003', '이뚜엉', '20201019', 'qwer432!', now(), now());
INSERT INTO user (userid, name, birth, password, since, date_of_modification) VALUES ('dev004', '이뚜엉', '20201019', 'qwer432!', now(), now());

