package ua.org.alex.javalight.code.exception;

import static java.util.Objects.requireNonNull;

/**
 * @author Oleksandr Pavliuk
 */
public final class ConfigException extends RuntimeException {

  public ConfigException(final String message) {
    super(requireNonNull(message));
  }

  public ConfigException(final String message,
      final Throwable cause) {
    super(requireNonNull(message), requireNonNull(cause));
  }
}
