class Matrix {
  double [][]data;
  int rows, cols;
  
  public Matrix (int rows, int cols) {
    data = new double[rows][cols];
    this.rows = rows;
    this.cols = cols;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        data[i][j] = Math.random() * 2 - 1;
      }
    }
  }
  
  public void add (double scaler) {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        this.data[i][j] += scaler;
      }
    }
  }
  
  public void add (Matrix m) {
    if (cols != m.cols || rows != m.rows) {
      System.out.println("Shape Mismatch");
      return;
    }
    
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        this.data[i][j] += m.data[i][j];
      }
    }
  }
  
  public static Matrix subtract (Matrix a, Matrix b) {
    Matrix temp = new Matrix (a.rows, a.cols);
    for (int i = 0; i < a.rows; i++) {
      for (int j = 0; j < a.cols; j++) {
        temp.data[i][j] = a.data[i][j] - b.data[i][j]
        }
    }
    return temp;
  }
}
