# Java

# Design Patterns.

**Design patterns** are solutions to most commonly occurring problems in software design. They are like pre-defined template that could be customized to solve a recurring design problem.

Patterns are often confused with algorithms, because both concepts describe typical solutions to some known problems. 

An analogy to an algorithm is a cooking recipe: both have clear steps to achieve a goal. On the other hand, a pattern is more like a blueprint: you can see what the result and its features are, but the exact order of implementation is up to you.

* **Creational patterns** provide object creation mechanisms that increase flexibility and reuse of existing code.
* **Structural patterns** explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient.
* **Behavioral patterns** take care of effective communication and the assignment of responsibilities between objects.

## Creational Pattern
Deals with thge ways the objects are created
1. Singleton
2. Builder
3. Prototype
4. Factory
5. AbstractFactory

### Singleton Pattern [https://github.com/mgs-in/java/tree/main/designpatterns/src/main/java/org/msgin/design/pattern/singleton]
The primary purpose of a Singleton is to restrict the limit of the number of object creation to only one. This often ensures that there is access control to resources, for example, socket or database connection.

To create a singleton class, we must follow the steps, given below:
1. Ensure that only one instance of the class exists.
2. Provide global access to that instance by
   * Declaring all constructors of the class to be private.
   * Providing a static method that returns a reference to the instance.
   * The instance is stored as a private static variable.

There are two forms of singleton design pattern, which are:

* **Early Instantiation:** The object creation takes place at the load time.
* **Lazy Instantiation:** The object creation is done according to the requirement.
