package ru.sberschool.hystrix

import feign.RequestLine

interface SlowlyApi {
    @RequestLine("GET /ben-muhiuddinkhan-la/1/4.json")
    fun getSomething(): SimpleResponse
}


