/*
 * This file is generated by jOOQ.
 */
package diplomski.xapi.jooq.model.tables.records;


import diplomski.xapi.jooq.model.tables.QuizPages;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuizPagesRecord extends TableRecordImpl<QuizPagesRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = 1897441120;

    /**
     * Setter for <code>public.QUIZ_PAGES.page</code>.
     */
    public void setPage(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.QUIZ_PAGES.page</code>.
     */
    public Integer getPage() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.QUIZ_PAGES.question</code>.
     */
    public void setQuestion(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.QUIZ_PAGES.question</code>.
     */
    public String getQuestion() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.QUIZ_PAGES.quizId</code>.
     */
    public void setQuizid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.QUIZ_PAGES.quizId</code>.
     */
    public String getQuizid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.QUIZ_PAGES.answer</code>.
     */
    public void setAnswer(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.QUIZ_PAGES.answer</code>.
     */
    public String getAnswer() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return QuizPages.QUIZ_PAGES.PAGE;
    }

    @Override
    public Field<String> field2() {
        return QuizPages.QUIZ_PAGES.QUESTION;
    }

    @Override
    public Field<String> field3() {
        return QuizPages.QUIZ_PAGES.QUIZID;
    }

    @Override
    public Field<String> field4() {
        return QuizPages.QUIZ_PAGES.ANSWER;
    }

    @Override
    public Integer component1() {
        return getPage();
    }

    @Override
    public String component2() {
        return getQuestion();
    }

    @Override
    public String component3() {
        return getQuizid();
    }

    @Override
    public String component4() {
        return getAnswer();
    }

    @Override
    public Integer value1() {
        return getPage();
    }

    @Override
    public String value2() {
        return getQuestion();
    }

    @Override
    public String value3() {
        return getQuizid();
    }

    @Override
    public String value4() {
        return getAnswer();
    }

    @Override
    public QuizPagesRecord value1(Integer value) {
        setPage(value);
        return this;
    }

    @Override
    public QuizPagesRecord value2(String value) {
        setQuestion(value);
        return this;
    }

    @Override
    public QuizPagesRecord value3(String value) {
        setQuizid(value);
        return this;
    }

    @Override
    public QuizPagesRecord value4(String value) {
        setAnswer(value);
        return this;
    }

    @Override
    public QuizPagesRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached QuizPagesRecord
     */
    public QuizPagesRecord() {
        super(QuizPages.QUIZ_PAGES);
    }

    /**
     * Create a detached, initialised QuizPagesRecord
     */
    public QuizPagesRecord(Integer page, String question, String quizid, String answer) {
        super(QuizPages.QUIZ_PAGES);

        set(0, page);
        set(1, question);
        set(2, quizid);
        set(3, answer);
    }
}
