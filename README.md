# Java Comment Section

[![Java](https://img.shields.io/badge/Java-21-blue.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.9.6-blue.svg)](https://maven.apache.org/)
[![JUnit](https://img.shields.io/badge/JUnit-5-blue.svg)](https://junit.org/junit5/)

## Description

This project implements a solution to count occurrences of a specific word within a collection of comments. The solution:

- Takes an array of comments and a search word as input
- Uses Java Streams API for efficient processing
- Performs case-insensitive search
- Returns the count of comments containing the specified word
- Handles null and empty inputs gracefully

Example usage:
```java
String[] comments = {
    "This is a great solution",
    "The solution works well",
    "Not related to solutions"
};
int count = Solution.solution(3, "solution", comments);
// Returns: 2
```

## Project Structure

```
.
├── LICENSE.md
├── README.md
├── .gitignore
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── Solution.java
    └── test
        └── java
            └── SolutionTest.java
```

## Prerequisites

- Java 21 or higher
- Maven 3.9.6 or higher
- Git

## Installation

1. Clone the repository:
```bash
git clone git@github.com:luismr/java-comment-section.git
```

2. Navigate to the project directory:
```bash
cd java-comment-section
```

3. Build the project:
```bash
mvn clean install
```

## Running Tests

To run the tests:
```bash
mvn test
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details. 