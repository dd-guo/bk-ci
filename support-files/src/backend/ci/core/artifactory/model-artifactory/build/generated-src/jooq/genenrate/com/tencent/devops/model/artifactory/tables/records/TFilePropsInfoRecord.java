/*
 * This file is generated by jOOQ.
*/
package com.tencent.devops.model.artifactory.tables.records;


import com.tencent.devops.model.artifactory.tables.TFilePropsInfo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 文件元数据信息表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TFilePropsInfoRecord extends UpdatableRecordImpl<TFilePropsInfoRecord> implements Record8<String, String, String, String, String, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 376513600;

    /**
     * Setter for <code>devops_artifactory.T_FILE_PROPS_INFO.ID</code>.
     */
    public TFilePropsInfoRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_FILE_PROPS_INFO.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>devops_artifactory.T_FILE_PROPS_INFO.PROPS_KEY</code>.
     */
    public TFilePropsInfoRecord setPropsKey(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_FILE_PROPS_INFO.PROPS_KEY</code>.
     */
    public String getPropsKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>devops_artifactory.T_FILE_PROPS_INFO.PROPS_VALUE</code>.
     */
    public TFilePropsInfoRecord setPropsValue(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_FILE_PROPS_INFO.PROPS_VALUE</code>.
     */
    public String getPropsValue() {
        return (String) get(2);
    }

    /**
     * Setter for <code>devops_artifactory.T_FILE_PROPS_INFO.FILE_ID</code>.
     */
    public TFilePropsInfoRecord setFileId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_FILE_PROPS_INFO.FILE_ID</code>.
     */
    public String getFileId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>devops_artifactory.T_FILE_PROPS_INFO.CREATOR</code>.
     */
    public TFilePropsInfoRecord setCreator(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_FILE_PROPS_INFO.CREATOR</code>.
     */
    public String getCreator() {
        return (String) get(4);
    }

    /**
     * Setter for <code>devops_artifactory.T_FILE_PROPS_INFO.MODIFIER</code>.
     */
    public TFilePropsInfoRecord setModifier(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_FILE_PROPS_INFO.MODIFIER</code>.
     */
    public String getModifier() {
        return (String) get(5);
    }

    /**
     * Setter for <code>devops_artifactory.T_FILE_PROPS_INFO.CREATE_TIME</code>.
     */
    public TFilePropsInfoRecord setCreateTime(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_FILE_PROPS_INFO.CREATE_TIME</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>devops_artifactory.T_FILE_PROPS_INFO.UPDATE_TIME</code>.
     */
    public TFilePropsInfoRecord setUpdateTime(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>devops_artifactory.T_FILE_PROPS_INFO.UPDATE_TIME</code>.
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TFilePropsInfo.T_FILE_PROPS_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TFilePropsInfo.T_FILE_PROPS_INFO.PROPS_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TFilePropsInfo.T_FILE_PROPS_INFO.PROPS_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TFilePropsInfo.T_FILE_PROPS_INFO.FILE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TFilePropsInfo.T_FILE_PROPS_INFO.CREATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TFilePropsInfo.T_FILE_PROPS_INFO.MODIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field7() {
        return TFilePropsInfo.T_FILE_PROPS_INFO.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return TFilePropsInfo.T_FILE_PROPS_INFO.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPropsKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPropsValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCreator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getModifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value7() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFilePropsInfoRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFilePropsInfoRecord value2(String value) {
        setPropsKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFilePropsInfoRecord value3(String value) {
        setPropsValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFilePropsInfoRecord value4(String value) {
        setFileId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFilePropsInfoRecord value5(String value) {
        setCreator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFilePropsInfoRecord value6(String value) {
        setModifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFilePropsInfoRecord value7(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFilePropsInfoRecord value8(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFilePropsInfoRecord values(String value1, String value2, String value3, String value4, String value5, String value6, LocalDateTime value7, LocalDateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TFilePropsInfoRecord
     */
    public TFilePropsInfoRecord() {
        super(TFilePropsInfo.T_FILE_PROPS_INFO);
    }

    /**
     * Create a detached, initialised TFilePropsInfoRecord
     */
    public TFilePropsInfoRecord(String id, String propsKey, String propsValue, String fileId, String creator, String modifier, LocalDateTime createTime, LocalDateTime updateTime) {
        super(TFilePropsInfo.T_FILE_PROPS_INFO);

        set(0, id);
        set(1, propsKey);
        set(2, propsValue);
        set(3, fileId);
        set(4, creator);
        set(5, modifier);
        set(6, createTime);
        set(7, updateTime);
    }
}