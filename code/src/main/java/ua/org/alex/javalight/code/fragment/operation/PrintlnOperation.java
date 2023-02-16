package ua.org.alex.javalight.code.fragment.operation;

import ua.org.alex.javalight.code.fragment.Operation;
import ua.org.alex.javalight.code.fragment.SourceLine;

import static java.util.Objects.requireNonNull;

/**
 * @author Oleksandr Pavliuk
 */
public final class PrintlnOperation extends AbstractOperation implements Operation {

  private final String text;

  public PrintlnOperation(final SourceLine sourceLine, final String text) {
    super(sourceLine);
    this.text = requireNonNull(text);
  }

  public String getText() {
    return text;
  }
}
