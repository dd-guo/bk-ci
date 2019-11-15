/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.quality.tables.records;


import com.tencent.devops.model.quality.tables.TCountPipeline;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCountPipelineRecord extends UpdatableRecordImpl<TCountPipelineRecord> implements Record9<Long, String, String, LocalDate, Integer, Integer, LocalDateTime, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1919021103;

    /**
     * Setter for <code>devops_quality.T_COUNT_PIPELINE.ID</code>.
     */
    public TCountPipelineRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_COUNT_PIPELINE.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>devops_quality.T_COUNT_PIPELINE.PROJECT_ID</code>.
     */
    public TCountPipelineRecord setProjectId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_COUNT_PIPELINE.PROJECT_ID</code>.
     */
    public String getProjectId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_quality.T_COUNT_PIPELINE.PIPELINE_ID</code>.
     */
    public TCountPipelineRecord setPipelineId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_COUNT_PIPELINE.PIPELINE_ID</code>.
     */
    public String getPipelineId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_quality.T_COUNT_PIPELINE.DATE</code>.
     */
    public TCountPipelineRecord setDate(LocalDate value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_COUNT_PIPELINE.DATE</code>.
     */
    public LocalDate getDate() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>devops_quality.T_COUNT_PIPELINE.COUNT</code>.
     */
    public TCountPipelineRecord setCount(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_COUNT_PIPELINE.COUNT</code>.
     */
    public Integer getCount() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>devops_quality.T_COUNT_PIPELINE.INTERCEPT_COUNT</code>.
     */
    public TCountPipelineRecord setInterceptCount(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_COUNT_PIPELINE.INTERCEPT_COUNT</code>.
     */
    public Integer getInterceptCount() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>devops_quality.T_COUNT_PIPELINE.LAST_INTERCEPT_TIME</code>.
     */
    public TCountPipelineRecord setLastInterceptTime(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_COUNT_PIPELINE.LAST_INTERCEPT_TIME</code>.
     */
    public LocalDateTime getLastInterceptTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>devops_quality.T_COUNT_PIPELINE.CREATE_TIME</code>.
     */
    public TCountPipelineRecord setCreateTime(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_COUNT_PIPELINE.CREATE_TIME</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>devops_quality.T_COUNT_PIPELINE.UPDATE_TIME</code>.
     */
    public TCountPipelineRecord setUpdateTime(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>devops_quality.T_COUNT_PIPELINE.UPDATE_TIME</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, LocalDate, Integer, Integer, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, LocalDate, Integer, Integer, LocalDateTime, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TCountPipeline.T_COUNT_PIPELINE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TCountPipeline.T_COUNT_PIPELINE.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TCountPipeline.T_COUNT_PIPELINE.PIPELINE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDate> field4() {
        return TCountPipeline.T_COUNT_PIPELINE.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TCountPipeline.T_COUNT_PIPELINE.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TCountPipeline.T_COUNT_PIPELINE.INTERCEPT_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field7() {
        return TCountPipeline.T_COUNT_PIPELINE.LAST_INTERCEPT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return TCountPipeline.T_COUNT_PIPELINE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field9() {
        return TCountPipeline.T_COUNT_PIPELINE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPipelineId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDate value4() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getInterceptCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value7() {
        return getLastInterceptTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value9() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCountPipelineRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCountPipelineRecord value2(String value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCountPipelineRecord value3(String value) {
        setPipelineId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCountPipelineRecord value4(LocalDate value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCountPipelineRecord value5(Integer value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCountPipelineRecord value6(Integer value) {
        setInterceptCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCountPipelineRecord value7(LocalDateTime value) {
        setLastInterceptTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCountPipelineRecord value8(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCountPipelineRecord value9(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCountPipelineRecord values(Long value1, String value2, String value3, LocalDate value4, Integer value5, Integer value6, LocalDateTime value7, LocalDateTime value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCountPipelineRecord
     */
    public TCountPipelineRecord() {
        super(TCountPipeline.T_COUNT_PIPELINE);
    }

    /**
     * Create a detached, initialised TCountPipelineRecord
     */
    public TCountPipelineRecord(Long id, String projectId, String pipelineId, LocalDate date, Integer count, Integer interceptCount, LocalDateTime lastInterceptTime, LocalDateTime createTime, LocalDateTime updateTime) {
        super(TCountPipeline.T_COUNT_PIPELINE);

        set(0, id);
        set(1, projectId);
        set(2, pipelineId);
        set(3, date);
        set(4, count);
        set(5, interceptCount);
        set(6, lastInterceptTime);
        set(7, createTime);
        set(8, updateTime);
    }
}