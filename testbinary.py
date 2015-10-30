from nose.tools import assert_equal
from binary import to_string

def test_to_string():
    assert_equal(to_string(0), "0")
    assert_equal(to_string(1), "1")
    assert_equal(to_string(2), "10")
    assert_equal(to_string(3), "11")
    assert_equal(to_string(4), "100")