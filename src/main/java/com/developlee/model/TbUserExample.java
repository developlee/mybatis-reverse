package com.developlee.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAutoIdIsNull() {
            addCriterion("auto_id is null");
            return (Criteria) this;
        }

        public Criteria andAutoIdIsNotNull() {
            addCriterion("auto_id is not null");
            return (Criteria) this;
        }

        public Criteria andAutoIdEqualTo(Integer value) {
            addCriterion("auto_id =", value, "autoId");
            return (Criteria) this;
        }

        public Criteria andAutoIdNotEqualTo(Integer value) {
            addCriterion("auto_id <>", value, "autoId");
            return (Criteria) this;
        }

        public Criteria andAutoIdGreaterThan(Integer value) {
            addCriterion("auto_id >", value, "autoId");
            return (Criteria) this;
        }

        public Criteria andAutoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_id >=", value, "autoId");
            return (Criteria) this;
        }

        public Criteria andAutoIdLessThan(Integer value) {
            addCriterion("auto_id <", value, "autoId");
            return (Criteria) this;
        }

        public Criteria andAutoIdLessThanOrEqualTo(Integer value) {
            addCriterion("auto_id <=", value, "autoId");
            return (Criteria) this;
        }

        public Criteria andAutoIdIn(List<Integer> values) {
            addCriterion("auto_id in", values, "autoId");
            return (Criteria) this;
        }

        public Criteria andAutoIdNotIn(List<Integer> values) {
            addCriterion("auto_id not in", values, "autoId");
            return (Criteria) this;
        }

        public Criteria andAutoIdBetween(Integer value1, Integer value2) {
            addCriterion("auto_id between", value1, value2, "autoId");
            return (Criteria) this;
        }

        public Criteria andAutoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_id not between", value1, value2, "autoId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andWechatPublicIdIsNull() {
            addCriterion("wechat_public_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatPublicIdIsNotNull() {
            addCriterion("wechat_public_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatPublicIdEqualTo(String value) {
            addCriterion("wechat_public_id =", value, "wechatPublicId");
            return (Criteria) this;
        }

        public Criteria andWechatPublicIdNotEqualTo(String value) {
            addCriterion("wechat_public_id <>", value, "wechatPublicId");
            return (Criteria) this;
        }

        public Criteria andWechatPublicIdGreaterThan(String value) {
            addCriterion("wechat_public_id >", value, "wechatPublicId");
            return (Criteria) this;
        }

        public Criteria andWechatPublicIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_public_id >=", value, "wechatPublicId");
            return (Criteria) this;
        }

        public Criteria andWechatPublicIdLessThan(String value) {
            addCriterion("wechat_public_id <", value, "wechatPublicId");
            return (Criteria) this;
        }

        public Criteria andWechatPublicIdLessThanOrEqualTo(String value) {
            addCriterion("wechat_public_id <=", value, "wechatPublicId");
            return (Criteria) this;
        }

        public Criteria andWechatPublicIdLike(String value) {
            addCriterion("wechat_public_id like", value, "wechatPublicId");
            return (Criteria) this;
        }

        public Criteria andWechatPublicIdNotLike(String value) {
            addCriterion("wechat_public_id not like", value, "wechatPublicId");
            return (Criteria) this;
        }

        public Criteria andWechatPublicIdIn(List<String> values) {
            addCriterion("wechat_public_id in", values, "wechatPublicId");
            return (Criteria) this;
        }

        public Criteria andWechatPublicIdNotIn(List<String> values) {
            addCriterion("wechat_public_id not in", values, "wechatPublicId");
            return (Criteria) this;
        }

        public Criteria andWechatPublicIdBetween(String value1, String value2) {
            addCriterion("wechat_public_id between", value1, value2, "wechatPublicId");
            return (Criteria) this;
        }

        public Criteria andWechatPublicIdNotBetween(String value1, String value2) {
            addCriterion("wechat_public_id not between", value1, value2, "wechatPublicId");
            return (Criteria) this;
        }

        public Criteria andUserHeaderIsNull() {
            addCriterion("user_header is null");
            return (Criteria) this;
        }

        public Criteria andUserHeaderIsNotNull() {
            addCriterion("user_header is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeaderEqualTo(String value) {
            addCriterion("user_header =", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderNotEqualTo(String value) {
            addCriterion("user_header <>", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderGreaterThan(String value) {
            addCriterion("user_header >", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("user_header >=", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderLessThan(String value) {
            addCriterion("user_header <", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderLessThanOrEqualTo(String value) {
            addCriterion("user_header <=", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderLike(String value) {
            addCriterion("user_header like", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderNotLike(String value) {
            addCriterion("user_header not like", value, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderIn(List<String> values) {
            addCriterion("user_header in", values, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderNotIn(List<String> values) {
            addCriterion("user_header not in", values, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderBetween(String value1, String value2) {
            addCriterion("user_header between", value1, value2, "userHeader");
            return (Criteria) this;
        }

        public Criteria andUserHeaderNotBetween(String value1, String value2) {
            addCriterion("user_header not between", value1, value2, "userHeader");
            return (Criteria) this;
        }

        public Criteria andChnNameIsNull() {
            addCriterion("chn_name is null");
            return (Criteria) this;
        }

        public Criteria andChnNameIsNotNull() {
            addCriterion("chn_name is not null");
            return (Criteria) this;
        }

        public Criteria andChnNameEqualTo(String value) {
            addCriterion("chn_name =", value, "chnName");
            return (Criteria) this;
        }

        public Criteria andChnNameNotEqualTo(String value) {
            addCriterion("chn_name <>", value, "chnName");
            return (Criteria) this;
        }

        public Criteria andChnNameGreaterThan(String value) {
            addCriterion("chn_name >", value, "chnName");
            return (Criteria) this;
        }

        public Criteria andChnNameGreaterThanOrEqualTo(String value) {
            addCriterion("chn_name >=", value, "chnName");
            return (Criteria) this;
        }

        public Criteria andChnNameLessThan(String value) {
            addCriterion("chn_name <", value, "chnName");
            return (Criteria) this;
        }

        public Criteria andChnNameLessThanOrEqualTo(String value) {
            addCriterion("chn_name <=", value, "chnName");
            return (Criteria) this;
        }

        public Criteria andChnNameLike(String value) {
            addCriterion("chn_name like", value, "chnName");
            return (Criteria) this;
        }

        public Criteria andChnNameNotLike(String value) {
            addCriterion("chn_name not like", value, "chnName");
            return (Criteria) this;
        }

        public Criteria andChnNameIn(List<String> values) {
            addCriterion("chn_name in", values, "chnName");
            return (Criteria) this;
        }

        public Criteria andChnNameNotIn(List<String> values) {
            addCriterion("chn_name not in", values, "chnName");
            return (Criteria) this;
        }

        public Criteria andChnNameBetween(String value1, String value2) {
            addCriterion("chn_name between", value1, value2, "chnName");
            return (Criteria) this;
        }

        public Criteria andChnNameNotBetween(String value1, String value2) {
            addCriterion("chn_name not between", value1, value2, "chnName");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andTradePasswordIsNull() {
            addCriterion("trade_password is null");
            return (Criteria) this;
        }

        public Criteria andTradePasswordIsNotNull() {
            addCriterion("trade_password is not null");
            return (Criteria) this;
        }

        public Criteria andTradePasswordEqualTo(String value) {
            addCriterion("trade_password =", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordNotEqualTo(String value) {
            addCriterion("trade_password <>", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordGreaterThan(String value) {
            addCriterion("trade_password >", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("trade_password >=", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordLessThan(String value) {
            addCriterion("trade_password <", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordLessThanOrEqualTo(String value) {
            addCriterion("trade_password <=", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordLike(String value) {
            addCriterion("trade_password like", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordNotLike(String value) {
            addCriterion("trade_password not like", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordIn(List<String> values) {
            addCriterion("trade_password in", values, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordNotIn(List<String> values) {
            addCriterion("trade_password not in", values, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordBetween(String value1, String value2) {
            addCriterion("trade_password between", value1, value2, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordNotBetween(String value1, String value2) {
            addCriterion("trade_password not between", value1, value2, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNull() {
            addCriterion("recharge_money is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNotNull() {
            addCriterion("recharge_money is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyEqualTo(BigDecimal value) {
            addCriterion("recharge_money =", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("recharge_money <>", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThan(BigDecimal value) {
            addCriterion("recharge_money >", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_money >=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThan(BigDecimal value) {
            addCriterion("recharge_money <", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_money <=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIn(List<BigDecimal> values) {
            addCriterion("recharge_money in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("recharge_money not in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_money between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_money not between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andTradeCountIsNull() {
            addCriterion("trade_count is null");
            return (Criteria) this;
        }

        public Criteria andTradeCountIsNotNull() {
            addCriterion("trade_count is not null");
            return (Criteria) this;
        }

        public Criteria andTradeCountEqualTo(Integer value) {
            addCriterion("trade_count =", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountNotEqualTo(Integer value) {
            addCriterion("trade_count <>", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountGreaterThan(Integer value) {
            addCriterion("trade_count >", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_count >=", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountLessThan(Integer value) {
            addCriterion("trade_count <", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountLessThanOrEqualTo(Integer value) {
            addCriterion("trade_count <=", value, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountIn(List<Integer> values) {
            addCriterion("trade_count in", values, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountNotIn(List<Integer> values) {
            addCriterion("trade_count not in", values, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountBetween(Integer value1, Integer value2) {
            addCriterion("trade_count between", value1, value2, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andTradeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_count not between", value1, value2, "tradeCount");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIsNull() {
            addCriterion("coupon_money is null");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIsNotNull() {
            addCriterion("coupon_money is not null");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyEqualTo(BigDecimal value) {
            addCriterion("coupon_money =", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotEqualTo(BigDecimal value) {
            addCriterion("coupon_money <>", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyGreaterThan(BigDecimal value) {
            addCriterion("coupon_money >", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_money >=", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLessThan(BigDecimal value) {
            addCriterion("coupon_money <", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_money <=", value, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyIn(List<BigDecimal> values) {
            addCriterion("coupon_money in", values, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotIn(List<BigDecimal> values) {
            addCriterion("coupon_money not in", values, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_money between", value1, value2, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andCouponMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_money not between", value1, value2, "couponMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyIsNull() {
            addCriterion("out_money is null");
            return (Criteria) this;
        }

        public Criteria andOutMoneyIsNotNull() {
            addCriterion("out_money is not null");
            return (Criteria) this;
        }

        public Criteria andOutMoneyEqualTo(BigDecimal value) {
            addCriterion("out_money =", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyNotEqualTo(BigDecimal value) {
            addCriterion("out_money <>", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyGreaterThan(BigDecimal value) {
            addCriterion("out_money >", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("out_money >=", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyLessThan(BigDecimal value) {
            addCriterion("out_money <", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("out_money <=", value, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyIn(List<BigDecimal> values) {
            addCriterion("out_money in", values, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyNotIn(List<BigDecimal> values) {
            addCriterion("out_money not in", values, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_money between", value1, value2, "outMoney");
            return (Criteria) this;
        }

        public Criteria andOutMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("out_money not between", value1, value2, "outMoney");
            return (Criteria) this;
        }

        public Criteria andAgentInviteCodeIsNull() {
            addCriterion("agent_invite_code is null");
            return (Criteria) this;
        }

        public Criteria andAgentInviteCodeIsNotNull() {
            addCriterion("agent_invite_code is not null");
            return (Criteria) this;
        }

        public Criteria andAgentInviteCodeEqualTo(String value) {
            addCriterion("agent_invite_code =", value, "agentInviteCode");
            return (Criteria) this;
        }

        public Criteria andAgentInviteCodeNotEqualTo(String value) {
            addCriterion("agent_invite_code <>", value, "agentInviteCode");
            return (Criteria) this;
        }

        public Criteria andAgentInviteCodeGreaterThan(String value) {
            addCriterion("agent_invite_code >", value, "agentInviteCode");
            return (Criteria) this;
        }

        public Criteria andAgentInviteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("agent_invite_code >=", value, "agentInviteCode");
            return (Criteria) this;
        }

        public Criteria andAgentInviteCodeLessThan(String value) {
            addCriterion("agent_invite_code <", value, "agentInviteCode");
            return (Criteria) this;
        }

        public Criteria andAgentInviteCodeLessThanOrEqualTo(String value) {
            addCriterion("agent_invite_code <=", value, "agentInviteCode");
            return (Criteria) this;
        }

        public Criteria andAgentInviteCodeLike(String value) {
            addCriterion("agent_invite_code like", value, "agentInviteCode");
            return (Criteria) this;
        }

        public Criteria andAgentInviteCodeNotLike(String value) {
            addCriterion("agent_invite_code not like", value, "agentInviteCode");
            return (Criteria) this;
        }

        public Criteria andAgentInviteCodeIn(List<String> values) {
            addCriterion("agent_invite_code in", values, "agentInviteCode");
            return (Criteria) this;
        }

        public Criteria andAgentInviteCodeNotIn(List<String> values) {
            addCriterion("agent_invite_code not in", values, "agentInviteCode");
            return (Criteria) this;
        }

        public Criteria andAgentInviteCodeBetween(String value1, String value2) {
            addCriterion("agent_invite_code between", value1, value2, "agentInviteCode");
            return (Criteria) this;
        }

        public Criteria andAgentInviteCodeNotBetween(String value1, String value2) {
            addCriterion("agent_invite_code not between", value1, value2, "agentInviteCode");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(Date value) {
            addCriterion("register_time =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(Date value) {
            addCriterion("register_time <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(Date value) {
            addCriterion("register_time >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_time >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(Date value) {
            addCriterion("register_time <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("register_time <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<Date> values) {
            addCriterion("register_time in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<Date> values) {
            addCriterion("register_time not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("register_time between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("register_time not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNull() {
            addCriterion("last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIsNotNull() {
            addCriterion("last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpEqualTo(String value) {
            addCriterion("last_login_ip =", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotEqualTo(String value) {
            addCriterion("last_login_ip <>", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThan(String value) {
            addCriterion("last_login_ip >", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_ip >=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThan(String value) {
            addCriterion("last_login_ip <", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("last_login_ip <=", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpLike(String value) {
            addCriterion("last_login_ip like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotLike(String value) {
            addCriterion("last_login_ip not like", value, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpIn(List<String> values) {
            addCriterion("last_login_ip in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotIn(List<String> values) {
            addCriterion("last_login_ip not in", values, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpBetween(String value1, String value2) {
            addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
            return (Criteria) this;
        }

        public Criteria andParent1IdIsNull() {
            addCriterion("parent1_id is null");
            return (Criteria) this;
        }

        public Criteria andParent1IdIsNotNull() {
            addCriterion("parent1_id is not null");
            return (Criteria) this;
        }

        public Criteria andParent1IdEqualTo(String value) {
            addCriterion("parent1_id =", value, "parent1Id");
            return (Criteria) this;
        }

        public Criteria andParent1IdNotEqualTo(String value) {
            addCriterion("parent1_id <>", value, "parent1Id");
            return (Criteria) this;
        }

        public Criteria andParent1IdGreaterThan(String value) {
            addCriterion("parent1_id >", value, "parent1Id");
            return (Criteria) this;
        }

        public Criteria andParent1IdGreaterThanOrEqualTo(String value) {
            addCriterion("parent1_id >=", value, "parent1Id");
            return (Criteria) this;
        }

        public Criteria andParent1IdLessThan(String value) {
            addCriterion("parent1_id <", value, "parent1Id");
            return (Criteria) this;
        }

        public Criteria andParent1IdLessThanOrEqualTo(String value) {
            addCriterion("parent1_id <=", value, "parent1Id");
            return (Criteria) this;
        }

        public Criteria andParent1IdLike(String value) {
            addCriterion("parent1_id like", value, "parent1Id");
            return (Criteria) this;
        }

        public Criteria andParent1IdNotLike(String value) {
            addCriterion("parent1_id not like", value, "parent1Id");
            return (Criteria) this;
        }

        public Criteria andParent1IdIn(List<String> values) {
            addCriterion("parent1_id in", values, "parent1Id");
            return (Criteria) this;
        }

        public Criteria andParent1IdNotIn(List<String> values) {
            addCriterion("parent1_id not in", values, "parent1Id");
            return (Criteria) this;
        }

        public Criteria andParent1IdBetween(String value1, String value2) {
            addCriterion("parent1_id between", value1, value2, "parent1Id");
            return (Criteria) this;
        }

        public Criteria andParent1IdNotBetween(String value1, String value2) {
            addCriterion("parent1_id not between", value1, value2, "parent1Id");
            return (Criteria) this;
        }

        public Criteria andParent2IdIsNull() {
            addCriterion("parent2_id is null");
            return (Criteria) this;
        }

        public Criteria andParent2IdIsNotNull() {
            addCriterion("parent2_id is not null");
            return (Criteria) this;
        }

        public Criteria andParent2IdEqualTo(String value) {
            addCriterion("parent2_id =", value, "parent2Id");
            return (Criteria) this;
        }

        public Criteria andParent2IdNotEqualTo(String value) {
            addCriterion("parent2_id <>", value, "parent2Id");
            return (Criteria) this;
        }

        public Criteria andParent2IdGreaterThan(String value) {
            addCriterion("parent2_id >", value, "parent2Id");
            return (Criteria) this;
        }

        public Criteria andParent2IdGreaterThanOrEqualTo(String value) {
            addCriterion("parent2_id >=", value, "parent2Id");
            return (Criteria) this;
        }

        public Criteria andParent2IdLessThan(String value) {
            addCriterion("parent2_id <", value, "parent2Id");
            return (Criteria) this;
        }

        public Criteria andParent2IdLessThanOrEqualTo(String value) {
            addCriterion("parent2_id <=", value, "parent2Id");
            return (Criteria) this;
        }

        public Criteria andParent2IdLike(String value) {
            addCriterion("parent2_id like", value, "parent2Id");
            return (Criteria) this;
        }

        public Criteria andParent2IdNotLike(String value) {
            addCriterion("parent2_id not like", value, "parent2Id");
            return (Criteria) this;
        }

        public Criteria andParent2IdIn(List<String> values) {
            addCriterion("parent2_id in", values, "parent2Id");
            return (Criteria) this;
        }

        public Criteria andParent2IdNotIn(List<String> values) {
            addCriterion("parent2_id not in", values, "parent2Id");
            return (Criteria) this;
        }

        public Criteria andParent2IdBetween(String value1, String value2) {
            addCriterion("parent2_id between", value1, value2, "parent2Id");
            return (Criteria) this;
        }

        public Criteria andParent2IdNotBetween(String value1, String value2) {
            addCriterion("parent2_id not between", value1, value2, "parent2Id");
            return (Criteria) this;
        }

        public Criteria andParent3IdIsNull() {
            addCriterion("parent3_id is null");
            return (Criteria) this;
        }

        public Criteria andParent3IdIsNotNull() {
            addCriterion("parent3_id is not null");
            return (Criteria) this;
        }

        public Criteria andParent3IdEqualTo(String value) {
            addCriterion("parent3_id =", value, "parent3Id");
            return (Criteria) this;
        }

        public Criteria andParent3IdNotEqualTo(String value) {
            addCriterion("parent3_id <>", value, "parent3Id");
            return (Criteria) this;
        }

        public Criteria andParent3IdGreaterThan(String value) {
            addCriterion("parent3_id >", value, "parent3Id");
            return (Criteria) this;
        }

        public Criteria andParent3IdGreaterThanOrEqualTo(String value) {
            addCriterion("parent3_id >=", value, "parent3Id");
            return (Criteria) this;
        }

        public Criteria andParent3IdLessThan(String value) {
            addCriterion("parent3_id <", value, "parent3Id");
            return (Criteria) this;
        }

        public Criteria andParent3IdLessThanOrEqualTo(String value) {
            addCriterion("parent3_id <=", value, "parent3Id");
            return (Criteria) this;
        }

        public Criteria andParent3IdLike(String value) {
            addCriterion("parent3_id like", value, "parent3Id");
            return (Criteria) this;
        }

        public Criteria andParent3IdNotLike(String value) {
            addCriterion("parent3_id not like", value, "parent3Id");
            return (Criteria) this;
        }

        public Criteria andParent3IdIn(List<String> values) {
            addCriterion("parent3_id in", values, "parent3Id");
            return (Criteria) this;
        }

        public Criteria andParent3IdNotIn(List<String> values) {
            addCriterion("parent3_id not in", values, "parent3Id");
            return (Criteria) this;
        }

        public Criteria andParent3IdBetween(String value1, String value2) {
            addCriterion("parent3_id between", value1, value2, "parent3Id");
            return (Criteria) this;
        }

        public Criteria andParent3IdNotBetween(String value1, String value2) {
            addCriterion("parent3_id not between", value1, value2, "parent3Id");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyIsNull() {
            addCriterion("return_money is null");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyIsNotNull() {
            addCriterion("return_money is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyEqualTo(BigDecimal value) {
            addCriterion("return_money =", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyNotEqualTo(BigDecimal value) {
            addCriterion("return_money <>", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyGreaterThan(BigDecimal value) {
            addCriterion("return_money >", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("return_money >=", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyLessThan(BigDecimal value) {
            addCriterion("return_money <", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("return_money <=", value, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyIn(List<BigDecimal> values) {
            addCriterion("return_money in", values, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyNotIn(List<BigDecimal> values) {
            addCriterion("return_money not in", values, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_money between", value1, value2, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_money not between", value1, value2, "returnMoney");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTotalIsNull() {
            addCriterion("return_money_total is null");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTotalIsNotNull() {
            addCriterion("return_money_total is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTotalEqualTo(BigDecimal value) {
            addCriterion("return_money_total =", value, "returnMoneyTotal");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTotalNotEqualTo(BigDecimal value) {
            addCriterion("return_money_total <>", value, "returnMoneyTotal");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTotalGreaterThan(BigDecimal value) {
            addCriterion("return_money_total >", value, "returnMoneyTotal");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("return_money_total >=", value, "returnMoneyTotal");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTotalLessThan(BigDecimal value) {
            addCriterion("return_money_total <", value, "returnMoneyTotal");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("return_money_total <=", value, "returnMoneyTotal");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTotalIn(List<BigDecimal> values) {
            addCriterion("return_money_total in", values, "returnMoneyTotal");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTotalNotIn(List<BigDecimal> values) {
            addCriterion("return_money_total not in", values, "returnMoneyTotal");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_money_total between", value1, value2, "returnMoneyTotal");
            return (Criteria) this;
        }

        public Criteria andReturnMoneyTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_money_total not between", value1, value2, "returnMoneyTotal");
            return (Criteria) this;
        }

        public Criteria andTicketWechatPublicIdIsNull() {
            addCriterion("ticket_wechat_public_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketWechatPublicIdIsNotNull() {
            addCriterion("ticket_wechat_public_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketWechatPublicIdEqualTo(String value) {
            addCriterion("ticket_wechat_public_id =", value, "ticketWechatPublicId");
            return (Criteria) this;
        }

        public Criteria andTicketWechatPublicIdNotEqualTo(String value) {
            addCriterion("ticket_wechat_public_id <>", value, "ticketWechatPublicId");
            return (Criteria) this;
        }

        public Criteria andTicketWechatPublicIdGreaterThan(String value) {
            addCriterion("ticket_wechat_public_id >", value, "ticketWechatPublicId");
            return (Criteria) this;
        }

        public Criteria andTicketWechatPublicIdGreaterThanOrEqualTo(String value) {
            addCriterion("ticket_wechat_public_id >=", value, "ticketWechatPublicId");
            return (Criteria) this;
        }

        public Criteria andTicketWechatPublicIdLessThan(String value) {
            addCriterion("ticket_wechat_public_id <", value, "ticketWechatPublicId");
            return (Criteria) this;
        }

        public Criteria andTicketWechatPublicIdLessThanOrEqualTo(String value) {
            addCriterion("ticket_wechat_public_id <=", value, "ticketWechatPublicId");
            return (Criteria) this;
        }

        public Criteria andTicketWechatPublicIdLike(String value) {
            addCriterion("ticket_wechat_public_id like", value, "ticketWechatPublicId");
            return (Criteria) this;
        }

        public Criteria andTicketWechatPublicIdNotLike(String value) {
            addCriterion("ticket_wechat_public_id not like", value, "ticketWechatPublicId");
            return (Criteria) this;
        }

        public Criteria andTicketWechatPublicIdIn(List<String> values) {
            addCriterion("ticket_wechat_public_id in", values, "ticketWechatPublicId");
            return (Criteria) this;
        }

        public Criteria andTicketWechatPublicIdNotIn(List<String> values) {
            addCriterion("ticket_wechat_public_id not in", values, "ticketWechatPublicId");
            return (Criteria) this;
        }

        public Criteria andTicketWechatPublicIdBetween(String value1, String value2) {
            addCriterion("ticket_wechat_public_id between", value1, value2, "ticketWechatPublicId");
            return (Criteria) this;
        }

        public Criteria andTicketWechatPublicIdNotBetween(String value1, String value2) {
            addCriterion("ticket_wechat_public_id not between", value1, value2, "ticketWechatPublicId");
            return (Criteria) this;
        }

        public Criteria andTicketIsNull() {
            addCriterion("ticket is null");
            return (Criteria) this;
        }

        public Criteria andTicketIsNotNull() {
            addCriterion("ticket is not null");
            return (Criteria) this;
        }

        public Criteria andTicketEqualTo(String value) {
            addCriterion("ticket =", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotEqualTo(String value) {
            addCriterion("ticket <>", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketGreaterThan(String value) {
            addCriterion("ticket >", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketGreaterThanOrEqualTo(String value) {
            addCriterion("ticket >=", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLessThan(String value) {
            addCriterion("ticket <", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLessThanOrEqualTo(String value) {
            addCriterion("ticket <=", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketLike(String value) {
            addCriterion("ticket like", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotLike(String value) {
            addCriterion("ticket not like", value, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketIn(List<String> values) {
            addCriterion("ticket in", values, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotIn(List<String> values) {
            addCriterion("ticket not in", values, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketBetween(String value1, String value2) {
            addCriterion("ticket between", value1, value2, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketNotBetween(String value1, String value2) {
            addCriterion("ticket not between", value1, value2, "ticket");
            return (Criteria) this;
        }

        public Criteria andTicketExpireTimeIsNull() {
            addCriterion("ticket_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andTicketExpireTimeIsNotNull() {
            addCriterion("ticket_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andTicketExpireTimeEqualTo(Date value) {
            addCriterion("ticket_expire_time =", value, "ticketExpireTime");
            return (Criteria) this;
        }

        public Criteria andTicketExpireTimeNotEqualTo(Date value) {
            addCriterion("ticket_expire_time <>", value, "ticketExpireTime");
            return (Criteria) this;
        }

        public Criteria andTicketExpireTimeGreaterThan(Date value) {
            addCriterion("ticket_expire_time >", value, "ticketExpireTime");
            return (Criteria) this;
        }

        public Criteria andTicketExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ticket_expire_time >=", value, "ticketExpireTime");
            return (Criteria) this;
        }

        public Criteria andTicketExpireTimeLessThan(Date value) {
            addCriterion("ticket_expire_time <", value, "ticketExpireTime");
            return (Criteria) this;
        }

        public Criteria andTicketExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("ticket_expire_time <=", value, "ticketExpireTime");
            return (Criteria) this;
        }

        public Criteria andTicketExpireTimeIn(List<Date> values) {
            addCriterion("ticket_expire_time in", values, "ticketExpireTime");
            return (Criteria) this;
        }

        public Criteria andTicketExpireTimeNotIn(List<Date> values) {
            addCriterion("ticket_expire_time not in", values, "ticketExpireTime");
            return (Criteria) this;
        }

        public Criteria andTicketExpireTimeBetween(Date value1, Date value2) {
            addCriterion("ticket_expire_time between", value1, value2, "ticketExpireTime");
            return (Criteria) this;
        }

        public Criteria andTicketExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("ticket_expire_time not between", value1, value2, "ticketExpireTime");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
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