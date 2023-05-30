/**
 * 455. Assign Cookies
 * 
 * Assume you are an awesome parent and want to give your children some cookies.
 * But, you should give each child at most one cookie.
 * Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
 * and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content.
 * Your goal is to maximize the number of your content children and output the maximum number.
 */

class AssignCookies {
    public int findContentChildren(int[] theG, int[] theS) {
        Arrays.sort(theG);
        Arrays.sort(theS);

        int contentChildren = 0;
        // Pointer for greed factors
        int i = 0; 
        // Pointer for cookie sizes
        int j = 0; 

        while (i < theG.length && j < theS.length) {
            if (theS[j] >= theG[i]) {
                contentChildren++;
                i++;
                j++;
            } else
                j++;
        }
        return contentChildren;
    }
}
