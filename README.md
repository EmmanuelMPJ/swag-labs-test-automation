# Test Case Project Description

## Objective
The objective of this project is to ensure the quality and correct functionality of the key features of the web application. Test cases have been designed and automated to validate platform access through login and shopping cart management. 
These test cases help identify errors, inconsistencies, and potential improvements in the user experience.

## Test Case Structure

### 1. **CP01 - Login Validation**
This set of tests is aimed at validating user access with valid and invalid credentials.

**Covered Scenarios:**
- **Login with correct credentials:** Verifies that when entering valid credentials, the system allows the user to access the main product module.
- **Login with incorrect credentials:** Verifies that when entering incorrect credentials, the system displays an appropriate error message.

**Associated Tags:** `@Suite`, `@Login`, `@ValidCredentials`, `@InvalidCredentials`

---

### 2. **CP02 - Shopping Cart Validation**
This set of tests aims to verify the behavior of the shopping cart functionality, from product selection to purchase completion.

**Covered Scenarios:**
- **Product list in the cart:** Verifies that the products selected by the user are correctly displayed in the shopping cart.
- **Empty cart:** Verifies that, when no products are selected, the cart appears empty.
- **Complete purchase process:** Validates that, after adding products to the cart, the user can successfully complete the purchase.

**Associated Tags:** `@Suite`, `@ShoppingCart`, `@ShoppingCartList`, `@ShoppingCartEmpty`, `@ShoppingCartProcess`

---

## Tools and Technologies
- **Gherkin:** for defining test scenarios.
- **Cucumber**
- **Serenity bdd 4.1.6:** further versions do not work properly due to web elements initialization issues while using the @FindBy annotation. See more at: [WebElementFacade not getting initialized when using PageFactory](https://github.com/serenity-bdd/serenity-core/issues/3498).

## How to Run the Tests
1. Clone the repository using the command:
   ```bash
   git clone https://github.com/EmmanuelMPJ/swag-labs-test-automation.git
   ```
2. Open the proyect with your IDE.
3. Set up the test environment, this include installing dependencies.
4. Run the test cases running the class Runner on your IDE.
5. Generate serenity report as the following images show.

[![Screenshot-2024-12-12-230325.png](https://i.postimg.cc/4dBVpqfF/Screenshot-2024-12-12-230325.png)](https://postimg.cc/Kk3129gn)

[![Screenshot-2024-12-12-230534.png](https://i.postimg.cc/HkwJQR34/Screenshot-2024-12-12-230534.png)](https://postimg.cc/nXLcxdyC)

[![Screenshot-2024-12-12-230816.png](https://i.postimg.cc/zDwX2KT8/Screenshot-2024-12-12-230816.png)](https://postimg.cc/Thw6pyk4)

[![Screenshot-2024-12-12-231120.png](https://i.postimg.cc/wMDVLFrt/Screenshot-2024-12-12-231120.png)](https://postimg.cc/BPQHG54s)

the report will show something like this:

[![Screenshot-2024-12-12-231232.png](https://i.postimg.cc/GtnPLGpb/Screenshot-2024-12-12-231232.png)](https://postimg.cc/8JwfwFWY)

---
# Autor
[<img src="https://avatars.githubusercontent.com/u/168949963?v=4" width=115><br><sub>Emmanuel Paternina</sub>](https://github.com/EmmanuelMPJ)

