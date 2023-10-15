public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> A) {

        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {
                if (i != j) {
                    int temp = A.get(i).get(j);
                    A.get(i).set(j, A.get(j).get(i));
                    A.get(j).set(i, temp);
                }
            }
        }
       
        for (int i = 0; i < A.size() / 2; i++) {
            for (int j = 0; j < A.size(); j++) {
                int temp = A.get(j).get(i);
                A.get(j).set(i, A.get(j).get(A.size() - 1 - i));
                A.get(j).set(A.size() - 1 - i, temp);
            }
        }
    }
}
