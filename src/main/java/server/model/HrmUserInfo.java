package server.model;

import java.util.Date;

public class HrmUserInfo {
    private String id;

    private String nickname;

    private String mobile;

    private String email;

    private String bigheadurl;

    private String smallheadurl;

    private String userlevel;

    private Short usertype;

    private Date lastlogintime;

    private Date createtime;

    private String loginpassword;

    private String paypwd;

    private Integer points;

    private String lnd;

    private String lat;

    private Short maxcontinuenumber;

    private Short curcontinuenumber;

    private String registrationtype;

    private String viplevel;

    private String citycode;

    private String invitationcode;

    private String username;

    private String machineid;

    private String registername;

    private Integer userstate;

    private Integer blockid;

    private String channelid;

    private Double qmcoin;

    private String qrcode;

    private String rong_token;

    private Integer manager;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getBigheadurl() {
        return bigheadurl;
    }

    public void setBigheadurl(String bigheadurl) {
        this.bigheadurl = bigheadurl == null ? null : bigheadurl.trim();
    }

    public String getSmallheadurl() {
        return smallheadurl;
    }

    public void setSmallheadurl(String smallheadurl) {
        this.smallheadurl = smallheadurl == null ? null : smallheadurl.trim();
    }

    public String getUserlevel() {
        return userlevel;
    }

    public void setUserlevel(String userlevel) {
        this.userlevel = userlevel == null ? null : userlevel.trim();
    }

    public Short getUsertype() {
        return usertype;
    }

    public void setUsertype(Short usertype) {
        this.usertype = usertype;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLoginpassword() {
        return loginpassword;
    }

    public void setLoginpassword(String loginpassword) {
        this.loginpassword = loginpassword == null ? null : loginpassword.trim();
    }

    public String getPaypwd() {
        return paypwd;
    }

    public void setPaypwd(String paypwd) {
        this.paypwd = paypwd == null ? null : paypwd.trim();
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getLnd() {
        return lnd;
    }

    public void setLnd(String lnd) {
        this.lnd = lnd == null ? null : lnd.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public Short getMaxcontinuenumber() {
        return maxcontinuenumber;
    }

    public void setMaxcontinuenumber(Short maxcontinuenumber) {
        this.maxcontinuenumber = maxcontinuenumber;
    }

    public Short getCurcontinuenumber() {
        return curcontinuenumber;
    }

    public void setCurcontinuenumber(Short curcontinuenumber) {
        this.curcontinuenumber = curcontinuenumber;
    }

    public String getRegistrationtype() {
        return registrationtype;
    }

    public void setRegistrationtype(String registrationtype) {
        this.registrationtype = registrationtype == null ? null : registrationtype.trim();
    }

    public String getViplevel() {
        return viplevel;
    }

    public void setViplevel(String viplevel) {
        this.viplevel = viplevel == null ? null : viplevel.trim();
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode == null ? null : citycode.trim();
    }

    public String getInvitationcode() {
        return invitationcode;
    }

    public void setInvitationcode(String invitationcode) {
        this.invitationcode = invitationcode == null ? null : invitationcode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMachineid() {
        return machineid;
    }

    public void setMachineid(String machineid) {
        this.machineid = machineid == null ? null : machineid.trim();
    }

    public String getRegistername() {
        return registername;
    }

    public void setRegistername(String registername) {
        this.registername = registername == null ? null : registername.trim();
    }

    public Integer getUserstate() {
        return userstate;
    }

    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }

    public Integer getBlockid() {
        return blockid;
    }

    public void setBlockid(Integer blockid) {
        this.blockid = blockid;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }

    public Double getQmcoin() {
        return qmcoin;
    }

    public void setQmcoin(Double qmcoin) {
        this.qmcoin = qmcoin;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
    }

    public String getRong_token() {
        return rong_token;
    }

    public void setRong_token(String rong_token) {
        this.rong_token = rong_token == null ? null : rong_token.trim();
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }
}