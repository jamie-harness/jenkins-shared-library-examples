
def call() {
    sh "echo 'starting build and test with gradle'"
    sh sh "gradle test --continue --profile"
}
