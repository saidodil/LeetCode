/**
 * 766. Toeplitz Matrix
 * 
 * Given an m x n matrix, return true if the matrix is Toeplitz.
 * Otherwise, return false.
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.
 */

class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] theMatrix) {
        int rows = theMatrix.length;
        int cols = theMatrix[0].length;

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (theMatrix[i][j] != theMatrix[i - 1][j - 1])
                    return false;
            }
        }
        return true;
    }
}
