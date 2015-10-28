package binary
//BEGIN_CHALLENGE
import "strconv"
//END_CHALLENGE

func ToString(i int64) string {
//BEGIN_CHALLENGE
	return strconv.FormatInt(i, 2)
//END_CHALLENGE
}