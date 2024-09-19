rootProject.name = "kaidl"

include(":kaidl")
include(":kaidl-runtime")
include(":example")

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        google()
    }
}
