from nose.tools import assert_equal
from binary import to_string

def test_to_string():
    for i in range(1, 1000):
        assert_equal(to_string(i), "{0:b}".format(i))