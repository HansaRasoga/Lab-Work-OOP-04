# These are the questions of lab sheet 4
Lab Sheet 4 

Classes and Objects - Review
 
1. Create a Java class “Name” to represent the name of a person with three data fields 
“First_Name”, “Middle_Name” and “Last_Name”.
  Three constructors (including default constructor)
  A method name “input” that takes first, middle and last name from a keyboard.
  A method name “toString” that returns the full name of the person.
  A method name “myName” that return name with initials (Hint: Assume that, first name 
“Imalka” Middle name “Sadeesh” and last name “Perera” then “myName” method return 
“I.S. Perera” )


 2. Create a class called Invoice that a hardware store might use to represent an invoice for an item sold 
at the store. An Invoice should include four pieces of information as instance variables a part 
number (type String), a part description (type String), a quantity of the item being purchased (type 
int) and a price per item (double). Your class should have following constructors to initializes the 
four instance variables. 
 No-argument constructor (initializes part number to null, part description to null, quantity 
of the item to 0 and price per item to 0.0).
  Constructor: part number supplied, part description, quantity of the item and price per item 
to default values.
  Constructor: part number and part description are supplied, quantity of the item and price 
per item to default values.
  Constructor: part number, part description, quantity of the item and price per item 
are supplied.
  Constructor: another Invoice2 object supplied.


 3. Create a class called Employee that includes three instance variables: a first name (type String), a 
last name (type String) and a monthly salary (double). Your class should have following constructors 
to initializes the three instance variables. 
 No-argument constructor (initializes first name to null, last name to null and monthly 
salary to 0.0).
  Constructor: first name supplied, last name and monthly salary to default values.
  Constructor: first name and last name are supplied, monthly salary to 0.0.
  Constructor: first name, last name and monthly salary are supplied.
  Constructor: another Emp2 object supplied.
 4. Create a class called Date that includes three instance variables: a month (type int), a day (type int) and a year 
(type int). Your class should have following constructors to initializes the three instance variables. 
 No-argument constructor: initializes the three instance variables to zero.
  Constructor: month, day and year are supplied.
  Provide a method display Date that displays the month, day and year separated by forward slashes
 (/).
