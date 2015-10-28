package binary

import "testing"
import "strconv"

func TestHiddenToString(t *testing.T) {
	for i := int64(0); i < 10000; i += 9 {
		exp := strconv.FormatInt(i, 2)
		act := ToString(i)
		if exp != act {
			t.Errorf("found %v expected %v", act, exp)
		}
	}
}