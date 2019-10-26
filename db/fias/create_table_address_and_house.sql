CREATE TABLE address
(
    aoguid     varchar(256) NOT NULL COMMENT 'Уникальный номер',
    aoid       varchar(256) COMMENT 'Уникальный номер',
    citycode   varchar(256) NOT NULL COMMENT 'Код региона',
    formalname varchar(256) NOT NULL COMMENT 'Формальное название',
    nextid     varchar(256) COMMENT 'Формальное название',
    offname    varchar(256) NOT NULL COMMENT 'Неофициальное название',
    parentguid varchar(256) COMMENT 'Уникальный номер',
    previd     varchar(256) COMMENT 'Уникальный номер',
    shortname  varchar(256) NOT NULL COMMENT 'Короткое название'

);

CREATE TABLE house
(
    aoguid    varchar(256) NOT NULL COMMENT 'Уникальный номер',
    houseguid varchar(256) NOT NULL COMMENT 'Уникальный номер дома',
    housenum  varchar(256) COMMENT 'Формальное название'
);