package ua.org.alex.javalight.compiler.component;

import ua.org.alex.javalight.code.fragment.SourceCode;
import ua.org.alex.javalight.code.fragment.SourceLine;

import java.util.List;

/**
 * @author Oleksandr Pavliuk
 */
public interface SourceLineReader {

  List<SourceLine> read(SourceCode sourceCode);
}
