def call(String name = "Alice") {
    sh "go install github.com/jstemmer/go-junit-report/v2@latest"
    sh "go test -v 2>&1 -cover ./... | $HOME/go/bin/go-junit-report -set-exit-code > report.xml"
    junit "report.xml"
}
