# mentiTest
Menti Test


This project is to test the API response for the Question and results generated to Backend service, and JSON stores the results and renders as HTML in results page(this part is yet to be completed).
Focused on it as a Tester approach

Tools and language tradeoffs,
1) Spring boot - host a local server
2) Selenium - Opensource for browser and API tests
3) TestNG framework - Trigger tests
4) RestAssured - for API testing

In this code, 
  1) Test the Questions API response is 200
  2) Test the result API response is 200
  3) Generated a JSON with random Integer(as the value in the results response is static, generated random INT for values to change everytime)
  4) Tested this in loop for 10 times within 10 seconds to see if it responsive
  5) Sample HTML file created (yet to integrate MVC)
  6) Open google chrome and test if local host is opening - Result page is yet to be implemented (didnt focus on Automating the UI page elements as it is static local host)
  
 Steps to Run, 
 1) Maven clean
 2) Maven Install
 3) Start MentiResultsTestApplication.java and have the local host 8080 ready
 4) Run driverInit.java
 5) Check for the response is 200 for Question and reslut API
 6) Check the JSON is generated everytime with a new value
 7) Check if local host is loading in chrome
 8) Yet to complete this step --- Pull the JSON and load values in local host server to show the results page 
 9) Check the results in index.html in SureFire Reports in Target folder 


Further what can be done,
1) Integrate Extentreport to show more detailed report with screenshots and more validations
2) Introduce Load testing using jmeter
3) Run and build it in Azure DevOps to automate CI/CD and do a health check trigger on daily basis
4) Send mail or message to Team members on every Test Run and attach report

 Cheers!
 
