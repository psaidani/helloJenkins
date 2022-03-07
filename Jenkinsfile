node {
    stage('Clone') {
        git branch: 'main', url: 'https://github.com/psaidani/helloJenkins.git'
    }
    stage('Build') {
        sh label: '', script: 'javac hello.java'
    }
    stage('Run') {
        sh label: '', script: 'java hello'
    }
}
