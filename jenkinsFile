@Library('gradle-shared-lib') _
pipeline {
    agent any

    triggers {
        pollSCM('*/5 * * * *')
    }
    stages {
     stage('Gradle version with global var') {
                steps {
                    gradlew '-v'
                }
           }
    }
}

def mvnw(String... args) {
    sh "./mvnw ${args.join(' ')} -X"
}