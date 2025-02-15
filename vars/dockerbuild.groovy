def call(String imageName,String tagName,String dockerUser){
  sh "docker build -t ${dockerUser}/${imageName}:${tagName} ."
  echo "Build Successful"
}
