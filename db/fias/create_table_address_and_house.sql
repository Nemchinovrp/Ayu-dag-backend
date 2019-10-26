CREATE TABLE address
(
    aoguid     varchar(150) NOT NULL COMMENT 'Уникальный номер',
    aoid     varchar(150)  COMMENT 'Уникальный номер',
    citycode varchar(150) NOT NULL COMMENT 'Код региона',
    formalname varchar(150) NOT NULL COMMENT 'Формальное название',
    nextid varchar(150) COMMENT 'Формальное название',
    offname    varchar(150) NOT NULL COMMENT 'Неофициальное название',
    parentguid    varchar(150)  COMMENT 'Уникальный номер',
    previd    varchar(150)  COMMENT 'Уникальный номер',
    shortname  varchar(150) NOT NULL COMMENT 'Короткое название'

);

CREATE TABLE house
(
    aoguid     varchar(150) NOT NULL COMMENT 'Уникальный номер',
    housenum varchar(150)  COMMENT 'Формальное название',
    postalcode varchar(150) COMMENT 'Код региона'
);