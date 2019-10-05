package evan.chen.tutorial.koinsample

import org.koin.dsl.module


val koinModule = module {
    factory {
        Presenter(Repository())
    }
}


