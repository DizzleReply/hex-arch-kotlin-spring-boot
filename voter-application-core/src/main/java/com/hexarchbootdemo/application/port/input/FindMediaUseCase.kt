package com.hexarchbootdemo.application.port.input

import com.hexarchbootdemo.domain.model.Media
import com.hexarchbootdemo.domain.model.Voter
import kotlinx.coroutines.flow.Flow
import org.valiktor.functions.isGreaterThan
import org.valiktor.validate

interface FindMediaUseCase {

    fun findById(query: FindByIdQuery): List<Media>
    fun getMediaInfo(query: FindByIdQuery): List<Media>

    suspend fun findByLastNameReactive(query: FindByIdQuery): Flow<Voter>

    data class FindByIdQuery(val idContains: Int) {
        init {
            validate(this) {
                validate(FindByIdQuery::idContains).isGreaterThan(0)
            }
        }
    }

    data class FindMediaInfoQuery(val apiString: Int) {
        val success: Boolean = false;
        val source: String = "";



    }

    fun findByMediaType(query: FindByIdQuery): List<Voter>

}
