package com.woniuxy.pojo;

import java.util.ArrayList;
import java.util.List;

public class TrueorfalseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    public TrueorfalseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTfIdIsNull() {
            addCriterion("tf_id is null");
            return (Criteria) this;
        }

        public Criteria andTfIdIsNotNull() {
            addCriterion("tf_id is not null");
            return (Criteria) this;
        }

        public Criteria andTfIdEqualTo(Integer value) {
            addCriterion("tf_id =", value, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdNotEqualTo(Integer value) {
            addCriterion("tf_id <>", value, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdGreaterThan(Integer value) {
            addCriterion("tf_id >", value, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tf_id >=", value, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdLessThan(Integer value) {
            addCriterion("tf_id <", value, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdLessThanOrEqualTo(Integer value) {
            addCriterion("tf_id <=", value, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdIn(List<Integer> values) {
            addCriterion("tf_id in", values, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdNotIn(List<Integer> values) {
            addCriterion("tf_id not in", values, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdBetween(Integer value1, Integer value2) {
            addCriterion("tf_id between", value1, value2, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tf_id not between", value1, value2, "tfId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeid is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeid is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeid =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeid <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeid >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeid >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeid <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeid <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeid in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeid not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeid between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeid not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdIsNull() {
            addCriterion("test_question_id is null");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdIsNotNull() {
            addCriterion("test_question_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdEqualTo(Integer value) {
            addCriterion("test_question_id =", value, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdNotEqualTo(Integer value) {
            addCriterion("test_question_id <>", value, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdGreaterThan(Integer value) {
            addCriterion("test_question_id >", value, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_question_id >=", value, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdLessThan(Integer value) {
            addCriterion("test_question_id <", value, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_question_id <=", value, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdIn(List<Integer> values) {
            addCriterion("test_question_id in", values, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdNotIn(List<Integer> values) {
            addCriterion("test_question_id not in", values, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("test_question_id between", value1, value2, "testQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_question_id not between", value1, value2, "testQuestionId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TrueorFalse
     *
     * @mbg.generated do_not_delete_during_merge Sat Aug 24 12:21:22 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TrueorFalse
     *
     * @mbg.generated Sat Aug 24 12:21:22 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}