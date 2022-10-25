package com.hexarchbootdemo.adapter.output.persistence.h2.internal

import com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.Voter.VOTER
import com.hexarchbootdemo.application.port.input.FindMediaUseCase
import com.hexarchbootdemo.application.port.input.FindVoterUseCase.FindByLastNameQuery
import com.hexarchbootdemo.application.port.input.RegisterVoterUseCase.RegisterVoterCommand
import com.hexarchbootdemo.application.port.output.repository.FindMediaPort
import com.hexarchbootdemo.application.port.output.repository.FindVoterPort
import com.hexarchbootdemo.application.port.output.repository.RegisterVoterPort
import com.hexarchbootdemo.domain.model.Media
import com.hexarchbootdemo.domain.model.SocialSecurityNumber
import com.hexarchbootdemo.domain.model.Voter
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.reactive.asFlow
import org.jooq.DSLContext
import org.jooq.conf.ParamType
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.r2dbc.core.DatabaseClient
import org.springframework.data.r2dbc.core.await
import org.springframework.stereotype.Repository
import java.util.UUID
import java.util.stream.Collectors

@Repository("MediaPersistenceH2Adapter")
internal class MediaPersistenceH2Adapter @Autowired constructor(
    val dslContext: DSLContext,
    val databaseClient: DatabaseClient
) : FindMediaPort {
    override fun findMediaById(query: FindMediaUseCase.FindByIdQuery): List<Media> {
                TODO("Not yet implemented")
    }

    override suspend fun findVotersByLastNameReactive(query: FindMediaUseCase.FindByIdQuery): Flow<Voter> {
        TODO("Not yet implemented")
    }

}