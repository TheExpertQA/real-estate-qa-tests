# Manual Test Case: Invalid Login – Practice Automation Testing

**Test Case ID:** TC_LOGIN_002  
**Title:** Verify error message for invalid login  
**Test Environment:** https://practicetestautomation.com/practice-test-login/  
**Precondition:** None

---

## Test Steps:
1. Navigate to the Login Page 
2. Enter invalid username and password
3. Click the **Submit**  button
-- 

## Expected Result:
- User should **not** be logged in
- Error message should appear:
  > "Your username is invalid!"

---

## Test Data:
| Username   | Password   |
|------------|------------|
| wronguser  | wrongpass  |

---

## Priority: Medium
**Status:** To be Executed
