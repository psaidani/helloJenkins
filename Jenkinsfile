node {
    stage('Clone') {
        git "https://github.com/psaidani/helloJenkins"
    }
    stage('Build') {
        bat 'javac hello.java'
    }
    stage('Run') {
        bat 'java hello'
    }
}
