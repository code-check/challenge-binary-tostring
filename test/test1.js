var
    app = require('../app.js'),
    assert = require('chai').assert;

describe('toBinaryString', function () {
    it('1 should be 1', function () {
        assert.equal('1', app.toBinaryString(1));
    });

    it('2 should be 10', function () {
        assert.equal('10', app.toBinaryString(2));
    });

    it('3 should be 11', function () {
        assert.equal('11', app.toBinaryString(3));
    });

    it('4 should be 100', function () {
        assert.equal('100', app.toBinaryString(4));
    });
});