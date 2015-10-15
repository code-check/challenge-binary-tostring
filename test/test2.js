var
    app = require('../app.js'),
    assert = require('chai').assert;

describe('toBinaryString', function () {
    it('validate 1 to 10000 by steps of 10', function (done) {
        for (var i = 10; i <= 10000; i += 10)
            assert.equal(i.toString(2), app.toBinaryString(i));
        done();
    });
});