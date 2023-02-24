-- Задания 7-12




CREATE DATABASE IF NOT EXISTS `human_friends1`;
USE `human_friends1` ;

-- -----------------------------------------------------
-- Table `human_friends1`.`animals`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `human_friends1`.`animals` (
  `id_animal` INT NOT NULL AUTO_INCREMENT PRIMARY KEY
  
);


-- -----------------------------------------------------
-- Table `human_friends1`.`domastic_animals`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `human_friends1`.`domastic_animals` (
  `id_domestic_animal` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `id_animal` INT,  
  INDEX `animal_idx` (`id_animal` ASC) VISIBLE,
     FOREIGN KEY (`id_animal`) REFERENCES `human_friends1`.`animals` (`id_animal`)
);

-- -----------------------------------------------------
-- Table `human_friends1`.`pack_animals`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `human_friends1`.`pack_animals` (
  `id_pack_animal` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `id_animal` INT,
  INDEX `animal_idx` (`id_animal` ASC) VISIBLE,
    FOREIGN KEY (`id_animal`) REFERENCES `human_friends1`.`animals` (`id_animal`)
);

-- -----------------------------------------------------
-- Table `human_friends1`.`dogs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `human_friends1`.`dogs` (
  `id_dog` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `id_domestic_animal` INT,
  `nickname` VARCHAR(45) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  `command` VARCHAR(45) NOT NULL,
  INDEX `domestic_animal_idx` (`id_domestic_animal` ASC) VISIBLE,
    FOREIGN KEY (`id_domestic_animal`) REFERENCES `human_friends1`.`domastic_animals` (`id_domestic_animal`)
);

-- -----------------------------------------------------
-- Table `human_friends1`.`cats`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `human_friends1`.`cats` (
  `id_cat` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `id_domestic_animal` INT,
  `nickname` VARCHAR(45) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  `command` VARCHAR(45) NOT NULL,
  INDEX `domestic_animal_idx` (`id_domestic_animal` ASC) VISIBLE,
    FOREIGN KEY (`id_domestic_animal`) REFERENCES `human_friends1`.`domastic_animals` (`id_domestic_animal`)
);

-- -----------------------------------------------------
-- Table `human_friends1`.`hamsters`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `human_friends1`.`hamsters` (
  `id_hamster` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `id_domestic_animal` INT,
  `nickname` VARCHAR(45) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  `command` VARCHAR(45) NOT NULL,
    INDEX `domestic_animal_idx` (`id_domestic_animal` ASC) VISIBLE,
    FOREIGN KEY (`id_domestic_animal`) REFERENCES `human_friends1`.`domastic_animals` (`id_domestic_animal`)
);

-- -----------------------------------------------------
-- Table `human_friends1`.`horses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `human_friends1`.`horses` (
  `id_horse` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `id_pack_animal` INT,
  `nickname` VARCHAR(45) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  `command` VARCHAR(45) NOT NULL,
    INDEX `pack_animal_idx` (`id_pack_animal` ASC) VISIBLE,
  -- CONSTRAINT `pack_animal`
    FOREIGN KEY (`id_pack_animal`) REFERENCES `human_friends1`.`pack_animals` (`id_pack_animal`)
);

-- -----------------------------------------------------
-- Table `human_friends1`.`camels`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `human_friends1`.`camels` (
  `id_camel` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `id_pack_animal` INT,
  `nickname` VARCHAR(45) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  `command` VARCHAR(45) NOT NULL,
    INDEX `pack_animal_idx` (`id_pack_animal` ASC) VISIBLE,
    FOREIGN KEY (`id_pack_animal`) REFERENCES `human_friends1`.`pack_animals` (`id_pack_animal`)
 );

-- -----------------------------------------------------
-- Table `human_friends1`.`donkeys`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `human_friends1`.`donkeys` (
  `id_donkey` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `id_pack_animal` INT,
  `nickname` VARCHAR(45) NOT NULL,
  `date_of_birth` DATE NOT NULL,
  `command` VARCHAR(45) NOT NULL,
   INDEX `pack_animal_idx` (`id_pack_animal` ASC) VISIBLE,
    FOREIGN KEY (`id_pack_animal`) REFERENCES `human_friends1`.`pack_animals` (`id_pack_animal`)
 );

