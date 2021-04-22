@Library('gradle-shared-lib') _
pipeline {
    agent any

    triggers {
        pollSCM('*/5 * * * *')
    }
    stages {
     stage('Gradle version with global var') {
                steps {
                    sh 'chmod +x gradlew'
                    gradlew '-v'
                }
           }
    }
}

def mvnw(String... args) {
    sh "./mvnw ${args.join(' ')} -X"
}