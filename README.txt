Java cursus
    <-- Nieuwe branch -->
    git checkout -b <branchname>
git add <file>
git commit -m <message>
    <-- Nieuwe branch naar master branch -->
    git checkout master
    git merge <branchname>
    git branch -d <branchname> (delete branch)
git push origin master

<-- Maven -->
To compile the project, type: mvn clean compile
To execute the application, type: mvn exec:java
To package the application, type: mvn package
To execute the packaged JAR file, type: java -jar target/09-02-Hello-1.0-SNAPSHOT.jar
