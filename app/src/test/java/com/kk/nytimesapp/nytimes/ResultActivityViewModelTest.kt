//package com.kk.nytimesapp.nytimes
//
//import com.kk.nytimesapp.BuildConfig
//import com.kk.nytimesapp.mockData.TestDataGenerator
//import com.kk.nytimesapp.network.ResultResponseApi
//import org.junit.Assert
//import org.junit.Test
//import org.junit.Before
//import org.junit.runner.RunWith
//import org.junit.runners.JUnit4
//import org.mockito.Mock
//import org.mockito.Mockito
//import org.mockito.MockitoAnnotations
//
//@RunWith(JUnit4::class)
//class ResultActivityViewModelTest {
//
//    @Mock
//    private lateinit var resultResponseApi: ResultResponseApi
//
//    @Before
//    fun setUp() {
//        MockitoAnnotations.initMocks(this)
//    }
//
//    @Test
//    fun getArticleSuccess() {
//        val list  = TestDataGenerator.getResultList()
//        Mockito.`when`(resultResponseApi.getPosts(7, BuildConfig.API_KEY))
//                .thenReturn(list)
//        assert(list.byline != null)
//    }
//
//    @Test
//    fun getArticleError() {
//        val list = TestDataGenerator.getResultList()[14]
//        Mockito.`when`(resultResponseApi.getPosts(14, BuildConfig.API_KEY))
//                .thenReturn(list)
//        Assert.assertNull(list)
//    }
//}
