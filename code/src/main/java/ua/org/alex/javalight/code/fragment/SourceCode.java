package ua.org.alex.javalight.code.fragment;

import java.util.List;

/**
 * @author Oleksandr Pavliuk
 */
public interface SourceCode {

  String getModuleName();

  List<String> getLines();
}
