USE aswin3;

-- Create a table with a primary key
CREATE TABLE ExampleTable1 (
    ID INT PRIMARY KEY,
    Name VARCHAR(50),
    Age INT
);  
-- Inserting data into ExampleTable3 with unique constraint
INSERT INTO ExampleTable3 (ID, Name, Age) VALUES (1, 'Michael', 35); -- This will succeed
INSERT INTO ExampleTable3 (ID, Name, Age) VALUES (2, 'Alice', 25); -- This will fail due to duplicate ID
CREATE TABLE ExampleTable2 (
    ID INT PRIMARY KEY,
    ExampleTable1_ID INT,
    FOREIGN KEY (ExampleTable1_ID) REFERENCES ExampleTable1(ID)
);


INSERT INTO ExampleTable2 (ID, ExampleTable1_ID) VALUES (101, 1);
INSERT INTO ExampleTable2 (ID, ExampleTable1_ID) VALUES (102, 2);
UPDATE ExampleTable1 SET Age = 31 WHERE ID = 1;
ALTER TABLE ExampleTable2;
DELETE FROM ExampleTable2 WHERE ID = 2;


ADD CONSTRAINT FK_ExampleTable1_ID FOREIGN KEY (ExampleTable1_ID) REFERENCES ExampleTable1(ID);
