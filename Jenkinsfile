        pipeline {
          agent any
          tools{
            maven 'Maven-3.9.6'
          }

          stages {
            stage("build jar"){
              steps{
                    script {
                         echo "Building"
                         sh 'mvn package'
                    }
              }
            }
              stage("build Docker Image"){
                    steps{
                          script {
                               echo "Building docker image"
                               withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]){
                                    sh 'docker build -t kevinlearningaccount/java-maven:2.0 .'
                                    sh 'echo $PASS docker login -u $USER --password-stdin'
                                    sh 'docker push kevinlearningaccount/java-maven:1.0'

                               }
                          }
                    }
              }

          }

        }
