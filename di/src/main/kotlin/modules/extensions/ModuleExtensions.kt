@file:Suppress("PackageDirectoryMismatch")

package org.koin.core.module.dsl

import org.koin.core.definition.KoinDefinition
import org.koin.core.module.Module

inline fun <reified R, reified T1, reified T2, reified T3, reified T4, reified T5, reified T6, reified T7, reified T8, reified T9, reified T10, reified T11, reified T12, reified T13, reified T14, reified T15, reified T16, reified T17, reified T18, reified T19, reified T20, reified T21, reified T22, reified T23> Module.factoryOf(
    crossinline constructor: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23) -> R,
    noinline options: DefinitionOptions<R>? = null,
): KoinDefinition<R> = factory { new(constructor) }.onOptions(options)
