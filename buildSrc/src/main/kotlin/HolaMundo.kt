import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class HolaMundo : DefaultTask(){
    init {
        group = "Hola Mundo"
        description = "Task para decir hola"
    }

    @TaskAction
    fun run()
    {
        println("Hola mundo")
    }
}