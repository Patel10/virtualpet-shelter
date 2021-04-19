# Virtual Pet Shelter

So, you have some experience under your belt in the care and feeding of a virtual pet. It's time to share that with the community! Time to volunteer! 

Build upon your Virtual Pet project that allows you to care for multiple pets in a virtual pet shelter!

## Details

In our Virtual Pet project, we created a pet from a `VirtualPet` class and set up a game loop for user interaction in `VirtualPetApp` class. For this project, we will be creating a `VirtualPetShelter` class that allows the user to house and care for a collection of pets. The ideal way to organize your code would be to have your `VirtualPetApp` call methods from `VirtualPetShelter` which interact with our `VirtualPet` objects. 

We encourage you to use TDD on this project, but it is not required to attain a passing grade. If you feel trying to incorporate testing would be a barrier to your completing the project before the deadline, forgo it. 

### Example Console Output And User Interaction

```
Thank you for volunteering at Big Al\'s Virtual Pet Shelter and Delicatessen!

This is the status of your pets:

Name	|Hunger	|Thirst	|Boredom
--------|-------|-------|-------
Joey	|83     |34     |23
Johnny	|69     |49     |2
Dee Dee	|39     |18     |88
Tommy	|59     |19     |37

What would you like to do next?

1. Feed the pets
2. Water the pets
3. Play with a pet
4. Adopt a pet
5. Admit a pet
6. Quit

You feed the pets!

This is the status of your pets:

Name	|Hunger	|Thirst	|Boredom
--------|-------|-------|-------
Joey	|73     |39     |28
Johnny	|59     |54     |7
Dee Dee	|29     |23     |93
Tommy	|49     |24     |42
```
Note that after feeding all the pets, the Hunger went down by 10 while Thirst and Boredom went up by 5. In this example, feeding the pet decreased Hunger by 15 while the required tick() method raised Hunger, Thirst, and Boredom by 5. 

#### Example Pet Selection Interaction

```bash
Ok, so you\'d like to play with a pet. Please choose one:

[Joey] 
[Johnny]
[Dee Dee]
[Tommy] 

Which pet would you like to play with?
Tommy

Ok, you play with Tommy.
```
Tommy's Boredom would be lowered, the tick() method effects every pet in the shelter, and the user is returned to the main menu

## Required Tasks to be completed in the order you feel is necessary

### Setup
- [ ] Update the README.md file in your project folder to describe what you've done with your project. No fancy formatting is necessary. Just separate paragraphs with an empty line. (If you'd like to learn more about Markdown formatting, check out the [Github Markdown Guide](https://guides.github.com/features/mastering-markdown/).)

### VirtualPetShelterApp class

- Create a `main` method that…
	- [ ] implements a *game loop*.
	- [ ] asks for user input.
	- [ ] writes output to the console.
	- [ ] calls `VirtualPetShelter`'s `tick` method after each interaction

- Available user interface actions should include (at minimum)…
	- [ ] feeding all the pets
	- [ ] watering all the pets
	- [ ] playing with an individual pet, which should display a list of pet names and descriptions, allowing a user to select one
	- [ ] allow adoption of a pet, which should display a list of pet names and descriptions, allowing a user to select one.  _NOTE: In the past this has been a bit confusing.  Keep in mind you are playing the role of a shelter worker, if a pet is adopted it will be removed from the shelter._
	- [ ] allow intake of a pet, prompting the user for the pet's information, requiring the user to (at minimum) specify name and description

	(*Hint: you can use tab characters ("\t") to align console output in columns.*)

### VirtualPetShelter class

- [ ] include appropriate instance variable(s) to store the pets who reside at the shelter
- [ ] include methods that:
	- [ ] return a `Collection` of all of the pets in the shelter
	- [ ] return a specific `VirtualPet` given its name
	- [ ] allow intake of a homeless pet (adding a pet to the shelter)
	- [ ] allow adoption of a homeless pet (removing a pet from the shelter)
	- [ ] feed all of the pets in the shelter
	- [ ] water all of the pets in the shelter
	- [ ] plays (or performs some other interaction(s)) with an individual pet in the shelter
- [ ] include a `tick` method that calls the `tick` method for each of the pets in the shelter, updating their needs

### VirtualPet class
	
In addition to the requirements from [last week's project](./virtual-pet):
- [ ] include instance variables representing:
	- [ ] name (from the above example, this might be "Tommy")
	- [ ] description (from the above example, this might be "smells like a Stargazer lily fresh with morning dew")
- [ ] include a constructor that accepts a name and description
- [ ] include a constructor that, in addition to name and description, accepts default values for the pet's attributes (hunger, boredom, etc)
- [ ] Do **not** include a default (zero arguments) constructor.
 
### Grading
Your grading will be based on three areas:
- Working Software
- Clean Code
- Test Driven Development (will be assessed but will not required to pass) 

#### Working Software
Working software consists of does the application run and how well you met the requirements.  Of the 30 required tasks above, we need to see 25 complete for this category to be considered PASSING.

#### Clean Code
Clean code deals with how your code is written.  Is it readable, easy to understand, formatted, and not littered with commented out code?   These are the things we will be looking for:

- Keep method chains to a minimum. (Three chained methods in the entire project are permissable.)
- Formatted code - This is the simplest task, use _CTRL + ALT + L_ to have IntelliJ format your code for you.
- Variable and Method Names - Variables and method names should inform the reader what the purpose of the variable or method is.  A `feed()` method that affects the `hunger` field variable in your `VirtualPet` class is an example of good naming.
- If you use descriptive method and variable names, your reliance on comments can be reduced.  And you should never leave blocks of commented out code in your committed code. 


We are looking for adherence to all four of the above principles for this category to be considered PASSING.

#### Test Driven Development 
Should you decide to go with full TDD approach, write your code by writing tests first.  Each public method you write should have a unit test that covers its behavior.  Try to apply the principles of clean code to your test classes. 

## Stretch Tasks

- [ ] Consider any stretch tasks from last week's project that you did not attempt.
- [ ] Keep track of the cleanliness of individual pets' cages and offer an option in the user interface to clean pet cages
- [ ] DNA! In order to give your pets individual character, include as part of each pet's state one or more multipliers for needs so that one pet may become hungrier/thirstier/more bored slower/faster than another pet. (*Tip: you could create a class to encapsulate this.*)
