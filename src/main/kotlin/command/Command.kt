package command

import discord4j.core.event.domain.message.MessageCreateEvent
import reactor.core.publisher.Mono

fun interface Command {
    fun execute(event: MessageCreateEvent): Mono<Void>

}