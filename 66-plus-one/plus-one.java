class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb=new StringBuilder();
        for(int ele:digits) {
            sb.append(ele);
        }
        java.math.BigInteger num = new java.math.BigInteger(sb.toString());
        num = num.add(java.math.BigInteger.ONE);
        String str=num.toString();
        int res[]=new int[str.length()];
        for(int i=0;i<res.length;i++) {
            res[i]=Character.getNumericValue(str.charAt(i));
        }
        return res;
    }
}