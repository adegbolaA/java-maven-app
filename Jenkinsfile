#!/user/bin/env groovy

def gv

@Library('jenkins-shared-library')_

  pipeline {
    agent any

    tools {
      maven 'Maven-3.9.6'
    }

    stages {
      stage('init') {
        steps {
          script {
            gv = load 'script.groovy'
          }
        }
      }

      stage('build jar') {
        steps {
          script {
            buildJar()
          }
        }
      }
      stage('build Docker Image') {
        steps {
          script {
            buildDockerImage'kevinlearningaccount/java-maven:3.0'
           // dockerLogin()
            //dockerPush 'kevinlearningaccount/java-maven:3.0'
          }
        }
      }
    }
  }
