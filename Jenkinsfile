//@Library('gradle-shared-lib') _
pipeline {
    agent any

    triggers {
        pollSCM('*/5 * * * *')
    }
    librairies {
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

