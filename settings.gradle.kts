pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "UM_VISA_MATE_FINAL"
include(":app")
include(":UMVISAMATE_M3")
include(":UMVisaMate1")
include(":UMVISAMATE2_M4")
include(":UMVISAMATE")
include(":UMVISAMATEM2-Faculty")
include(":student_module")
