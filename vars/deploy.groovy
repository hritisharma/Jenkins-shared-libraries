def call()
{
  echo "This is the deploy stage"
  sh "docker compose down && docker compose up -d"
  echo "Deployed Successful"
}
