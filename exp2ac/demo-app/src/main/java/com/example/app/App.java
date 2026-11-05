package com.example.app;

    import org.apache.commons.lang3.StringUtils;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;

    public class App {

        private static final Logger logger = LoggerFactory.getLogger(App.class);

        public static String greet(String name) {
            if (StringUtils.isNotBlank(name)) {
                return "Hello, " + name + "! Welcome to Maven CI/CD Demo.";
            }
            return "Hello, Student! Welcome to Maven CI/CD Demo.";
        }

        public static void main(String[] args) {
            logger.info(greet("Student"));
        }
    }
