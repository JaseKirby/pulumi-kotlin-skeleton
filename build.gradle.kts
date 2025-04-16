plugins {
  kotlin("jvm") version "2.1.10"
  application
}

repositories { mavenCentral() }

dependencies {
  implementation("com.pulumi:pulumi:1.3.0")
  implementation("com.pulumi:aws:6.77.0")

  testImplementation(kotlin("test"))
  testImplementation("org.jetbrains.kotlin:kotlin-test")
}

kotlin { jvmToolchain(21) }

tasks.test { useJUnitPlatform() }

application {
  mainClass =
          if (project.hasProperty("mainClass")) project.property("mainClass") as String
          else "pulkot.MainKt"
}
