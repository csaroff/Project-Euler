'use strict';

const _ = require('lodash');
const sieve = require('sieve');
const Combinatorics = require('js-combinatorics');

console.log('retrieving primes');
const primes = sieve(7654321);
console.log('finished retrieving primes');
console.log(primes.slice(1,3));

console.log('retrieving pandigitals');
const pandigitals = Combinatorics.permutation([1, 2, 3, 4, 5, 6, 7]).map(elem => parseInt(elem.join('')));
console.log('finished retrieving pandigitals');
console.log(pandigitals.slice(1, 3));

const result = _.intersection(primes, pandigitals);
console.log(result);
