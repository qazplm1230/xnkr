package com.lxm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyainKeirekiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyainKeirekiExample() {
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

        public Criteria andPjNameIsNull() {
            addCriterion("PJ_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPjNameIsNotNull() {
            addCriterion("PJ_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPjNameEqualTo(String value) {
            addCriterion("PJ_NAME =", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameNotEqualTo(String value) {
            addCriterion("PJ_NAME <>", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameGreaterThan(String value) {
            addCriterion("PJ_NAME >", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameGreaterThanOrEqualTo(String value) {
            addCriterion("PJ_NAME >=", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameLessThan(String value) {
            addCriterion("PJ_NAME <", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameLessThanOrEqualTo(String value) {
            addCriterion("PJ_NAME <=", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameLike(String value) {
            addCriterion("PJ_NAME like", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameNotLike(String value) {
            addCriterion("PJ_NAME not like", value, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameIn(List<String> values) {
            addCriterion("PJ_NAME in", values, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameNotIn(List<String> values) {
            addCriterion("PJ_NAME not in", values, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameBetween(String value1, String value2) {
            addCriterion("PJ_NAME between", value1, value2, "pjName");
            return (Criteria) this;
        }

        public Criteria andPjNameNotBetween(String value1, String value2) {
            addCriterion("PJ_NAME not between", value1, value2, "pjName");
            return (Criteria) this;
        }

        public Criteria andTainitiFlagIsNull() {
            addCriterion("TAINITI_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTainitiFlagIsNotNull() {
            addCriterion("TAINITI_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTainitiFlagEqualTo(Integer value) {
            addCriterion("TAINITI_FLAG =", value, "tainitiFlag");
            return (Criteria) this;
        }

        public Criteria andTainitiFlagNotEqualTo(Integer value) {
            addCriterion("TAINITI_FLAG <>", value, "tainitiFlag");
            return (Criteria) this;
        }

        public Criteria andTainitiFlagGreaterThan(Integer value) {
            addCriterion("TAINITI_FLAG >", value, "tainitiFlag");
            return (Criteria) this;
        }

        public Criteria andTainitiFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("TAINITI_FLAG >=", value, "tainitiFlag");
            return (Criteria) this;
        }

        public Criteria andTainitiFlagLessThan(Integer value) {
            addCriterion("TAINITI_FLAG <", value, "tainitiFlag");
            return (Criteria) this;
        }

        public Criteria andTainitiFlagLessThanOrEqualTo(Integer value) {
            addCriterion("TAINITI_FLAG <=", value, "tainitiFlag");
            return (Criteria) this;
        }

        public Criteria andTainitiFlagIn(List<Integer> values) {
            addCriterion("TAINITI_FLAG in", values, "tainitiFlag");
            return (Criteria) this;
        }

        public Criteria andTainitiFlagNotIn(List<Integer> values) {
            addCriterion("TAINITI_FLAG not in", values, "tainitiFlag");
            return (Criteria) this;
        }

        public Criteria andTainitiFlagBetween(Integer value1, Integer value2) {
            addCriterion("TAINITI_FLAG between", value1, value2, "tainitiFlag");
            return (Criteria) this;
        }

        public Criteria andTainitiFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("TAINITI_FLAG not between", value1, value2, "tainitiFlag");
            return (Criteria) this;
        }

        public Criteria andBasyoIsNull() {
            addCriterion("BASYO is null");
            return (Criteria) this;
        }

        public Criteria andBasyoIsNotNull() {
            addCriterion("BASYO is not null");
            return (Criteria) this;
        }

        public Criteria andBasyoEqualTo(Integer value) {
            addCriterion("BASYO =", value, "basyo");
            return (Criteria) this;
        }

        public Criteria andBasyoNotEqualTo(Integer value) {
            addCriterion("BASYO <>", value, "basyo");
            return (Criteria) this;
        }

        public Criteria andBasyoGreaterThan(Integer value) {
            addCriterion("BASYO >", value, "basyo");
            return (Criteria) this;
        }

        public Criteria andBasyoGreaterThanOrEqualTo(Integer value) {
            addCriterion("BASYO >=", value, "basyo");
            return (Criteria) this;
        }

        public Criteria andBasyoLessThan(Integer value) {
            addCriterion("BASYO <", value, "basyo");
            return (Criteria) this;
        }

        public Criteria andBasyoLessThanOrEqualTo(Integer value) {
            addCriterion("BASYO <=", value, "basyo");
            return (Criteria) this;
        }

        public Criteria andBasyoIn(List<Integer> values) {
            addCriterion("BASYO in", values, "basyo");
            return (Criteria) this;
        }

        public Criteria andBasyoNotIn(List<Integer> values) {
            addCriterion("BASYO not in", values, "basyo");
            return (Criteria) this;
        }

        public Criteria andBasyoBetween(Integer value1, Integer value2) {
            addCriterion("BASYO between", value1, value2, "basyo");
            return (Criteria) this;
        }

        public Criteria andBasyoNotBetween(Integer value1, Integer value2) {
            addCriterion("BASYO not between", value1, value2, "basyo");
            return (Criteria) this;
        }

        public Criteria andKiboIsNull() {
            addCriterion("KIBO is null");
            return (Criteria) this;
        }

        public Criteria andKiboIsNotNull() {
            addCriterion("KIBO is not null");
            return (Criteria) this;
        }

        public Criteria andKiboEqualTo(Integer value) {
            addCriterion("KIBO =", value, "kibo");
            return (Criteria) this;
        }

        public Criteria andKiboNotEqualTo(Integer value) {
            addCriterion("KIBO <>", value, "kibo");
            return (Criteria) this;
        }

        public Criteria andKiboGreaterThan(Integer value) {
            addCriterion("KIBO >", value, "kibo");
            return (Criteria) this;
        }

        public Criteria andKiboGreaterThanOrEqualTo(Integer value) {
            addCriterion("KIBO >=", value, "kibo");
            return (Criteria) this;
        }

        public Criteria andKiboLessThan(Integer value) {
            addCriterion("KIBO <", value, "kibo");
            return (Criteria) this;
        }

        public Criteria andKiboLessThanOrEqualTo(Integer value) {
            addCriterion("KIBO <=", value, "kibo");
            return (Criteria) this;
        }

        public Criteria andKiboIn(List<Integer> values) {
            addCriterion("KIBO in", values, "kibo");
            return (Criteria) this;
        }

        public Criteria andKiboNotIn(List<Integer> values) {
            addCriterion("KIBO not in", values, "kibo");
            return (Criteria) this;
        }

        public Criteria andKiboBetween(Integer value1, Integer value2) {
            addCriterion("KIBO between", value1, value2, "kibo");
            return (Criteria) this;
        }

        public Criteria andKiboNotBetween(Integer value1, Integer value2) {
            addCriterion("KIBO not between", value1, value2, "kibo");
            return (Criteria) this;
        }

        public Criteria andGyosyuIsNull() {
            addCriterion("GYOSYU is null");
            return (Criteria) this;
        }

        public Criteria andGyosyuIsNotNull() {
            addCriterion("GYOSYU is not null");
            return (Criteria) this;
        }

        public Criteria andGyosyuEqualTo(Integer value) {
            addCriterion("GYOSYU =", value, "gyosyu");
            return (Criteria) this;
        }

        public Criteria andGyosyuNotEqualTo(Integer value) {
            addCriterion("GYOSYU <>", value, "gyosyu");
            return (Criteria) this;
        }

        public Criteria andGyosyuGreaterThan(Integer value) {
            addCriterion("GYOSYU >", value, "gyosyu");
            return (Criteria) this;
        }

        public Criteria andGyosyuGreaterThanOrEqualTo(Integer value) {
            addCriterion("GYOSYU >=", value, "gyosyu");
            return (Criteria) this;
        }

        public Criteria andGyosyuLessThan(Integer value) {
            addCriterion("GYOSYU <", value, "gyosyu");
            return (Criteria) this;
        }

        public Criteria andGyosyuLessThanOrEqualTo(Integer value) {
            addCriterion("GYOSYU <=", value, "gyosyu");
            return (Criteria) this;
        }

        public Criteria andGyosyuIn(List<Integer> values) {
            addCriterion("GYOSYU in", values, "gyosyu");
            return (Criteria) this;
        }

        public Criteria andGyosyuNotIn(List<Integer> values) {
            addCriterion("GYOSYU not in", values, "gyosyu");
            return (Criteria) this;
        }

        public Criteria andGyosyuBetween(Integer value1, Integer value2) {
            addCriterion("GYOSYU between", value1, value2, "gyosyu");
            return (Criteria) this;
        }

        public Criteria andGyosyuNotBetween(Integer value1, Integer value2) {
            addCriterion("GYOSYU not between", value1, value2, "gyosyu");
            return (Criteria) this;
        }

        public Criteria andKaihatukankyoIsNull() {
            addCriterion("KAIHATUKANKYO is null");
            return (Criteria) this;
        }

        public Criteria andKaihatukankyoIsNotNull() {
            addCriterion("KAIHATUKANKYO is not null");
            return (Criteria) this;
        }

        public Criteria andKaihatukankyoEqualTo(Integer value) {
            addCriterion("KAIHATUKANKYO =", value, "kaihatukankyo");
            return (Criteria) this;
        }

        public Criteria andKaihatukankyoNotEqualTo(Integer value) {
            addCriterion("KAIHATUKANKYO <>", value, "kaihatukankyo");
            return (Criteria) this;
        }

        public Criteria andKaihatukankyoGreaterThan(Integer value) {
            addCriterion("KAIHATUKANKYO >", value, "kaihatukankyo");
            return (Criteria) this;
        }

        public Criteria andKaihatukankyoGreaterThanOrEqualTo(Integer value) {
            addCriterion("KAIHATUKANKYO >=", value, "kaihatukankyo");
            return (Criteria) this;
        }

        public Criteria andKaihatukankyoLessThan(Integer value) {
            addCriterion("KAIHATUKANKYO <", value, "kaihatukankyo");
            return (Criteria) this;
        }

        public Criteria andKaihatukankyoLessThanOrEqualTo(Integer value) {
            addCriterion("KAIHATUKANKYO <=", value, "kaihatukankyo");
            return (Criteria) this;
        }

        public Criteria andKaihatukankyoIn(List<Integer> values) {
            addCriterion("KAIHATUKANKYO in", values, "kaihatukankyo");
            return (Criteria) this;
        }

        public Criteria andKaihatukankyoNotIn(List<Integer> values) {
            addCriterion("KAIHATUKANKYO not in", values, "kaihatukankyo");
            return (Criteria) this;
        }

        public Criteria andKaihatukankyoBetween(Integer value1, Integer value2) {
            addCriterion("KAIHATUKANKYO between", value1, value2, "kaihatukankyo");
            return (Criteria) this;
        }

        public Criteria andKaihatukankyoNotBetween(Integer value1, Integer value2) {
            addCriterion("KAIHATUKANKYO not between", value1, value2, "kaihatukankyo");
            return (Criteria) this;
        }

        public Criteria andUnyoukankyoIsNull() {
            addCriterion("UNYOUKANKYO is null");
            return (Criteria) this;
        }

        public Criteria andUnyoukankyoIsNotNull() {
            addCriterion("UNYOUKANKYO is not null");
            return (Criteria) this;
        }

        public Criteria andUnyoukankyoEqualTo(Integer value) {
            addCriterion("UNYOUKANKYO =", value, "unyoukankyo");
            return (Criteria) this;
        }

        public Criteria andUnyoukankyoNotEqualTo(Integer value) {
            addCriterion("UNYOUKANKYO <>", value, "unyoukankyo");
            return (Criteria) this;
        }

        public Criteria andUnyoukankyoGreaterThan(Integer value) {
            addCriterion("UNYOUKANKYO >", value, "unyoukankyo");
            return (Criteria) this;
        }

        public Criteria andUnyoukankyoGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNYOUKANKYO >=", value, "unyoukankyo");
            return (Criteria) this;
        }

        public Criteria andUnyoukankyoLessThan(Integer value) {
            addCriterion("UNYOUKANKYO <", value, "unyoukankyo");
            return (Criteria) this;
        }

        public Criteria andUnyoukankyoLessThanOrEqualTo(Integer value) {
            addCriterion("UNYOUKANKYO <=", value, "unyoukankyo");
            return (Criteria) this;
        }

        public Criteria andUnyoukankyoIn(List<Integer> values) {
            addCriterion("UNYOUKANKYO in", values, "unyoukankyo");
            return (Criteria) this;
        }

        public Criteria andUnyoukankyoNotIn(List<Integer> values) {
            addCriterion("UNYOUKANKYO not in", values, "unyoukankyo");
            return (Criteria) this;
        }

        public Criteria andUnyoukankyoBetween(Integer value1, Integer value2) {
            addCriterion("UNYOUKANKYO between", value1, value2, "unyoukankyo");
            return (Criteria) this;
        }

        public Criteria andUnyoukankyoNotBetween(Integer value1, Integer value2) {
            addCriterion("UNYOUKANKYO not between", value1, value2, "unyoukankyo");
            return (Criteria) this;
        }

        public Criteria andGengoIsNull() {
            addCriterion("GENGO is null");
            return (Criteria) this;
        }

        public Criteria andGengoIsNotNull() {
            addCriterion("GENGO is not null");
            return (Criteria) this;
        }

        public Criteria andGengoEqualTo(String value) {
            addCriterion("GENGO =", value, "gengo");
            return (Criteria) this;
        }

        public Criteria andGengoNotEqualTo(String value) {
            addCriterion("GENGO <>", value, "gengo");
            return (Criteria) this;
        }

        public Criteria andGengoGreaterThan(String value) {
            addCriterion("GENGO >", value, "gengo");
            return (Criteria) this;
        }

        public Criteria andGengoGreaterThanOrEqualTo(String value) {
            addCriterion("GENGO >=", value, "gengo");
            return (Criteria) this;
        }

        public Criteria andGengoLessThan(String value) {
            addCriterion("GENGO <", value, "gengo");
            return (Criteria) this;
        }

        public Criteria andGengoLessThanOrEqualTo(String value) {
            addCriterion("GENGO <=", value, "gengo");
            return (Criteria) this;
        }

        public Criteria andGengoLike(String value) {
            addCriterion("GENGO like", value, "gengo");
            return (Criteria) this;
        }

        public Criteria andGengoNotLike(String value) {
            addCriterion("GENGO not like", value, "gengo");
            return (Criteria) this;
        }

        public Criteria andGengoIn(List<String> values) {
            addCriterion("GENGO in", values, "gengo");
            return (Criteria) this;
        }

        public Criteria andGengoNotIn(List<String> values) {
            addCriterion("GENGO not in", values, "gengo");
            return (Criteria) this;
        }

        public Criteria andGengoBetween(String value1, String value2) {
            addCriterion("GENGO between", value1, value2, "gengo");
            return (Criteria) this;
        }

        public Criteria andGengoNotBetween(String value1, String value2) {
            addCriterion("GENGO not between", value1, value2, "gengo");
            return (Criteria) this;
        }

        public Criteria andDbIsNull() {
            addCriterion("DB is null");
            return (Criteria) this;
        }

        public Criteria andDbIsNotNull() {
            addCriterion("DB is not null");
            return (Criteria) this;
        }

        public Criteria andDbEqualTo(String value) {
            addCriterion("DB =", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotEqualTo(String value) {
            addCriterion("DB <>", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThan(String value) {
            addCriterion("DB >", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThanOrEqualTo(String value) {
            addCriterion("DB >=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThan(String value) {
            addCriterion("DB <", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThanOrEqualTo(String value) {
            addCriterion("DB <=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLike(String value) {
            addCriterion("DB like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotLike(String value) {
            addCriterion("DB not like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbIn(List<String> values) {
            addCriterion("DB in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotIn(List<String> values) {
            addCriterion("DB not in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbBetween(String value1, String value2) {
            addCriterion("DB between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotBetween(String value1, String value2) {
            addCriterion("DB not between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andToolIsNull() {
            addCriterion("TOOL is null");
            return (Criteria) this;
        }

        public Criteria andToolIsNotNull() {
            addCriterion("TOOL is not null");
            return (Criteria) this;
        }

        public Criteria andToolEqualTo(String value) {
            addCriterion("TOOL =", value, "tool");
            return (Criteria) this;
        }

        public Criteria andToolNotEqualTo(String value) {
            addCriterion("TOOL <>", value, "tool");
            return (Criteria) this;
        }

        public Criteria andToolGreaterThan(String value) {
            addCriterion("TOOL >", value, "tool");
            return (Criteria) this;
        }

        public Criteria andToolGreaterThanOrEqualTo(String value) {
            addCriterion("TOOL >=", value, "tool");
            return (Criteria) this;
        }

        public Criteria andToolLessThan(String value) {
            addCriterion("TOOL <", value, "tool");
            return (Criteria) this;
        }

        public Criteria andToolLessThanOrEqualTo(String value) {
            addCriterion("TOOL <=", value, "tool");
            return (Criteria) this;
        }

        public Criteria andToolLike(String value) {
            addCriterion("TOOL like", value, "tool");
            return (Criteria) this;
        }

        public Criteria andToolNotLike(String value) {
            addCriterion("TOOL not like", value, "tool");
            return (Criteria) this;
        }

        public Criteria andToolIn(List<String> values) {
            addCriterion("TOOL in", values, "tool");
            return (Criteria) this;
        }

        public Criteria andToolNotIn(List<String> values) {
            addCriterion("TOOL not in", values, "tool");
            return (Criteria) this;
        }

        public Criteria andToolBetween(String value1, String value2) {
            addCriterion("TOOL between", value1, value2, "tool");
            return (Criteria) this;
        }

        public Criteria andToolNotBetween(String value1, String value2) {
            addCriterion("TOOL not between", value1, value2, "tool");
            return (Criteria) this;
        }

        public Criteria andTantouIsNull() {
            addCriterion("TANTOU is null");
            return (Criteria) this;
        }

        public Criteria andTantouIsNotNull() {
            addCriterion("TANTOU is not null");
            return (Criteria) this;
        }

        public Criteria andTantouEqualTo(Integer value) {
            addCriterion("TANTOU =", value, "tantou");
            return (Criteria) this;
        }

        public Criteria andTantouNotEqualTo(Integer value) {
            addCriterion("TANTOU <>", value, "tantou");
            return (Criteria) this;
        }

        public Criteria andTantouGreaterThan(Integer value) {
            addCriterion("TANTOU >", value, "tantou");
            return (Criteria) this;
        }

        public Criteria andTantouGreaterThanOrEqualTo(Integer value) {
            addCriterion("TANTOU >=", value, "tantou");
            return (Criteria) this;
        }

        public Criteria andTantouLessThan(Integer value) {
            addCriterion("TANTOU <", value, "tantou");
            return (Criteria) this;
        }

        public Criteria andTantouLessThanOrEqualTo(Integer value) {
            addCriterion("TANTOU <=", value, "tantou");
            return (Criteria) this;
        }

        public Criteria andTantouIn(List<Integer> values) {
            addCriterion("TANTOU in", values, "tantou");
            return (Criteria) this;
        }

        public Criteria andTantouNotIn(List<Integer> values) {
            addCriterion("TANTOU not in", values, "tantou");
            return (Criteria) this;
        }

        public Criteria andTantouBetween(Integer value1, Integer value2) {
            addCriterion("TANTOU between", value1, value2, "tantou");
            return (Criteria) this;
        }

        public Criteria andTantouNotBetween(Integer value1, Integer value2) {
            addCriterion("TANTOU not between", value1, value2, "tantou");
            return (Criteria) this;
        }

        public Criteria andSagyohaniIsNull() {
            addCriterion("SAGYOHANI is null");
            return (Criteria) this;
        }

        public Criteria andSagyohaniIsNotNull() {
            addCriterion("SAGYOHANI is not null");
            return (Criteria) this;
        }

        public Criteria andSagyohaniEqualTo(String value) {
            addCriterion("SAGYOHANI =", value, "sagyohani");
            return (Criteria) this;
        }

        public Criteria andSagyohaniNotEqualTo(String value) {
            addCriterion("SAGYOHANI <>", value, "sagyohani");
            return (Criteria) this;
        }

        public Criteria andSagyohaniGreaterThan(String value) {
            addCriterion("SAGYOHANI >", value, "sagyohani");
            return (Criteria) this;
        }

        public Criteria andSagyohaniGreaterThanOrEqualTo(String value) {
            addCriterion("SAGYOHANI >=", value, "sagyohani");
            return (Criteria) this;
        }

        public Criteria andSagyohaniLessThan(String value) {
            addCriterion("SAGYOHANI <", value, "sagyohani");
            return (Criteria) this;
        }

        public Criteria andSagyohaniLessThanOrEqualTo(String value) {
            addCriterion("SAGYOHANI <=", value, "sagyohani");
            return (Criteria) this;
        }

        public Criteria andSagyohaniLike(String value) {
            addCriterion("SAGYOHANI like", value, "sagyohani");
            return (Criteria) this;
        }

        public Criteria andSagyohaniNotLike(String value) {
            addCriterion("SAGYOHANI not like", value, "sagyohani");
            return (Criteria) this;
        }

        public Criteria andSagyohaniIn(List<String> values) {
            addCriterion("SAGYOHANI in", values, "sagyohani");
            return (Criteria) this;
        }

        public Criteria andSagyohaniNotIn(List<String> values) {
            addCriterion("SAGYOHANI not in", values, "sagyohani");
            return (Criteria) this;
        }

        public Criteria andSagyohaniBetween(String value1, String value2) {
            addCriterion("SAGYOHANI between", value1, value2, "sagyohani");
            return (Criteria) this;
        }

        public Criteria andSagyohaniNotBetween(String value1, String value2) {
            addCriterion("SAGYOHANI not between", value1, value2, "sagyohani");
            return (Criteria) this;
        }

        public Criteria andGaiyouIsNull() {
            addCriterion("GAIYOU is null");
            return (Criteria) this;
        }

        public Criteria andGaiyouIsNotNull() {
            addCriterion("GAIYOU is not null");
            return (Criteria) this;
        }

        public Criteria andGaiyouEqualTo(String value) {
            addCriterion("GAIYOU =", value, "gaiyou");
            return (Criteria) this;
        }

        public Criteria andGaiyouNotEqualTo(String value) {
            addCriterion("GAIYOU <>", value, "gaiyou");
            return (Criteria) this;
        }

        public Criteria andGaiyouGreaterThan(String value) {
            addCriterion("GAIYOU >", value, "gaiyou");
            return (Criteria) this;
        }

        public Criteria andGaiyouGreaterThanOrEqualTo(String value) {
            addCriterion("GAIYOU >=", value, "gaiyou");
            return (Criteria) this;
        }

        public Criteria andGaiyouLessThan(String value) {
            addCriterion("GAIYOU <", value, "gaiyou");
            return (Criteria) this;
        }

        public Criteria andGaiyouLessThanOrEqualTo(String value) {
            addCriterion("GAIYOU <=", value, "gaiyou");
            return (Criteria) this;
        }

        public Criteria andGaiyouLike(String value) {
            addCriterion("GAIYOU like", value, "gaiyou");
            return (Criteria) this;
        }

        public Criteria andGaiyouNotLike(String value) {
            addCriterion("GAIYOU not like", value, "gaiyou");
            return (Criteria) this;
        }

        public Criteria andGaiyouIn(List<String> values) {
            addCriterion("GAIYOU in", values, "gaiyou");
            return (Criteria) this;
        }

        public Criteria andGaiyouNotIn(List<String> values) {
            addCriterion("GAIYOU not in", values, "gaiyou");
            return (Criteria) this;
        }

        public Criteria andGaiyouBetween(String value1, String value2) {
            addCriterion("GAIYOU between", value1, value2, "gaiyou");
            return (Criteria) this;
        }

        public Criteria andGaiyouNotBetween(String value1, String value2) {
            addCriterion("GAIYOU not between", value1, value2, "gaiyou");
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