INSERT INTO dogs (nickname, date_of_birth, command) VALUES
('Milo', '2021-06-12', 'Fetch'),
('Andy', '2022-08-02', 'Fetch'),
('Ace', '2022-12-12', 'Fetch');

-- -----------------------------------------------------
-- Заполнение таблицы `Human_friends`.`cats`
-- -----------------------------------------------------

INSERT INTO cats (nickname, date_of_birth, command) VALUES
('Aber', '2020-03-10', 'Wait'),
('Bardo', '2018-04-02', 'Wait'),
('Cade', '2021-09-15', 'Wait');

-- -----------------------------------------------------
-- Заполнение таблицы `Human_friends`.`hamsters`
-- -----------------------------------------------------

INSERT INTO hamsters (nickname, date_of_birth, command) VALUES
('Corbin', '2021-10-10', 'Run'),
('David', '2022-01-12', 'Run'),
('Ace', '2022-07-25', 'Run');

-- -----------------------------------------------------
-- Заполнение таблицы `Human_friends`.`horses`
-- -----------------------------------------------------

INSERT INTO horses (nickname, date_of_birth, command) VALUES
('Alina', '2021-06-20', 'Trot'),
('Bud', '2022-05-13', 'Trot'),
('Thea', '2017-03-15', 'Trot');

-- -----------------------------------------------------
-- Заполнение таблицы `Human_friends`.`camels`
-- -----------------------------------------------------

INSERT INTO camels (nickname, date_of_birth, command) VALUES
('Carrie', '2021-07-18', 'Stop'),
('Elias', '2016-11-12', 'Stop'),
('Glady', '2000-06-22', 'Stop');

-- -----------------------------------------------------
-- Заполнение таблицы `Human_friends`.`donkeys`
-- -----------------------------------------------------

INSERT INTO donkeys (nickname, date_of_birth, command) VALUES
('Josef', '2011-01-23', 'Go'),
('Luise', '2017-08-12', 'Go'),
('Klaas', '2019-09-19', 'Go');


-- -----------------------------------------------------
-- Удаление таблицы `human_friends1`.`camels`
-- -----------------------------------------------------
DROP TABLE human_friends.camels;

-- -----------------------------------------------------------------------
-- Объединение таблиц `human_friends1`.`horses` и `human_friends1`.`donkeys`
-- -----------------------------------------------------------------------

SELECT * FROM human_friends.horses JOIN human_friends.horses AS newtable;


-- -----------------------------------------------------------------------
-- Объединение всех таблицы в одну, при этом сохраняя поля, указывающие на 
-- прошлую принадлежность к старым таблицам
-- -----------------------------------------------------------------------

CREATE TABLE new_table (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
SELECT  nickname, 
        date_of_birth,
        command,       
        'cats' as old_table
FROM human_friends.cats union 
SELECT  nickname, 
        date_of_birth,
        command, 
        'dogs' as old_table
FROM human_friends.dogs union
SELECT  nickname, 
        date_of_birth,
        command, 
        'hamsters' as old_table
FROM human_friends.hamsters union 
SELECT  nickname, 
        date_of_birth,
        command, 
        'horses' as old_table
FROM human_friends.horses union 
SELECT  nickname, 
        date_of_birth,
        command, 
        'donkeys' as old_table
FROM human_friends.donkeys;

SELECT * FROM new_table;

-- -----------------------------------------------------------------------
--  Создать новую таблицу “молодые животные”, в которую попадут все
-- животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
-- до месяца подсчитать возраст животных в новой таблице
-- -----------------------------------------------------------------------

CREATE TABLE young_animals (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
SELECT  nickname, 
        date_of_birth,
        command,   
        Round((YEAR(CURRENT_DATE()) - YEAR(date_of_birth)) + (MONTH(CURRENT_DATE() - MONTH(date_of_birth)))/10, 2) AS age
FROM human_friends1.new_table
WHERE Round((YEAR(CURRENT_DATE()) - YEAR(date_of_birth)) + (MONTH(CURRENT_DATE() - MONTH(date_of_birth)))/10, 2) > 1
	AND Round((YEAR(CURRENT_DATE()) - YEAR(date_of_birth)) + (MONTH(CURRENT_DATE() - MONTH(date_of_birth)))/10, 2) < 3;