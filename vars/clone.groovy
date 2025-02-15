def call(String url,String branch)
{
  echo "This is the Cloning Stage"
  git url: "${url}",branch:"${branch}"
  echo "Cloning Successful"
}
