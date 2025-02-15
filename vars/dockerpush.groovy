def call(String imageName,String tagName){
  echo "This is the Push stage"
  withCredentials([usernamePassword(credentialsId:"dockerHubCred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
    sh "docker image tag ${imageName}:${tagName} ${env.dockerHubUser}/${imageName}:${tagName}"
    sh "docker push ${env.dockerHubUser}/${imageName}:${tagName}"
    echo "Push to Docker Hub Successful"
  }
}
