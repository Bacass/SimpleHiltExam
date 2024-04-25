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

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class Type3

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class Type4

    @Named("Type1")
    @Provides
    fun provideString01() = "HelloWorld"

    @Named("Type2")
    @Provides
    fun provideString02() = "SWM.com"

    @Type3
    @Provides
    fun provideString03() = "Qualifier Type3"

    @Type4
    @Provides
    fun provideString04() = "Qualifier Type4"

    @Provides
    fun provideTestData() = TestData(3)
}