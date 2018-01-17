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

-   a subclass should override the parent class methods in a way that does\*\*
    not break functionality from a client’s point of view\*\*

 

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

 

Creational Design Patterns
--------------------------

 

### Builder

The builder pattern is an object creation software design pattern. Unlike the
abstract factory pattern and the factory method pattern whose intention is to
enable polymorphism, **the intention of the builder pattern is to find a
solution to the telescoping constructor anti-pattern citation needed that occurs
when the increase of object constructor parameter combination leads to an
exponential list of constructors**. Instead of using numerous constructors, the
builder pattern uses another object, a builder, that receives each
initialization parameter step by step and then returns the resulting constructed
object at once.

 

Motivation

-   some objects are simple and can be created in a single constructor call

    -   other objects require a lot of ceremony to create(eg. StringBuilder)

    -   having an object with 10 constructor arguments is not productive

    -   instead, opt for piecewise construction

     

    When piecewise object construction is complicated, provide an API for doing
    it succinctly.

 

 

 

 

### Factory

In class-based programming, the factory method pattern is a creational pattern
that **uses factory methods to deal with the problem of creating objects without
having to specify the exact class of the object that will be created**. This is
done by creating objects by calling a factory method—either specified in an
interface and implemented by child classes, or implemented in a base class and
optionally overridden by derived classes—rather than by calling a constructor.

 

 

### Abstract Factory

The abstract factory pattern **provides a way to encapsulate a group of
individual factories that have a common theme without specifying their concrete
classes**.In normal usage, the client software creates a concrete implementation
of the abstract factory and then uses the generic interface of the factory to
create the concrete objects that are part of the theme. The client doesn't know
(or care) which concrete objects it gets from each of these internal factories,
since it uses only the generic interfaces of their products. This pattern
separates the details of implementation of a set of objects from their general
usage and relies on object composition, as object creation is implemented in
methods exposed in the factory interface.

 
