using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using PairProg;
namespace StudentTest
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Student student = new Student();

            Assert.AreEqual(student.getName(), "");
            Assert.AreEqual(student.getId(), 0);
            Assert.AreEqual(student.getPercentage(), 0);
            Assert.AreEqual(student.getSkills(), null);
            Assert.AreEqual(student.getSkillsSize(), 0);
        }

        [TestMethod]
        public void TestMethod2()
        {

            Student student = new Student("Anurag Basu", 13, 75);

            Assert.AreEqual(student.getName(), "Anurag Basu");
            Assert.AreEqual(student.getId(), 13);
            Assert.AreEqual(student.getPercentage(), 75);
            Assert.AreEqual(student.getSkills(), null);
            Assert.AreEqual(student.getSkillsSize(), 0);
        }

        [TestMethod]
        public void TestMethod3()
        {

            string[] skills = new string[3];
            skills[0] = "C";
            skills[1] = "C++";
            skills[2] = "Java";
            Student student = new Student("Anurag Basu", 13, 75, skills, 3);

            Assert.AreEqual(student.getName(), "Anurag Basu");
            Assert.AreEqual(student.getId(), 13);
            Assert.AreEqual(student.getPercentage(), 75);
            Assert.AreEqual(student.getSkills(), skills);
            Assert.AreEqual(student.getSkillsSize(), 3);
        }
    }
}
