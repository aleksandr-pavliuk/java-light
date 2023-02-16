package ua.org.alex.javalight.code.fragment.operation;

import ua.org.alex.javalight.code.fragment.Operation;
import ua.org.alex.javalight.code.fragment.SourceLine;

import static java.util.Objects.requireNonNull;

/**
 * @author Oleksandr Pavliuk
 */
public class AbstractOperation implements Operation {

  private final SourceLine sourceLine;

  public AbstractOperation(final SourceLine sourceLine) {
    this.sourceLine = requireNonNull(sourceLine);
  }

  @Override
  public final SourceLine getSourceLine() {
    return sourceLine;
  }

  @Override
  public String toString() {
    return sourceLine.toString();
  }
}
