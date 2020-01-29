import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class OpenFolder:DefaultTask() {
    init {
        group = "meetup"
        description = "Abrir carpeta de apk cuando se ejecute un build en release"
    }

    @TaskAction
    fun run()
    {
        Runtime.getRuntime()
            .exec(arrayOf("/bin/sh", "-c", "open ./app/build/outputs/apk/release"))
    }
}