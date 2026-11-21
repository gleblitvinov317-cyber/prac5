package prac23.task1;

public class QueueFullException extends RuntimeException {
  public QueueFullException(String message) {
    super(message);
  }
}
