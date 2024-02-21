#!/usr/bin/env kotlin
import java.nio.file.Files
import java.nio.file.Path

val environment: MutableMap<String, String> = System.getenv()
val githubEnvironmentFilePath: String = environment["GITHUB_ENV"]
        ?: throw IllegalStateException("GITHUB_ENV not found in environment")
Files.readAllLines(Path.of(githubEnvironmentFilePath)).forEach {
    println(it)
}
