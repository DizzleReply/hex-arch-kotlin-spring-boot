package com.hexarchbootdemo.application.port.output.repository

import com.hexarchbootdemo.application.port.input.FindMediaUseCase
import com.hexarchbootdemo.domain.model.Media
import com.hexarchbootdemo.domain.model.Voter
import kotlinx.coroutines.flow.Flow

interface FindMediaPort {
    fun findMediaById(query: FindMediaUseCase.FindByIdQuery): List<Media>
    fun findMediaInfoQuery(query: FindMediaUseCase.FindMediaInfoQuery): String

    suspend fun findVotersByLastNameReactive(query: FindMediaUseCase.FindByIdQuery): Flow<Voter>
}
