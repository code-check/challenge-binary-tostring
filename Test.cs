using NUnit.Framework;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SimpleBinaryChallenge
{
    [TestFixture]
    public class Test
    {
        [Test]
        public void TestBinary()
        {
            Assert.AreEqual("10", Main.ToBinary(2));
            Assert.AreEqual("1111111", Main.ToBinary(127));
            Assert.AreEqual("10000100", Main.ToBinary(132));
        }
    }
}
