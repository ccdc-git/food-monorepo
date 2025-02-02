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
### Prepare the database

To run this project, you need to hava a postgres database running.
After that, you need to create a database called `food` and a user with the following credentials:
- username: `admin`
- password: `admin`
You can make user with the following command:
```shell
psql -U postgres -c "CREATE USER admin WITH PASSWORD 'admin';"
psql -U postgres -c "CREATE DATABASE food;"
psql -U postgres -c "GRANT ALL PRIVILEGES ON DATABASE food TO admin;"
```

### Running the project
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
