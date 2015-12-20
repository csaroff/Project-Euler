const _ = require('lodash');
const DEPTH = 1000000;

const triangle =   _.range(DEPTH).map(n => n*(n+1)/2);
const pentagonal = _.range(DEPTH).map(n => n*(3*n-1)/2);
const hexagonal =  _.range(DEPTH).map(n => n*(2*n-1));
const intersection = _.intersection(triangle, pentagonal, hexagonal);

console.log(intersection);
