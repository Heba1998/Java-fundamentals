/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;



import org.junit.Test;
import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import static linter.App.*;


class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void testingSplinter(){


        String noErrOut = "";
        Path noErrorFile = Paths.get("./src/test/resources/test.js");

        assertEquals(noErrOut,javaScriptLinter(noErrorFile));


     
        String oneErrOut = "Line 2: Missing semicolon.\n";
        Path oneErrorFile = Paths.get("./src/test/resources/test.js");

        assertEquals(oneErrOut,javaScriptLinter(oneErrorFile));



        String someErrOut = "Line 4: Missing semicolon.\n";
        Path someErrorsFile = Paths.get("./src/test/resources/test.js");

        assertEquals(someErrOut,javaScriptLinter(someErrorsFile));



        String someErrOut = "Line 3: Missing semicolon.\n";
        Path someErrorsFile = Paths.get("./src/test/resources/test.js");

        assertEquals(someErrOut,javaScriptLinter(someErrorsFile));

    }
}