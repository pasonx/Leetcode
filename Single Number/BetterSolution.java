int singleNumber(int A[], int n) {
  // A xor 0 => A
  int result = 0;
  //for all the element in the array appear twice except the target one
  //a ^ b ^ b = a
  for (int i = 0; i<n; i++) {
      result ^=A[i];
  }
  return result;
}
