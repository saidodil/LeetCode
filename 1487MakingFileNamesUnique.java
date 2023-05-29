/**
 * DESCRIPTION
 * 
 * Given an array of strings names of size n.
 * You will create n folders in your file system such that, at the ith minute, you will create a folder with the name theNames[i].
 * Since two files cannot have the same name, if you enter a folder name that was previously used,
 * the system will have a suffix addition to its name in the form of (k), where, k is the smallest positive integer such that the obtained name remains unique.
 * Return an array of strings of length n where ans[i] is the actual name the system will assign to the ith folder when you create it.
 */

class 1487MakingFileNamesUnique {
 public String[] getFolderNames(String[] theNames) {
        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < theNames.length; i++) {
            if (m.containsKey(theNames[i])) {
                int k = m.get(theNames[i]);
                while (m.containsKey(theNames[i] + "(" + k + ")"))
                    k++;
                m.put(theNames[i], k + 1);
                theNames[i] = theNames[i] + "(" + k + ")";
            }
            m.put(theNames[i], 1);
        }
        return theNames;
    }
}
