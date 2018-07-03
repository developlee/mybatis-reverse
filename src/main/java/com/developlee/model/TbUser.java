package com.developlee.model;

import java.math.BigDecimal;
import java.util.Date;

public class TbUser {
    private String id;

    private Integer autoId;

    private String openId;

    private String wechatPublicId;

    private String userHeader;

    private String chnName;

    private String mobile;

    private String tradePassword;

    private BigDecimal money;

    private BigDecimal rechargeMoney;

    private Integer tradeCount;

    private BigDecimal couponMoney;

    private BigDecimal outMoney;

    private String agentInviteCode;

    private Integer status;

    private Date registerTime;

    private Date lastLoginTime;

    private String lastLoginIp;

    private String parent1Id;

    private String parent2Id;

    private String parent3Id;

    private BigDecimal returnMoney;

    private BigDecimal returnMoneyTotal;

    private String ticketWechatPublicId;

    private String ticket;

    private Date ticketExpireTime;

    private String idCard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getAutoId() {
        return autoId;
    }

    public void setAutoId(Integer autoId) {
        this.autoId = autoId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getWechatPublicId() {
        return wechatPublicId;
    }

    public void setWechatPublicId(String wechatPublicId) {
        this.wechatPublicId = wechatPublicId == null ? null : wechatPublicId.trim();
    }

    public String getUserHeader() {
        return userHeader;
    }

    public void setUserHeader(String userHeader) {
        this.userHeader = userHeader == null ? null : userHeader.trim();
    }

    public String getChnName() {
        return chnName;
    }

    public void setChnName(String chnName) {
        this.chnName = chnName == null ? null : chnName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTradePassword() {
        return tradePassword;
    }

    public void setTradePassword(String tradePassword) {
        this.tradePassword = tradePassword == null ? null : tradePassword.trim();
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(BigDecimal rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }

    public Integer getTradeCount() {
        return tradeCount;
    }

    public void setTradeCount(Integer tradeCount) {
        this.tradeCount = tradeCount;
    }

    public BigDecimal getCouponMoney() {
        return couponMoney;
    }

    public void setCouponMoney(BigDecimal couponMoney) {
        this.couponMoney = couponMoney;
    }

    public BigDecimal getOutMoney() {
        return outMoney;
    }

    public void setOutMoney(BigDecimal outMoney) {
        this.outMoney = outMoney;
    }

    public String getAgentInviteCode() {
        return agentInviteCode;
    }

    public void setAgentInviteCode(String agentInviteCode) {
        this.agentInviteCode = agentInviteCode == null ? null : agentInviteCode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public String getParent1Id() {
        return parent1Id;
    }

    public void setParent1Id(String parent1Id) {
        this.parent1Id = parent1Id == null ? null : parent1Id.trim();
    }

    public String getParent2Id() {
        return parent2Id;
    }

    public void setParent2Id(String parent2Id) {
        this.parent2Id = parent2Id == null ? null : parent2Id.trim();
    }

    public String getParent3Id() {
        return parent3Id;
    }

    public void setParent3Id(String parent3Id) {
        this.parent3Id = parent3Id == null ? null : parent3Id.trim();
    }

    public BigDecimal getReturnMoney() {
        return returnMoney;
    }

    public void setReturnMoney(BigDecimal returnMoney) {
        this.returnMoney = returnMoney;
    }

    public BigDecimal getReturnMoneyTotal() {
        return returnMoneyTotal;
    }

    public void setReturnMoneyTotal(BigDecimal returnMoneyTotal) {
        this.returnMoneyTotal = returnMoneyTotal;
    }

    public String getTicketWechatPublicId() {
        return ticketWechatPublicId;
    }

    public void setTicketWechatPublicId(String ticketWechatPublicId) {
        this.ticketWechatPublicId = ticketWechatPublicId == null ? null : ticketWechatPublicId.trim();
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket == null ? null : ticket.trim();
    }

    public Date getTicketExpireTime() {
        return ticketExpireTime;
    }

    public void setTicketExpireTime(Date ticketExpireTime) {
        this.ticketExpireTime = ticketExpireTime;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }
}