using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using student;
namespace studentTesting
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestName()               //testing for method Name
        {
           Program obj = new Program();
            String name = obj.getName();      //getting name from class student
            Assert.IsNotNull(name);
        }
        [TestMethod]
        public void TestId()                    //testing for method Id
        {
            Program obj = new Program();
            int Id = obj.getId();              //getting Id from class student
            Assert.IsNotNull(Id);
        }
        [TestMethod]
        public void TestPercentage()              //testing for method Percentage
        {
            Program obj = new Program();
            double ans = obj.getPercentage();    //getting Percentage from class student
            Assert.IsTrue(ans<=40);
        }
        [TestMethod]
        public void TestSkills()                //testing for method Skills
        {
            Program obj = new Program();
           String ans = obj.getSkills();       //getting Skills from class student
            Assert.Equals ("java",ans);
        }
      



    }
}
