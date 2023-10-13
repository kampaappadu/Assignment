// Sample array
let numbers = [4, 2, 8, 1, 6, 3];

// Sort the array in descending order
numbers.sort(function(a, b) {
  return b - a;
});

console.log(numbers); // Output: [8, 6, 4, 3, 2, 1]
