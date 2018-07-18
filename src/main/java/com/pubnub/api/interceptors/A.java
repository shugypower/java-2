class A{
  B b;
  int x;
  
  int foo(){
    return x + 3;
  }
  
  void goo(){
    B g = b;
    x += 2;
    x += 1;
  }
}
