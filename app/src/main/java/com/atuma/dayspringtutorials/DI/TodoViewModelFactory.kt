package com.wadud.basicview.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.RuntimeException
import javax.inject.Inject
import javax.inject.Provider

@Suppress("UNCHECKED_CAST")
class TodoViewModelFactory @Inject constructor(
    private val creators: Map<Class<out ViewModel>,@JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val creator = creators[modelClass] ?: creators.entries.firstOrNull{
            modelClass.isAssignableFrom(it.key) }?.value ?: throw IllegalArgumentException("unknown model class $modelClass")
        try {
            return creator.get() as T
        }catch (e: Exception){
            throw RuntimeException(e)
        }
    }
}