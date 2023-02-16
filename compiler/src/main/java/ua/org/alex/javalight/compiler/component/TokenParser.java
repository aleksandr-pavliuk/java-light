package ua.org.alex.javalight.compiler.component;

import ua.org.alex.javalight.compiler.model.TokenParserResult;

/**
 * @author Oleksandr Pavliuk
 */
public interface TokenParser {

  TokenParserResult parseLine(String line, boolean multilineCommentStarted);
}
