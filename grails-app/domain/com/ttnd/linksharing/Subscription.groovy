package com.ttnd.linksharing

class Subscription {
    Topic topic
    User user
    Seriousness seriousness
    Date dateCreated
    Date lastUpdated
    static belongsTo = [user: User, topic: Topic]

    static constraints = {
        user(blank: false, unique: "topic")
        topic(blank: false)
        seriousness(blank: false)

    }
}
