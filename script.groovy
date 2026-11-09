pipeline {
    agent any
    stages {
        stage('clone') {
            steps {
                git branch: 'main'
                    url: 'https://github.com/pujapatel81/publicrepo.git'
            }
        }
         stage('build') {
            steps {
                archiveArtifacts artifacts: 'script.groovy mvn clean package -DSKIPTests', 
                followSymlinks: false
            }
        }
         stage('deploy') {
            steps {
                sh 'echo deploying app'
            }
         }
    }
}