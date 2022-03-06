node {
    stage('Clone') {
        git "https://github.com/psaidani/helloJenkins/go-securi"
    }
    stage('Build') {
        sh label: '', script: 'javac hello.java'
    }
    stage('Run') {
        sh label: '', script: 'java hello'
    }
}
