package com.example.app;

        import org.junit.Test;
        import static org.junit.Assert.assertEquals;

        public class AppTest {

            @Test
            public void testGreet() {
                assertEquals(
                    "Hello, Student! Welcome to Maven CI/CD Demo.",
                    App.greet("Student")
                );
            }
        }