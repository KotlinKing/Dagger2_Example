# Dagger2 Example

## What is Dependency Injection
Dependency Injection (DI) is a design pattern that allows the creation of dependent objects outside of
a class and provides those objects to a class in different ways. Using DI, we move the creation and
binding of the dependent objects outside of the class that depends on them.

In other words a class will be doing the task which it is made for instead of creating objects which is
needed in the process.

## Problems which Dependency Injection solves...

* Unit testing is not possible.
* Code is not extensible.
* Breaks Single Responsibility principle.
* Lifetime of objects (Reusability not possible.)

## How to Achieve Dependency Injection
* Manual Dependency Injection
* Automated Dependency Injection

There are two ways to do DI
* Constructor Dependency Injection
* Field Dependency Injection


## What is Daagger2 ?
* Dagger is a fully static, compile-time dependency injection framework.
* Compile time checking is performed if Dagger can create the requqired objects.
* Annotation Based.

In other words:

* Dagger will behave as a system for us to create required objects.
* Dagger will help us inject these objects.
* Dagger will manage the lifetime of the objects.
* Dagger will help us write manageable code.
