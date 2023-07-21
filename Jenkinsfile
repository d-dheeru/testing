pipeline {
    agent any
    tools {
        git 'git' 
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/d-dheeru/testing.git'
            }
        }


        stage('Build') {
            steps {
                withMaven(maven: 'MavenInstallationName') {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Deploy') {
            steps {
                sh 'java -jar src/src/main/java/com/example/application.jar'
            }
        }
    }
}
