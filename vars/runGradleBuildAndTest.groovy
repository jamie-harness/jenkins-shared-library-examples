def call() {
    sh "echo 'starting build and test with gradle'"
    sh "./gradlew test --continue --profile | true"
}
