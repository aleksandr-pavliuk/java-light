package ua.org.alex.javalight.compiler;

import ua.org.alex.javalight.code.fragment.ByteCode;
import ua.org.alex.javalight.code.fragment.SourceCode;

/**
 * @author Oleksandr Pavliuk
 */
public interface Compiler {

  ByteCode compile(SourceCode... sourceCodes) throws JavaLightSyntaxError;
}
