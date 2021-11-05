pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Clean') {
            steps {
                // Get some code from a GitHub repository
                git 'https://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@github.com/psaidani/helloJenkins.git'

                // Run Maven on a Unix agent.
                //sh "mvn clean"

                // To run Maven on a Windows agent, use
                dir('Jenkins') {
                    bat "mvn -Dmaven.test.failure.ignore=true clean"
                }
                
            }
        }
        
        stage('Package') 
        {
            steps 
            {
                // Get some code from a GitHub repository
                //git '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@github.com/psaidani/helloJenkins.git'

                // Run Maven on a Unix agent.
                //sh "mvn clean"

                // To run Maven on a Windows agent, use
                dir('Jenkins') 
                {
                    bat "mvn -Dmaven.test.failure.ignore=true package"
                }
                
            }
        }
        
        stage('Install') 
        {
            steps 
            {
                // Get some code from a GitHub repository
                //git 'https://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@github.com/psaidani/helloJenkins.git'

                // Run Maven on a Unix agent.
                //sh "mvn clean"

                // To run Maven on a Windows agent, use
                dir('Jenkins') 
                {
                    bat "mvn -Dmaven.test.failure.ignore=true install"
                }
                
            }
        }
        
        stage('Test') 
        {
            steps 
            {
                // Get some code from a GitHub repository
                //git 'https://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@github.com/psaidani/helloJenkins.git'

                // Run Maven on a Unix agent.
                //sh "mvn clean"

                // To run Maven on a Windows agent, use
                dir('Jenkins') 
                {
                    bat "mvn -Dmaven.test.failure.ignore=true test"
                }
                
            }
        }
    }
}
