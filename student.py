class Student:
    def __init__(self, name, Id, percentage = 0, skills = []):
        self.name = name
        self.Id = Id
        self.percentage = percentage
        self.skills = skills
    
    #Getter methods
    
    def get_name(self):
        return self.name

 

    def get_Id(self):
        return self.Id

 

    def get_percentage(self):
        return self.percentage

 

    def get_skills(self):
        return self.skills

 

    #Setter methods
    
    def set_name(self, name):
        self.name = name

 

    def set_percentage(self, perct):
        self.percentage = perct

 

    def set_skill(self, skillsnew):
        self.skills = skillsnew

 

        
class Operation (Student):
    def __init__(self):
        Student.__init__(self,"saurav",1,10,["java"])
    
    #Method to change name of a given object
    def changeName(self, newName):
        self.set_name(newName)

 

    #Method to change name according to user input
    def changeNameUserInput(self):
        newName = input("Enter your new Name")
        self.set_name(newName)

 

     #Method to add upto 5 new skills   
    def addSkills(self,newSkills):
        if newSkills.length < 5:
            newarr = newSkills+ self.skills
            self.set_skill(newarr)
     
