FlightResponder
===============

Default generated mockresponder with 'edit' link relations.

## Deploy to CloudBees

http://developer.cloudbees.com/bin/view/RUN/DevToRun
`
mvn bees:deploy -Dbees.appid=youraccount/yourappname -Dbees.apikey=<key> -Dbees.secret=<secret>
`

NB - be sure to set the CloudBees app to Java 1.7, there's no way to set this from the maven plugin right now.
http://stackoverflow.com/questions/12204582/when-can-i-use-jdk-7-with-cloudbees-runcloud
`
bees config:set -Rjava_version=1.7 -a account/appname
`
