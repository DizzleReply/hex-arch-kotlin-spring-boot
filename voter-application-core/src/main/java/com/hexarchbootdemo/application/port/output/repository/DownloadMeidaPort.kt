package com.hexarchbootdemo.application.port.output.repository

interface DownloadMediaPort {
    fun downloadMediaByUrl(url: String)
    fun downloadMetadataByUrl(url: String)

}