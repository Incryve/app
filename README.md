# Rental Database Project
  Hey there, fellow coders! 👋   
  
  Welcome to my latest adventure in the tech world! 
  This project is a unique blend of skills and passions, 
  combining my journey through the **Code Girls First SQL Database** course 
  with the backend mastery gained through a **Santander Group scholarship in Java Backend by Dio**.

  I've taken the database I created for a film equipment rental service 
  and am supercharging it with a Java Spring Boot API, using Gradle as my trusty build tool. 
  And guess what? Then I'm taking my baby to the cloud with Railway!

# API URL
  Visit to check my progress! <br>
  https://rental-app.up.railway.app/swagger-ui/index.html#

  **Next updates**: Payment & Rentals business logic. 

  Please, feel free to test and send me any comments or suggestions!  
  
# UML class diagram

```mermaid
erDiagram
    CUSTOMER ||--o{ RENTAL : "has"
    EQUIPMENT ||--o{ RENTAL : "has"
    RENTAL ||--o{ PAYMENT : "has"
    EQUIPMENT ||--o{ EQUIPMENTLOG : "has"

    CUSTOMER {
        int customerID PK
        string firstName
        string lastName
        string email
        string phone
    }

    EQUIPMENT {
        int equipmentID PK
        string equipmentName
        string equipmentType
        decimal rentalRate
    }

    RENTAL {
        int rentalID PK
        int customerID FK
        int equipmentID FK
        date rentalDate
        date dueDate
        date returnDate
    }

    PAYMENT {
        int paymentID PK
        int rentalID FK
        decimal amount
        date paymentDate
    }

    EQUIPMENTLOG {
        int logID PK
        int equipmentID FK
        string logText
        date logDate
    }

```
