#!/usr/bin/env kotlin
import java.nio.file.Files
import java.nio.file.Path

val environment: MutableMap<String, String> = System.getenv()
environment.map {
    println("Environment: ${it.key}=${it.value}")
}

val githubEnvironmentFilePath: String = environment["GITHUB_ENV"]
        ?: throw IllegalStateException("GITHUB_ENV not found in environment")

println("File path: $githubEnvironmentFilePath")


val readAllBytes = Files.readAllLines(Path.of(githubEnvironmentFilePath))

println(readAllBytes)

