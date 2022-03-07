pipeline {
    agent any
    tools {
        maven "maven"
    }
    stages {
        stage('Initialize'){
            steps{
                echo "PATH = ${M3_HOME}/bin:${PATH}"
                echo "M3_HOME = /opt/maven"
            }
        }
        stage('Build') {
            steps {
                dir("C:/ProgramData/Jenkins/.jenkins/workspace/PipelineMaven") {
                sh 'mvn -B -DskipTests clean package'
                }
            }
        }
     }
}
