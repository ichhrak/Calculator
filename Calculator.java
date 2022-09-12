/**********************Q2-Devoir2 ITI1521*********/

class Calculator {
  private double first, second;
  private String oP;

  Calculator() {
  }

  void operation(String str) {
      first = second; // garde la 1ere operande
      second = 0; // initialise la 2eme
      oP = str;

  }

  void add() {
      operation("+"); //addition
  }

  void subtract() {
      operation("-"); // soustraction

  }

  void multiply() {
      operation("*"); // multiplication
  }

  void divide() {
      operation("/"); // division
  }

  void factorial() {
      operation("!"); // factoriel
  }

  void pow() {
      operation("pow"); // puissance
  }

  void rootSquare() {
      operation("sqrt"); // racine carré
  }

  void nepLog() {
      operation("ln"); // logarithme neperien
  }



  void compute() {

      switch (oP) { //distinction de cas
          case "+": // on accede a la case "+"
              second = first + second;
              break;
          case "-":
              second = first - second;
              break;
          case "*":
              second = first * second;
              break;
          case "/":

              second = first / second;
              break;
          case "!":
              second= Math.sqrt(2*Math.PI*second)*Math.pow((second/2.718),second)*(1+(1/(12*second)));
              break;
          case "pow":
              second = Math.pow(first, second);
              break;
          case "sqrt":
              second = Math.sqrt(second);
              break;

          case "ln":
              second = Math.log(second);
              break;

          default:
              break;

      }
  }

  void clear() { // on reinitialise les valeurs et l'operation

      first = 0;
      second = 0;
      oP = "";
  }

  double display() {

      return second;
  }

  void addfirst(double second) {
      this.second = second;
  }
}





