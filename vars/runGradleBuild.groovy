def call() {
    sh "echo 'starting build with gradle'"
    sh "./gradlew test --continue --profile"
}
