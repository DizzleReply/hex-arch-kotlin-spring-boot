package com.hexarchbootdemo.application.service//package com.hexarchbootdemo.application.service;
//
//import com.hexarchbootdemo.application.port.input.DownloadMediaUseCase
//import com.hexarchbootdemo.application.port.output.repository.DownloadMediaPort;
//import io.netty.util.concurrent.Promise
//
//import javax.inject.Named;
//
//@Named
//class DownloadMediaService(val downLoadMediaRepository:DownloadMediaPort) : DownloadMediaUseCase {
//    override fun downloadMedia(downLoadUrl: String): Boolean {
//        println(downLoadMediaRepository)
//
//        //val fetchOutput = fetch.
//        val promise = Promise.resolve(window.fetch("https://jsonplaceholder.typicode.com/todos/1").then { response->
//            response.json()
//        }.then {
//            it
//        }).await()
//
//        return true
//
//    }
//
//}
//
