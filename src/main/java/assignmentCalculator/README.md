# YEAR OF BIRTH CALCULATOR:
Version 01

This is a simple Java program to calculate the birth year of a person based on their age and provide unit tests for the validation methods. When the program runs then it will ask the user their name and age through scanner, after that the user will see a greeting message to see their birth year.



## Getting Started
To create this program we use a main method alongside the multiple custom methods so that, the main method becomes more concise and focuses on the overall flow of the program, while the custom methods handle specific tasks.
On the other hand, it includes 2 classes with this ReadMe file; one of them is dedicated for unit tests when the other includes the custom methods and main method.


### Prerequisites
These instructions will help you set up and run the project on your local machine.

-Programming language: Java 18 or higher

-Idea: IntelliJ(Community or Ultimate version) or Eclipse

-JUnit 4.13 for running unit tests

-JUnit-Jupiter to provide assertions for tests,the dependency is right below.

" <dependency>
<groupId>org.junit.jupiter</groupId>
<artifactId>junit-jupiter-api</artifactId>
<version>5.8.2</version>
<scope>test</scope>
</dependency> "

-Dependencies(external libraries) can be stored in Pom.xml file.



### How to run

1.Clone the repository:
"https://github.com/Mavi7965/JavaAssignment.git"

2.Run your commands or use handy buttons from your Ide.

3.Run the program via "YearOfBirthCalculator" class. To see the test cases and the results of them, run the "UnitTests" class.



### Installing
- Java JDK 18 or Higher
- IntelliJ IDEA
- JUnit and JUnit-Jupiter

### Test Cases
The program was tested with valid inputs including boundray values for age data.
It was also tested valid age and invalid(empty) name.
Additionally, it was tested with invalid ages when the name is occured clearly.

1. Calculate the year of the birth with valid age and valid name:
- age: 25, name:john, actual result is expected one which is : "Hello john! You were born in 1998"
- age:130, name:yeliz, actual result is expected. The greatest boundray value was tested with this. 
- age:1, name:jack, actual result is expected. The smallest boundray value was tested.
2. The system does not calculate with invalid age.
-age: 150, name:john, actual result is expected which is the error on console:Invalid input. Please enter a valid integer. The user can see "enter your age" until the right input which is between 1-130.

3. The system does not calculate the age with empty name.
-age:65, name:"" , the system gives us the error "Name cannot be empty.Enter a valid name." and quit the program. 


#### License
xxx

#### Contact information
Software Tester : Hicret Gazioglu
linkedIn account: https://www.linkedin.com/in/hicret-gazioglu/


