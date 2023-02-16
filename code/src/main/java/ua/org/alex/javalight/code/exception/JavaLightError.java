package ua.org.alex.javalight.code.exception;

import static java.util.Objects.requireNonNull;

/**
 * @author Oleksandr Pavliuk
 */
public abstract class JavaLightError extends RuntimeException {

  protected JavaLightError(final String message) {
    super(requireNonNull(message), null, false, false);
  }
}
