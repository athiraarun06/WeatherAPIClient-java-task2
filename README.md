# WeatherAPIClient-java-task2
Java Programming task-2, Weather API Client, CodTech solutions Internship COMPANY: CODTECH IT SOLUTIONS NAME: ATHIRA ARUN INTERN ID: CT04DG364 DOMAIN: JAVA PROGRAMMING DURATION: 4 WEEKS MENTOR: NEELA SANTHOSH

## Overview
**WeatherAPIClient** is a simple Java console application that consumes the public OpenWeatherMap REST API to fetch real-time weather data for a specified city (default is Bangalore). It sends HTTP requests, parses JSON responses, and displays weather information in a structured format.

## Features
- Fetches weather data via HTTP GET requests
- Parses JSON response using the `org.json` library
- Displays temperature (°C), humidity (%), and weather conditions
- Basic error handling for HTTP response codes

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- [org.json](https://github.com/stleary/JSON-java) library for JSON parsing

## Setup & Usage

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/WeatherFetcher.git
   cd WeatherFetcher
2. Download the json.jar from the org.json GitHub repo and place it in your project directory.
3. Compile the Java program:
   ```bash
   javac -cp .;json.jar WeatherFetcher.java
4. Run the program:
   ```bash
   java -cp .;json.jar WeatherFetcher
5. The app will display the current weather report for the city specified in the code (default: Bangalore).
# Customization
-To change the city, edit the CITY variable in WeatherFetcher.java:
static final String CITY = "Bangalore";

-To use your own OpenWeatherMap API key, replace the API_KEY variable:
static final String API_KEY = "bc0faa6edc212f3eccaf52578814c4c0";

# OUTPUT 
![Image](https://github.com/user-attachments/assets/f868d58a-8049-4261-baa8-abe16a9abfa3)
