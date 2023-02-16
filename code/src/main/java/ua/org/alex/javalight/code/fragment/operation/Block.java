package ua.org.alex.javalight.code.fragment.operation;

import ua.org.alex.javalight.code.fragment.Operation;
import ua.org.alex.javalight.code.fragment.SourceLine;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Oleksandr Pavliuk
 */
public class Block extends AbstractOperation implements Operation {

  private final List<Operation> operations;

  public Block(final List<Operation> operations, final SourceLine sourceLine) {
    super(sourceLine);
    this.operations = List.copyOf(operations);
  }

  public Block(final Operation operation, final SourceLine sourceLine) {
    this(List.of(operation), sourceLine);
  }

  public List<Operation> getOperations() {
    return operations;
  }

  @Override
  public String toString() {

    return operations.stream()
        .map(Object::toString)
        .collect(Collectors.joining(System.lineSeparator()));
  }
}
