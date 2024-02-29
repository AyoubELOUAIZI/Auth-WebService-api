I want to create a webserver or restwebserver using java openliberty framework and maven archetecture also I am using vscode for date the ws is about authentecation it does 3 main think for its client the signin and signup and lougout and for the database connection I want to use mysql and DataSource methode so can you give me the best archetechture the server for me should not have any fontend things because I well implement it later using html and css and javascript or a frontend framework , so the important is to make the api works and to have a good archetecture for the project files and code and use datasource for connection I need to use packeges for layers like the buseniss layer dal layer an so on and also have controllers and interfaces and every possible better archetecture to add to meke the project more better and more scalabel for now I well need one model for the user to signin and up and logout


project-root/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── yourcompany/
│   │   │   │   │   ├── controllers/
│   │   │   │   │   │   ├── UserController.java      // REST API controllers
│   │   │   │   │   │   
│   │   │   │   │   ├── data/
│   │   │   │   │   │   ├── UserRepository.java      // Data access layer (DAO)
│   │   │   │   │   │   ├── DataSourceConfig.java    // DataSource configuration
│   │   │   │   │   │   
│   │   │   │   │   ├── models/
│   │   │   │   │   │   ├── User.java                // User model
│   │   │   │   │   │   
│   │   │   │   │   ├── services/
│   │   │   │   │   │   ├── UserService.java         // Service layer
│   │   │   │   │   │   
│   │   │   │   │   ├── security/
│   │   │   │   │   │   ├── AuthenticationFilter.java // Authentication filter
│   │   │   │   │   │   ├── JwtTokenProvider.java    // JWT token provider
│   │   │   │   │   │   
│   │   │   │   │   ├── config/
│   │   │   │   │   │   ├── AppConfig.java           // Application configuration
│   │   │   │   │   │   
│   │   │   │   │   ├── exceptions/
│   │   │   │   │   │   ├── CustomExceptionHandler.java // Exception handler
│   │   │   │   │   │   
│   │   │   │   │   ├── Application.java            // Main application class
│   │   │   │   │
│   │   ├── resources/
│   │   │   ├── application.properties              // Application properties (e.g., database configuration)
│   │   │
│   │   └── webapp/                                // Frontend files (HTML, CSS, JS) - to be added later
│   │
├── pom.xml                                       // Maven project configuration file
│
└── README.md                                     // Project documentation
