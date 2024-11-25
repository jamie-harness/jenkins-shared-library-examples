def call() {
    sh "echo 'starting build with gradle'"
    sh "./gradlew build"
}
