package binary

import "testing"

func TestToString(t *testing.T) {
	if ToString(0) != "0" {
		t.Errorf("found '%v' expected '0'", ToString(0))
	}
	if ToString(1) != "1" {
		t.Errorf("found '%v' expected '1'", ToString(1))
	}
	if ToString(2) != "10" {
		t.Errorf("found '%v' expected '10'", ToString(2))
	}
	if ToString(3) != "11" {
		t.Errorf("found '%v' expected '11'", ToString(3))
	}
	if ToString(4) != "100" {
		t.Errorf("found '%v' expected '100'", ToString(4))
	}
}