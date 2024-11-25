def call() {
    sh "echo 'starting unit test with gradle'"
    sh "./gradlew clean test --continue"
    junit "**/test/TEST*.xml"
}
