# SpringBoot Monorepo Example
This is a simple example of a monorepo using SpringBoot. The project is divided into two modules: `search` and `admin`

## Monorepo
A monorepo is a software development strategy where code for many projects is stored in the same repository. This is in contrast to the more common "polyrepo" strategy where each project has its own repository.
This project is a simple example of a monorepo using SpringBoot. The project is divided into two modules: `search` and `admin`

## Modules
### Search
This module is a simple REST API that returns a list of foods in database.

### Admin
This module is for adding new foods to the database.

## Running the project
To run the project, you can use the following command:
```shell
# Build admin
./gradlew :admin:build

# Run admin
java -jar admin/build/libs/admin-0.0.1.jar

# Build search
./gradlew :search:build

# Run search
java -jar search/build/libs/search-0.0.1.jar
```
