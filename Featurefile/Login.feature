Feature:Login

Scenario: open browser and  enter the test url login page should be displayed,Enter valid Username and valid password
             and click on login button home page should be displayed
             
             
Given Open the browsewr and enter the testURL as "http://facebook.com"
Then Login Page is Displayed
When Enter Valid Username as "vickydadannavar@gmail.com" and valid Password as "9449287423"
And click on Login button
Then Home page should be displayed
             