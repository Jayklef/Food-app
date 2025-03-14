Food-app
A simple Spring Boot application that interacts with a remote restaurant API and manages a list of favorite restaurants using H2 Database.

🚀 Features 
Fetch restaurant data from an external API. 
Filter restaurants by state and delivery availability. 
Manage a favorites list (add, view, remove favorites). 
Store favorite restaurants in an H2 in-memory database.

📌 Prerequisites 
Java 17+
Maven
Postman or cURL (for testing API)


💻 How to Run the Application

Clone the Repository 
git clone https://github.com/Jayklef/Food-app.git
cd restaurant-api

Build and Run with Maven s
mvn spring-boot:run 
the application will start on http://localhost:8080.

📊 H2 Database Console 
The app uses H2 in-memory database for storing favorites.

How to Access H2 Console 
Open http://localhost:8080/h2-console Use the following credentials: 
JDBC URL: jdbc:h2:mem:restaurantdb 
User: sa 
Password: (leave blank) 
Click Connect 
Run SQL queries to inspect stored data: sql Copy Edit SELECT * FROM FAVORITE_RESTAURANT;

📢 API Endpoints 
📝 Restaurants API Method Endpoint Description 
GET /api/restaurants 
Get all restaurants from API GET /api/restaurants/state/{state} 
Get restaurants in a specific state (e.g., /api/restaurants/state/TX) 
GET /api/restaurants/delivery Get restaurants that offer delivery

⭐ Favorites API Method Endpoint Description 
POST /api/favorites Add a restaurant to favorites 
GET /api/favorites View all favorite restaurants 
DELETE /api/favorites/{id} Remove a restaurant from favorites

🎯 Technologies Used 
Java 17 
Spring Boot Spring Data JPA
H2 Database 
RestTemplate (for external API calls) 
Lombok (for reducing boilerplate code)

📌 Notes The H2 database resets when the app restarts (since it's in-memory). Change spring.jpa.hibernate.ddl-auto=update in application.properties to create-drop if you want fresh tables on every restart. If you face errors, ensure H2 Console is enabled (spring.h2.console.enabled=true).
