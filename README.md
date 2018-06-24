# Spring RESTful Application
A RESTful API Application built on Spring Framework. When running this application a command line runner will be excetuted in order to populate the in-memory SQL database with entries from a JSON file. The resource of RESTful API is **People**, which will response JSON structure data based on endpoints.


## Technologies used:
  * Language: **Java**
  * Development Kit: **Java SDK 8**
  * Framework: **Spring Framework**
  * Build Automation Tool: **Gradle**
  * Database: **H2 (In-Memory)**
  * ORM: **Hibernate**
  * Service API: **REST**
  * IDE: **IntelliJ IDEA (Ultimate Edition)**

## Getting Started
These instructions will get you a copy of the project up and running on you local machine for development and testing purposes.

## Local Installation
### Prerequisites
  #### Required
   * Java SDK 8
   * Java IDE (IntelliJ IDEA recommended)
   * Git
  #### Optional
   * Gradle
   * Spring Boot

**Note: If you want to use command line to run application and tests you need to install softwares mentioned in Optional above**

## Installing and Running Application
Please follow carefully step by step instructions below in order to get the app up and running locally.

1. Open Terminal

2. Get a clone of this project in local machine:
 ```
https://github.com/arionitmisini/Spring-RESTful.git
 cd Spring-RESTful
 ```
* Running application with IDE:
   - Open this project folder with any Java IDE (IntelliJ IDEA recommended)
   - Run the application using IDE Run Option
 ## API Documentation 
 **Localhost base URL: http://localhost:8080**
 
 **Note: In order to test API RESTful Endpoints you need to use an HTTP Client Tool, Postman is recommended**
 
 ### Show People
 Returns json list of people data
 
 * **URL**
 
    /people/
    
 * **Method:**
    
    `GET`
    
 * **Success Response:**

    * **Code**: 200
    
      **Content:** 
      
      ```json
      [{
            "id": 1,
            "name": "Keeley",
            "lastname": "Boscko",
            "gender":"female"
            "ipAdress": "192.168.22.43"
            
       }, {...}]
       ```
  
### Show Person
Returns json of a specific Person data based on its id
 
* **URL**
 
   /person/:id
   
*  **URL Params**

   **Required:**
 
   `id=[integer]`
    
* **Method:**
    
   `GET`
    
* **Success Response:**

   * **Code**: 200
    
     **Content:** 
      
     ```json
    {
            "id": 1,
            "name": "Keeley",
            "lastname": "Boscko",
            "gender":"female",
            "ipAdress": "192.168.22.43"
            
       }
      ```

### Create Person

  Create new Person from json structure with values sent in body of request

* **URL**

  /person/

* **Method:**

  `POST`

* **Body Data (application/json)**

  ```json
    {
            "id": 1,
            "name": "Keeley",
            "lastname": "Boscko",
            "gender":"female",
            "ipAdress": "192.168.22.43"
            
       }
   ```
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
    
    ```json
     {
            "id": 1,
            "name": "Keeley",
            "lastname": "Boscko",
            "gender":"female",
            "ipAdress": "192.168.22.43"
            
       }
      
### Update Person Data

  Updates the values sent as json in request body of a specific Person by its ID, returns updated json Person structure

* **URL**

  /person/:id

* **Method:**

  `PUT`
  
* **URL Params**

  **Required:**
 
  `id=[integer]`

* **Body Data (application/json)**

  ```json
     {
            "id": 1,
            "name": "Keeley",
            "lastname": "Boscko",
            "gender":"female",
            "ipAdress": "192.168.22.43"
            
       }
   ```
* **Success Response:**

  * **Code:** 200 <br />
    **Content:** 
    
    ```json
    {
            "id": 1,
            "name": "Keeley",
            "lastname": "Boscko",
            "gender":"female",
            "ipAdress": "192.168.22.43"
            
       }
    ```
    
### Delete Person
Deletes Person by its ID and returns a message if deleted successfully
 
* **URL**
 
   /person/:id
    
* **Method:**
    
   `DELETE`
   
* **URL Params**

  **Required:**
 
  `id=[integer]`
    
* **Success Response:**

   * **Code**: 200

     **Content:** 

     ```json
         {"message": "Person successfully deleted!"}
      ```
 
### Sort People Data
Returns json of people data sorted naturally by its name
 
* **URL**
 
   /person/sort/name
    
* **Method:**
    
   `GET`
    
* **Success Response:**

   * **Code**: 200

     **Content:** 

     ```json
     [{
            "id": 1,
            "name": "Keeley",
            "lastname": "Boscko",
            "gender":"female",
            "ipAdress": "192.168.22.43"
            
       }, {...}]
      ```

 ## Author
  * **Arionit Misini**
