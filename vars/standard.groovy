def call(String goToolName = 'go-1.12', String golangCiVersion = 'v1.18.0') {
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
}