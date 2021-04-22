//@Library('gradle-shared-lib') _
pipeline {
    agent any

    triggers {
        pollSCM('*/5 * * * *')
    }
    libraries {
        lib 'gradle-shared-lib'
    }
    stages {
     stage('Gradle version with global var') {
                steps {
                   // sh 'chmod +x gradlew'
                    gradlew '-v'
                }
           }
    }
}

