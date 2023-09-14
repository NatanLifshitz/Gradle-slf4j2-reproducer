package com.reproduce

import aws.sdk.kotlin.services.s3.S3Client
import aws.sdk.kotlin.services.s3.model.PutObjectRequest
import kotlinx.coroutines.runBlocking
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ReproducePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val logger: Logger = LoggerFactory.getLogger("test")
        // This doesn't compile even though the method exists in the compile classpath
//        logger.isEnabledForLevel(false)

        runBlocking {
            S3Client {

            }.putObject(PutObjectRequest {
                bucket = "1234"
                key = "1234"
            })
        }

    }
}
