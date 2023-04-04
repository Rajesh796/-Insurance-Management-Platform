# -Insurance-Management-Platform

In the given Assignement we are informed to prepare an Insurance Management Platform by using spring boot and java.
I have Built this application in spring tool suite(sts).
Dependencies i have added while creating a spring starter project using STS named as n Insurance Management Platform 
Spring Web
Spring Data
Database:Aparchy

CLIENT MODEL:
we have been assigned to create three sub-applications i.e. Client,Insurance Policy, Claim.
first i have created Client api by declaring a class called ClientModel
In client model i have declared datatypes  client id , name , data of birth, address,contact information after creating the properties of the client model i have declared the getters and setter for the properties by using source method in STS or we can declare by using @getter and @setter anotations.
I also have declared the constructor by using source method in STS passing the properties as the arguments.This class will act as blue print for how the client data must be viewed.
After done with client model i have declared the repository class for the Client model where our CRUD operations for the Clientmodel will be in.
I have created an interface named ClientRepository extending CRUDRepositories where it comes handy without actual implementation of methods but provided with already implemented methods like find(),findall(),save(),ExitsById();
After i have done with Repository class for the client model i have created a service class named ClientService marked with @service annotation.
i have injected the cleintrepository as repo using @autowired annotation.
In My client service class i have implemented the methods getallclients(),getclientbyid(),updateclientbyid(),addcleint(),deleteclientbyid() by using inbuild methods that are provided by the  crud repository which we have injected as repo

API CALLS:

GETALLCLIENTS:

After i have done with Cleint service i have created Cleintcontroller class which we are telling the spring to lookup into this class when the api is having calls.for the spring to lookup into the controller class we are marking the class with @RestController annotaion
for the client to get the all cleints data by enetering "GET /api/clients" i have used @RequestMapping annotation look upto the url if its same the cleint can have all the clients data;

GETCLIENTBYID:(@getmapping or reuqestmethod.get)

