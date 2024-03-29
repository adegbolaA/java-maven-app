    def buildJar(){
        echo "Building"
        sh 'mvn package'
    }
    def buildDockerImage(){
        echo "Building docker image"
        withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
            sh 'docker build -t kevinlearningaccount/java-maven:2.0 .'
            sh 'echo $PASS docker login -u $USER --password-stdin'
            sh 'docker push kevinlearningaccount/java-maven:2.0'

        }
    }

    return this