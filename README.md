   <i> Maersk Technical Test </i>
  
  <b> The task </b>
  
  The website has a flight ticket booking functionality. Can book a flight as any other flight booking website by searching available flight using the source and destination and then finalising the booking by entering the passenger details.
  
  You should create an automated test to verify that the booking functionality and verify the confirmation id.
  
  Challenge: Identify all the possible test scenarios for the booking but automate only few priority scenario’s (possible for you in 2- 3 hours) which are critical to be passed so that the software product can be deployed to the production.
  
  <b> How to set up </b> 
  
  In order to run the challenge the latest version of intellij is needed. The latest version of chromedriver is needed in order to use the selenium feature. The link is provided:  https://chromedriver.chromium.org
  
   You need to make sure the version of chrome and the chromedriver is up to date. The relative paths would have to be changed in order ot run the program. The needed dependencies are all within the pom file. 
   
   Plugins required would be cucumber for java. 
  
   <b>  What I was able to complete </b> 
   
  Within the allocated time frame I was able to find the critical path of the website. The critical path was going from the selecting the destination to completing the form in its entirety. The code follows the suers journey from the selection of the locations to the confirmation page. I had managed to complete the critical path using BDD using the gherkin syntax as well as doing simple tests for the critical path initially. If I was to have more time I would have explored the scenarios in more detail. However exhaustive testing is impossible so I would have to analyse which of the features are truly the most important.  
