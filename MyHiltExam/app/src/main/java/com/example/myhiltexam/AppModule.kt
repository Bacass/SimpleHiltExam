package com.example.myhiltexam

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Qualifier

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

//    @Qualifier
//    @Retention(AnnotationRetention.BINARY)
//    annotation class Type1
//
//    @Qualifier
//    @Retention(AnnotationRetention.BINARY)
//    annotation class Type2

    @Named("Type1")
    @Provides
    fun provideString01() = "HelloWorld"

    @Named("Type2")
    @Provides
    fun provideString02() = "SWM.com"

    @Provides
    fun provideTestData() = TestData(3)
}