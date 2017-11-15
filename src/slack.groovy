import groovy.json.JsonOutput

def notify(slack, message, emoji, colour, channel, username) {
    def json = JsonOutput.toJson([text: component,
            channel: channel,
            username: username,
            icon_emoji: emoji,
            color: colour,
            text: message])
    try {
        sh "curl -s -X POST --data-urlencode \'payload=${json}\' ${slack}"
    } catch (Exception e) {
        echo "Slack notification failed... Skipping"
    }
}

