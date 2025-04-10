def call() {
    sh "echo 'starting build with gradle'"
    sh "gradle test --continue --profile"
}
