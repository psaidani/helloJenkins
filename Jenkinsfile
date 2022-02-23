node {
    stage('Clone') {
        git "https://github.com/psaidani/helloJenkins"
    }
    stage('Build') {
        sh label: '', script: 'javac hello.java'
    }
    stage('Run') {
        sh label: '', script: 'java hello'
    }
}
