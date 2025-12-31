plugins {
	java
	alias(libs.plugins.spring.dependency.management)
	alias(libs.plugins.spring.boot)
}

group = "me.frk2222"
version = "0.1.0"

repositories {
	mavenCentral()
}

dependencies {
	implementation(libs.jimmer.spring.boot.starter)
	implementation(libs.spring.boot.starter.web)
	annotationProcessor(libs.jimmer.apt)
}
