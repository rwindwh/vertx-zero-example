/*
 * This up.god.file is generated by jOOQ.
 */
package com.htl.domain.tables.records;


import com.htl.domain.tables.SysMenu;
import com.htl.domain.tables.interfaces.ISysMenu;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.7"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class SysMenuRecord extends UpdatableRecordImpl<SysMenuRecord> implements Record22<String, String, String, String, String, String, String, String, String, String, String, Long, Integer, Long, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime>, ISysMenu {

    private static final long serialVersionUID = -986394081;

    /**
     * Create a detached SysMenuRecord
     */
    public SysMenuRecord() {
        super(SysMenu.SYS_MENU);
    }

    /**
     * Create a detached, initialised SysMenuRecord
     */
    public SysMenuRecord(String pkId, String tScript, String vAppId, String vResId, String sName, String sCode, String sIcon, String sText, String sType, String sUri, String jConfig, Long iLeft, Integer iLevel, Long iRight, String rParentId, Boolean isActive, String zSigma, String zLanguage, String zCreateBy, LocalDateTime zCreateTime, String zUpdateBy, LocalDateTime zUpdateTime) {
        super(SysMenu.SYS_MENU);

        set(0, pkId);
        set(1, tScript);
        set(2, vAppId);
        set(3, vResId);
        set(4, sName);
        set(5, sCode);
        set(6, sIcon);
        set(7, sText);
        set(8, sType);
        set(9, sUri);
        set(10, jConfig);
        set(11, iLeft);
        set(12, iLevel);
        set(13, iRight);
        set(14, rParentId);
        set(15, isActive);
        set(16, zSigma);
        set(17, zLanguage);
        set(18, zCreateBy);
        set(19, zCreateTime);
        set(20, zUpdateBy);
        set(21, zUpdateTime);
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public String getPkId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.PK_ID</code>. uniqueId,PK_ID
     */
    @Override
    public SysMenuRecord setPkId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.T_SCRIPT</code>. script,T_SCRIPT
     */
    @Override
    public String getTScript() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.T_SCRIPT</code>. script,T_SCRIPT
     */
    @Override
    public SysMenuRecord setTScript(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.V_APP_ID</code>. appId,V_APP_ID
     */
    @Override
    public String getVAppId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.V_APP_ID</code>. appId,V_APP_ID
     */
    @Override
    public SysMenuRecord setVAppId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.V_RES_ID</code>. resourceId,V_RES_ID
     */
    @Override
    public String getVResId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.V_RES_ID</code>. resourceId,V_RES_ID
     */
    @Override
    public SysMenuRecord setVResId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.S_NAME</code>. name,S_NAME
     */
    @Override
    public String getSName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.S_NAME</code>. name,S_NAME
     */
    @Override
    public SysMenuRecord setSName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.S_CODE</code>. code,S_CODE
     */
    @Override
    public String getSCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.S_CODE</code>. code,S_CODE
     */
    @Override
    public SysMenuRecord setSCode(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.S_ICON</code>. icon,S_ICON
     */
    @Override
    public String getSIcon() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.S_ICON</code>. icon,S_ICON
     */
    @Override
    public SysMenuRecord setSIcon(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.S_TEXT</code>. text,S_TEXT
     */
    @Override
    public String getSText() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.S_TEXT</code>. text,S_TEXT
     */
    @Override
    public SysMenuRecord setSText(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.S_TYPE</code>. type,S_TYPE
     */
    @Override
    public String getSType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.S_TYPE</code>. type,S_TYPE
     */
    @Override
    public SysMenuRecord setSType(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.S_URI</code>. uri,S_URI
     */
    @Override
    public String getSUri() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.S_URI</code>. uri,S_URI
     */
    @Override
    public SysMenuRecord setSUri(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.J_CONFIG</code>. config,J_CONFIG
     */
    @Override
    public String getJConfig() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.J_CONFIG</code>. config,J_CONFIG
     */
    @Override
    public SysMenuRecord setJConfig(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.I_LEFT</code>. left,I_LEFT
     */
    @Override
    public Long getILeft() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.I_LEFT</code>. left,I_LEFT
     */
    @Override
    public SysMenuRecord setILeft(Long value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.I_LEVEL</code>. level,I_LEVEL
     */
    @Override
    public Integer getILevel() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.I_LEVEL</code>. level,I_LEVEL
     */
    @Override
    public SysMenuRecord setILevel(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.I_RIGHT</code>. right,I_RIGHT
     */
    @Override
    public Long getIRight() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.I_RIGHT</code>. right,I_RIGHT
     */
    @Override
    public SysMenuRecord setIRight(Long value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.R_PARENT_ID</code>. parentId,R_PARENT_ID
     */
    @Override
    public String getRParentId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.R_PARENT_ID</code>. parentId,R_PARENT_ID
     */
    @Override
    public SysMenuRecord setRParentId(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    @Override
    public Boolean getIsActive() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.IS_ACTIVE</code>. active,IS_ACTIVE
     */
    @Override
    public SysMenuRecord setIsActive(Boolean value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    @Override
    public String getZSigma() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.Z_SIGMA</code>. sigma,Z_SIGMA
     */
    @Override
    public SysMenuRecord setZSigma(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    @Override
    public String getZLanguage() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.Z_LANGUAGE</code>. language,Z_LANGUAGE
     */
    @Override
    public SysMenuRecord setZLanguage(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    @Override
    public String getZCreateBy() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.Z_CREATE_BY</code>. createBy,Z_CREATE_BY
     */
    @Override
    public SysMenuRecord setZCreateBy(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    @Override
    public LocalDateTime getZCreateTime() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.Z_CREATE_TIME</code>. createTime,Z_CREATE_TIME
     */
    @Override
    public SysMenuRecord setZCreateTime(LocalDateTime value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_HTL.SYS_MENU.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    @Override
    public String getZUpdateBy() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_HTL.SYS_MENU.Z_UPDATE_BY</code>. updateBy,Z_UPDATE_BY
     */
    @Override
    public SysMenuRecord setZUpdateBy(String value) {
        set(20, value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>DB_HTL.SYS_MENU.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    @Override
    public LocalDateTime getZUpdateTime() {
        return (LocalDateTime) get(21);
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>DB_HTL.SYS_MENU.Z_UPDATE_TIME</code>. updateTime,Z_UPDATE_TIME
     */
    @Override
    public SysMenuRecord setZUpdateTime(LocalDateTime value) {
        set(21, value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<String, String, String, String, String, String, String, String, String, String, String, Long, Integer, Long, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<String, String, String, String, String, String, String, String, String, String, String, Long, Integer, Long, String, Boolean, String, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SysMenu.SYS_MENU.PK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SysMenu.SYS_MENU.T_SCRIPT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SysMenu.SYS_MENU.V_APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return SysMenu.SYS_MENU.V_RES_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SysMenu.SYS_MENU.S_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SysMenu.SYS_MENU.S_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return SysMenu.SYS_MENU.S_ICON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return SysMenu.SYS_MENU.S_TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return SysMenu.SYS_MENU.S_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return SysMenu.SYS_MENU.S_URI;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return SysMenu.SYS_MENU.J_CONFIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return SysMenu.SYS_MENU.I_LEFT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return SysMenu.SYS_MENU.I_LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return SysMenu.SYS_MENU.I_RIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return SysMenu.SYS_MENU.R_PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field16() {
        return SysMenu.SYS_MENU.IS_ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return SysMenu.SYS_MENU.Z_SIGMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return SysMenu.SYS_MENU.Z_LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return SysMenu.SYS_MENU.Z_CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field20() {
        return SysMenu.SYS_MENU.Z_CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return SysMenu.SYS_MENU.Z_UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field22() {
        return SysMenu.SYS_MENU.Z_UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getPkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTScript();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getVAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getVResId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSIcon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getSText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getSType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getSUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getJConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component12() {
        return getILeft();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getILevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component14() {
        return getIRight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getRParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component16() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getZSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getZLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getZCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component20() {
        return getZCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component21() {
        return getZUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component22() {
        return getZUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getPkId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTScript();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getVAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getVResId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSIcon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getSText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getSType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getSUri();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getJConfig();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getILeft();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getILevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getIRight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getRParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value16() {
        return getIsActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getZSigma();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getZLanguage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getZCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value20() {
        return getZCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getZUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value22() {
        return getZUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value1(String value) {
        setPkId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value2(String value) {
        setTScript(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value3(String value) {
        setVAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value4(String value) {
        setVResId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value5(String value) {
        setSName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value6(String value) {
        setSCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value7(String value) {
        setSIcon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value8(String value) {
        setSText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value9(String value) {
        setSType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value10(String value) {
        setSUri(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value11(String value) {
        setJConfig(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value12(Long value) {
        setILeft(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value13(Integer value) {
        setILevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value14(Long value) {
        setIRight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value15(String value) {
        setRParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value16(Boolean value) {
        setIsActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value17(String value) {
        setZSigma(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value18(String value) {
        setZLanguage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value19(String value) {
        setZCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value20(LocalDateTime value) {
        setZCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value21(String value) {
        setZUpdateBy(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord value22(LocalDateTime value) {
        setZUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SysMenuRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Long value12, Integer value13, Long value14, String value15, Boolean value16, String value17, String value18, String value19, LocalDateTime value20, String value21, LocalDateTime value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISysMenu from) {
        setPkId(from.getPkId());
        setTScript(from.getTScript());
        setVAppId(from.getVAppId());
        setVResId(from.getVResId());
        setSName(from.getSName());
        setSCode(from.getSCode());
        setSIcon(from.getSIcon());
        setSText(from.getSText());
        setSType(from.getSType());
        setSUri(from.getSUri());
        setJConfig(from.getJConfig());
        setILeft(from.getILeft());
        setILevel(from.getILevel());
        setIRight(from.getIRight());
        setRParentId(from.getRParentId());
        setIsActive(from.getIsActive());
        setZSigma(from.getZSigma());
        setZLanguage(from.getZLanguage());
        setZCreateBy(from.getZCreateBy());
        setZCreateTime(from.getZCreateTime());
        setZUpdateBy(from.getZUpdateBy());
        setZUpdateTime(from.getZUpdateTime());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISysMenu> E into(E into) {
        into.from(this);
        return into;
    }
}
