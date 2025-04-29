AUT: Software Testing Board's Luma website, URL:https://magento.softwaretestingboard.com/

PROJECT STRUCTURE:
- Page classes:
  1. MagentoCreateAccount
  2. MagentoHomePage
  3. MagentoItem
  4. MagentoShipping
  5. MagentoSignInPage

- Test classes:
  1. BaseTestClass
  2. MagentoHomePage_testClass
  3. MagentoItem_testClass
  4. MagentoShipping_testClass
  5. MagentoSignIn_testClass

TEST SCENARIOS:
  1. Successful and unsuccessful (already existing account) registration -> MagentoHomePage_testClass
  2. Sign In with an existing account -> MagentoSignIn_testClass
  3. Choosing an item and adding it to shopping cart, delete option, proceeding to checkout -> MagentoItem_testClass
  4. Filling shipping form and placing order -> MagentoShipping_testClass

TECHNOLOGIES AND TOOLS:
  1. Java
  2. Selenium WebDriver
  3. POM (Page Object Model)
  4. TestNG
  5. Page Factory
  6. Eclipse IDE
  7. Maven



