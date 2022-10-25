package com.hexarchbootdemo.adapter.input.rest.reactor

import com.hexarchbootdemo.application.port.input.FindMediaUseCase
import com.hexarchbootdemo.domain.model.Media
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class DownloadMediaController (
    //private val downloadMediaUseCase: DownloadMediaUseCase,
    private val findMediaUseCase: FindMediaUseCase

) {
//        @GetMapping("/media")
//        fun findMedia(@RequestParam url: String): Boolean {
//            println("Get Mapping called")
//            return downloadMediaUseCase.downloadMedia(url)
//        }

        @GetMapping("/media")
        fun findMediaById(@RequestParam id: Int): List<Media> {
            println("Get Media by Id called -> id: $id")
            return findMediaUseCase.findById(FindMediaUseCase.FindByIdQuery(id))
        }

        @GetMapping("/info")
        fun getMediaInfo(): String {
                   println("Get Info by Id called -> id: $id")
            return getMediaInfoUseCase.
        }

//        private fun toJsonList(media: List<Media>): List<MediaJSON> {
//            return media.map {
//                MediaJSON(
//                    name =  it.name,
//                    type= it.type ,
//                    file= it.file
//                )
//            }
//        }
}
