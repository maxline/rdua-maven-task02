Task 2.
Create project with 2 types of test - ITest and simple test. 
Configure maven to run build without ITests. 
Create profile to run build with ITests, only ITests.
Use maven properties to configure ITest name convention.


Maven command examples:
mvn clean install 
mvn clean install -P execute-itests
