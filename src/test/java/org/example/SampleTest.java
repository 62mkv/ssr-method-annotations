package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class SampleTest {

    @Test
    public void testWithAnnotatedParam(@TempDir String path) {
        System.out.println("Hello, test");
    }

    @Test
    public void testWithUnannotatedParam(String path) {
        System.out.println("Hello, test");
    }

    @Test
    public void testWithoutParam() {
        System.out.println("Hello, test");
    }


    @Test
    public void testWithTwoAnnotatedParams(@TempDir String path, @SuppressWarnings("") int count) {
        System.out.println("Hello, test");
    }

    @Test
    public void testWithTwoUnannotatedParams(String path, int count) {
        System.out.println("Hello, test");
    }
}
