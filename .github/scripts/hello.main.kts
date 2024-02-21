#!/usr/bin/env kotlin
import java.nio.file.Files
import java.nio.file.Path

val environment: MutableMap<String, String> = System.getenv()
println("Environment: $environment")
val githubEnvironmentFilePath: String = environment["GITHUB_ENV"]
        ?: throw IllegalStateException("GITHUB_ENV not found in environment")

println("File path: $githubEnvironmentFilePath")


val readAllBytes = Files.readAllBytes(Path.of(githubEnvironmentFilePath))

println(readAllBytes)

