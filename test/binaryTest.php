<?php

require_once 'app/binary.php';

class binaryTest extends PHPUnit_Framework_TestCase
{
    function testToString() {
        $this->assertEquals("0", toString(0));
        $this->assertEquals("1", toString(1));
        $this->assertEquals("10", toString(2));
        $this->assertEquals("11", toString(3));
        $this->assertEquals("100", toString(4));
    }
}