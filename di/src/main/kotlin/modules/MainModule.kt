package modules

import com.sample.clean.common.sample.ISample
import com.sample.clean.common.sample.SampleClass
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module

val mainModule = module {
    factoryOf(::SampleClass) bind ISample::class
}
