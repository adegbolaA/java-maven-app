      def gv

      pipeline {
          agent any

          tools{
            maven 'Maven-3.9.6'
          }

          stages {

              stage ("init"){
                steps{
                    script{
                        gv = load "script.groovy"
                    }
                }
              }

            stage("build jar"){
              steps{
                    script {
                         gv.buildJar()
                    }
              }
            }
              stage("build Docker Image"){
                    steps{
                          script {
                                gv.buildDockerImage()
                          }
                    }
              }

          }

        }
