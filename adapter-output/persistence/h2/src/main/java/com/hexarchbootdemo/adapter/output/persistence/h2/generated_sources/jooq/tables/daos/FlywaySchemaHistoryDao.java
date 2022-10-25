/*
 * This file is generated by jOOQ.
 */
package com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.daos;


import com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.FlywaySchemaHistory;
import com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.records.FlywaySchemaHistoryRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FlywaySchemaHistoryDao extends DAOImpl<FlywaySchemaHistoryRecord, com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory, Integer> {

    /**
     * Create a new FlywaySchemaHistoryDao without any configuration
     */
    public FlywaySchemaHistoryDao() {
        super(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory.class);
    }

    /**
     * Create a new FlywaySchemaHistoryDao with an attached configuration
     */
    public FlywaySchemaHistoryDao(Configuration configuration) {
        super(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory.class, configuration);
    }

    @Override
    public Integer getId(com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory object) {
        return object.getInstalledRank();
    }

    /**
     * Fetch records that have <code>installed_rank BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchRangeOfInstalledRank(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>installed_rank IN (values)</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchByInstalledRank(Integer... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK, values);
    }

    /**
     * Fetch a unique record that has <code>installed_rank = value</code>
     */
    public com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory fetchOneByInstalledRank(Integer value) {
        return fetchOne(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK, value);
    }

    /**
     * Fetch records that have <code>version BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchRangeOfVersion(String lowerInclusive, String upperInclusive) {
        return fetchRange(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.VERSION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchByVersion(String... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.VERSION, values);
    }

    /**
     * Fetch records that have <code>description BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchRangeOfDescription(String lowerInclusive, String upperInclusive) {
        return fetchRange(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.DESCRIPTION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchByDescription(String... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>type BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchRangeOfType(String lowerInclusive, String upperInclusive) {
        return fetchRange(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.TYPE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchByType(String... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.TYPE, values);
    }

    /**
     * Fetch records that have <code>script BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchRangeOfScript(String lowerInclusive, String upperInclusive) {
        return fetchRange(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SCRIPT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>script IN (values)</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchByScript(String... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SCRIPT, values);
    }

    /**
     * Fetch records that have <code>checksum BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchRangeOfChecksum(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.CHECKSUM, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>checksum IN (values)</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchByChecksum(Integer... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.CHECKSUM, values);
    }

    /**
     * Fetch records that have <code>installed_by BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchRangeOfInstalledBy(String lowerInclusive, String upperInclusive) {
        return fetchRange(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_BY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>installed_by IN (values)</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchByInstalledBy(String... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_BY, values);
    }

    /**
     * Fetch records that have <code>installed_on BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchRangeOfInstalledOn(Timestamp lowerInclusive, Timestamp upperInclusive) {
        return fetchRange(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_ON, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>installed_on IN (values)</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchByInstalledOn(Timestamp... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_ON, values);
    }

    /**
     * Fetch records that have <code>execution_time BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchRangeOfExecutionTime(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.EXECUTION_TIME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>execution_time IN (values)</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchByExecutionTime(Integer... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.EXECUTION_TIME, values);
    }

    /**
     * Fetch records that have <code>success BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchRangeOfSuccess(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SUCCESS, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>success IN (values)</code>
     */
    public List<com.hexarchbootdemo.adapter.output.persistence.h2.generated_sources.jooq.tables.pojos.FlywaySchemaHistory> fetchBySuccess(Boolean... values) {
        return fetch(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SUCCESS, values);
    }
}
