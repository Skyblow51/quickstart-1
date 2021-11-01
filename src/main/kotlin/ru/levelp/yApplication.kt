package ru.levelp

import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class yApplication : Application<yConfiguration>() {

    override fun getName(): String {
        return "y"
    }

    override fun initialize(bootstrap: Bootstrap<yConfiguration>) {
        // TODO: application initialization
    }

    override fun run(configuration: yConfiguration,
                     environment: Environment) {
        // TODO: implement application
    }
}

fun main(args: Array<String>) {
    yApplication().run(*args)
}

