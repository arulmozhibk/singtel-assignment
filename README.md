#Singtel Java Coding Assignment 

A.
1. Can you implement the sing() method for the bird?
    Yes

a. How did you unit test it? 
    Implemented the unit test in BirdTest using junit

b. How did you optimize the code for maintainability?(Ask yourself the same question for all following exercises)
    For maintainability, changed the Animal class as interface and implemented some methods as default, so that we can still provide implementations and also we can override the implementation in bird 

A.1.1
Now, we have 2 special kinds of birds: The Duck and the Chicken... Can you implement them to make their own special sound?
    Yes

A.1.2. 
A duck says: “Quack, quack” b. A duck can swim c. A chicken says: “Cluck, cluck” d. A chicken cannot fly (assumption: its wings are clipped but ignore that)
    Implemented the sing, swim methods in Bird and also overridden the same in Duck and chicken classes.
  
 A.1.3. Now how would you model a rooster? a. A rooster says: “Cock-a-doodle-doo” b. How is the rooster related to the chicken? c. Can you think of other ways to model a rooster without using inheritance? 

    Rooster is a male chicken where Chicken is irrespective to gender. So, we can use the properties of Chicken class in our Rooster class using delegation without implementing the inheritance. 

	Delegation means that we can use the property of another class by creating an object. 
A.1.4. Can you model a parrot? We are specifically interested in three parrots, one that lived in a house with dogs one in a house with cats, the other lived on a farm next to the rooster.
Yes. We can use factory design pattern to let the sub class decide which type of instance to be instantiated. 
A.1.5
a. A parrot living with dogs says: “Woof, woof” b. A parrot living with cats says: “Meow” c. A parrot living near the rooster says: “Cock-a-doodle-doo” d. How do you keep the parrot maintainable? 
By using factory design pattern, If we pass "Dog" , then we can get Dog object and then call the sing() through Dog object.

A.1.6. What if we need another parrot lives near a Duck? Or near a phone that rings frequently?
In future, If we need some more type of instance we can still implement in the factory design pattern.