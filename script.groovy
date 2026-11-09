pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'echo building app'
            }
        }
         stage('test') {
            steps {
                sh 'echo testing app'
            }
        }
         stage('deploy') {
            steps {
                sh 'echo deploying app'
            }
         }
    }
}