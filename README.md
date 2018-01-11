SOLID principles
----------------

 

-   S — Single responsibility principle

-   O — Open closed principle

-   L — Liskov substitution principle

-   I — Interface segregation principle

-   D — Dependency Inversion principle

 

**Single Responsibility Principle - SRP**

A class should have one and only one reason to change, meaning that a class
should only have one job.

 

**Open-Closed Principle - OCP**

Objects or entities should be open for extension, but closed for modification.

-   open for extension means that we should be able to add new features or
    components to the application **without breaking** existing code

-   closed for modification means that **we should not introduce breaking
    changes to existing functionality**, because that would force you to
    refactor a lot of existing code.

 

**Liskov Substitution Principle - LSP**

Let q(x) be a property provable about objects of x of type T. Then q(y) should
be provable for objects y of type S where S is a subtype of T.

-   every subclass/derived class should be substitutable for their base/parent
    class

-   a subclass should override the parent class methods in a way that does** not
    break functionality from a client’s point of view**

 

**Interface Segregation Principle - ISP**

A client should never be forced to implement an interface that it doesn’t use or
clients shouldn’t be forced to depend on methods they do not use.

 

**Dependency Inversion Principle - DIP**

Entities must depend on abstractions not on concretions. It states that the high
level model must not depend on the low level module, but they should depend on
abstractions.

-   from a functional point of view, these containers and injection concepts can
    be solved with a simple higher order function, or hole-in-the-middle type
    pattern which are built into the language

 
