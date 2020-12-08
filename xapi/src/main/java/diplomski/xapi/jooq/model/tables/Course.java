/*
 * This file is generated by jOOQ.
 */
package diplomski.xapi.jooq.model.tables;


import diplomski.xapi.jooq.model.Keys;
import diplomski.xapi.jooq.model.Public;
import diplomski.xapi.jooq.model.tables.records.CourseRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Course extends TableImpl<CourseRecord> {

    private static final long serialVersionUID = 1636769705;

    /**
     * The reference instance of <code>public.COURSE</code>
     */
    public static final Course COURSE = new Course();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CourseRecord> getRecordType() {
        return CourseRecord.class;
    }

    /**
     * The column <code>public.COURSE.name</code>.
     */
    public final TableField<CourseRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.COURSE.id</code>.
     */
    public final TableField<CourseRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>public.COURSE</code> table reference
     */
    public Course() {
        this(DSL.name("COURSE"), null);
    }

    /**
     * Create an aliased <code>public.COURSE</code> table reference
     */
    public Course(String alias) {
        this(DSL.name(alias), COURSE);
    }

    /**
     * Create an aliased <code>public.COURSE</code> table reference
     */
    public Course(Name alias) {
        this(alias, COURSE);
    }

    private Course(Name alias, Table<CourseRecord> aliased) {
        this(alias, aliased, null);
    }

    private Course(Name alias, Table<CourseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Course(Table<O> child, ForeignKey<O, CourseRecord> key) {
        super(child, key, COURSE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<CourseRecord> getPrimaryKey() {
        return Keys.COURSE_PKEY;
    }

    @Override
    public List<UniqueKey<CourseRecord>> getKeys() {
        return Arrays.<UniqueKey<CourseRecord>>asList(Keys.COURSE_PKEY);
    }

    @Override
    public Course as(String alias) {
        return new Course(DSL.name(alias), this);
    }

    @Override
    public Course as(Name alias) {
        return new Course(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Course rename(String name) {
        return new Course(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Course rename(Name name) {
        return new Course(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}