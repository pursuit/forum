cleandb:
	./gradlew flywayClean

migrate:
	./gradlew flywayMigrate

run:
	./gradlew bootRun
