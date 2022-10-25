package com.hexarchbootdemo.application.service

import com.hexarchbootdemo.application.port.input.FindMediaUseCase
import com.hexarchbootdemo.application.port.output.repository.FindMediaPort
import com.hexarchbootdemo.domain.model.Media
import com.hexarchbootdemo.domain.model.Voter
import kotlinx.coroutines.flow.Flow
import javax.inject.Named

@Named
class FindMediaService(val findMediaRepository: FindMediaPort) : FindMediaUseCase {

    override fun findById(query: FindMediaUseCase.FindByIdQuery): List<Media> {
        return findMediaRepository.findMediaById(query)
    }

    override suspend fun findByLastNameReactive(query: FindMediaUseCase.FindByIdQuery): Flow<Voter> {
        TODO("Not yet implemented")
    }

    override fun findByMediaType(query: FindMediaUseCase.FindByIdQuery): List<Voter> {
        TODO("Not yet implemented")
    }
}
