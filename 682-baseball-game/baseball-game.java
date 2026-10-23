class Solution {
    public int calPoints(String[] operations) {
        List<Integer> scores = new ArrayList<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int n = scores.size();
                scores.add(scores.get(n - 1) + scores.get(n - 2));
            } 
            else if (op.equals("D")) {
                scores.add(2 * scores.get(scores.size() - 1));
            } 
            else if (op.equals("C")) {
                scores.remove(scores.size() - 1);
            } 
            else {
                scores.add(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return sum;
    }
}