package com.lxm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SyainMainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyainMainExample() {
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

        public Criteria andFirstNameKanjiIsNull() {
            addCriterion("FIRST_NAME_KANJI is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanjiIsNotNull() {
            addCriterion("FIRST_NAME_KANJI is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanjiEqualTo(String value) {
            addCriterion("FIRST_NAME_KANJI =", value, "firstNameKanji");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanjiNotEqualTo(String value) {
            addCriterion("FIRST_NAME_KANJI <>", value, "firstNameKanji");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanjiGreaterThan(String value) {
            addCriterion("FIRST_NAME_KANJI >", value, "firstNameKanji");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanjiGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME_KANJI >=", value, "firstNameKanji");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanjiLessThan(String value) {
            addCriterion("FIRST_NAME_KANJI <", value, "firstNameKanji");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanjiLessThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME_KANJI <=", value, "firstNameKanji");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanjiLike(String value) {
            addCriterion("FIRST_NAME_KANJI like", value, "firstNameKanji");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanjiNotLike(String value) {
            addCriterion("FIRST_NAME_KANJI not like", value, "firstNameKanji");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanjiIn(List<String> values) {
            addCriterion("FIRST_NAME_KANJI in", values, "firstNameKanji");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanjiNotIn(List<String> values) {
            addCriterion("FIRST_NAME_KANJI not in", values, "firstNameKanji");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanjiBetween(String value1, String value2) {
            addCriterion("FIRST_NAME_KANJI between", value1, value2, "firstNameKanji");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanjiNotBetween(String value1, String value2) {
            addCriterion("FIRST_NAME_KANJI not between", value1, value2, "firstNameKanji");
            return (Criteria) this;
        }

        public Criteria andLastNameKanjiIsNull() {
            addCriterion("LAST_NAME_KANJI is null");
            return (Criteria) this;
        }

        public Criteria andLastNameKanjiIsNotNull() {
            addCriterion("LAST_NAME_KANJI is not null");
            return (Criteria) this;
        }

        public Criteria andLastNameKanjiEqualTo(String value) {
            addCriterion("LAST_NAME_KANJI =", value, "lastNameKanji");
            return (Criteria) this;
        }

        public Criteria andLastNameKanjiNotEqualTo(String value) {
            addCriterion("LAST_NAME_KANJI <>", value, "lastNameKanji");
            return (Criteria) this;
        }

        public Criteria andLastNameKanjiGreaterThan(String value) {
            addCriterion("LAST_NAME_KANJI >", value, "lastNameKanji");
            return (Criteria) this;
        }

        public Criteria andLastNameKanjiGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_NAME_KANJI >=", value, "lastNameKanji");
            return (Criteria) this;
        }

        public Criteria andLastNameKanjiLessThan(String value) {
            addCriterion("LAST_NAME_KANJI <", value, "lastNameKanji");
            return (Criteria) this;
        }

        public Criteria andLastNameKanjiLessThanOrEqualTo(String value) {
            addCriterion("LAST_NAME_KANJI <=", value, "lastNameKanji");
            return (Criteria) this;
        }

        public Criteria andLastNameKanjiLike(String value) {
            addCriterion("LAST_NAME_KANJI like", value, "lastNameKanji");
            return (Criteria) this;
        }

        public Criteria andLastNameKanjiNotLike(String value) {
            addCriterion("LAST_NAME_KANJI not like", value, "lastNameKanji");
            return (Criteria) this;
        }

        public Criteria andLastNameKanjiIn(List<String> values) {
            addCriterion("LAST_NAME_KANJI in", values, "lastNameKanji");
            return (Criteria) this;
        }

        public Criteria andLastNameKanjiNotIn(List<String> values) {
            addCriterion("LAST_NAME_KANJI not in", values, "lastNameKanji");
            return (Criteria) this;
        }

        public Criteria andLastNameKanjiBetween(String value1, String value2) {
            addCriterion("LAST_NAME_KANJI between", value1, value2, "lastNameKanji");
            return (Criteria) this;
        }

        public Criteria andLastNameKanjiNotBetween(String value1, String value2) {
            addCriterion("LAST_NAME_KANJI not between", value1, value2, "lastNameKanji");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanaIsNull() {
            addCriterion("FIRST_NAME_KANA is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanaIsNotNull() {
            addCriterion("FIRST_NAME_KANA is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanaEqualTo(String value) {
            addCriterion("FIRST_NAME_KANA =", value, "firstNameKana");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanaNotEqualTo(String value) {
            addCriterion("FIRST_NAME_KANA <>", value, "firstNameKana");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanaGreaterThan(String value) {
            addCriterion("FIRST_NAME_KANA >", value, "firstNameKana");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanaGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME_KANA >=", value, "firstNameKana");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanaLessThan(String value) {
            addCriterion("FIRST_NAME_KANA <", value, "firstNameKana");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanaLessThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME_KANA <=", value, "firstNameKana");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanaLike(String value) {
            addCriterion("FIRST_NAME_KANA like", value, "firstNameKana");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanaNotLike(String value) {
            addCriterion("FIRST_NAME_KANA not like", value, "firstNameKana");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanaIn(List<String> values) {
            addCriterion("FIRST_NAME_KANA in", values, "firstNameKana");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanaNotIn(List<String> values) {
            addCriterion("FIRST_NAME_KANA not in", values, "firstNameKana");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanaBetween(String value1, String value2) {
            addCriterion("FIRST_NAME_KANA between", value1, value2, "firstNameKana");
            return (Criteria) this;
        }

        public Criteria andFirstNameKanaNotBetween(String value1, String value2) {
            addCriterion("FIRST_NAME_KANA not between", value1, value2, "firstNameKana");
            return (Criteria) this;
        }

        public Criteria andLastNameKanaIsNull() {
            addCriterion("LAST_NAME_KANA is null");
            return (Criteria) this;
        }

        public Criteria andLastNameKanaIsNotNull() {
            addCriterion("LAST_NAME_KANA is not null");
            return (Criteria) this;
        }

        public Criteria andLastNameKanaEqualTo(String value) {
            addCriterion("LAST_NAME_KANA =", value, "lastNameKana");
            return (Criteria) this;
        }

        public Criteria andLastNameKanaNotEqualTo(String value) {
            addCriterion("LAST_NAME_KANA <>", value, "lastNameKana");
            return (Criteria) this;
        }

        public Criteria andLastNameKanaGreaterThan(String value) {
            addCriterion("LAST_NAME_KANA >", value, "lastNameKana");
            return (Criteria) this;
        }

        public Criteria andLastNameKanaGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_NAME_KANA >=", value, "lastNameKana");
            return (Criteria) this;
        }

        public Criteria andLastNameKanaLessThan(String value) {
            addCriterion("LAST_NAME_KANA <", value, "lastNameKana");
            return (Criteria) this;
        }

        public Criteria andLastNameKanaLessThanOrEqualTo(String value) {
            addCriterion("LAST_NAME_KANA <=", value, "lastNameKana");
            return (Criteria) this;
        }

        public Criteria andLastNameKanaLike(String value) {
            addCriterion("LAST_NAME_KANA like", value, "lastNameKana");
            return (Criteria) this;
        }

        public Criteria andLastNameKanaNotLike(String value) {
            addCriterion("LAST_NAME_KANA not like", value, "lastNameKana");
            return (Criteria) this;
        }

        public Criteria andLastNameKanaIn(List<String> values) {
            addCriterion("LAST_NAME_KANA in", values, "lastNameKana");
            return (Criteria) this;
        }

        public Criteria andLastNameKanaNotIn(List<String> values) {
            addCriterion("LAST_NAME_KANA not in", values, "lastNameKana");
            return (Criteria) this;
        }

        public Criteria andLastNameKanaBetween(String value1, String value2) {
            addCriterion("LAST_NAME_KANA between", value1, value2, "lastNameKana");
            return (Criteria) this;
        }

        public Criteria andLastNameKanaNotBetween(String value1, String value2) {
            addCriterion("LAST_NAME_KANA not between", value1, value2, "lastNameKana");
            return (Criteria) this;
        }

        public Criteria andFirstNameEigoIsNull() {
            addCriterion("FIRST_NAME_EIGO is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEigoIsNotNull() {
            addCriterion("FIRST_NAME_EIGO is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEigoEqualTo(String value) {
            addCriterion("FIRST_NAME_EIGO =", value, "firstNameEigo");
            return (Criteria) this;
        }

        public Criteria andFirstNameEigoNotEqualTo(String value) {
            addCriterion("FIRST_NAME_EIGO <>", value, "firstNameEigo");
            return (Criteria) this;
        }

        public Criteria andFirstNameEigoGreaterThan(String value) {
            addCriterion("FIRST_NAME_EIGO >", value, "firstNameEigo");
            return (Criteria) this;
        }

        public Criteria andFirstNameEigoGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME_EIGO >=", value, "firstNameEigo");
            return (Criteria) this;
        }

        public Criteria andFirstNameEigoLessThan(String value) {
            addCriterion("FIRST_NAME_EIGO <", value, "firstNameEigo");
            return (Criteria) this;
        }

        public Criteria andFirstNameEigoLessThanOrEqualTo(String value) {
            addCriterion("FIRST_NAME_EIGO <=", value, "firstNameEigo");
            return (Criteria) this;
        }

        public Criteria andFirstNameEigoLike(String value) {
            addCriterion("FIRST_NAME_EIGO like", value, "firstNameEigo");
            return (Criteria) this;
        }

        public Criteria andFirstNameEigoNotLike(String value) {
            addCriterion("FIRST_NAME_EIGO not like", value, "firstNameEigo");
            return (Criteria) this;
        }

        public Criteria andFirstNameEigoIn(List<String> values) {
            addCriterion("FIRST_NAME_EIGO in", values, "firstNameEigo");
            return (Criteria) this;
        }

        public Criteria andFirstNameEigoNotIn(List<String> values) {
            addCriterion("FIRST_NAME_EIGO not in", values, "firstNameEigo");
            return (Criteria) this;
        }

        public Criteria andFirstNameEigoBetween(String value1, String value2) {
            addCriterion("FIRST_NAME_EIGO between", value1, value2, "firstNameEigo");
            return (Criteria) this;
        }

        public Criteria andFirstNameEigoNotBetween(String value1, String value2) {
            addCriterion("FIRST_NAME_EIGO not between", value1, value2, "firstNameEigo");
            return (Criteria) this;
        }

        public Criteria andLastNameEigoIsNull() {
            addCriterion("LAST_NAME_EIGO is null");
            return (Criteria) this;
        }

        public Criteria andLastNameEigoIsNotNull() {
            addCriterion("LAST_NAME_EIGO is not null");
            return (Criteria) this;
        }

        public Criteria andLastNameEigoEqualTo(String value) {
            addCriterion("LAST_NAME_EIGO =", value, "lastNameEigo");
            return (Criteria) this;
        }

        public Criteria andLastNameEigoNotEqualTo(String value) {
            addCriterion("LAST_NAME_EIGO <>", value, "lastNameEigo");
            return (Criteria) this;
        }

        public Criteria andLastNameEigoGreaterThan(String value) {
            addCriterion("LAST_NAME_EIGO >", value, "lastNameEigo");
            return (Criteria) this;
        }

        public Criteria andLastNameEigoGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_NAME_EIGO >=", value, "lastNameEigo");
            return (Criteria) this;
        }

        public Criteria andLastNameEigoLessThan(String value) {
            addCriterion("LAST_NAME_EIGO <", value, "lastNameEigo");
            return (Criteria) this;
        }

        public Criteria andLastNameEigoLessThanOrEqualTo(String value) {
            addCriterion("LAST_NAME_EIGO <=", value, "lastNameEigo");
            return (Criteria) this;
        }

        public Criteria andLastNameEigoLike(String value) {
            addCriterion("LAST_NAME_EIGO like", value, "lastNameEigo");
            return (Criteria) this;
        }

        public Criteria andLastNameEigoNotLike(String value) {
            addCriterion("LAST_NAME_EIGO not like", value, "lastNameEigo");
            return (Criteria) this;
        }

        public Criteria andLastNameEigoIn(List<String> values) {
            addCriterion("LAST_NAME_EIGO in", values, "lastNameEigo");
            return (Criteria) this;
        }

        public Criteria andLastNameEigoNotIn(List<String> values) {
            addCriterion("LAST_NAME_EIGO not in", values, "lastNameEigo");
            return (Criteria) this;
        }

        public Criteria andLastNameEigoBetween(String value1, String value2) {
            addCriterion("LAST_NAME_EIGO between", value1, value2, "lastNameEigo");
            return (Criteria) this;
        }

        public Criteria andLastNameEigoNotBetween(String value1, String value2) {
            addCriterion("LAST_NAME_EIGO not between", value1, value2, "lastNameEigo");
            return (Criteria) this;
        }

        public Criteria andSeibetuIsNull() {
            addCriterion("SEIBETU is null");
            return (Criteria) this;
        }

        public Criteria andSeibetuIsNotNull() {
            addCriterion("SEIBETU is not null");
            return (Criteria) this;
        }

        public Criteria andSeibetuEqualTo(Integer value) {
            addCriterion("SEIBETU =", value, "seibetu");
            return (Criteria) this;
        }

        public Criteria andSeibetuNotEqualTo(Integer value) {
            addCriterion("SEIBETU <>", value, "seibetu");
            return (Criteria) this;
        }

        public Criteria andSeibetuGreaterThan(Integer value) {
            addCriterion("SEIBETU >", value, "seibetu");
            return (Criteria) this;
        }

        public Criteria andSeibetuGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEIBETU >=", value, "seibetu");
            return (Criteria) this;
        }

        public Criteria andSeibetuLessThan(Integer value) {
            addCriterion("SEIBETU <", value, "seibetu");
            return (Criteria) this;
        }

        public Criteria andSeibetuLessThanOrEqualTo(Integer value) {
            addCriterion("SEIBETU <=", value, "seibetu");
            return (Criteria) this;
        }

        public Criteria andSeibetuIn(List<Integer> values) {
            addCriterion("SEIBETU in", values, "seibetu");
            return (Criteria) this;
        }

        public Criteria andSeibetuNotIn(List<Integer> values) {
            addCriterion("SEIBETU not in", values, "seibetu");
            return (Criteria) this;
        }

        public Criteria andSeibetuBetween(Integer value1, Integer value2) {
            addCriterion("SEIBETU between", value1, value2, "seibetu");
            return (Criteria) this;
        }

        public Criteria andSeibetuNotBetween(Integer value1, Integer value2) {
            addCriterion("SEIBETU not between", value1, value2, "seibetu");
            return (Criteria) this;
        }

        public Criteria andTanjyobiIsNull() {
            addCriterion("TANJYOBI is null");
            return (Criteria) this;
        }

        public Criteria andTanjyobiIsNotNull() {
            addCriterion("TANJYOBI is not null");
            return (Criteria) this;
        }

        public Criteria andTanjyobiEqualTo(Date value) {
            addCriterionForJDBCDate("TANJYOBI =", value, "tanjyobi");
            return (Criteria) this;
        }

        public Criteria andTanjyobiNotEqualTo(Date value) {
            addCriterionForJDBCDate("TANJYOBI <>", value, "tanjyobi");
            return (Criteria) this;
        }

        public Criteria andTanjyobiGreaterThan(Date value) {
            addCriterionForJDBCDate("TANJYOBI >", value, "tanjyobi");
            return (Criteria) this;
        }

        public Criteria andTanjyobiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TANJYOBI >=", value, "tanjyobi");
            return (Criteria) this;
        }

        public Criteria andTanjyobiLessThan(Date value) {
            addCriterionForJDBCDate("TANJYOBI <", value, "tanjyobi");
            return (Criteria) this;
        }

        public Criteria andTanjyobiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TANJYOBI <=", value, "tanjyobi");
            return (Criteria) this;
        }

        public Criteria andTanjyobiIn(List<Date> values) {
            addCriterionForJDBCDate("TANJYOBI in", values, "tanjyobi");
            return (Criteria) this;
        }

        public Criteria andTanjyobiNotIn(List<Date> values) {
            addCriterionForJDBCDate("TANJYOBI not in", values, "tanjyobi");
            return (Criteria) this;
        }

        public Criteria andTanjyobiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TANJYOBI between", value1, value2, "tanjyobi");
            return (Criteria) this;
        }

        public Criteria andTanjyobiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TANJYOBI not between", value1, value2, "tanjyobi");
            return (Criteria) this;
        }

        public Criteria andKokusekiIsNull() {
            addCriterion("KOKUSEKI is null");
            return (Criteria) this;
        }

        public Criteria andKokusekiIsNotNull() {
            addCriterion("KOKUSEKI is not null");
            return (Criteria) this;
        }

        public Criteria andKokusekiEqualTo(Integer value) {
            addCriterion("KOKUSEKI =", value, "kokuseki");
            return (Criteria) this;
        }

        public Criteria andKokusekiNotEqualTo(Integer value) {
            addCriterion("KOKUSEKI <>", value, "kokuseki");
            return (Criteria) this;
        }

        public Criteria andKokusekiGreaterThan(Integer value) {
            addCriterion("KOKUSEKI >", value, "kokuseki");
            return (Criteria) this;
        }

        public Criteria andKokusekiGreaterThanOrEqualTo(Integer value) {
            addCriterion("KOKUSEKI >=", value, "kokuseki");
            return (Criteria) this;
        }

        public Criteria andKokusekiLessThan(Integer value) {
            addCriterion("KOKUSEKI <", value, "kokuseki");
            return (Criteria) this;
        }

        public Criteria andKokusekiLessThanOrEqualTo(Integer value) {
            addCriterion("KOKUSEKI <=", value, "kokuseki");
            return (Criteria) this;
        }

        public Criteria andKokusekiIn(List<Integer> values) {
            addCriterion("KOKUSEKI in", values, "kokuseki");
            return (Criteria) this;
        }

        public Criteria andKokusekiNotIn(List<Integer> values) {
            addCriterion("KOKUSEKI not in", values, "kokuseki");
            return (Criteria) this;
        }

        public Criteria andKokusekiBetween(Integer value1, Integer value2) {
            addCriterion("KOKUSEKI between", value1, value2, "kokuseki");
            return (Criteria) this;
        }

        public Criteria andKokusekiNotBetween(Integer value1, Integer value2) {
            addCriterion("KOKUSEKI not between", value1, value2, "kokuseki");
            return (Criteria) this;
        }

        public Criteria andSyussinnIsNull() {
            addCriterion("SYUSSINN is null");
            return (Criteria) this;
        }

        public Criteria andSyussinnIsNotNull() {
            addCriterion("SYUSSINN is not null");
            return (Criteria) this;
        }

        public Criteria andSyussinnEqualTo(String value) {
            addCriterion("SYUSSINN =", value, "syussinn");
            return (Criteria) this;
        }

        public Criteria andSyussinnNotEqualTo(String value) {
            addCriterion("SYUSSINN <>", value, "syussinn");
            return (Criteria) this;
        }

        public Criteria andSyussinnGreaterThan(String value) {
            addCriterion("SYUSSINN >", value, "syussinn");
            return (Criteria) this;
        }

        public Criteria andSyussinnGreaterThanOrEqualTo(String value) {
            addCriterion("SYUSSINN >=", value, "syussinn");
            return (Criteria) this;
        }

        public Criteria andSyussinnLessThan(String value) {
            addCriterion("SYUSSINN <", value, "syussinn");
            return (Criteria) this;
        }

        public Criteria andSyussinnLessThanOrEqualTo(String value) {
            addCriterion("SYUSSINN <=", value, "syussinn");
            return (Criteria) this;
        }

        public Criteria andSyussinnLike(String value) {
            addCriterion("SYUSSINN like", value, "syussinn");
            return (Criteria) this;
        }

        public Criteria andSyussinnNotLike(String value) {
            addCriterion("SYUSSINN not like", value, "syussinn");
            return (Criteria) this;
        }

        public Criteria andSyussinnIn(List<String> values) {
            addCriterion("SYUSSINN in", values, "syussinn");
            return (Criteria) this;
        }

        public Criteria andSyussinnNotIn(List<String> values) {
            addCriterion("SYUSSINN not in", values, "syussinn");
            return (Criteria) this;
        }

        public Criteria andSyussinnBetween(String value1, String value2) {
            addCriterion("SYUSSINN between", value1, value2, "syussinn");
            return (Criteria) this;
        }

        public Criteria andSyussinnNotBetween(String value1, String value2) {
            addCriterion("SYUSSINN not between", value1, value2, "syussinn");
            return (Criteria) this;
        }

        public Criteria andHaigusyaIsNull() {
            addCriterion("HAIGUSYA is null");
            return (Criteria) this;
        }

        public Criteria andHaigusyaIsNotNull() {
            addCriterion("HAIGUSYA is not null");
            return (Criteria) this;
        }

        public Criteria andHaigusyaEqualTo(Integer value) {
            addCriterion("HAIGUSYA =", value, "haigusya");
            return (Criteria) this;
        }

        public Criteria andHaigusyaNotEqualTo(Integer value) {
            addCriterion("HAIGUSYA <>", value, "haigusya");
            return (Criteria) this;
        }

        public Criteria andHaigusyaGreaterThan(Integer value) {
            addCriterion("HAIGUSYA >", value, "haigusya");
            return (Criteria) this;
        }

        public Criteria andHaigusyaGreaterThanOrEqualTo(Integer value) {
            addCriterion("HAIGUSYA >=", value, "haigusya");
            return (Criteria) this;
        }

        public Criteria andHaigusyaLessThan(Integer value) {
            addCriterion("HAIGUSYA <", value, "haigusya");
            return (Criteria) this;
        }

        public Criteria andHaigusyaLessThanOrEqualTo(Integer value) {
            addCriterion("HAIGUSYA <=", value, "haigusya");
            return (Criteria) this;
        }

        public Criteria andHaigusyaIn(List<Integer> values) {
            addCriterion("HAIGUSYA in", values, "haigusya");
            return (Criteria) this;
        }

        public Criteria andHaigusyaNotIn(List<Integer> values) {
            addCriterion("HAIGUSYA not in", values, "haigusya");
            return (Criteria) this;
        }

        public Criteria andHaigusyaBetween(Integer value1, Integer value2) {
            addCriterion("HAIGUSYA between", value1, value2, "haigusya");
            return (Criteria) this;
        }

        public Criteria andHaigusyaNotBetween(Integer value1, Integer value2) {
            addCriterion("HAIGUSYA not between", value1, value2, "haigusya");
            return (Criteria) this;
        }

        public Criteria andPassportNumIsNull() {
            addCriterion("PASSPORT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPassportNumIsNotNull() {
            addCriterion("PASSPORT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPassportNumEqualTo(String value) {
            addCriterion("PASSPORT_NUM =", value, "passportNum");
            return (Criteria) this;
        }

        public Criteria andPassportNumNotEqualTo(String value) {
            addCriterion("PASSPORT_NUM <>", value, "passportNum");
            return (Criteria) this;
        }

        public Criteria andPassportNumGreaterThan(String value) {
            addCriterion("PASSPORT_NUM >", value, "passportNum");
            return (Criteria) this;
        }

        public Criteria andPassportNumGreaterThanOrEqualTo(String value) {
            addCriterion("PASSPORT_NUM >=", value, "passportNum");
            return (Criteria) this;
        }

        public Criteria andPassportNumLessThan(String value) {
            addCriterion("PASSPORT_NUM <", value, "passportNum");
            return (Criteria) this;
        }

        public Criteria andPassportNumLessThanOrEqualTo(String value) {
            addCriterion("PASSPORT_NUM <=", value, "passportNum");
            return (Criteria) this;
        }

        public Criteria andPassportNumLike(String value) {
            addCriterion("PASSPORT_NUM like", value, "passportNum");
            return (Criteria) this;
        }

        public Criteria andPassportNumNotLike(String value) {
            addCriterion("PASSPORT_NUM not like", value, "passportNum");
            return (Criteria) this;
        }

        public Criteria andPassportNumIn(List<String> values) {
            addCriterion("PASSPORT_NUM in", values, "passportNum");
            return (Criteria) this;
        }

        public Criteria andPassportNumNotIn(List<String> values) {
            addCriterion("PASSPORT_NUM not in", values, "passportNum");
            return (Criteria) this;
        }

        public Criteria andPassportNumBetween(String value1, String value2) {
            addCriterion("PASSPORT_NUM between", value1, value2, "passportNum");
            return (Criteria) this;
        }

        public Criteria andPassportNumNotBetween(String value1, String value2) {
            addCriterion("PASSPORT_NUM not between", value1, value2, "passportNum");
            return (Criteria) this;
        }

        public Criteria andPassportEndDateIsNull() {
            addCriterion("PASSPORT_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPassportEndDateIsNotNull() {
            addCriterion("PASSPORT_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPassportEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("PASSPORT_END_DATE =", value, "passportEndDate");
            return (Criteria) this;
        }

        public Criteria andPassportEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PASSPORT_END_DATE <>", value, "passportEndDate");
            return (Criteria) this;
        }

        public Criteria andPassportEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PASSPORT_END_DATE >", value, "passportEndDate");
            return (Criteria) this;
        }

        public Criteria andPassportEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PASSPORT_END_DATE >=", value, "passportEndDate");
            return (Criteria) this;
        }

        public Criteria andPassportEndDateLessThan(Date value) {
            addCriterionForJDBCDate("PASSPORT_END_DATE <", value, "passportEndDate");
            return (Criteria) this;
        }

        public Criteria andPassportEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PASSPORT_END_DATE <=", value, "passportEndDate");
            return (Criteria) this;
        }

        public Criteria andPassportEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("PASSPORT_END_DATE in", values, "passportEndDate");
            return (Criteria) this;
        }

        public Criteria andPassportEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PASSPORT_END_DATE not in", values, "passportEndDate");
            return (Criteria) this;
        }

        public Criteria andPassportEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PASSPORT_END_DATE between", value1, value2, "passportEndDate");
            return (Criteria) this;
        }

        public Criteria andPassportEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PASSPORT_END_DATE not between", value1, value2, "passportEndDate");
            return (Criteria) this;
        }

        public Criteria andVisaKikanIsNull() {
            addCriterion("VISA_KIKAN is null");
            return (Criteria) this;
        }

        public Criteria andVisaKikanIsNotNull() {
            addCriterion("VISA_KIKAN is not null");
            return (Criteria) this;
        }

        public Criteria andVisaKikanEqualTo(Integer value) {
            addCriterion("VISA_KIKAN =", value, "visaKikan");
            return (Criteria) this;
        }

        public Criteria andVisaKikanNotEqualTo(Integer value) {
            addCriterion("VISA_KIKAN <>", value, "visaKikan");
            return (Criteria) this;
        }

        public Criteria andVisaKikanGreaterThan(Integer value) {
            addCriterion("VISA_KIKAN >", value, "visaKikan");
            return (Criteria) this;
        }

        public Criteria andVisaKikanGreaterThanOrEqualTo(Integer value) {
            addCriterion("VISA_KIKAN >=", value, "visaKikan");
            return (Criteria) this;
        }

        public Criteria andVisaKikanLessThan(Integer value) {
            addCriterion("VISA_KIKAN <", value, "visaKikan");
            return (Criteria) this;
        }

        public Criteria andVisaKikanLessThanOrEqualTo(Integer value) {
            addCriterion("VISA_KIKAN <=", value, "visaKikan");
            return (Criteria) this;
        }

        public Criteria andVisaKikanIn(List<Integer> values) {
            addCriterion("VISA_KIKAN in", values, "visaKikan");
            return (Criteria) this;
        }

        public Criteria andVisaKikanNotIn(List<Integer> values) {
            addCriterion("VISA_KIKAN not in", values, "visaKikan");
            return (Criteria) this;
        }

        public Criteria andVisaKikanBetween(Integer value1, Integer value2) {
            addCriterion("VISA_KIKAN between", value1, value2, "visaKikan");
            return (Criteria) this;
        }

        public Criteria andVisaKikanNotBetween(Integer value1, Integer value2) {
            addCriterion("VISA_KIKAN not between", value1, value2, "visaKikan");
            return (Criteria) this;
        }

        public Criteria andVisaEndDateIsNull() {
            addCriterion("VISA_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andVisaEndDateIsNotNull() {
            addCriterion("VISA_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andVisaEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("VISA_END_DATE =", value, "visaEndDate");
            return (Criteria) this;
        }

        public Criteria andVisaEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("VISA_END_DATE <>", value, "visaEndDate");
            return (Criteria) this;
        }

        public Criteria andVisaEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("VISA_END_DATE >", value, "visaEndDate");
            return (Criteria) this;
        }

        public Criteria andVisaEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VISA_END_DATE >=", value, "visaEndDate");
            return (Criteria) this;
        }

        public Criteria andVisaEndDateLessThan(Date value) {
            addCriterionForJDBCDate("VISA_END_DATE <", value, "visaEndDate");
            return (Criteria) this;
        }

        public Criteria andVisaEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("VISA_END_DATE <=", value, "visaEndDate");
            return (Criteria) this;
        }

        public Criteria andVisaEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("VISA_END_DATE in", values, "visaEndDate");
            return (Criteria) this;
        }

        public Criteria andVisaEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("VISA_END_DATE not in", values, "visaEndDate");
            return (Criteria) this;
        }

        public Criteria andVisaEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VISA_END_DATE between", value1, value2, "visaEndDate");
            return (Criteria) this;
        }

        public Criteria andVisaEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("VISA_END_DATE not between", value1, value2, "visaEndDate");
            return (Criteria) this;
        }

        public Criteria andZairyuSikakuIsNull() {
            addCriterion("ZAIRYU_SIKAKU is null");
            return (Criteria) this;
        }

        public Criteria andZairyuSikakuIsNotNull() {
            addCriterion("ZAIRYU_SIKAKU is not null");
            return (Criteria) this;
        }

        public Criteria andZairyuSikakuEqualTo(Integer value) {
            addCriterion("ZAIRYU_SIKAKU =", value, "zairyuSikaku");
            return (Criteria) this;
        }

        public Criteria andZairyuSikakuNotEqualTo(Integer value) {
            addCriterion("ZAIRYU_SIKAKU <>", value, "zairyuSikaku");
            return (Criteria) this;
        }

        public Criteria andZairyuSikakuGreaterThan(Integer value) {
            addCriterion("ZAIRYU_SIKAKU >", value, "zairyuSikaku");
            return (Criteria) this;
        }

        public Criteria andZairyuSikakuGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZAIRYU_SIKAKU >=", value, "zairyuSikaku");
            return (Criteria) this;
        }

        public Criteria andZairyuSikakuLessThan(Integer value) {
            addCriterion("ZAIRYU_SIKAKU <", value, "zairyuSikaku");
            return (Criteria) this;
        }

        public Criteria andZairyuSikakuLessThanOrEqualTo(Integer value) {
            addCriterion("ZAIRYU_SIKAKU <=", value, "zairyuSikaku");
            return (Criteria) this;
        }

        public Criteria andZairyuSikakuIn(List<Integer> values) {
            addCriterion("ZAIRYU_SIKAKU in", values, "zairyuSikaku");
            return (Criteria) this;
        }

        public Criteria andZairyuSikakuNotIn(List<Integer> values) {
            addCriterion("ZAIRYU_SIKAKU not in", values, "zairyuSikaku");
            return (Criteria) this;
        }

        public Criteria andZairyuSikakuBetween(Integer value1, Integer value2) {
            addCriterion("ZAIRYU_SIKAKU between", value1, value2, "zairyuSikaku");
            return (Criteria) this;
        }

        public Criteria andZairyuSikakuNotBetween(Integer value1, Integer value2) {
            addCriterion("ZAIRYU_SIKAKU not between", value1, value2, "zairyuSikaku");
            return (Criteria) this;
        }

        public Criteria andKojinNumIsNull() {
            addCriterion("KOJIN_NUM is null");
            return (Criteria) this;
        }

        public Criteria andKojinNumIsNotNull() {
            addCriterion("KOJIN_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andKojinNumEqualTo(String value) {
            addCriterion("KOJIN_NUM =", value, "kojinNum");
            return (Criteria) this;
        }

        public Criteria andKojinNumNotEqualTo(String value) {
            addCriterion("KOJIN_NUM <>", value, "kojinNum");
            return (Criteria) this;
        }

        public Criteria andKojinNumGreaterThan(String value) {
            addCriterion("KOJIN_NUM >", value, "kojinNum");
            return (Criteria) this;
        }

        public Criteria andKojinNumGreaterThanOrEqualTo(String value) {
            addCriterion("KOJIN_NUM >=", value, "kojinNum");
            return (Criteria) this;
        }

        public Criteria andKojinNumLessThan(String value) {
            addCriterion("KOJIN_NUM <", value, "kojinNum");
            return (Criteria) this;
        }

        public Criteria andKojinNumLessThanOrEqualTo(String value) {
            addCriterion("KOJIN_NUM <=", value, "kojinNum");
            return (Criteria) this;
        }

        public Criteria andKojinNumLike(String value) {
            addCriterion("KOJIN_NUM like", value, "kojinNum");
            return (Criteria) this;
        }

        public Criteria andKojinNumNotLike(String value) {
            addCriterion("KOJIN_NUM not like", value, "kojinNum");
            return (Criteria) this;
        }

        public Criteria andKojinNumIn(List<String> values) {
            addCriterion("KOJIN_NUM in", values, "kojinNum");
            return (Criteria) this;
        }

        public Criteria andKojinNumNotIn(List<String> values) {
            addCriterion("KOJIN_NUM not in", values, "kojinNum");
            return (Criteria) this;
        }

        public Criteria andKojinNumBetween(String value1, String value2) {
            addCriterion("KOJIN_NUM between", value1, value2, "kojinNum");
            return (Criteria) this;
        }

        public Criteria andKojinNumNotBetween(String value1, String value2) {
            addCriterion("KOJIN_NUM not between", value1, value2, "kojinNum");
            return (Criteria) this;
        }

        public Criteria andZairyuNumIsNull() {
            addCriterion("ZAIRYU_NUM is null");
            return (Criteria) this;
        }

        public Criteria andZairyuNumIsNotNull() {
            addCriterion("ZAIRYU_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andZairyuNumEqualTo(String value) {
            addCriterion("ZAIRYU_NUM =", value, "zairyuNum");
            return (Criteria) this;
        }

        public Criteria andZairyuNumNotEqualTo(String value) {
            addCriterion("ZAIRYU_NUM <>", value, "zairyuNum");
            return (Criteria) this;
        }

        public Criteria andZairyuNumGreaterThan(String value) {
            addCriterion("ZAIRYU_NUM >", value, "zairyuNum");
            return (Criteria) this;
        }

        public Criteria andZairyuNumGreaterThanOrEqualTo(String value) {
            addCriterion("ZAIRYU_NUM >=", value, "zairyuNum");
            return (Criteria) this;
        }

        public Criteria andZairyuNumLessThan(String value) {
            addCriterion("ZAIRYU_NUM <", value, "zairyuNum");
            return (Criteria) this;
        }

        public Criteria andZairyuNumLessThanOrEqualTo(String value) {
            addCriterion("ZAIRYU_NUM <=", value, "zairyuNum");
            return (Criteria) this;
        }

        public Criteria andZairyuNumLike(String value) {
            addCriterion("ZAIRYU_NUM like", value, "zairyuNum");
            return (Criteria) this;
        }

        public Criteria andZairyuNumNotLike(String value) {
            addCriterion("ZAIRYU_NUM not like", value, "zairyuNum");
            return (Criteria) this;
        }

        public Criteria andZairyuNumIn(List<String> values) {
            addCriterion("ZAIRYU_NUM in", values, "zairyuNum");
            return (Criteria) this;
        }

        public Criteria andZairyuNumNotIn(List<String> values) {
            addCriterion("ZAIRYU_NUM not in", values, "zairyuNum");
            return (Criteria) this;
        }

        public Criteria andZairyuNumBetween(String value1, String value2) {
            addCriterion("ZAIRYU_NUM between", value1, value2, "zairyuNum");
            return (Criteria) this;
        }

        public Criteria andZairyuNumNotBetween(String value1, String value2) {
            addCriterion("ZAIRYU_NUM not between", value1, value2, "zairyuNum");
            return (Criteria) this;
        }

        public Criteria andSyozokuKaisyaIsNull() {
            addCriterion("SYOZOKU_KAISYA is null");
            return (Criteria) this;
        }

        public Criteria andSyozokuKaisyaIsNotNull() {
            addCriterion("SYOZOKU_KAISYA is not null");
            return (Criteria) this;
        }

        public Criteria andSyozokuKaisyaEqualTo(Integer value) {
            addCriterion("SYOZOKU_KAISYA =", value, "syozokuKaisya");
            return (Criteria) this;
        }

        public Criteria andSyozokuKaisyaNotEqualTo(Integer value) {
            addCriterion("SYOZOKU_KAISYA <>", value, "syozokuKaisya");
            return (Criteria) this;
        }

        public Criteria andSyozokuKaisyaGreaterThan(Integer value) {
            addCriterion("SYOZOKU_KAISYA >", value, "syozokuKaisya");
            return (Criteria) this;
        }

        public Criteria andSyozokuKaisyaGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYOZOKU_KAISYA >=", value, "syozokuKaisya");
            return (Criteria) this;
        }

        public Criteria andSyozokuKaisyaLessThan(Integer value) {
            addCriterion("SYOZOKU_KAISYA <", value, "syozokuKaisya");
            return (Criteria) this;
        }

        public Criteria andSyozokuKaisyaLessThanOrEqualTo(Integer value) {
            addCriterion("SYOZOKU_KAISYA <=", value, "syozokuKaisya");
            return (Criteria) this;
        }

        public Criteria andSyozokuKaisyaIn(List<Integer> values) {
            addCriterion("SYOZOKU_KAISYA in", values, "syozokuKaisya");
            return (Criteria) this;
        }

        public Criteria andSyozokuKaisyaNotIn(List<Integer> values) {
            addCriterion("SYOZOKU_KAISYA not in", values, "syozokuKaisya");
            return (Criteria) this;
        }

        public Criteria andSyozokuKaisyaBetween(Integer value1, Integer value2) {
            addCriterion("SYOZOKU_KAISYA between", value1, value2, "syozokuKaisya");
            return (Criteria) this;
        }

        public Criteria andSyozokuKaisyaNotBetween(Integer value1, Integer value2) {
            addCriterion("SYOZOKU_KAISYA not between", value1, value2, "syozokuKaisya");
            return (Criteria) this;
        }

        public Criteria andNyuusyaDateIsNull() {
            addCriterion("NYUUSYA_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNyuusyaDateIsNotNull() {
            addCriterion("NYUUSYA_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNyuusyaDateEqualTo(Date value) {
            addCriterionForJDBCDate("NYUUSYA_DATE =", value, "nyuusyaDate");
            return (Criteria) this;
        }

        public Criteria andNyuusyaDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("NYUUSYA_DATE <>", value, "nyuusyaDate");
            return (Criteria) this;
        }

        public Criteria andNyuusyaDateGreaterThan(Date value) {
            addCriterionForJDBCDate("NYUUSYA_DATE >", value, "nyuusyaDate");
            return (Criteria) this;
        }

        public Criteria andNyuusyaDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NYUUSYA_DATE >=", value, "nyuusyaDate");
            return (Criteria) this;
        }

        public Criteria andNyuusyaDateLessThan(Date value) {
            addCriterionForJDBCDate("NYUUSYA_DATE <", value, "nyuusyaDate");
            return (Criteria) this;
        }

        public Criteria andNyuusyaDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NYUUSYA_DATE <=", value, "nyuusyaDate");
            return (Criteria) this;
        }

        public Criteria andNyuusyaDateIn(List<Date> values) {
            addCriterionForJDBCDate("NYUUSYA_DATE in", values, "nyuusyaDate");
            return (Criteria) this;
        }

        public Criteria andNyuusyaDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("NYUUSYA_DATE not in", values, "nyuusyaDate");
            return (Criteria) this;
        }

        public Criteria andNyuusyaDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NYUUSYA_DATE between", value1, value2, "nyuusyaDate");
            return (Criteria) this;
        }

        public Criteria andNyuusyaDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NYUUSYA_DATE not between", value1, value2, "nyuusyaDate");
            return (Criteria) this;
        }

        public Criteria andTaisyaDateIsNull() {
            addCriterion("TAISYA_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTaisyaDateIsNotNull() {
            addCriterion("TAISYA_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaisyaDateEqualTo(Date value) {
            addCriterionForJDBCDate("TAISYA_DATE =", value, "taisyaDate");
            return (Criteria) this;
        }

        public Criteria andTaisyaDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TAISYA_DATE <>", value, "taisyaDate");
            return (Criteria) this;
        }

        public Criteria andTaisyaDateGreaterThan(Date value) {
            addCriterionForJDBCDate("TAISYA_DATE >", value, "taisyaDate");
            return (Criteria) this;
        }

        public Criteria andTaisyaDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TAISYA_DATE >=", value, "taisyaDate");
            return (Criteria) this;
        }

        public Criteria andTaisyaDateLessThan(Date value) {
            addCriterionForJDBCDate("TAISYA_DATE <", value, "taisyaDate");
            return (Criteria) this;
        }

        public Criteria andTaisyaDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TAISYA_DATE <=", value, "taisyaDate");
            return (Criteria) this;
        }

        public Criteria andTaisyaDateIn(List<Date> values) {
            addCriterionForJDBCDate("TAISYA_DATE in", values, "taisyaDate");
            return (Criteria) this;
        }

        public Criteria andTaisyaDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TAISYA_DATE not in", values, "taisyaDate");
            return (Criteria) this;
        }

        public Criteria andTaisyaDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TAISYA_DATE between", value1, value2, "taisyaDate");
            return (Criteria) this;
        }

        public Criteria andTaisyaDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TAISYA_DATE not between", value1, value2, "taisyaDate");
            return (Criteria) this;
        }

        public Criteria andSyokugyoKindIsNull() {
            addCriterion("SYOKUGYO_KIND is null");
            return (Criteria) this;
        }

        public Criteria andSyokugyoKindIsNotNull() {
            addCriterion("SYOKUGYO_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andSyokugyoKindEqualTo(Integer value) {
            addCriterion("SYOKUGYO_KIND =", value, "syokugyoKind");
            return (Criteria) this;
        }

        public Criteria andSyokugyoKindNotEqualTo(Integer value) {
            addCriterion("SYOKUGYO_KIND <>", value, "syokugyoKind");
            return (Criteria) this;
        }

        public Criteria andSyokugyoKindGreaterThan(Integer value) {
            addCriterion("SYOKUGYO_KIND >", value, "syokugyoKind");
            return (Criteria) this;
        }

        public Criteria andSyokugyoKindGreaterThanOrEqualTo(Integer value) {
            addCriterion("SYOKUGYO_KIND >=", value, "syokugyoKind");
            return (Criteria) this;
        }

        public Criteria andSyokugyoKindLessThan(Integer value) {
            addCriterion("SYOKUGYO_KIND <", value, "syokugyoKind");
            return (Criteria) this;
        }

        public Criteria andSyokugyoKindLessThanOrEqualTo(Integer value) {
            addCriterion("SYOKUGYO_KIND <=", value, "syokugyoKind");
            return (Criteria) this;
        }

        public Criteria andSyokugyoKindIn(List<Integer> values) {
            addCriterion("SYOKUGYO_KIND in", values, "syokugyoKind");
            return (Criteria) this;
        }

        public Criteria andSyokugyoKindNotIn(List<Integer> values) {
            addCriterion("SYOKUGYO_KIND not in", values, "syokugyoKind");
            return (Criteria) this;
        }

        public Criteria andSyokugyoKindBetween(Integer value1, Integer value2) {
            addCriterion("SYOKUGYO_KIND between", value1, value2, "syokugyoKind");
            return (Criteria) this;
        }

        public Criteria andSyokugyoKindNotBetween(Integer value1, Integer value2) {
            addCriterion("SYOKUGYO_KIND not between", value1, value2, "syokugyoKind");
            return (Criteria) this;
        }

        public Criteria andRainitiDateIsNull() {
            addCriterion("RAINITI_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRainitiDateIsNotNull() {
            addCriterion("RAINITI_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRainitiDateEqualTo(Date value) {
            addCriterionForJDBCDate("RAINITI_DATE =", value, "rainitiDate");
            return (Criteria) this;
        }

        public Criteria andRainitiDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("RAINITI_DATE <>", value, "rainitiDate");
            return (Criteria) this;
        }

        public Criteria andRainitiDateGreaterThan(Date value) {
            addCriterionForJDBCDate("RAINITI_DATE >", value, "rainitiDate");
            return (Criteria) this;
        }

        public Criteria andRainitiDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RAINITI_DATE >=", value, "rainitiDate");
            return (Criteria) this;
        }

        public Criteria andRainitiDateLessThan(Date value) {
            addCriterionForJDBCDate("RAINITI_DATE <", value, "rainitiDate");
            return (Criteria) this;
        }

        public Criteria andRainitiDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RAINITI_DATE <=", value, "rainitiDate");
            return (Criteria) this;
        }

        public Criteria andRainitiDateIn(List<Date> values) {
            addCriterionForJDBCDate("RAINITI_DATE in", values, "rainitiDate");
            return (Criteria) this;
        }

        public Criteria andRainitiDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("RAINITI_DATE not in", values, "rainitiDate");
            return (Criteria) this;
        }

        public Criteria andRainitiDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RAINITI_DATE between", value1, value2, "rainitiDate");
            return (Criteria) this;
        }

        public Criteria andRainitiDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RAINITI_DATE not between", value1, value2, "rainitiDate");
            return (Criteria) this;
        }

        public Criteria andBikouIsNull() {
            addCriterion("BIKOU is null");
            return (Criteria) this;
        }

        public Criteria andBikouIsNotNull() {
            addCriterion("BIKOU is not null");
            return (Criteria) this;
        }

        public Criteria andBikouEqualTo(String value) {
            addCriterion("BIKOU =", value, "bikou");
            return (Criteria) this;
        }

        public Criteria andBikouNotEqualTo(String value) {
            addCriterion("BIKOU <>", value, "bikou");
            return (Criteria) this;
        }

        public Criteria andBikouGreaterThan(String value) {
            addCriterion("BIKOU >", value, "bikou");
            return (Criteria) this;
        }

        public Criteria andBikouGreaterThanOrEqualTo(String value) {
            addCriterion("BIKOU >=", value, "bikou");
            return (Criteria) this;
        }

        public Criteria andBikouLessThan(String value) {
            addCriterion("BIKOU <", value, "bikou");
            return (Criteria) this;
        }

        public Criteria andBikouLessThanOrEqualTo(String value) {
            addCriterion("BIKOU <=", value, "bikou");
            return (Criteria) this;
        }

        public Criteria andBikouLike(String value) {
            addCriterion("BIKOU like", value, "bikou");
            return (Criteria) this;
        }

        public Criteria andBikouNotLike(String value) {
            addCriterion("BIKOU not like", value, "bikou");
            return (Criteria) this;
        }

        public Criteria andBikouIn(List<String> values) {
            addCriterion("BIKOU in", values, "bikou");
            return (Criteria) this;
        }

        public Criteria andBikouNotIn(List<String> values) {
            addCriterion("BIKOU not in", values, "bikou");
            return (Criteria) this;
        }

        public Criteria andBikouBetween(String value1, String value2) {
            addCriterion("BIKOU between", value1, value2, "bikou");
            return (Criteria) this;
        }

        public Criteria andBikouNotBetween(String value1, String value2) {
            addCriterion("BIKOU not between", value1, value2, "bikou");
            return (Criteria) this;
        }

        public Criteria andYuubinIsNull() {
            addCriterion("YUUBIN is null");
            return (Criteria) this;
        }

        public Criteria andYuubinIsNotNull() {
            addCriterion("YUUBIN is not null");
            return (Criteria) this;
        }

        public Criteria andYuubinEqualTo(String value) {
            addCriterion("YUUBIN =", value, "yuubin");
            return (Criteria) this;
        }

        public Criteria andYuubinNotEqualTo(String value) {
            addCriterion("YUUBIN <>", value, "yuubin");
            return (Criteria) this;
        }

        public Criteria andYuubinGreaterThan(String value) {
            addCriterion("YUUBIN >", value, "yuubin");
            return (Criteria) this;
        }

        public Criteria andYuubinGreaterThanOrEqualTo(String value) {
            addCriterion("YUUBIN >=", value, "yuubin");
            return (Criteria) this;
        }

        public Criteria andYuubinLessThan(String value) {
            addCriterion("YUUBIN <", value, "yuubin");
            return (Criteria) this;
        }

        public Criteria andYuubinLessThanOrEqualTo(String value) {
            addCriterion("YUUBIN <=", value, "yuubin");
            return (Criteria) this;
        }

        public Criteria andYuubinLike(String value) {
            addCriterion("YUUBIN like", value, "yuubin");
            return (Criteria) this;
        }

        public Criteria andYuubinNotLike(String value) {
            addCriterion("YUUBIN not like", value, "yuubin");
            return (Criteria) this;
        }

        public Criteria andYuubinIn(List<String> values) {
            addCriterion("YUUBIN in", values, "yuubin");
            return (Criteria) this;
        }

        public Criteria andYuubinNotIn(List<String> values) {
            addCriterion("YUUBIN not in", values, "yuubin");
            return (Criteria) this;
        }

        public Criteria andYuubinBetween(String value1, String value2) {
            addCriterion("YUUBIN between", value1, value2, "yuubin");
            return (Criteria) this;
        }

        public Criteria andYuubinNotBetween(String value1, String value2) {
            addCriterion("YUUBIN not between", value1, value2, "yuubin");
            return (Criteria) this;
        }

        public Criteria andJyusyo1IsNull() {
            addCriterion("JYUSYO_1 is null");
            return (Criteria) this;
        }

        public Criteria andJyusyo1IsNotNull() {
            addCriterion("JYUSYO_1 is not null");
            return (Criteria) this;
        }

        public Criteria andJyusyo1EqualTo(String value) {
            addCriterion("JYUSYO_1 =", value, "jyusyo1");
            return (Criteria) this;
        }

        public Criteria andJyusyo1NotEqualTo(String value) {
            addCriterion("JYUSYO_1 <>", value, "jyusyo1");
            return (Criteria) this;
        }

        public Criteria andJyusyo1GreaterThan(String value) {
            addCriterion("JYUSYO_1 >", value, "jyusyo1");
            return (Criteria) this;
        }

        public Criteria andJyusyo1GreaterThanOrEqualTo(String value) {
            addCriterion("JYUSYO_1 >=", value, "jyusyo1");
            return (Criteria) this;
        }

        public Criteria andJyusyo1LessThan(String value) {
            addCriterion("JYUSYO_1 <", value, "jyusyo1");
            return (Criteria) this;
        }

        public Criteria andJyusyo1LessThanOrEqualTo(String value) {
            addCriterion("JYUSYO_1 <=", value, "jyusyo1");
            return (Criteria) this;
        }

        public Criteria andJyusyo1Like(String value) {
            addCriterion("JYUSYO_1 like", value, "jyusyo1");
            return (Criteria) this;
        }

        public Criteria andJyusyo1NotLike(String value) {
            addCriterion("JYUSYO_1 not like", value, "jyusyo1");
            return (Criteria) this;
        }

        public Criteria andJyusyo1In(List<String> values) {
            addCriterion("JYUSYO_1 in", values, "jyusyo1");
            return (Criteria) this;
        }

        public Criteria andJyusyo1NotIn(List<String> values) {
            addCriterion("JYUSYO_1 not in", values, "jyusyo1");
            return (Criteria) this;
        }

        public Criteria andJyusyo1Between(String value1, String value2) {
            addCriterion("JYUSYO_1 between", value1, value2, "jyusyo1");
            return (Criteria) this;
        }

        public Criteria andJyusyo1NotBetween(String value1, String value2) {
            addCriterion("JYUSYO_1 not between", value1, value2, "jyusyo1");
            return (Criteria) this;
        }

        public Criteria andJyusyo2IsNull() {
            addCriterion("JYUSYO_2 is null");
            return (Criteria) this;
        }

        public Criteria andJyusyo2IsNotNull() {
            addCriterion("JYUSYO_2 is not null");
            return (Criteria) this;
        }

        public Criteria andJyusyo2EqualTo(String value) {
            addCriterion("JYUSYO_2 =", value, "jyusyo2");
            return (Criteria) this;
        }

        public Criteria andJyusyo2NotEqualTo(String value) {
            addCriterion("JYUSYO_2 <>", value, "jyusyo2");
            return (Criteria) this;
        }

        public Criteria andJyusyo2GreaterThan(String value) {
            addCriterion("JYUSYO_2 >", value, "jyusyo2");
            return (Criteria) this;
        }

        public Criteria andJyusyo2GreaterThanOrEqualTo(String value) {
            addCriterion("JYUSYO_2 >=", value, "jyusyo2");
            return (Criteria) this;
        }

        public Criteria andJyusyo2LessThan(String value) {
            addCriterion("JYUSYO_2 <", value, "jyusyo2");
            return (Criteria) this;
        }

        public Criteria andJyusyo2LessThanOrEqualTo(String value) {
            addCriterion("JYUSYO_2 <=", value, "jyusyo2");
            return (Criteria) this;
        }

        public Criteria andJyusyo2Like(String value) {
            addCriterion("JYUSYO_2 like", value, "jyusyo2");
            return (Criteria) this;
        }

        public Criteria andJyusyo2NotLike(String value) {
            addCriterion("JYUSYO_2 not like", value, "jyusyo2");
            return (Criteria) this;
        }

        public Criteria andJyusyo2In(List<String> values) {
            addCriterion("JYUSYO_2 in", values, "jyusyo2");
            return (Criteria) this;
        }

        public Criteria andJyusyo2NotIn(List<String> values) {
            addCriterion("JYUSYO_2 not in", values, "jyusyo2");
            return (Criteria) this;
        }

        public Criteria andJyusyo2Between(String value1, String value2) {
            addCriterion("JYUSYO_2 between", value1, value2, "jyusyo2");
            return (Criteria) this;
        }

        public Criteria andJyusyo2NotBetween(String value1, String value2) {
            addCriterion("JYUSYO_2 not between", value1, value2, "jyusyo2");
            return (Criteria) this;
        }

        public Criteria andMoyoriEkiIsNull() {
            addCriterion("MOYORI_EKI is null");
            return (Criteria) this;
        }

        public Criteria andMoyoriEkiIsNotNull() {
            addCriterion("MOYORI_EKI is not null");
            return (Criteria) this;
        }

        public Criteria andMoyoriEkiEqualTo(String value) {
            addCriterion("MOYORI_EKI =", value, "moyoriEki");
            return (Criteria) this;
        }

        public Criteria andMoyoriEkiNotEqualTo(String value) {
            addCriterion("MOYORI_EKI <>", value, "moyoriEki");
            return (Criteria) this;
        }

        public Criteria andMoyoriEkiGreaterThan(String value) {
            addCriterion("MOYORI_EKI >", value, "moyoriEki");
            return (Criteria) this;
        }

        public Criteria andMoyoriEkiGreaterThanOrEqualTo(String value) {
            addCriterion("MOYORI_EKI >=", value, "moyoriEki");
            return (Criteria) this;
        }

        public Criteria andMoyoriEkiLessThan(String value) {
            addCriterion("MOYORI_EKI <", value, "moyoriEki");
            return (Criteria) this;
        }

        public Criteria andMoyoriEkiLessThanOrEqualTo(String value) {
            addCriterion("MOYORI_EKI <=", value, "moyoriEki");
            return (Criteria) this;
        }

        public Criteria andMoyoriEkiLike(String value) {
            addCriterion("MOYORI_EKI like", value, "moyoriEki");
            return (Criteria) this;
        }

        public Criteria andMoyoriEkiNotLike(String value) {
            addCriterion("MOYORI_EKI not like", value, "moyoriEki");
            return (Criteria) this;
        }

        public Criteria andMoyoriEkiIn(List<String> values) {
            addCriterion("MOYORI_EKI in", values, "moyoriEki");
            return (Criteria) this;
        }

        public Criteria andMoyoriEkiNotIn(List<String> values) {
            addCriterion("MOYORI_EKI not in", values, "moyoriEki");
            return (Criteria) this;
        }

        public Criteria andMoyoriEkiBetween(String value1, String value2) {
            addCriterion("MOYORI_EKI between", value1, value2, "moyoriEki");
            return (Criteria) this;
        }

        public Criteria andMoyoriEkiNotBetween(String value1, String value2) {
            addCriterion("MOYORI_EKI not between", value1, value2, "moyoriEki");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("WECHAT is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("WECHAT is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("WECHAT =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("WECHAT <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("WECHAT >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("WECHAT >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("WECHAT <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("WECHAT <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("WECHAT like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("WECHAT not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("WECHAT in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("WECHAT not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("WECHAT between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("WECHAT not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andLineIsNull() {
            addCriterion("LINE is null");
            return (Criteria) this;
        }

        public Criteria andLineIsNotNull() {
            addCriterion("LINE is not null");
            return (Criteria) this;
        }

        public Criteria andLineEqualTo(String value) {
            addCriterion("LINE =", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotEqualTo(String value) {
            addCriterion("LINE <>", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineGreaterThan(String value) {
            addCriterion("LINE >", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineGreaterThanOrEqualTo(String value) {
            addCriterion("LINE >=", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLessThan(String value) {
            addCriterion("LINE <", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLessThanOrEqualTo(String value) {
            addCriterion("LINE <=", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLike(String value) {
            addCriterion("LINE like", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotLike(String value) {
            addCriterion("LINE not like", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineIn(List<String> values) {
            addCriterion("LINE in", values, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotIn(List<String> values) {
            addCriterion("LINE not in", values, "line");
            return (Criteria) this;
        }

        public Criteria andLineBetween(String value1, String value2) {
            addCriterion("LINE between", value1, value2, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotBetween(String value1, String value2) {
            addCriterion("LINE not between", value1, value2, "line");
            return (Criteria) this;
        }

        public Criteria andBokokuJyusyoIsNull() {
            addCriterion("BOKOKU_JYUSYO is null");
            return (Criteria) this;
        }

        public Criteria andBokokuJyusyoIsNotNull() {
            addCriterion("BOKOKU_JYUSYO is not null");
            return (Criteria) this;
        }

        public Criteria andBokokuJyusyoEqualTo(String value) {
            addCriterion("BOKOKU_JYUSYO =", value, "bokokuJyusyo");
            return (Criteria) this;
        }

        public Criteria andBokokuJyusyoNotEqualTo(String value) {
            addCriterion("BOKOKU_JYUSYO <>", value, "bokokuJyusyo");
            return (Criteria) this;
        }

        public Criteria andBokokuJyusyoGreaterThan(String value) {
            addCriterion("BOKOKU_JYUSYO >", value, "bokokuJyusyo");
            return (Criteria) this;
        }

        public Criteria andBokokuJyusyoGreaterThanOrEqualTo(String value) {
            addCriterion("BOKOKU_JYUSYO >=", value, "bokokuJyusyo");
            return (Criteria) this;
        }

        public Criteria andBokokuJyusyoLessThan(String value) {
            addCriterion("BOKOKU_JYUSYO <", value, "bokokuJyusyo");
            return (Criteria) this;
        }

        public Criteria andBokokuJyusyoLessThanOrEqualTo(String value) {
            addCriterion("BOKOKU_JYUSYO <=", value, "bokokuJyusyo");
            return (Criteria) this;
        }

        public Criteria andBokokuJyusyoLike(String value) {
            addCriterion("BOKOKU_JYUSYO like", value, "bokokuJyusyo");
            return (Criteria) this;
        }

        public Criteria andBokokuJyusyoNotLike(String value) {
            addCriterion("BOKOKU_JYUSYO not like", value, "bokokuJyusyo");
            return (Criteria) this;
        }

        public Criteria andBokokuJyusyoIn(List<String> values) {
            addCriterion("BOKOKU_JYUSYO in", values, "bokokuJyusyo");
            return (Criteria) this;
        }

        public Criteria andBokokuJyusyoNotIn(List<String> values) {
            addCriterion("BOKOKU_JYUSYO not in", values, "bokokuJyusyo");
            return (Criteria) this;
        }

        public Criteria andBokokuJyusyoBetween(String value1, String value2) {
            addCriterion("BOKOKU_JYUSYO between", value1, value2, "bokokuJyusyo");
            return (Criteria) this;
        }

        public Criteria andBokokuJyusyoNotBetween(String value1, String value2) {
            addCriterion("BOKOKU_JYUSYO not between", value1, value2, "bokokuJyusyo");
            return (Criteria) this;
        }

        public Criteria andBokokuKinnkyuuRennrakuIsNull() {
            addCriterion("BOKOKU_KINNKYUU_RENNRAKU is null");
            return (Criteria) this;
        }

        public Criteria andBokokuKinnkyuuRennrakuIsNotNull() {
            addCriterion("BOKOKU_KINNKYUU_RENNRAKU is not null");
            return (Criteria) this;
        }

        public Criteria andBokokuKinnkyuuRennrakuEqualTo(String value) {
            addCriterion("BOKOKU_KINNKYUU_RENNRAKU =", value, "bokokuKinnkyuuRennraku");
            return (Criteria) this;
        }

        public Criteria andBokokuKinnkyuuRennrakuNotEqualTo(String value) {
            addCriterion("BOKOKU_KINNKYUU_RENNRAKU <>", value, "bokokuKinnkyuuRennraku");
            return (Criteria) this;
        }

        public Criteria andBokokuKinnkyuuRennrakuGreaterThan(String value) {
            addCriterion("BOKOKU_KINNKYUU_RENNRAKU >", value, "bokokuKinnkyuuRennraku");
            return (Criteria) this;
        }

        public Criteria andBokokuKinnkyuuRennrakuGreaterThanOrEqualTo(String value) {
            addCriterion("BOKOKU_KINNKYUU_RENNRAKU >=", value, "bokokuKinnkyuuRennraku");
            return (Criteria) this;
        }

        public Criteria andBokokuKinnkyuuRennrakuLessThan(String value) {
            addCriterion("BOKOKU_KINNKYUU_RENNRAKU <", value, "bokokuKinnkyuuRennraku");
            return (Criteria) this;
        }

        public Criteria andBokokuKinnkyuuRennrakuLessThanOrEqualTo(String value) {
            addCriterion("BOKOKU_KINNKYUU_RENNRAKU <=", value, "bokokuKinnkyuuRennraku");
            return (Criteria) this;
        }

        public Criteria andBokokuKinnkyuuRennrakuLike(String value) {
            addCriterion("BOKOKU_KINNKYUU_RENNRAKU like", value, "bokokuKinnkyuuRennraku");
            return (Criteria) this;
        }

        public Criteria andBokokuKinnkyuuRennrakuNotLike(String value) {
            addCriterion("BOKOKU_KINNKYUU_RENNRAKU not like", value, "bokokuKinnkyuuRennraku");
            return (Criteria) this;
        }

        public Criteria andBokokuKinnkyuuRennrakuIn(List<String> values) {
            addCriterion("BOKOKU_KINNKYUU_RENNRAKU in", values, "bokokuKinnkyuuRennraku");
            return (Criteria) this;
        }

        public Criteria andBokokuKinnkyuuRennrakuNotIn(List<String> values) {
            addCriterion("BOKOKU_KINNKYUU_RENNRAKU not in", values, "bokokuKinnkyuuRennraku");
            return (Criteria) this;
        }

        public Criteria andBokokuKinnkyuuRennrakuBetween(String value1, String value2) {
            addCriterion("BOKOKU_KINNKYUU_RENNRAKU between", value1, value2, "bokokuKinnkyuuRennraku");
            return (Criteria) this;
        }

        public Criteria andBokokuKinnkyuuRennrakuNotBetween(String value1, String value2) {
            addCriterion("BOKOKU_KINNKYUU_RENNRAKU not between", value1, value2, "bokokuKinnkyuuRennraku");
            return (Criteria) this;
        }

        public Criteria andSaisyuuGakurekiIsNull() {
            addCriterion("SAISYUU_GAKUREKI is null");
            return (Criteria) this;
        }

        public Criteria andSaisyuuGakurekiIsNotNull() {
            addCriterion("SAISYUU_GAKUREKI is not null");
            return (Criteria) this;
        }

        public Criteria andSaisyuuGakurekiEqualTo(Integer value) {
            addCriterion("SAISYUU_GAKUREKI =", value, "saisyuuGakureki");
            return (Criteria) this;
        }

        public Criteria andSaisyuuGakurekiNotEqualTo(Integer value) {
            addCriterion("SAISYUU_GAKUREKI <>", value, "saisyuuGakureki");
            return (Criteria) this;
        }

        public Criteria andSaisyuuGakurekiGreaterThan(Integer value) {
            addCriterion("SAISYUU_GAKUREKI >", value, "saisyuuGakureki");
            return (Criteria) this;
        }

        public Criteria andSaisyuuGakurekiGreaterThanOrEqualTo(Integer value) {
            addCriterion("SAISYUU_GAKUREKI >=", value, "saisyuuGakureki");
            return (Criteria) this;
        }

        public Criteria andSaisyuuGakurekiLessThan(Integer value) {
            addCriterion("SAISYUU_GAKUREKI <", value, "saisyuuGakureki");
            return (Criteria) this;
        }

        public Criteria andSaisyuuGakurekiLessThanOrEqualTo(Integer value) {
            addCriterion("SAISYUU_GAKUREKI <=", value, "saisyuuGakureki");
            return (Criteria) this;
        }

        public Criteria andSaisyuuGakurekiIn(List<Integer> values) {
            addCriterion("SAISYUU_GAKUREKI in", values, "saisyuuGakureki");
            return (Criteria) this;
        }

        public Criteria andSaisyuuGakurekiNotIn(List<Integer> values) {
            addCriterion("SAISYUU_GAKUREKI not in", values, "saisyuuGakureki");
            return (Criteria) this;
        }

        public Criteria andSaisyuuGakurekiBetween(Integer value1, Integer value2) {
            addCriterion("SAISYUU_GAKUREKI between", value1, value2, "saisyuuGakureki");
            return (Criteria) this;
        }

        public Criteria andSaisyuuGakurekiNotBetween(Integer value1, Integer value2) {
            addCriterion("SAISYUU_GAKUREKI not between", value1, value2, "saisyuuGakureki");
            return (Criteria) this;
        }

        public Criteria andGakkouNameIsNull() {
            addCriterion("GAKKOU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGakkouNameIsNotNull() {
            addCriterion("GAKKOU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGakkouNameEqualTo(String value) {
            addCriterion("GAKKOU_NAME =", value, "gakkouName");
            return (Criteria) this;
        }

        public Criteria andGakkouNameNotEqualTo(String value) {
            addCriterion("GAKKOU_NAME <>", value, "gakkouName");
            return (Criteria) this;
        }

        public Criteria andGakkouNameGreaterThan(String value) {
            addCriterion("GAKKOU_NAME >", value, "gakkouName");
            return (Criteria) this;
        }

        public Criteria andGakkouNameGreaterThanOrEqualTo(String value) {
            addCriterion("GAKKOU_NAME >=", value, "gakkouName");
            return (Criteria) this;
        }

        public Criteria andGakkouNameLessThan(String value) {
            addCriterion("GAKKOU_NAME <", value, "gakkouName");
            return (Criteria) this;
        }

        public Criteria andGakkouNameLessThanOrEqualTo(String value) {
            addCriterion("GAKKOU_NAME <=", value, "gakkouName");
            return (Criteria) this;
        }

        public Criteria andGakkouNameLike(String value) {
            addCriterion("GAKKOU_NAME like", value, "gakkouName");
            return (Criteria) this;
        }

        public Criteria andGakkouNameNotLike(String value) {
            addCriterion("GAKKOU_NAME not like", value, "gakkouName");
            return (Criteria) this;
        }

        public Criteria andGakkouNameIn(List<String> values) {
            addCriterion("GAKKOU_NAME in", values, "gakkouName");
            return (Criteria) this;
        }

        public Criteria andGakkouNameNotIn(List<String> values) {
            addCriterion("GAKKOU_NAME not in", values, "gakkouName");
            return (Criteria) this;
        }

        public Criteria andGakkouNameBetween(String value1, String value2) {
            addCriterion("GAKKOU_NAME between", value1, value2, "gakkouName");
            return (Criteria) this;
        }

        public Criteria andGakkouNameNotBetween(String value1, String value2) {
            addCriterion("GAKKOU_NAME not between", value1, value2, "gakkouName");
            return (Criteria) this;
        }

        public Criteria andSennmomNameIsNull() {
            addCriterion("SENNMOM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSennmomNameIsNotNull() {
            addCriterion("SENNMOM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSennmomNameEqualTo(String value) {
            addCriterion("SENNMOM_NAME =", value, "sennmomName");
            return (Criteria) this;
        }

        public Criteria andSennmomNameNotEqualTo(String value) {
            addCriterion("SENNMOM_NAME <>", value, "sennmomName");
            return (Criteria) this;
        }

        public Criteria andSennmomNameGreaterThan(String value) {
            addCriterion("SENNMOM_NAME >", value, "sennmomName");
            return (Criteria) this;
        }

        public Criteria andSennmomNameGreaterThanOrEqualTo(String value) {
            addCriterion("SENNMOM_NAME >=", value, "sennmomName");
            return (Criteria) this;
        }

        public Criteria andSennmomNameLessThan(String value) {
            addCriterion("SENNMOM_NAME <", value, "sennmomName");
            return (Criteria) this;
        }

        public Criteria andSennmomNameLessThanOrEqualTo(String value) {
            addCriterion("SENNMOM_NAME <=", value, "sennmomName");
            return (Criteria) this;
        }

        public Criteria andSennmomNameLike(String value) {
            addCriterion("SENNMOM_NAME like", value, "sennmomName");
            return (Criteria) this;
        }

        public Criteria andSennmomNameNotLike(String value) {
            addCriterion("SENNMOM_NAME not like", value, "sennmomName");
            return (Criteria) this;
        }

        public Criteria andSennmomNameIn(List<String> values) {
            addCriterion("SENNMOM_NAME in", values, "sennmomName");
            return (Criteria) this;
        }

        public Criteria andSennmomNameNotIn(List<String> values) {
            addCriterion("SENNMOM_NAME not in", values, "sennmomName");
            return (Criteria) this;
        }

        public Criteria andSennmomNameBetween(String value1, String value2) {
            addCriterion("SENNMOM_NAME between", value1, value2, "sennmomName");
            return (Criteria) this;
        }

        public Criteria andSennmomNameNotBetween(String value1, String value2) {
            addCriterion("SENNMOM_NAME not between", value1, value2, "sennmomName");
            return (Criteria) this;
        }

        public Criteria andSotugyoDateIsNull() {
            addCriterion("SOTUGYO_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSotugyoDateIsNotNull() {
            addCriterion("SOTUGYO_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSotugyoDateEqualTo(Date value) {
            addCriterionForJDBCDate("SOTUGYO_DATE =", value, "sotugyoDate");
            return (Criteria) this;
        }

        public Criteria andSotugyoDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SOTUGYO_DATE <>", value, "sotugyoDate");
            return (Criteria) this;
        }

        public Criteria andSotugyoDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SOTUGYO_DATE >", value, "sotugyoDate");
            return (Criteria) this;
        }

        public Criteria andSotugyoDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SOTUGYO_DATE >=", value, "sotugyoDate");
            return (Criteria) this;
        }

        public Criteria andSotugyoDateLessThan(Date value) {
            addCriterionForJDBCDate("SOTUGYO_DATE <", value, "sotugyoDate");
            return (Criteria) this;
        }

        public Criteria andSotugyoDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SOTUGYO_DATE <=", value, "sotugyoDate");
            return (Criteria) this;
        }

        public Criteria andSotugyoDateIn(List<Date> values) {
            addCriterionForJDBCDate("SOTUGYO_DATE in", values, "sotugyoDate");
            return (Criteria) this;
        }

        public Criteria andSotugyoDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SOTUGYO_DATE not in", values, "sotugyoDate");
            return (Criteria) this;
        }

        public Criteria andSotugyoDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SOTUGYO_DATE between", value1, value2, "sotugyoDate");
            return (Criteria) this;
        }

        public Criteria andSotugyoDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SOTUGYO_DATE not between", value1, value2, "sotugyoDate");
            return (Criteria) this;
        }

        public Criteria andGyumuNensuIsNull() {
            addCriterion("GYUMU_NENSU is null");
            return (Criteria) this;
        }

        public Criteria andGyumuNensuIsNotNull() {
            addCriterion("GYUMU_NENSU is not null");
            return (Criteria) this;
        }

        public Criteria andGyumuNensuEqualTo(Float value) {
            addCriterion("GYUMU_NENSU =", value, "gyumuNensu");
            return (Criteria) this;
        }

        public Criteria andGyumuNensuNotEqualTo(Float value) {
            addCriterion("GYUMU_NENSU <>", value, "gyumuNensu");
            return (Criteria) this;
        }

        public Criteria andGyumuNensuGreaterThan(Float value) {
            addCriterion("GYUMU_NENSU >", value, "gyumuNensu");
            return (Criteria) this;
        }

        public Criteria andGyumuNensuGreaterThanOrEqualTo(Float value) {
            addCriterion("GYUMU_NENSU >=", value, "gyumuNensu");
            return (Criteria) this;
        }

        public Criteria andGyumuNensuLessThan(Float value) {
            addCriterion("GYUMU_NENSU <", value, "gyumuNensu");
            return (Criteria) this;
        }

        public Criteria andGyumuNensuLessThanOrEqualTo(Float value) {
            addCriterion("GYUMU_NENSU <=", value, "gyumuNensu");
            return (Criteria) this;
        }

        public Criteria andGyumuNensuIn(List<Float> values) {
            addCriterion("GYUMU_NENSU in", values, "gyumuNensu");
            return (Criteria) this;
        }

        public Criteria andGyumuNensuNotIn(List<Float> values) {
            addCriterion("GYUMU_NENSU not in", values, "gyumuNensu");
            return (Criteria) this;
        }

        public Criteria andGyumuNensuBetween(Float value1, Float value2) {
            addCriterion("GYUMU_NENSU between", value1, value2, "gyumuNensu");
            return (Criteria) this;
        }

        public Criteria andGyumuNensuNotBetween(Float value1, Float value2) {
            addCriterion("GYUMU_NENSU not between", value1, value2, "gyumuNensu");
            return (Criteria) this;
        }

        public Criteria andItOsIsNull() {
            addCriterion("IT_OS is null");
            return (Criteria) this;
        }

        public Criteria andItOsIsNotNull() {
            addCriterion("IT_OS is not null");
            return (Criteria) this;
        }

        public Criteria andItOsEqualTo(String value) {
            addCriterion("IT_OS =", value, "itOs");
            return (Criteria) this;
        }

        public Criteria andItOsNotEqualTo(String value) {
            addCriterion("IT_OS <>", value, "itOs");
            return (Criteria) this;
        }

        public Criteria andItOsGreaterThan(String value) {
            addCriterion("IT_OS >", value, "itOs");
            return (Criteria) this;
        }

        public Criteria andItOsGreaterThanOrEqualTo(String value) {
            addCriterion("IT_OS >=", value, "itOs");
            return (Criteria) this;
        }

        public Criteria andItOsLessThan(String value) {
            addCriterion("IT_OS <", value, "itOs");
            return (Criteria) this;
        }

        public Criteria andItOsLessThanOrEqualTo(String value) {
            addCriterion("IT_OS <=", value, "itOs");
            return (Criteria) this;
        }

        public Criteria andItOsLike(String value) {
            addCriterion("IT_OS like", value, "itOs");
            return (Criteria) this;
        }

        public Criteria andItOsNotLike(String value) {
            addCriterion("IT_OS not like", value, "itOs");
            return (Criteria) this;
        }

        public Criteria andItOsIn(List<String> values) {
            addCriterion("IT_OS in", values, "itOs");
            return (Criteria) this;
        }

        public Criteria andItOsNotIn(List<String> values) {
            addCriterion("IT_OS not in", values, "itOs");
            return (Criteria) this;
        }

        public Criteria andItOsBetween(String value1, String value2) {
            addCriterion("IT_OS between", value1, value2, "itOs");
            return (Criteria) this;
        }

        public Criteria andItOsNotBetween(String value1, String value2) {
            addCriterion("IT_OS not between", value1, value2, "itOs");
            return (Criteria) this;
        }

        public Criteria andItGengoIsNull() {
            addCriterion("IT_GENGO is null");
            return (Criteria) this;
        }

        public Criteria andItGengoIsNotNull() {
            addCriterion("IT_GENGO is not null");
            return (Criteria) this;
        }

        public Criteria andItGengoEqualTo(String value) {
            addCriterion("IT_GENGO =", value, "itGengo");
            return (Criteria) this;
        }

        public Criteria andItGengoNotEqualTo(String value) {
            addCriterion("IT_GENGO <>", value, "itGengo");
            return (Criteria) this;
        }

        public Criteria andItGengoGreaterThan(String value) {
            addCriterion("IT_GENGO >", value, "itGengo");
            return (Criteria) this;
        }

        public Criteria andItGengoGreaterThanOrEqualTo(String value) {
            addCriterion("IT_GENGO >=", value, "itGengo");
            return (Criteria) this;
        }

        public Criteria andItGengoLessThan(String value) {
            addCriterion("IT_GENGO <", value, "itGengo");
            return (Criteria) this;
        }

        public Criteria andItGengoLessThanOrEqualTo(String value) {
            addCriterion("IT_GENGO <=", value, "itGengo");
            return (Criteria) this;
        }

        public Criteria andItGengoLike(String value) {
            addCriterion("IT_GENGO like", value, "itGengo");
            return (Criteria) this;
        }

        public Criteria andItGengoNotLike(String value) {
            addCriterion("IT_GENGO not like", value, "itGengo");
            return (Criteria) this;
        }

        public Criteria andItGengoIn(List<String> values) {
            addCriterion("IT_GENGO in", values, "itGengo");
            return (Criteria) this;
        }

        public Criteria andItGengoNotIn(List<String> values) {
            addCriterion("IT_GENGO not in", values, "itGengo");
            return (Criteria) this;
        }

        public Criteria andItGengoBetween(String value1, String value2) {
            addCriterion("IT_GENGO between", value1, value2, "itGengo");
            return (Criteria) this;
        }

        public Criteria andItGengoNotBetween(String value1, String value2) {
            addCriterion("IT_GENGO not between", value1, value2, "itGengo");
            return (Criteria) this;
        }

        public Criteria andItDbIsNull() {
            addCriterion("IT_DB is null");
            return (Criteria) this;
        }

        public Criteria andItDbIsNotNull() {
            addCriterion("IT_DB is not null");
            return (Criteria) this;
        }

        public Criteria andItDbEqualTo(String value) {
            addCriterion("IT_DB =", value, "itDb");
            return (Criteria) this;
        }

        public Criteria andItDbNotEqualTo(String value) {
            addCriterion("IT_DB <>", value, "itDb");
            return (Criteria) this;
        }

        public Criteria andItDbGreaterThan(String value) {
            addCriterion("IT_DB >", value, "itDb");
            return (Criteria) this;
        }

        public Criteria andItDbGreaterThanOrEqualTo(String value) {
            addCriterion("IT_DB >=", value, "itDb");
            return (Criteria) this;
        }

        public Criteria andItDbLessThan(String value) {
            addCriterion("IT_DB <", value, "itDb");
            return (Criteria) this;
        }

        public Criteria andItDbLessThanOrEqualTo(String value) {
            addCriterion("IT_DB <=", value, "itDb");
            return (Criteria) this;
        }

        public Criteria andItDbLike(String value) {
            addCriterion("IT_DB like", value, "itDb");
            return (Criteria) this;
        }

        public Criteria andItDbNotLike(String value) {
            addCriterion("IT_DB not like", value, "itDb");
            return (Criteria) this;
        }

        public Criteria andItDbIn(List<String> values) {
            addCriterion("IT_DB in", values, "itDb");
            return (Criteria) this;
        }

        public Criteria andItDbNotIn(List<String> values) {
            addCriterion("IT_DB not in", values, "itDb");
            return (Criteria) this;
        }

        public Criteria andItDbBetween(String value1, String value2) {
            addCriterion("IT_DB between", value1, value2, "itDb");
            return (Criteria) this;
        }

        public Criteria andItDbNotBetween(String value1, String value2) {
            addCriterion("IT_DB not between", value1, value2, "itDb");
            return (Criteria) this;
        }

        public Criteria andItWebServerIsNull() {
            addCriterion("IT_WEB_SERVER is null");
            return (Criteria) this;
        }

        public Criteria andItWebServerIsNotNull() {
            addCriterion("IT_WEB_SERVER is not null");
            return (Criteria) this;
        }

        public Criteria andItWebServerEqualTo(String value) {
            addCriterion("IT_WEB_SERVER =", value, "itWebServer");
            return (Criteria) this;
        }

        public Criteria andItWebServerNotEqualTo(String value) {
            addCriterion("IT_WEB_SERVER <>", value, "itWebServer");
            return (Criteria) this;
        }

        public Criteria andItWebServerGreaterThan(String value) {
            addCriterion("IT_WEB_SERVER >", value, "itWebServer");
            return (Criteria) this;
        }

        public Criteria andItWebServerGreaterThanOrEqualTo(String value) {
            addCriterion("IT_WEB_SERVER >=", value, "itWebServer");
            return (Criteria) this;
        }

        public Criteria andItWebServerLessThan(String value) {
            addCriterion("IT_WEB_SERVER <", value, "itWebServer");
            return (Criteria) this;
        }

        public Criteria andItWebServerLessThanOrEqualTo(String value) {
            addCriterion("IT_WEB_SERVER <=", value, "itWebServer");
            return (Criteria) this;
        }

        public Criteria andItWebServerLike(String value) {
            addCriterion("IT_WEB_SERVER like", value, "itWebServer");
            return (Criteria) this;
        }

        public Criteria andItWebServerNotLike(String value) {
            addCriterion("IT_WEB_SERVER not like", value, "itWebServer");
            return (Criteria) this;
        }

        public Criteria andItWebServerIn(List<String> values) {
            addCriterion("IT_WEB_SERVER in", values, "itWebServer");
            return (Criteria) this;
        }

        public Criteria andItWebServerNotIn(List<String> values) {
            addCriterion("IT_WEB_SERVER not in", values, "itWebServer");
            return (Criteria) this;
        }

        public Criteria andItWebServerBetween(String value1, String value2) {
            addCriterion("IT_WEB_SERVER between", value1, value2, "itWebServer");
            return (Criteria) this;
        }

        public Criteria andItWebServerNotBetween(String value1, String value2) {
            addCriterion("IT_WEB_SERVER not between", value1, value2, "itWebServer");
            return (Criteria) this;
        }

        public Criteria andItFwIsNull() {
            addCriterion("IT_FW is null");
            return (Criteria) this;
        }

        public Criteria andItFwIsNotNull() {
            addCriterion("IT_FW is not null");
            return (Criteria) this;
        }

        public Criteria andItFwEqualTo(String value) {
            addCriterion("IT_FW =", value, "itFw");
            return (Criteria) this;
        }

        public Criteria andItFwNotEqualTo(String value) {
            addCriterion("IT_FW <>", value, "itFw");
            return (Criteria) this;
        }

        public Criteria andItFwGreaterThan(String value) {
            addCriterion("IT_FW >", value, "itFw");
            return (Criteria) this;
        }

        public Criteria andItFwGreaterThanOrEqualTo(String value) {
            addCriterion("IT_FW >=", value, "itFw");
            return (Criteria) this;
        }

        public Criteria andItFwLessThan(String value) {
            addCriterion("IT_FW <", value, "itFw");
            return (Criteria) this;
        }

        public Criteria andItFwLessThanOrEqualTo(String value) {
            addCriterion("IT_FW <=", value, "itFw");
            return (Criteria) this;
        }

        public Criteria andItFwLike(String value) {
            addCriterion("IT_FW like", value, "itFw");
            return (Criteria) this;
        }

        public Criteria andItFwNotLike(String value) {
            addCriterion("IT_FW not like", value, "itFw");
            return (Criteria) this;
        }

        public Criteria andItFwIn(List<String> values) {
            addCriterion("IT_FW in", values, "itFw");
            return (Criteria) this;
        }

        public Criteria andItFwNotIn(List<String> values) {
            addCriterion("IT_FW not in", values, "itFw");
            return (Criteria) this;
        }

        public Criteria andItFwBetween(String value1, String value2) {
            addCriterion("IT_FW between", value1, value2, "itFw");
            return (Criteria) this;
        }

        public Criteria andItFwNotBetween(String value1, String value2) {
            addCriterion("IT_FW not between", value1, value2, "itFw");
            return (Criteria) this;
        }

        public Criteria andItOtherIsNull() {
            addCriterion("IT_OTHER is null");
            return (Criteria) this;
        }

        public Criteria andItOtherIsNotNull() {
            addCriterion("IT_OTHER is not null");
            return (Criteria) this;
        }

        public Criteria andItOtherEqualTo(String value) {
            addCriterion("IT_OTHER =", value, "itOther");
            return (Criteria) this;
        }

        public Criteria andItOtherNotEqualTo(String value) {
            addCriterion("IT_OTHER <>", value, "itOther");
            return (Criteria) this;
        }

        public Criteria andItOtherGreaterThan(String value) {
            addCriterion("IT_OTHER >", value, "itOther");
            return (Criteria) this;
        }

        public Criteria andItOtherGreaterThanOrEqualTo(String value) {
            addCriterion("IT_OTHER >=", value, "itOther");
            return (Criteria) this;
        }

        public Criteria andItOtherLessThan(String value) {
            addCriterion("IT_OTHER <", value, "itOther");
            return (Criteria) this;
        }

        public Criteria andItOtherLessThanOrEqualTo(String value) {
            addCriterion("IT_OTHER <=", value, "itOther");
            return (Criteria) this;
        }

        public Criteria andItOtherLike(String value) {
            addCriterion("IT_OTHER like", value, "itOther");
            return (Criteria) this;
        }

        public Criteria andItOtherNotLike(String value) {
            addCriterion("IT_OTHER not like", value, "itOther");
            return (Criteria) this;
        }

        public Criteria andItOtherIn(List<String> values) {
            addCriterion("IT_OTHER in", values, "itOther");
            return (Criteria) this;
        }

        public Criteria andItOtherNotIn(List<String> values) {
            addCriterion("IT_OTHER not in", values, "itOther");
            return (Criteria) this;
        }

        public Criteria andItOtherBetween(String value1, String value2) {
            addCriterion("IT_OTHER between", value1, value2, "itOther");
            return (Criteria) this;
        }

        public Criteria andItOtherNotBetween(String value1, String value2) {
            addCriterion("IT_OTHER not between", value1, value2, "itOther");
            return (Criteria) this;
        }

        public Criteria andItBikouIsNull() {
            addCriterion("IT_BIKOU is null");
            return (Criteria) this;
        }

        public Criteria andItBikouIsNotNull() {
            addCriterion("IT_BIKOU is not null");
            return (Criteria) this;
        }

        public Criteria andItBikouEqualTo(String value) {
            addCriterion("IT_BIKOU =", value, "itBikou");
            return (Criteria) this;
        }

        public Criteria andItBikouNotEqualTo(String value) {
            addCriterion("IT_BIKOU <>", value, "itBikou");
            return (Criteria) this;
        }

        public Criteria andItBikouGreaterThan(String value) {
            addCriterion("IT_BIKOU >", value, "itBikou");
            return (Criteria) this;
        }

        public Criteria andItBikouGreaterThanOrEqualTo(String value) {
            addCriterion("IT_BIKOU >=", value, "itBikou");
            return (Criteria) this;
        }

        public Criteria andItBikouLessThan(String value) {
            addCriterion("IT_BIKOU <", value, "itBikou");
            return (Criteria) this;
        }

        public Criteria andItBikouLessThanOrEqualTo(String value) {
            addCriterion("IT_BIKOU <=", value, "itBikou");
            return (Criteria) this;
        }

        public Criteria andItBikouLike(String value) {
            addCriterion("IT_BIKOU like", value, "itBikou");
            return (Criteria) this;
        }

        public Criteria andItBikouNotLike(String value) {
            addCriterion("IT_BIKOU not like", value, "itBikou");
            return (Criteria) this;
        }

        public Criteria andItBikouIn(List<String> values) {
            addCriterion("IT_BIKOU in", values, "itBikou");
            return (Criteria) this;
        }

        public Criteria andItBikouNotIn(List<String> values) {
            addCriterion("IT_BIKOU not in", values, "itBikou");
            return (Criteria) this;
        }

        public Criteria andItBikouBetween(String value1, String value2) {
            addCriterion("IT_BIKOU between", value1, value2, "itBikou");
            return (Criteria) this;
        }

        public Criteria andItBikouNotBetween(String value1, String value2) {
            addCriterion("IT_BIKOU not between", value1, value2, "itBikou");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("DELETE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("DELETE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Integer value) {
            addCriterion("DELETE_FLAG =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Integer value) {
            addCriterion("DELETE_FLAG <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Integer value) {
            addCriterion("DELETE_FLAG >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELETE_FLAG >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Integer value) {
            addCriterion("DELETE_FLAG <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("DELETE_FLAG <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Integer> values) {
            addCriterion("DELETE_FLAG in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Integer> values) {
            addCriterion("DELETE_FLAG not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("DELETE_FLAG between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("DELETE_FLAG not between", value1, value2, "deleteFlag");
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