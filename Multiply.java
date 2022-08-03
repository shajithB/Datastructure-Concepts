public class Multiply 
{
public static void main(String[] args) 
{
       		int a = 2, b = 3;
        		int c = 3, d = 2;
        		int[][] firstMatrix = { {3, -2, 5}, {3, 0, 4} };
        		int[][] secondMatrix = { {2, 3}, {-9, 0}, {0, 4} };
int[][] product = multiplyMatrices(firstMatrix, secondMatrix, a, b, d);
displayProduct(product);
    	}

public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix, int a, int b, int d) 
{
        		int[][] product = new int[a][d];
        		for(int i = 0; i < a; i++) 
{
            			for (int j = 0; j < d; j++) 
{
                			for (int k = 0; k < b; k++) 
{
                    				product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                			}
            			}
       	 	}
return product;
    	}
public static void displayProduct(int[][] product) 
{
        		System.out.println("Product of two matrices is: ");
        		for(int[] row : product) 
{
            			for (int column : row) 
{
                			System.out.print(column + "    ");
            			}
            			System.out.println();
        		}
    	}
}