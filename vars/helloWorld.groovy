def call(String name, String env) {
    check_args("${name}","${env}")
    bat "echo my name is number"
}

private def check_args(String arg1, String arg2) {
    if (arg1 == 'AMOL') {
        if (arg2 == 'DEV'){
            bat 'echo correct runner'
        }
    } else {
        error('incorrect runner or env')
    }
}
