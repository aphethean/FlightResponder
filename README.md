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

## Clickstart, the easiest way to get started with IRIS

Clickstart is an awesome way to clone this project, setup an automated build, and deploy it instantly.  All with one click.

<a href="https://grandcentral.cloudbees.com/?CB_clickstart=https://raw.github.com/aphethean/FlightResponder/master/clickstart.json"><img src="https://s3.amazonaws.com/cloudbees-downloads/clickstart/clickstart-now.png"/></a>

