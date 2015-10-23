<?php

require_once 'app/binary.php';

class hiddenTest extends PHPUnit_Framework_TestCase
{
    function testToString()
    {
        for ($i = 1; $i < 10000; $i += 9) {
            $this->assertEquals(base_convert($i, 10, 2), toString($i));
        }
    }
}