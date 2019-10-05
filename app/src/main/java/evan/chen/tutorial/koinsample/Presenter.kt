package evan.chen.tutorial.koinsample

class Presenter(private val repository: Repository) {

    fun getString(): String {
        return repository.getString()
    }
}