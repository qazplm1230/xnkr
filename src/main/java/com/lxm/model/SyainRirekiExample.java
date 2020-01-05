package com.lxm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyainRirekiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyainRirekiExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSyainIdIsNull() {
            addCriterion("SYAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andSyainIdIsNotNull() {
            addCriterion("SYAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSyainIdEqualTo(Integer value) {
            addCriterion("SYAIN_ID =", value, "syainId");
            return (Criteria) this;
        }

        public Criteria andSyainIdNotEqualTo(Integer value) {
            addCriterion("SYAIN_ID <>", value, "syainId");
            return (Criteria) this;
        }

        public Criteria andSyainIdGreaterThan(Integer value) {
            addCriterion("SYAIN_ID >", value, "syainId");
            return (Criteria) this;
        }

        public Criteria andSyainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYAIN_ID >=", value, "syainId");
            return (Criteria) this;
        }

        public Criteria andSyainIdLessThan(Integer value) {
            addCriterion("SYAIN_ID <", value, "syainId");
            return (Criteria) this;
        }

        public Criteria andSyainIdLessThanOrEqualTo(Integer value) {
            addCriterion("SYAIN_ID <=", value, "syainId");
            return (Criteria) this;
        }

        public Criteria andSyainIdIn(List<Integer> values) {
            addCriterion("SYAIN_ID in", values, "syainId");
            return (Criteria) this;
        }

        public Criteria andSyainIdNotIn(List<Integer> values) {
            addCriterion("SYAIN_ID not in", values, "syainId");
            return (Criteria) this;
        }

        public Criteria andSyainIdBetween(Integer value1, Integer value2) {
            addCriterion("SYAIN_ID between", value1, value2, "syainId");
            return (Criteria) this;
        }

        public Criteria andSyainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SYAIN_ID not between", value1, value2, "syainId");
            return (Criteria) this;
        }

        public Criteria andKaisibiIsNull() {
            addCriterion("KAISIBI is null");
            return (Criteria) this;
        }

        public Criteria andKaisibiIsNotNull() {
            addCriterion("KAISIBI is not null");
            return (Criteria) this;
        }

        public Criteria andKaisibiEqualTo(Date value) {
            addCriterionForJDBCDate("KAISIBI =", value, "kaisibi");
            return (Criteria) this;
        }

        public Criteria andKaisibiNotEqualTo(Date value) {
            addCriterionForJDBCDate("KAISIBI <>", value, "kaisibi");
            return (Criteria) this;
        }

        public Criteria andKaisibiGreaterThan(Date value) {
            addCriterionForJDBCDate("KAISIBI >", value, "kaisibi");
            return (Criteria) this;
        }

        public Criteria andKaisibiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("KAISIBI >=", value, "kaisibi");
            return (Criteria) this;
        }

        public Criteria andKaisibiLessThan(Date value) {
            addCriterionForJDBCDate("KAISIBI <", value, "kaisibi");
            return (Criteria) this;
        }

        public Criteria andKaisibiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("KAISIBI <=", value, "kaisibi");
            return (Criteria) this;
        }

        public Criteria andKaisibiIn(List<Date> values) {
            addCriterionForJDBCDate("KAISIBI in", values, "kaisibi");
            return (Criteria) this;
        }

        public Criteria andKaisibiNotIn(List<Date> values) {
            addCriterionForJDBCDate("KAISIBI not in", values, "kaisibi");
            return (Criteria) this;
        }

        public Criteria andKaisibiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("KAISIBI between", value1, value2, "kaisibi");
            return (Criteria) this;
        }

        public Criteria andKaisibiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("KAISIBI not between", value1, value2, "kaisibi");
            return (Criteria) this;
        }

        public Criteria andSyuryobiIsNull() {
            addCriterion("SYURYOBI is null");
            return (Criteria) this;
        }

        public Criteria andSyuryobiIsNotNull() {
            addCriterion("SYURYOBI is not null");
            return (Criteria) this;
        }

        public Criteria andSyuryobiEqualTo(Date value) {
            addCriterionForJDBCDate("SYURYOBI =", value, "syuryobi");
            return (Criteria) this;
        }

        public Criteria andSyuryobiNotEqualTo(Date value) {
            addCriterionForJDBCDate("SYURYOBI <>", value, "syuryobi");
            return (Criteria) this;
        }

        public Criteria andSyuryobiGreaterThan(Date value) {
            addCriterionForJDBCDate("SYURYOBI >", value, "syuryobi");
            return (Criteria) this;
        }

        public Criteria andSyuryobiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SYURYOBI >=", value, "syuryobi");
            return (Criteria) this;
        }

        public Criteria andSyuryobiLessThan(Date value) {
            addCriterionForJDBCDate("SYURYOBI <", value, "syuryobi");
            return (Criteria) this;
        }

        public Criteria andSyuryobiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SYURYOBI <=", value, "syuryobi");
            return (Criteria) this;
        }

        public Criteria andSyuryobiIn(List<Date> values) {
            addCriterionForJDBCDate("SYURYOBI in", values, "syuryobi");
            return (Criteria) this;
        }

        public Criteria andSyuryobiNotIn(List<Date> values) {
            addCriterionForJDBCDate("SYURYOBI not in", values, "syuryobi");
            return (Criteria) this;
        }

        public Criteria andSyuryobiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SYURYOBI between", value1, value2, "syuryobi");
            return (Criteria) this;
        }

        public Criteria andSyuryobiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SYURYOBI not between", value1, value2, "syuryobi");
            return (Criteria) this;
        }

        public Criteria andKaisyaNameIsNull() {
            addCriterion("KAISYA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andKaisyaNameIsNotNull() {
            addCriterion("KAISYA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andKaisyaNameEqualTo(String value) {
            addCriterion("KAISYA_NAME =", value, "kaisyaName");
            return (Criteria) this;
        }

        public Criteria andKaisyaNameNotEqualTo(String value) {
            addCriterion("KAISYA_NAME <>", value, "kaisyaName");
            return (Criteria) this;
        }

        public Criteria andKaisyaNameGreaterThan(String value) {
            addCriterion("KAISYA_NAME >", value, "kaisyaName");
            return (Criteria) this;
        }

        public Criteria andKaisyaNameGreaterThanOrEqualTo(String value) {
            addCriterion("KAISYA_NAME >=", value, "kaisyaName");
            return (Criteria) this;
        }

        public Criteria andKaisyaNameLessThan(String value) {
            addCriterion("KAISYA_NAME <", value, "kaisyaName");
            return (Criteria) this;
        }

        public Criteria andKaisyaNameLessThanOrEqualTo(String value) {
            addCriterion("KAISYA_NAME <=", value, "kaisyaName");
            return (Criteria) this;
        }

        public Criteria andKaisyaNameLike(String value) {
            addCriterion("KAISYA_NAME like", value, "kaisyaName");
            return (Criteria) this;
        }

        public Criteria andKaisyaNameNotLike(String value) {
            addCriterion("KAISYA_NAME not like", value, "kaisyaName");
            return (Criteria) this;
        }

        public Criteria andKaisyaNameIn(List<String> values) {
            addCriterion("KAISYA_NAME in", values, "kaisyaName");
            return (Criteria) this;
        }

        public Criteria andKaisyaNameNotIn(List<String> values) {
            addCriterion("KAISYA_NAME not in", values, "kaisyaName");
            return (Criteria) this;
        }

        public Criteria andKaisyaNameBetween(String value1, String value2) {
            addCriterion("KAISYA_NAME between", value1, value2, "kaisyaName");
            return (Criteria) this;
        }

        public Criteria andKaisyaNameNotBetween(String value1, String value2) {
            addCriterion("KAISYA_NAME not between", value1, value2, "kaisyaName");
            return (Criteria) this;
        }

        public Criteria andBusyoIsNull() {
            addCriterion("BUSYO is null");
            return (Criteria) this;
        }

        public Criteria andBusyoIsNotNull() {
            addCriterion("BUSYO is not null");
            return (Criteria) this;
        }

        public Criteria andBusyoEqualTo(String value) {
            addCriterion("BUSYO =", value, "busyo");
            return (Criteria) this;
        }

        public Criteria andBusyoNotEqualTo(String value) {
            addCriterion("BUSYO <>", value, "busyo");
            return (Criteria) this;
        }

        public Criteria andBusyoGreaterThan(String value) {
            addCriterion("BUSYO >", value, "busyo");
            return (Criteria) this;
        }

        public Criteria andBusyoGreaterThanOrEqualTo(String value) {
            addCriterion("BUSYO >=", value, "busyo");
            return (Criteria) this;
        }

        public Criteria andBusyoLessThan(String value) {
            addCriterion("BUSYO <", value, "busyo");
            return (Criteria) this;
        }

        public Criteria andBusyoLessThanOrEqualTo(String value) {
            addCriterion("BUSYO <=", value, "busyo");
            return (Criteria) this;
        }

        public Criteria andBusyoLike(String value) {
            addCriterion("BUSYO like", value, "busyo");
            return (Criteria) this;
        }

        public Criteria andBusyoNotLike(String value) {
            addCriterion("BUSYO not like", value, "busyo");
            return (Criteria) this;
        }

        public Criteria andBusyoIn(List<String> values) {
            addCriterion("BUSYO in", values, "busyo");
            return (Criteria) this;
        }

        public Criteria andBusyoNotIn(List<String> values) {
            addCriterion("BUSYO not in", values, "busyo");
            return (Criteria) this;
        }

        public Criteria andBusyoBetween(String value1, String value2) {
            addCriterion("BUSYO between", value1, value2, "busyo");
            return (Criteria) this;
        }

        public Criteria andBusyoNotBetween(String value1, String value2) {
            addCriterion("BUSYO not between", value1, value2, "busyo");
            return (Criteria) this;
        }

        public Criteria andTourokubiIsNull() {
            addCriterion("TOUROKUBI is null");
            return (Criteria) this;
        }

        public Criteria andTourokubiIsNotNull() {
            addCriterion("TOUROKUBI is not null");
            return (Criteria) this;
        }

        public Criteria andTourokubiEqualTo(Date value) {
            addCriterion("TOUROKUBI =", value, "tourokubi");
            return (Criteria) this;
        }

        public Criteria andTourokubiNotEqualTo(Date value) {
            addCriterion("TOUROKUBI <>", value, "tourokubi");
            return (Criteria) this;
        }

        public Criteria andTourokubiGreaterThan(Date value) {
            addCriterion("TOUROKUBI >", value, "tourokubi");
            return (Criteria) this;
        }

        public Criteria andTourokubiGreaterThanOrEqualTo(Date value) {
            addCriterion("TOUROKUBI >=", value, "tourokubi");
            return (Criteria) this;
        }

        public Criteria andTourokubiLessThan(Date value) {
            addCriterion("TOUROKUBI <", value, "tourokubi");
            return (Criteria) this;
        }

        public Criteria andTourokubiLessThanOrEqualTo(Date value) {
            addCriterion("TOUROKUBI <=", value, "tourokubi");
            return (Criteria) this;
        }

        public Criteria andTourokubiIn(List<Date> values) {
            addCriterion("TOUROKUBI in", values, "tourokubi");
            return (Criteria) this;
        }

        public Criteria andTourokubiNotIn(List<Date> values) {
            addCriterion("TOUROKUBI not in", values, "tourokubi");
            return (Criteria) this;
        }

        public Criteria andTourokubiBetween(Date value1, Date value2) {
            addCriterion("TOUROKUBI between", value1, value2, "tourokubi");
            return (Criteria) this;
        }

        public Criteria andTourokubiNotBetween(Date value1, Date value2) {
            addCriterion("TOUROKUBI not between", value1, value2, "tourokubi");
            return (Criteria) this;
        }

        public Criteria andKousinnbiIsNull() {
            addCriterion("KOUSINNBI is null");
            return (Criteria) this;
        }

        public Criteria andKousinnbiIsNotNull() {
            addCriterion("KOUSINNBI is not null");
            return (Criteria) this;
        }

        public Criteria andKousinnbiEqualTo(Date value) {
            addCriterion("KOUSINNBI =", value, "kousinnbi");
            return (Criteria) this;
        }

        public Criteria andKousinnbiNotEqualTo(Date value) {
            addCriterion("KOUSINNBI <>", value, "kousinnbi");
            return (Criteria) this;
        }

        public Criteria andKousinnbiGreaterThan(Date value) {
            addCriterion("KOUSINNBI >", value, "kousinnbi");
            return (Criteria) this;
        }

        public Criteria andKousinnbiGreaterThanOrEqualTo(Date value) {
            addCriterion("KOUSINNBI >=", value, "kousinnbi");
            return (Criteria) this;
        }

        public Criteria andKousinnbiLessThan(Date value) {
            addCriterion("KOUSINNBI <", value, "kousinnbi");
            return (Criteria) this;
        }

        public Criteria andKousinnbiLessThanOrEqualTo(Date value) {
            addCriterion("KOUSINNBI <=", value, "kousinnbi");
            return (Criteria) this;
        }

        public Criteria andKousinnbiIn(List<Date> values) {
            addCriterion("KOUSINNBI in", values, "kousinnbi");
            return (Criteria) this;
        }

        public Criteria andKousinnbiNotIn(List<Date> values) {
            addCriterion("KOUSINNBI not in", values, "kousinnbi");
            return (Criteria) this;
        }

        public Criteria andKousinnbiBetween(Date value1, Date value2) {
            addCriterion("KOUSINNBI between", value1, value2, "kousinnbi");
            return (Criteria) this;
        }

        public Criteria andKousinnbiNotBetween(Date value1, Date value2) {
            addCriterion("KOUSINNBI not between", value1, value2, "kousinnbi");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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