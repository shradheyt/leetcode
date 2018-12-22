class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet();
        for(String email:emails) {
            int i = email.indexOf('@');
            String local = email.substring(0,i);
            String domain = email.substring(i);
            
            if(local.contains("+")) {
                local = local.substring(0,local.indexOf('+'));
            }
            local = local.replaceAll(".","");
            set.add(local+domain);
        }
        return set.size();
    }
}