when the admin/cient wants to see about a particular client by id by using "GET /api/clients/{id}" in our @RequestMapping annotation where we have defined @Pathvariable where it extracts the data right from entered url i.e. Id.
if the id that is entered is matched with our id in the database he can view about the client.
           ------->Exception Handling(if the id doest not matches with our ids in the database)
           i have declared an exception class when there is an exception call from the spring i have marked this class with @ControllerAdvice annotation so whenever there is an exception raised by the controller class the spring can lookup to this file for exception handing which extends runtime exception
           for ids that doesnot match with our ids in the database i have declared an exception with @ExceptionHandler(value="NoElementFoundException.class) where it returns the new ResponseEntity with"there is no client with that id" and Httpstatus.Bad           
POST:(@postmapping or requestmethod.post)

if the admin wants to add new client entering the details of the client in the url "POST /api/clients" if the id and name is not nutnull then the client data is added to the database.
when the data is being recieved by the post we use @requestbody annootation and we provide the blueprint on how our data should i.e. ClientModel
           ------>Exception Handling(if the name and id is null)
           then the method that defined with @ExceptionHandler with value(Emptystackexception .class) will throw exception with new response entity(" data cannot be empty") and httpstatus.bad
PUT:(@putmapping or requestmethod.put)

if the client wants to update the cleint data by id in the url("PUT /api/clients/{id}") if the id that is entered is matched with our id in the database the client data can bed added successfully. 
            ------->Exception Handling(if the id doest not matches with our ids in the database)
                    then the method that defined with @ExceptionHandler with value(Noelementfoundexception .class) will throw exception with new response entity(" id doest not found") and httpstatus.bad
DELETE:(@Deletemapping or requestmapping.delete)

if the admin wants delete the clientdata inthe url"DELETE /api/clients/{id}" if the id matches with our id in the database then client data will be deleted.
             ------->Exception Handling(if the id doest not matches with our ids in the database)
                    then the method that defined with @ExceptionHandler with value(Noelementfoundexception .class) will throw exception with new response entity(" id doest not found") and httpstatus.bad
                    
                    
                                        spring                      @restcontroller                   @reuqestmapping                                 service(@autowired)                             repo(@Autowired                             
                    "url in browser" -------------->Controllerclass------------------>"Requesmapping"------------------->"methodcallingincontroller"----------------------> "method in service class"---------------------->"Repositorymethods"----------------->Success
                                                                                            |                                                                                                                                         |
                                                                                            |                                                                                                                                         |
                                                                                            |                                                                                                                                         |
                                                                                            |                                                                                                                                         |
                                                                                    "not valid url"                                                                                                                          "exception" ---------------->Exceptionclass--------->exceptionhandler
                                                                                     
   
   
 INSURANCE POLCIY:
 
 Second we have to create Insurance Policy Model with properties like policy number, type, coverage amount, premium, start date, and end date.we are binding the client with the id number.
 I have created the Insurance Model with the given properties
 In client model i have declared datatypes   id , policy number , type, coverage amount ,premium,start date ,end date after creating the properties of the Insurance model i have declared the getters and setter for the properties by using source method in STS or we can declare by using @getter and @setter anotations.
I also have declared the constructor by using source method in STS passing the properties as the arguments.This class will act as blue print for how the policy data must be viewed.
After done with Insurancepolicy model i have declared the repository class for the Insurancepolicy model where our CRUD operations for the Insurance policy model will be in.
I have created an interface named PolicyRepository extending CRUDRepositories where it comes handy without actual implementation of methods but provided with already implemented methods like find(),findall(),save(),ExitsById();
After i have done with Repository class for the Insurance model i have created a service class named PolciyService marked with @service annotation.
i have injected the Policyrepository as repo using @autowired annotation.
In My Policy service class i have implemented the methods getallpolicies(),getpolicybyid(),updatepolicybyid(),addpolicy(),deletepolicybyid() by using inbuild methods that are provided by the  crud repository which we have injected as repo

API CALLS:

GETALLPLOCIES:

After i have done with POLICY service i have created policy controller class which we are telling the spring to lookup into this class when the api is having calls.for the spring to lookup into the controller class we are marking the class with @RestController annotaion
for the client to get the all policies data by enetering "GET /api/policies" i have used @RequestMapping annotation look upto the url if its same the cleint can have all the ploicies data;


GETPOLICYBYID:(@getmapping or reuqestmethod.get)

when the admin/cient wants to see about a particular policy by id by using "GET /api/policies/{id}" in our @RequestMapping annotation where we have defined @Pathvariable where it extracts the data right from entered url i.e. Id.
if the id that is entered is matched with our id in the database he can view about the policy.
           ------->Exception Handling(if the id doest not matches with our ids in the database)
           i have declared an exception class when there is an exception call from the spring i have marked this class with @ControllerAdvice annotation so whenever there is an exception raised by the controller class the spring can lookup to this file for exception handing which extends runtime exception
           for ids that doesnot match with our ids in the database i have declared an exception with @ExceptionHandler(value="NoElementFoundException.class) where it returns the new ResponseEntity with"there is no client with that id" and Httpstatus.Bad 
           
POST:(@postmapping or requestmethod.post)

if the admin wants to add new policy entering the details of the policies in the url "POST /api/policies" if the id and policytype is not nutnull then the policy data is added to the database.
when the data is being recieved by the post we use @requestbody annootation and we provide the blueprint on how our data should i.e. Insurancepolicy model
           ------>Exception Handling(if the name and poilcytype is null)
           then the method that defined with @ExceptionHandler with value(Emptystackexception .class) will throw exception with new response entity(" data cannot be empty") and httpstatus
           
PUT:(@putmapping or requestmethod.put)

if the client wants to update the policy data by id in the url("PUT /api/policies/{id}") if the id that is entered is matched with our id in the database the policy data can bed added successfully. 
            ------->Exception Handling(if the id doest not matches with our ids in the database)
                    then the method that defined with @ExceptionHandler with value(Noelementfoundexception .class) will throw exception with new response entity(" id doest not found") and httpstatus.bad           
DELETE:(@Deletemapping or requestmapping.delete)

if the admin wants delete the policydata inthe url"DELETE /api/policies/{id}" if the id matches with our id in the database then policy data will be deleted.
             ------->Exception Handling(if the id doest not matches with our ids in the database)
                    then the method that defined with @ExceptionHandler with value(Noelementfoundexception .class) will throw exception with new response entity(" id doest not found") and httpstatus.bad


CLAIM:
third we will be creating the claim model with the given properties like id,claim number,description, claim date, and claim status
i have created the Claim model with the given properties.
In Claim model i have declared the variables like Id,claim number,description, claim date, and claim status after creating the properties of the claim model i have declared the getters and setter for the properties by using source method in STS or we can declare by using @getter and @setter anotations.
After done with Claim model i have declared the repository class for the claim model where our CRUD operations for the  Claim model will be in.
I have created an interface named ClaimRepository extending CRUDRepositories where it comes handy without actual implementation of methods but provided with already implemented methods like find(),findall(),save(),ExitsById();
After i have done with Repository class for the Claim model i have created a service class named ClaimService marked with @service annotation.
i have injected the Claimrepository as repo using @autowired annotation.
In My Claim service class i have implemented the methods getallclaims(),getclaimbyid(),updateclaimbyid(),addclaim(),deleteclaimbyid() by using inbuild methods that are provided by the  crud repository which we have injected as repo

API CALLS:

GETALLCLAIMS:

After i have done with Claim service i have created claim controller class which we are telling the spring to lookup into this class when the api is having calls.for the spring to lookup into the controller class we are marking the class with @RestController annotaion
for the client to get the all claims data by enetering "GET /api/claims" i have used @RequestMapping annotation look upto the url if its same the cleint can have all the claims data;

GETCLAIMBYID:(@getmapping or reuqestmethod.get)

when the admin/cient wants to see about a particular claim by id by using "GET /api/claims/{id}" in our @RequestMapping annotation where we have defined @Pathvariable where it extracts the data right from entered url i.e. Id.
if the id that is entered is matched with our id in the database he can view about the policy.
           ------->Exception Handling(if the id doest not matches with our ids in the database)
           i have declared an exception class when there is an exception call from the spring i have marked this class with @ControllerAdvice annotation so whenever there is an exception raised by the controller class the spring can lookup to this file for exception handing which extends runtime exception
           for ids that doesnot match with our ids in the database i have declared an exception with @ExceptionHandler(value="NoElementFoundException.class) where it returns the new ResponseEntity with"there is no client with that id" and Httpstatus.Bad 
           
POST:(@postmapping or requestmethod.post)

if the admin wants to add new claim entering the details of the claim in the url "POST /api/claim" if the id and claimid is not nutnull then the policy data is added to the database.
when the data is being recieved by the post we use @requestbody annootation and we provide the blueprint on how our data should i.e. Claim model
           ------>Exception Handling(if the name and poilcytype is null)
           then the method that defined with @ExceptionHandler with value(Emptystackexception .class) will throw exception with new response entity(" data cannot be empty") and httpstatus
 
 PUT:(@putmapping or requestmethod.put)

if the client wants to update the claim data by id in the url("PUT /api/claims/{id}") if the id that is entered is matched with our id in the database the claim data can bed added successfully. 
            ------->Exception Handling(if the id doest not matches with our ids in the database)
                    then the method that defined with @ExceptionHandler with value(Noelementfoundexception .class) will throw exception with new response entity(" id doest not found") and httpstatus.bad           
DELETE:(@Deletemapping or requestmapping.delete)

if the admin wants delete the claimdata inthe url"DELETE /api/claims/{id}" if the id matches with our id in the database then policy data will be deleted.
             ------->Exception Handling(if the id doest not matches with our ids in the database)
                    then the method that defined with @ExceptionHandler with value(Noelementfoundexception .class) will throw exception with new response entity(" id doest not found") and httpstatus.bad


Thus our Application will be completed     
we can run our application by using sts and in command prompt with maven 
           
