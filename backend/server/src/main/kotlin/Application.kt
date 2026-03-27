package com.portfolio

import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureFrameworks()
    configureSockets()
    configureAdministration()
    configureTemplating()
    configureRouting()
}
