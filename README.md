## Lab 8: Quotes
Application takes in a Json file and randomly prints out quotes from famous authors.

## Feature Task
Use the file [recentquotes.json](https://codefellows.github.io/code-401-java-guide/curriculum/08-oo-design-practice/recentquotes.json) to show random popular book quotes. Your program should use GSON to parse the .json file. 
The app needs no functionality other than showing the quote and the author when it is run. The app should choose one quote each time it is run.

## How to Run Application
All dependencies have been added to the application.
Just run <b>./gradlew run</b> to install proper dependencies.

## Resources
[GSON](https://github.com/google/gson/blob/master/UserGuide.md)  
[Reading From Scanner](https://stackoverflow.com/questions/13185727/reading-a-txt-file-using-scanner-class-in-java)  
[Parsing JSON File with GSON](https://stackoverflow.com/questions/29965764/how-to-parse-json-file-with-gson)

## Authors
* [Bomi Bear](https://github.com/bomibear)
* [Perezm27](https://github.com/perezm27)


## Lab 9 : Web requests
Rather than using a hardcoded file of JSON data with quotes, you’ll grab quotes from an API and display those to the user.

## Feature Tasks
When running the application, don’t read in the quotes file. Instead, make a request to an API to get a random quote.  
Ensure that if your app has errors in connecting to the Internet, you instead display a random quote from your file.  
Add that functionality: when a quote comes back from a request, it’s also cached in the json file.  

## Sources 
[StarWars Api](http://swquotesapi.digitaljedi.dk/index.html)  
[HTTP Request Java](https://www.baeldung.com/java-http-request)

## Collaborative Efforts
* Nick Paro
* Matt Stuhring

# Author
* [Perezm27](https://github.com/perezm27)
