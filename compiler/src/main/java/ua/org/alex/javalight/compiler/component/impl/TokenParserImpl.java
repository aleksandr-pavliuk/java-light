package ua.org.alex.javalight.compiler.component.impl;

import ua.org.alex.javalight.compiler.component.TokenParser;
import ua.org.alex.javalight.compiler.model.TokenParserResult;

import java.util.List;

/**
 * @author Oleksandr Pavliuk
 */
public class TokenParserImpl implements TokenParser {

  @Override
  public TokenParserResult parseLine(final String line,
      final boolean multilineCommentStarted) {
    final List<String> tokens = line.isEmpty() ? List.of() : List.of(line.trim().split(" "));
    return new TokenParserResult(tokens, false);
  }
}
