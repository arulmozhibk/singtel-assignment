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
