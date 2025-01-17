import com.bmuschko.jenkins.Gradle
//@Library('gradle-shared-lib@4.0') import com.bmuschko.jenkins.Gradle
def call(String goToolName = 'go-1.12', String golangCiVersion = 'v1.18.0') {
       gradle = new Gradle(this)
    pipeline {
        agent any

        triggers {
            pollSCM('*/5 * * * *')
        }

        stages {
            stage('Gradle version with global var') {
                steps {
                    sh 'chmod +x gradlew'
                    script {
                        gradle.wrapper '-v'
                    }
                }
            }
        }
    }
}