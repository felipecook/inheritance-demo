package edu.cnm.deepdive;

public abstract class Canis {

  final int[] data;
   
  
  public static final int NUMBER_OF_LEGS = 4;
  
  public Canis() {
    System.out.println("Canis::new");
  }
  
  public abstract void vocalize();
  
  public abstract void hunt();

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "I am a " + this.getClass().getSimpleName();
  }
  
  public static void about() {
    System.out.println("Canis is a genus of Canidae, "
        + "distinguished by it's large size, massive skull and long legs.");
  }
  
}
