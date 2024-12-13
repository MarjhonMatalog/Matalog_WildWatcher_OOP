I.PROJECT OVERVIEW
=
Wildwatcher is a system that allows users to track animal sightings. This is a system where users can input information such as the animal name, location, date, and the description of the animal's behavior. Furthermore it’s a user friendly system which allows a wide range of individuals to tell their observations about a specific or certain animal.

II.APPLICATION OF OOP PRINCIPLES
=
1.ENCAPSULATION
  
  The oop encapsulation principle is used in protecting the user data.In the UserAccount class the username and password are set in private. Wherein the username and password can only be accessed by public methods such as geUsername() and verifyPassword(). This also applies in Animal Sigthing class is that also encapsulates data which can only be accessed by public method getDetails().

2.INHERITANCE

  The oop inheritance principle is used to avoid the code to repeat over and over . This is used in AdminUser class that extends to UserAccount class. This allows the admin(the admin is the user) to inherit the basic functionalities of a user. Then we have the UserDashboard that extends abstract Dashboard class. Wherein allows the classes to share common behavior even if the users are customizing their actions.

3.POLYMORPHISM
   
   Polymorphism is used to enable the user to behave differently based on the method called. This principle is used in the AdminUser and UserAccount class which use the same method called showDashboard(), wherein the behavior is different but they share the same method. Moreover the system doesn'y know whether its the AdminUser or UserAccount that's being called, what the sytem do is figure it out when the system is running.

4.ABSTRACTION
   
   Abstraction is used to simplify the complex logic behind the system. Wherein the specific implementation of the methods displayMenu() and handleUserInput() where this abstract methods is left in the subclasses, such as UserDashboard class. Furthermore this will allow us to create different types of code for dashboard with minimal duplication of codes. Well the login and registration fuctionality is abstracted into methods that will help interacting with the basic data structures.
   
III.DETAILS OF THE SDG IN THE PROJECT
=
SDG 15: LIFE ON LAND

The system falls under SDG 15 because it’s a wildlife
monitoring system that enables the user to monitor the animal's behavior overtime. 
It will help people to raise awareness about the behavior of a animal, 
proving wildlife researcher and rangers a valuable data. Therefore the data that’s been collected 
will provide users information that they needed to know about the patterns and behavior of an animal. 
So to sum things up the system is a simple way that will help anyone in volunteering in wildlife tracking.

IV.INSTRUCTIONS IN RUNNING THE SYSTEM
=
 1. Ensure that Java is installed on your machine. The system is developed using Java, so you need a Java Development Kit (JDK) installed.

 2. Clone or download the project.

 3. Setup the project and make sure that the class are in the same IDE.
 
 4. Run the program.

 5. When the program runs it will give you three options which you can choose:
    
     1.register - will allow the user to create an account.

     2.login - will let the user log in to the account and continue to UserDashboard.

     3.exit - exit the program.

6. Once logged in the user will be then directed to the UserDashboard, this has 4 options:
     1. Add Animal Sighting - this will allow the user to report an animal sighting by providing the system details such as animal name, location, date, and a description.
     2. View Sightings - allows the users to view sightings.
     3. Delete Sightings - allows the user to delete a sighting.
     3. Logout - Will let you return in the main menu.
