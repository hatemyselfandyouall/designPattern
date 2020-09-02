package chainofResponsibility;

public abstract class Handle {
  private Handle successor;

  public abstract void handleRequest();

  public Handle getSuccessor() {
    return successor;
  }

  public void setSuccessor(Handle successor) {
    this.successor = successor;
  }
}
