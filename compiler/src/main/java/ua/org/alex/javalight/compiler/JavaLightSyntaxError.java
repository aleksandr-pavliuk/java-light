package ua.org.alex.javalight.compiler;

import ua.org.alex.javalight.code.exception.JavaLightError;

/**
 * @author Oleksandr Pavliuk
 */
public abstract class JavaLightSyntaxError extends JavaLightError {

  protected JavaLightSyntaxError(final String message) {
    super(message);
  }
}
