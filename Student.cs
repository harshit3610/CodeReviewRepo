using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PairProg
{
    public class Student
    {
        string name;
        int id;
        double percentage;
        string []skills;
        int skillsSize;

        public Student()
        {
            name = "";
            id = 0;
            percentage = 0;
            skills = null;
            skillsSize = 0;
        }

        public Student(String name = "", int id = 0, double percentage = 0, string[] skills = null, int skillsSize = 0)
        {
            this.name = name;
            this.id = id;
            this.percentage = percentage;
            this.skills = skills;
            this.skillsSize = skillsSize;
        }

        public void setName(String name)
        {
            this.name = name;
        }
        public void setId(int id)
        {
            this.id = id;
        }
        public void setPercentage(double percentage)
        {
            this.percentage = percentage;
        }
        public void setSkills(string []skills)
        {
            this.skills = skills;
        }
        public void setSkillsSize(int skillsSize)
        {
            this.skillsSize = skillsSize;
        }

        public string getName() { return name; }
        public int getId() { return id; }
        public double getPercentage() { return percentage; }
        public string[] getSkills() { return skills; }
        public int getSkillsSize() { return skillsSize; }


    }
}
