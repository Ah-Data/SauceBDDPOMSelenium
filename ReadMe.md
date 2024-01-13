Clone the project from repo
Please make sure the chrome driver version is similar to your machine chrome driver
If needed to update the version
    -> Go to src/drivers
        -> Add the chrome driver similar to your machine
Using jdk -19 version
Execute mvn clean
Execute mvn install
Some cases may fail.
Execute this commad:
    ->mvn clean test -Dcucumber.filter.tags="@login"
Or
    -> mvn clean test -Dgroups=yourGroupName
