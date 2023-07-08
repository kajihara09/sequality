package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public float ave(int x, int y) {
    return sum(x, y) / 2f;
  }

  public int sumInRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += i;
    }
    return sum;
  }

  public float aveInRange(int start, int end) {
    int sum = sumInRange(start, end);
    float ave = sum / (float) (end - start + 1);
    return ave;
  }

  public int sumOfOddInRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0)
        sum += i;
    }
    return sum;
  }

  public int sumOfEvenInRange(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0)
        sum += i;
    }
    return sum;
  }
}
