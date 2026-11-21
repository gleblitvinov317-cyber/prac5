package prac23.task1;

public class QueueEmptyException extends RuntimeException {
  public QueueEmptyException(String message) {
    super(message);
  }
}
