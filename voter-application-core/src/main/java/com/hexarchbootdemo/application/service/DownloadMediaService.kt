package com.hexarchbootdemo.application.service;

import com.hexarchbootdemo.application.port.output.repository.FindVoterPort;

import javax.inject.Named;

@Named
class DownloadMediaService(val findVoterRepository:FindVoterPort) : FindVoterUseCase {
        override fun findByLastName(query: FindByLastNameQuery): List<Voter> {
        return findVoterRepository.findVotersByLastName(query)
        }

        override suspend fun findByLastNameReactive(query: FindByLastNameQuery): Flow<Voter> {
        return findVoterRepository.findVotersByLastNameReactive(query)
        }

        override fun findByMediaType(query: FindByLastNameQuery): List<Voter> {
        TODO("Not yet implemented")
        }
        }
