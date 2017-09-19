package server.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HrmUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HrmUserInfoExample() {
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

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andBigheadurlIsNull() {
            addCriterion("bigheadurl is null");
            return (Criteria) this;
        }

        public Criteria andBigheadurlIsNotNull() {
            addCriterion("bigheadurl is not null");
            return (Criteria) this;
        }

        public Criteria andBigheadurlEqualTo(String value) {
            addCriterion("bigheadurl =", value, "bigheadurl");
            return (Criteria) this;
        }

        public Criteria andBigheadurlNotEqualTo(String value) {
            addCriterion("bigheadurl <>", value, "bigheadurl");
            return (Criteria) this;
        }

        public Criteria andBigheadurlGreaterThan(String value) {
            addCriterion("bigheadurl >", value, "bigheadurl");
            return (Criteria) this;
        }

        public Criteria andBigheadurlGreaterThanOrEqualTo(String value) {
            addCriterion("bigheadurl >=", value, "bigheadurl");
            return (Criteria) this;
        }

        public Criteria andBigheadurlLessThan(String value) {
            addCriterion("bigheadurl <", value, "bigheadurl");
            return (Criteria) this;
        }

        public Criteria andBigheadurlLessThanOrEqualTo(String value) {
            addCriterion("bigheadurl <=", value, "bigheadurl");
            return (Criteria) this;
        }

        public Criteria andBigheadurlLike(String value) {
            addCriterion("bigheadurl like", value, "bigheadurl");
            return (Criteria) this;
        }

        public Criteria andBigheadurlNotLike(String value) {
            addCriterion("bigheadurl not like", value, "bigheadurl");
            return (Criteria) this;
        }

        public Criteria andBigheadurlIn(List<String> values) {
            addCriterion("bigheadurl in", values, "bigheadurl");
            return (Criteria) this;
        }

        public Criteria andBigheadurlNotIn(List<String> values) {
            addCriterion("bigheadurl not in", values, "bigheadurl");
            return (Criteria) this;
        }

        public Criteria andBigheadurlBetween(String value1, String value2) {
            addCriterion("bigheadurl between", value1, value2, "bigheadurl");
            return (Criteria) this;
        }

        public Criteria andBigheadurlNotBetween(String value1, String value2) {
            addCriterion("bigheadurl not between", value1, value2, "bigheadurl");
            return (Criteria) this;
        }

        public Criteria andSmallheadurlIsNull() {
            addCriterion("smallheadurl is null");
            return (Criteria) this;
        }

        public Criteria andSmallheadurlIsNotNull() {
            addCriterion("smallheadurl is not null");
            return (Criteria) this;
        }

        public Criteria andSmallheadurlEqualTo(String value) {
            addCriterion("smallheadurl =", value, "smallheadurl");
            return (Criteria) this;
        }

        public Criteria andSmallheadurlNotEqualTo(String value) {
            addCriterion("smallheadurl <>", value, "smallheadurl");
            return (Criteria) this;
        }

        public Criteria andSmallheadurlGreaterThan(String value) {
            addCriterion("smallheadurl >", value, "smallheadurl");
            return (Criteria) this;
        }

        public Criteria andSmallheadurlGreaterThanOrEqualTo(String value) {
            addCriterion("smallheadurl >=", value, "smallheadurl");
            return (Criteria) this;
        }

        public Criteria andSmallheadurlLessThan(String value) {
            addCriterion("smallheadurl <", value, "smallheadurl");
            return (Criteria) this;
        }

        public Criteria andSmallheadurlLessThanOrEqualTo(String value) {
            addCriterion("smallheadurl <=", value, "smallheadurl");
            return (Criteria) this;
        }

        public Criteria andSmallheadurlLike(String value) {
            addCriterion("smallheadurl like", value, "smallheadurl");
            return (Criteria) this;
        }

        public Criteria andSmallheadurlNotLike(String value) {
            addCriterion("smallheadurl not like", value, "smallheadurl");
            return (Criteria) this;
        }

        public Criteria andSmallheadurlIn(List<String> values) {
            addCriterion("smallheadurl in", values, "smallheadurl");
            return (Criteria) this;
        }

        public Criteria andSmallheadurlNotIn(List<String> values) {
            addCriterion("smallheadurl not in", values, "smallheadurl");
            return (Criteria) this;
        }

        public Criteria andSmallheadurlBetween(String value1, String value2) {
            addCriterion("smallheadurl between", value1, value2, "smallheadurl");
            return (Criteria) this;
        }

        public Criteria andSmallheadurlNotBetween(String value1, String value2) {
            addCriterion("smallheadurl not between", value1, value2, "smallheadurl");
            return (Criteria) this;
        }

        public Criteria andUserlevelIsNull() {
            addCriterion("userlevel is null");
            return (Criteria) this;
        }

        public Criteria andUserlevelIsNotNull() {
            addCriterion("userlevel is not null");
            return (Criteria) this;
        }

        public Criteria andUserlevelEqualTo(String value) {
            addCriterion("userlevel =", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotEqualTo(String value) {
            addCriterion("userlevel <>", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelGreaterThan(String value) {
            addCriterion("userlevel >", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelGreaterThanOrEqualTo(String value) {
            addCriterion("userlevel >=", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelLessThan(String value) {
            addCriterion("userlevel <", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelLessThanOrEqualTo(String value) {
            addCriterion("userlevel <=", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelLike(String value) {
            addCriterion("userlevel like", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotLike(String value) {
            addCriterion("userlevel not like", value, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelIn(List<String> values) {
            addCriterion("userlevel in", values, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotIn(List<String> values) {
            addCriterion("userlevel not in", values, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelBetween(String value1, String value2) {
            addCriterion("userlevel between", value1, value2, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUserlevelNotBetween(String value1, String value2) {
            addCriterion("userlevel not between", value1, value2, "userlevel");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("usertype is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("usertype is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Short value) {
            addCriterion("usertype =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Short value) {
            addCriterion("usertype <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Short value) {
            addCriterion("usertype >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Short value) {
            addCriterion("usertype >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Short value) {
            addCriterion("usertype <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Short value) {
            addCriterion("usertype <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Short> values) {
            addCriterion("usertype in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Short> values) {
            addCriterion("usertype not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Short value1, Short value2) {
            addCriterion("usertype between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Short value1, Short value2) {
            addCriterion("usertype not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNull() {
            addCriterion("lastlogintime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNotNull() {
            addCriterion("lastlogintime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeEqualTo(Date value) {
            addCriterion("lastlogintime =", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotEqualTo(Date value) {
            addCriterion("lastlogintime <>", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThan(Date value) {
            addCriterion("lastlogintime >", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lastlogintime >=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThan(Date value) {
            addCriterion("lastlogintime <", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("lastlogintime <=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIn(List<Date> values) {
            addCriterion("lastlogintime in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotIn(List<Date> values) {
            addCriterion("lastlogintime not in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeBetween(Date value1, Date value2) {
            addCriterion("lastlogintime between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("lastlogintime not between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLoginpasswordIsNull() {
            addCriterion("loginpassword is null");
            return (Criteria) this;
        }

        public Criteria andLoginpasswordIsNotNull() {
            addCriterion("loginpassword is not null");
            return (Criteria) this;
        }

        public Criteria andLoginpasswordEqualTo(String value) {
            addCriterion("loginpassword =", value, "loginpassword");
            return (Criteria) this;
        }

        public Criteria andLoginpasswordNotEqualTo(String value) {
            addCriterion("loginpassword <>", value, "loginpassword");
            return (Criteria) this;
        }

        public Criteria andLoginpasswordGreaterThan(String value) {
            addCriterion("loginpassword >", value, "loginpassword");
            return (Criteria) this;
        }

        public Criteria andLoginpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("loginpassword >=", value, "loginpassword");
            return (Criteria) this;
        }

        public Criteria andLoginpasswordLessThan(String value) {
            addCriterion("loginpassword <", value, "loginpassword");
            return (Criteria) this;
        }

        public Criteria andLoginpasswordLessThanOrEqualTo(String value) {
            addCriterion("loginpassword <=", value, "loginpassword");
            return (Criteria) this;
        }

        public Criteria andLoginpasswordLike(String value) {
            addCriterion("loginpassword like", value, "loginpassword");
            return (Criteria) this;
        }

        public Criteria andLoginpasswordNotLike(String value) {
            addCriterion("loginpassword not like", value, "loginpassword");
            return (Criteria) this;
        }

        public Criteria andLoginpasswordIn(List<String> values) {
            addCriterion("loginpassword in", values, "loginpassword");
            return (Criteria) this;
        }

        public Criteria andLoginpasswordNotIn(List<String> values) {
            addCriterion("loginpassword not in", values, "loginpassword");
            return (Criteria) this;
        }

        public Criteria andLoginpasswordBetween(String value1, String value2) {
            addCriterion("loginpassword between", value1, value2, "loginpassword");
            return (Criteria) this;
        }

        public Criteria andLoginpasswordNotBetween(String value1, String value2) {
            addCriterion("loginpassword not between", value1, value2, "loginpassword");
            return (Criteria) this;
        }

        public Criteria andPaypwdIsNull() {
            addCriterion("paypwd is null");
            return (Criteria) this;
        }

        public Criteria andPaypwdIsNotNull() {
            addCriterion("paypwd is not null");
            return (Criteria) this;
        }

        public Criteria andPaypwdEqualTo(String value) {
            addCriterion("paypwd =", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotEqualTo(String value) {
            addCriterion("paypwd <>", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdGreaterThan(String value) {
            addCriterion("paypwd >", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdGreaterThanOrEqualTo(String value) {
            addCriterion("paypwd >=", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLessThan(String value) {
            addCriterion("paypwd <", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLessThanOrEqualTo(String value) {
            addCriterion("paypwd <=", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLike(String value) {
            addCriterion("paypwd like", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotLike(String value) {
            addCriterion("paypwd not like", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdIn(List<String> values) {
            addCriterion("paypwd in", values, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotIn(List<String> values) {
            addCriterion("paypwd not in", values, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdBetween(String value1, String value2) {
            addCriterion("paypwd between", value1, value2, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotBetween(String value1, String value2) {
            addCriterion("paypwd not between", value1, value2, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Integer value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Integer value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Integer value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Integer> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andLndIsNull() {
            addCriterion("lnd is null");
            return (Criteria) this;
        }

        public Criteria andLndIsNotNull() {
            addCriterion("lnd is not null");
            return (Criteria) this;
        }

        public Criteria andLndEqualTo(String value) {
            addCriterion("lnd =", value, "lnd");
            return (Criteria) this;
        }

        public Criteria andLndNotEqualTo(String value) {
            addCriterion("lnd <>", value, "lnd");
            return (Criteria) this;
        }

        public Criteria andLndGreaterThan(String value) {
            addCriterion("lnd >", value, "lnd");
            return (Criteria) this;
        }

        public Criteria andLndGreaterThanOrEqualTo(String value) {
            addCriterion("lnd >=", value, "lnd");
            return (Criteria) this;
        }

        public Criteria andLndLessThan(String value) {
            addCriterion("lnd <", value, "lnd");
            return (Criteria) this;
        }

        public Criteria andLndLessThanOrEqualTo(String value) {
            addCriterion("lnd <=", value, "lnd");
            return (Criteria) this;
        }

        public Criteria andLndLike(String value) {
            addCriterion("lnd like", value, "lnd");
            return (Criteria) this;
        }

        public Criteria andLndNotLike(String value) {
            addCriterion("lnd not like", value, "lnd");
            return (Criteria) this;
        }

        public Criteria andLndIn(List<String> values) {
            addCriterion("lnd in", values, "lnd");
            return (Criteria) this;
        }

        public Criteria andLndNotIn(List<String> values) {
            addCriterion("lnd not in", values, "lnd");
            return (Criteria) this;
        }

        public Criteria andLndBetween(String value1, String value2) {
            addCriterion("lnd between", value1, value2, "lnd");
            return (Criteria) this;
        }

        public Criteria andLndNotBetween(String value1, String value2) {
            addCriterion("lnd not between", value1, value2, "lnd");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andMaxcontinuenumberIsNull() {
            addCriterion("maxcontinuenumber is null");
            return (Criteria) this;
        }

        public Criteria andMaxcontinuenumberIsNotNull() {
            addCriterion("maxcontinuenumber is not null");
            return (Criteria) this;
        }

        public Criteria andMaxcontinuenumberEqualTo(Short value) {
            addCriterion("maxcontinuenumber =", value, "maxcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andMaxcontinuenumberNotEqualTo(Short value) {
            addCriterion("maxcontinuenumber <>", value, "maxcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andMaxcontinuenumberGreaterThan(Short value) {
            addCriterion("maxcontinuenumber >", value, "maxcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andMaxcontinuenumberGreaterThanOrEqualTo(Short value) {
            addCriterion("maxcontinuenumber >=", value, "maxcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andMaxcontinuenumberLessThan(Short value) {
            addCriterion("maxcontinuenumber <", value, "maxcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andMaxcontinuenumberLessThanOrEqualTo(Short value) {
            addCriterion("maxcontinuenumber <=", value, "maxcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andMaxcontinuenumberIn(List<Short> values) {
            addCriterion("maxcontinuenumber in", values, "maxcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andMaxcontinuenumberNotIn(List<Short> values) {
            addCriterion("maxcontinuenumber not in", values, "maxcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andMaxcontinuenumberBetween(Short value1, Short value2) {
            addCriterion("maxcontinuenumber between", value1, value2, "maxcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andMaxcontinuenumberNotBetween(Short value1, Short value2) {
            addCriterion("maxcontinuenumber not between", value1, value2, "maxcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andCurcontinuenumberIsNull() {
            addCriterion("curcontinuenumber is null");
            return (Criteria) this;
        }

        public Criteria andCurcontinuenumberIsNotNull() {
            addCriterion("curcontinuenumber is not null");
            return (Criteria) this;
        }

        public Criteria andCurcontinuenumberEqualTo(Short value) {
            addCriterion("curcontinuenumber =", value, "curcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andCurcontinuenumberNotEqualTo(Short value) {
            addCriterion("curcontinuenumber <>", value, "curcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andCurcontinuenumberGreaterThan(Short value) {
            addCriterion("curcontinuenumber >", value, "curcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andCurcontinuenumberGreaterThanOrEqualTo(Short value) {
            addCriterion("curcontinuenumber >=", value, "curcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andCurcontinuenumberLessThan(Short value) {
            addCriterion("curcontinuenumber <", value, "curcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andCurcontinuenumberLessThanOrEqualTo(Short value) {
            addCriterion("curcontinuenumber <=", value, "curcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andCurcontinuenumberIn(List<Short> values) {
            addCriterion("curcontinuenumber in", values, "curcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andCurcontinuenumberNotIn(List<Short> values) {
            addCriterion("curcontinuenumber not in", values, "curcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andCurcontinuenumberBetween(Short value1, Short value2) {
            addCriterion("curcontinuenumber between", value1, value2, "curcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andCurcontinuenumberNotBetween(Short value1, Short value2) {
            addCriterion("curcontinuenumber not between", value1, value2, "curcontinuenumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationtypeIsNull() {
            addCriterion("registrationtype is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationtypeIsNotNull() {
            addCriterion("registrationtype is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationtypeEqualTo(String value) {
            addCriterion("registrationtype =", value, "registrationtype");
            return (Criteria) this;
        }

        public Criteria andRegistrationtypeNotEqualTo(String value) {
            addCriterion("registrationtype <>", value, "registrationtype");
            return (Criteria) this;
        }

        public Criteria andRegistrationtypeGreaterThan(String value) {
            addCriterion("registrationtype >", value, "registrationtype");
            return (Criteria) this;
        }

        public Criteria andRegistrationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("registrationtype >=", value, "registrationtype");
            return (Criteria) this;
        }

        public Criteria andRegistrationtypeLessThan(String value) {
            addCriterion("registrationtype <", value, "registrationtype");
            return (Criteria) this;
        }

        public Criteria andRegistrationtypeLessThanOrEqualTo(String value) {
            addCriterion("registrationtype <=", value, "registrationtype");
            return (Criteria) this;
        }

        public Criteria andRegistrationtypeLike(String value) {
            addCriterion("registrationtype like", value, "registrationtype");
            return (Criteria) this;
        }

        public Criteria andRegistrationtypeNotLike(String value) {
            addCriterion("registrationtype not like", value, "registrationtype");
            return (Criteria) this;
        }

        public Criteria andRegistrationtypeIn(List<String> values) {
            addCriterion("registrationtype in", values, "registrationtype");
            return (Criteria) this;
        }

        public Criteria andRegistrationtypeNotIn(List<String> values) {
            addCriterion("registrationtype not in", values, "registrationtype");
            return (Criteria) this;
        }

        public Criteria andRegistrationtypeBetween(String value1, String value2) {
            addCriterion("registrationtype between", value1, value2, "registrationtype");
            return (Criteria) this;
        }

        public Criteria andRegistrationtypeNotBetween(String value1, String value2) {
            addCriterion("registrationtype not between", value1, value2, "registrationtype");
            return (Criteria) this;
        }

        public Criteria andViplevelIsNull() {
            addCriterion("viplevel is null");
            return (Criteria) this;
        }

        public Criteria andViplevelIsNotNull() {
            addCriterion("viplevel is not null");
            return (Criteria) this;
        }

        public Criteria andViplevelEqualTo(String value) {
            addCriterion("viplevel =", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelNotEqualTo(String value) {
            addCriterion("viplevel <>", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelGreaterThan(String value) {
            addCriterion("viplevel >", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelGreaterThanOrEqualTo(String value) {
            addCriterion("viplevel >=", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelLessThan(String value) {
            addCriterion("viplevel <", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelLessThanOrEqualTo(String value) {
            addCriterion("viplevel <=", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelLike(String value) {
            addCriterion("viplevel like", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelNotLike(String value) {
            addCriterion("viplevel not like", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelIn(List<String> values) {
            addCriterion("viplevel in", values, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelNotIn(List<String> values) {
            addCriterion("viplevel not in", values, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelBetween(String value1, String value2) {
            addCriterion("viplevel between", value1, value2, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelNotBetween(String value1, String value2) {
            addCriterion("viplevel not between", value1, value2, "viplevel");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("citycode is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("citycode is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("citycode =", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("citycode <>", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("citycode >", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("citycode >=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("citycode <", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("citycode <=", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLike(String value) {
            addCriterion("citycode like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotLike(String value) {
            addCriterion("citycode not like", value, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("citycode in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("citycode not in", values, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("citycode between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("citycode not between", value1, value2, "citycode");
            return (Criteria) this;
        }

        public Criteria andInvitationcodeIsNull() {
            addCriterion("invitationcode is null");
            return (Criteria) this;
        }

        public Criteria andInvitationcodeIsNotNull() {
            addCriterion("invitationcode is not null");
            return (Criteria) this;
        }

        public Criteria andInvitationcodeEqualTo(String value) {
            addCriterion("invitationcode =", value, "invitationcode");
            return (Criteria) this;
        }

        public Criteria andInvitationcodeNotEqualTo(String value) {
            addCriterion("invitationcode <>", value, "invitationcode");
            return (Criteria) this;
        }

        public Criteria andInvitationcodeGreaterThan(String value) {
            addCriterion("invitationcode >", value, "invitationcode");
            return (Criteria) this;
        }

        public Criteria andInvitationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("invitationcode >=", value, "invitationcode");
            return (Criteria) this;
        }

        public Criteria andInvitationcodeLessThan(String value) {
            addCriterion("invitationcode <", value, "invitationcode");
            return (Criteria) this;
        }

        public Criteria andInvitationcodeLessThanOrEqualTo(String value) {
            addCriterion("invitationcode <=", value, "invitationcode");
            return (Criteria) this;
        }

        public Criteria andInvitationcodeLike(String value) {
            addCriterion("invitationcode like", value, "invitationcode");
            return (Criteria) this;
        }

        public Criteria andInvitationcodeNotLike(String value) {
            addCriterion("invitationcode not like", value, "invitationcode");
            return (Criteria) this;
        }

        public Criteria andInvitationcodeIn(List<String> values) {
            addCriterion("invitationcode in", values, "invitationcode");
            return (Criteria) this;
        }

        public Criteria andInvitationcodeNotIn(List<String> values) {
            addCriterion("invitationcode not in", values, "invitationcode");
            return (Criteria) this;
        }

        public Criteria andInvitationcodeBetween(String value1, String value2) {
            addCriterion("invitationcode between", value1, value2, "invitationcode");
            return (Criteria) this;
        }

        public Criteria andInvitationcodeNotBetween(String value1, String value2) {
            addCriterion("invitationcode not between", value1, value2, "invitationcode");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andMachineidIsNull() {
            addCriterion("machineid is null");
            return (Criteria) this;
        }

        public Criteria andMachineidIsNotNull() {
            addCriterion("machineid is not null");
            return (Criteria) this;
        }

        public Criteria andMachineidEqualTo(String value) {
            addCriterion("machineid =", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidNotEqualTo(String value) {
            addCriterion("machineid <>", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidGreaterThan(String value) {
            addCriterion("machineid >", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidGreaterThanOrEqualTo(String value) {
            addCriterion("machineid >=", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidLessThan(String value) {
            addCriterion("machineid <", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidLessThanOrEqualTo(String value) {
            addCriterion("machineid <=", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidLike(String value) {
            addCriterion("machineid like", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidNotLike(String value) {
            addCriterion("machineid not like", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidIn(List<String> values) {
            addCriterion("machineid in", values, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidNotIn(List<String> values) {
            addCriterion("machineid not in", values, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidBetween(String value1, String value2) {
            addCriterion("machineid between", value1, value2, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidNotBetween(String value1, String value2) {
            addCriterion("machineid not between", value1, value2, "machineid");
            return (Criteria) this;
        }

        public Criteria andRegisternameIsNull() {
            addCriterion("registername is null");
            return (Criteria) this;
        }

        public Criteria andRegisternameIsNotNull() {
            addCriterion("registername is not null");
            return (Criteria) this;
        }

        public Criteria andRegisternameEqualTo(String value) {
            addCriterion("registername =", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameNotEqualTo(String value) {
            addCriterion("registername <>", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameGreaterThan(String value) {
            addCriterion("registername >", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameGreaterThanOrEqualTo(String value) {
            addCriterion("registername >=", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameLessThan(String value) {
            addCriterion("registername <", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameLessThanOrEqualTo(String value) {
            addCriterion("registername <=", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameLike(String value) {
            addCriterion("registername like", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameNotLike(String value) {
            addCriterion("registername not like", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameIn(List<String> values) {
            addCriterion("registername in", values, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameNotIn(List<String> values) {
            addCriterion("registername not in", values, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameBetween(String value1, String value2) {
            addCriterion("registername between", value1, value2, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameNotBetween(String value1, String value2) {
            addCriterion("registername not between", value1, value2, "registername");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNull() {
            addCriterion("userstate is null");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNotNull() {
            addCriterion("userstate is not null");
            return (Criteria) this;
        }

        public Criteria andUserstateEqualTo(Integer value) {
            addCriterion("userstate =", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotEqualTo(Integer value) {
            addCriterion("userstate <>", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThan(Integer value) {
            addCriterion("userstate >", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("userstate >=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThan(Integer value) {
            addCriterion("userstate <", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThanOrEqualTo(Integer value) {
            addCriterion("userstate <=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateIn(List<Integer> values) {
            addCriterion("userstate in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotIn(List<Integer> values) {
            addCriterion("userstate not in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateBetween(Integer value1, Integer value2) {
            addCriterion("userstate between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotBetween(Integer value1, Integer value2) {
            addCriterion("userstate not between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andBlockidIsNull() {
            addCriterion("blockid is null");
            return (Criteria) this;
        }

        public Criteria andBlockidIsNotNull() {
            addCriterion("blockid is not null");
            return (Criteria) this;
        }

        public Criteria andBlockidEqualTo(Integer value) {
            addCriterion("blockid =", value, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidNotEqualTo(Integer value) {
            addCriterion("blockid <>", value, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidGreaterThan(Integer value) {
            addCriterion("blockid >", value, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidGreaterThanOrEqualTo(Integer value) {
            addCriterion("blockid >=", value, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidLessThan(Integer value) {
            addCriterion("blockid <", value, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidLessThanOrEqualTo(Integer value) {
            addCriterion("blockid <=", value, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidIn(List<Integer> values) {
            addCriterion("blockid in", values, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidNotIn(List<Integer> values) {
            addCriterion("blockid not in", values, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidBetween(Integer value1, Integer value2) {
            addCriterion("blockid between", value1, value2, "blockid");
            return (Criteria) this;
        }

        public Criteria andBlockidNotBetween(Integer value1, Integer value2) {
            addCriterion("blockid not between", value1, value2, "blockid");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNull() {
            addCriterion("channelid is null");
            return (Criteria) this;
        }

        public Criteria andChannelidIsNotNull() {
            addCriterion("channelid is not null");
            return (Criteria) this;
        }

        public Criteria andChannelidEqualTo(String value) {
            addCriterion("channelid =", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotEqualTo(String value) {
            addCriterion("channelid <>", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThan(String value) {
            addCriterion("channelid >", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidGreaterThanOrEqualTo(String value) {
            addCriterion("channelid >=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThan(String value) {
            addCriterion("channelid <", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLessThanOrEqualTo(String value) {
            addCriterion("channelid <=", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidLike(String value) {
            addCriterion("channelid like", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotLike(String value) {
            addCriterion("channelid not like", value, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidIn(List<String> values) {
            addCriterion("channelid in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotIn(List<String> values) {
            addCriterion("channelid not in", values, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidBetween(String value1, String value2) {
            addCriterion("channelid between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andChannelidNotBetween(String value1, String value2) {
            addCriterion("channelid not between", value1, value2, "channelid");
            return (Criteria) this;
        }

        public Criteria andQmcoinIsNull() {
            addCriterion("qmcoin is null");
            return (Criteria) this;
        }

        public Criteria andQmcoinIsNotNull() {
            addCriterion("qmcoin is not null");
            return (Criteria) this;
        }

        public Criteria andQmcoinEqualTo(Double value) {
            addCriterion("qmcoin =", value, "qmcoin");
            return (Criteria) this;
        }

        public Criteria andQmcoinNotEqualTo(Double value) {
            addCriterion("qmcoin <>", value, "qmcoin");
            return (Criteria) this;
        }

        public Criteria andQmcoinGreaterThan(Double value) {
            addCriterion("qmcoin >", value, "qmcoin");
            return (Criteria) this;
        }

        public Criteria andQmcoinGreaterThanOrEqualTo(Double value) {
            addCriterion("qmcoin >=", value, "qmcoin");
            return (Criteria) this;
        }

        public Criteria andQmcoinLessThan(Double value) {
            addCriterion("qmcoin <", value, "qmcoin");
            return (Criteria) this;
        }

        public Criteria andQmcoinLessThanOrEqualTo(Double value) {
            addCriterion("qmcoin <=", value, "qmcoin");
            return (Criteria) this;
        }

        public Criteria andQmcoinIn(List<Double> values) {
            addCriterion("qmcoin in", values, "qmcoin");
            return (Criteria) this;
        }

        public Criteria andQmcoinNotIn(List<Double> values) {
            addCriterion("qmcoin not in", values, "qmcoin");
            return (Criteria) this;
        }

        public Criteria andQmcoinBetween(Double value1, Double value2) {
            addCriterion("qmcoin between", value1, value2, "qmcoin");
            return (Criteria) this;
        }

        public Criteria andQmcoinNotBetween(Double value1, Double value2) {
            addCriterion("qmcoin not between", value1, value2, "qmcoin");
            return (Criteria) this;
        }

        public Criteria andQrcodeIsNull() {
            addCriterion("qrcode is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeIsNotNull() {
            addCriterion("qrcode is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeEqualTo(String value) {
            addCriterion("qrcode =", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotEqualTo(String value) {
            addCriterion("qrcode <>", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeGreaterThan(String value) {
            addCriterion("qrcode >", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode >=", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeLessThan(String value) {
            addCriterion("qrcode <", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeLessThanOrEqualTo(String value) {
            addCriterion("qrcode <=", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeLike(String value) {
            addCriterion("qrcode like", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotLike(String value) {
            addCriterion("qrcode not like", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeIn(List<String> values) {
            addCriterion("qrcode in", values, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotIn(List<String> values) {
            addCriterion("qrcode not in", values, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeBetween(String value1, String value2) {
            addCriterion("qrcode between", value1, value2, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotBetween(String value1, String value2) {
            addCriterion("qrcode not between", value1, value2, "qrcode");
            return (Criteria) this;
        }

        public Criteria andRong_tokenIsNull() {
            addCriterion("rong_token is null");
            return (Criteria) this;
        }

        public Criteria andRong_tokenIsNotNull() {
            addCriterion("rong_token is not null");
            return (Criteria) this;
        }

        public Criteria andRong_tokenEqualTo(String value) {
            addCriterion("rong_token =", value, "rong_token");
            return (Criteria) this;
        }

        public Criteria andRong_tokenNotEqualTo(String value) {
            addCriterion("rong_token <>", value, "rong_token");
            return (Criteria) this;
        }

        public Criteria andRong_tokenGreaterThan(String value) {
            addCriterion("rong_token >", value, "rong_token");
            return (Criteria) this;
        }

        public Criteria andRong_tokenGreaterThanOrEqualTo(String value) {
            addCriterion("rong_token >=", value, "rong_token");
            return (Criteria) this;
        }

        public Criteria andRong_tokenLessThan(String value) {
            addCriterion("rong_token <", value, "rong_token");
            return (Criteria) this;
        }

        public Criteria andRong_tokenLessThanOrEqualTo(String value) {
            addCriterion("rong_token <=", value, "rong_token");
            return (Criteria) this;
        }

        public Criteria andRong_tokenLike(String value) {
            addCriterion("rong_token like", value, "rong_token");
            return (Criteria) this;
        }

        public Criteria andRong_tokenNotLike(String value) {
            addCriterion("rong_token not like", value, "rong_token");
            return (Criteria) this;
        }

        public Criteria andRong_tokenIn(List<String> values) {
            addCriterion("rong_token in", values, "rong_token");
            return (Criteria) this;
        }

        public Criteria andRong_tokenNotIn(List<String> values) {
            addCriterion("rong_token not in", values, "rong_token");
            return (Criteria) this;
        }

        public Criteria andRong_tokenBetween(String value1, String value2) {
            addCriterion("rong_token between", value1, value2, "rong_token");
            return (Criteria) this;
        }

        public Criteria andRong_tokenNotBetween(String value1, String value2) {
            addCriterion("rong_token not between", value1, value2, "rong_token");
            return (Criteria) this;
        }

        public Criteria andManagerIsNull() {
            addCriterion("manager is null");
            return (Criteria) this;
        }

        public Criteria andManagerIsNotNull() {
            addCriterion("manager is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEqualTo(Integer value) {
            addCriterion("manager =", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotEqualTo(Integer value) {
            addCriterion("manager <>", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThan(Integer value) {
            addCriterion("manager >", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager >=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThan(Integer value) {
            addCriterion("manager <", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThanOrEqualTo(Integer value) {
            addCriterion("manager <=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIn(List<Integer> values) {
            addCriterion("manager in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotIn(List<Integer> values) {
            addCriterion("manager not in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerBetween(Integer value1, Integer value2) {
            addCriterion("manager between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotBetween(Integer value1, Integer value2) {
            addCriterion("manager not between", value1, value2, "manager");
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