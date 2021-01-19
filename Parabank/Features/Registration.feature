
@registrationTest
Feature: Check User Registration Form.


Scenario Outline:Successful registration on parabank website.
Given User is on home page of parabank website.
Then User clicks on register link to fill the form.
Then User enters "<firstname>" and "<lastname>" and "<address>" and "<city>" and "<state>" and "<zipcode>" and "<phonenumber>" and "<ssn>" and "<username>" and "<password>" and "<confirmpassword>" to register.
Then User retrieves the message displayed using "<id>".
Examples:
| firstname | lastname | address | city | state | zipcode | phonenumber | ssn | username | password | confirmpassword | id |
| Rahul | Dravid | charminar | hyderabad | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | Rahudl@171914 | rahul123 | rahul123 | 1 |
| Rahul | Dravid | charminar | hyderabad | Andhra pradesh | 845796 | | 321-654-9870 | Rahudl@1719144 | rahul123 | rahul123 | 2 |


Scenario Outline:Unsuccessful registration on parabank website.
Given User is on home page of parabank website.
Then User clicks on register link to fill the form.
Then User enters "<firstname>" and "<lastname>" and "<address>" and "<city>" and "<state>" and "<zipcode>" and "<phonenumber>" and "<ssn>" and "<username>" and "<password>" and "<confirmpassword>" to get error message.
Then User retrieves the error message displayed using "<id>".
Examples:
| firstname | lastname | address | city | state | zipcode | phonenumber | ssn | username | password | confirmpassword | id |
| | Dravid | charminar | hyderabad | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | Rahul@123 | rahul123 | rahul123 | 1 |
| Rahul | | charminar | hyderabad | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | Rahul@123 | rahul123 | rahul123 | 2 |
| Rahul | Dravid | | hyderabad | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | Rahul@123 | rahul123 | rahul123 | 3 |
| Rahul | Dravid | charminar | | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | Rahul@123 | rahul123 | rahul123 | 4 |
| Rahul | Dravid | charminar | hyderabad | | 845796 | 9876543210 | 321-654-9870 | Rahul@123 | rahul123 | rahul123 | 5 |
| Rahul | Dravid | charminar | hyderabad | Andhra pradesh | | 9876543210 | 321-654-9870 | Rahul@123 | rahul123 | rahul123 | 6 |
| Rahul | Dravid | charminar | hyderabad | Andhra pradesh | 845796 | 9876543210 | | Rahul@123 | rahul123 | rahul123 | 7 |
| Rahul | Dravid | charminar | hyderabad | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | | rahul123 | rahul123 | 8 |
| Rahul | Dravid | charminar | hyderabad | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | Rahul@123 | | rahul123 | 9 |
| Rahul | Dravid | charminar | hyderabad | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | Rahul@123 | rahul123 | | 10 |
| Rahul | Dravid | charminar | hyderabad | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | Rahul@123 | rahul123 | rahul 12 | 11 |
| aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  | Dravid | charminar | hyderabad | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | Rahul@1123 | rahul123 | rahul123 | 12 |
| Rahul | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | charminar | hyderabad | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | Rahul@1223 | rahul123 | rahul123 | 13 |
| Rahul | Dravid | aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | hyderabad | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | Rahul@1323 | rahul123 | rahul123 | 14 |
| Rahul | Dravid | charminar | aaaaaaaaaaaaaaaaaaaaaaaa | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | Rahul@1423 | rahul123 | rahul123 | 15 |
| Rahul | Dravid | charminar | hyderabad | aaaaaaaaaaaaaaaaaaaaaaaa | 845796 | 9876543210 | 321-654-9870 | Rahul@123 | rahul123 | rahul123 | 16 | 
| Rahul | Dravid | charminar | hyderabad | Andhra pradesh | aaaaaaaaaaaaaaaaaaaaaa | 9876543210 | 321-654-9870 | Rahul@1253 | rahul123 | rahul123 | 17 |
| Rahul | Dravid | charminar | hyderabad | Andhra pradesh | 845796 | aaaaaaaaaaaaaaaaaaaaaa | 321-654-9870 | Rahul@1623 | rahul123 | rahul123 | 18 |
| Rahul | Dravid | charminar | hyderabad | Andhra pradesh | 845796 | 9876543210 | aaaaaaaaaaaaaaaaaaaa | Rahul@1723 | rahul123 | rahul123 | 19 |
| Rahul | Dravid | charminar | hyderabad | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | aaaaaaaaaaaaaaaaaaaaaa | rahul123 | rahul123 | 20 |
| Rahul | Dravid | charminar | hyderabad | Andhra pradesh | 845796 | 9876543210 | 321-654-9870 | Rahul@1283 | aaaaaaaaaaaaaaaaaaaaaa | aaaaaaaaaaaaaaaaaaaaaa | 21 |

