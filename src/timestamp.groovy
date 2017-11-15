import groovy.json.*

def timestamp() {
    TimeZone.stDefault(TimeZone.getTimeZone('UTC'))
    def dateTimeStamp = new Date()
    def deploymentNotificationTimeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
    String deploymentNotificationTimeStamp = deploymentNotificationTimeFormat.format(dateTimeStamp)

    deploymentNotificationTimeStamp
}

