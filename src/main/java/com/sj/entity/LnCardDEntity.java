package com.sj.entity;

import com.sj.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "LN_CARD_D")
public class LnCardDEntity extends BaseEntity {
    @Id
    @Column(name = "ID", updatable = false, insertable = false)
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 类型
     */
    @Column(name = "LN_TYPE")
    private String lnType;

    /**
     * 卡号
     */
    @Column(name = "CARD_NO")
    private String cardNo;

    /**
     * 电子账户
     */
    @Column(name = "E_ACCT_NO")
    private String eAcctNo;

    /**
     * 姓名
     */
    @Column(name = "CUST_NAME")
    private String custName;

    /**
     * 身份证号码
     */
    @Column(name = "CUST_NO")
    private String custNo;

    /**
     * 放款日期
     */
    @Column(name = "BEGIN_DT")
    private String beginDt;

    /**
     * 贷款金额
     */
    @Column(name = "LN_BAL")
    private BigDecimal lnBal;

    /**
     * 期限
     */
    @Column(name = "LN_PRIOD")
    private String lnPriod;

    /**
     * 手续费率
     */
    @Column(name = "FEE_RATE")
    private BigDecimal feeRate;

    /**
     * 年利率
     */
    @Column(name = "LN_INIT_D")
    private BigDecimal lnInitD;

    /**
     * 业务区域
     */
    @Column(name = "PRODUCT_AREA")
    private String productArea;

    /**
     * 合同编号
     */
    @Column(name = "CONTRACT_NO")
    private String contractNo;

    /**
     * 担保公司
     */
    @Column(name = "GUARANTEE_COMPANG")
    private String guaranteeCompang;

    /**
     * 担保方式
     */
    @Column(name = "GUARANTEE_TYPE")
    private String guaranteeType;

    /**
     * 上牌公司
     */
    @Column(name = "SP_COMPANY")
    private String spCompany;

    /**
     * 业务类型
     */
    @Column(name = "PRODUCT_TYPE")
    private String productType;

    /**
     * 产品名称
     */
    @Column(name = "PRODUCT_NAME")
    private String productName;
    /**
     * 状态
     */
    @Column(name = "STATE")
    private Integer state;


   

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取类型
     *
     * @return LN_TYPE - 类型
     */
    public String getLnType() {
        return lnType;
    }

    /**
     * 设置类型
     *
     * @param lnType 类型
     */
    public void setLnType(String lnType) {
        this.lnType = lnType == null ? null : lnType.trim();
    }

    /**
     * 获取卡号
     *
     * @return CARD_NO - 卡号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置卡号
     *
     * @param cardNo 卡号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * 获取电子账户
     *
     * @return E_ACCT_NO - 电子账户
     */
    public String geteAcctNo() {
        return eAcctNo;
    }

    /**
     * 设置电子账户
     *
     * @param eAcctNo 电子账户
     */
    public void seteAcctNo(String eAcctNo) {
        this.eAcctNo = eAcctNo == null ? null : eAcctNo.trim();
    }

    /**
     * 获取姓名
     *
     * @return CUST_NAME - 姓名
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 设置姓名
     *
     * @param custName 姓名
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    /**
     * 获取身份证号码
     *
     * @return CUST_NO - 身份证号码
     */
    public String getCustNo() {
        return custNo;
    }

    /**
     * 设置身份证号码
     *
     * @param custNo 身份证号码
     */
    public void setCustNo(String custNo) {
        this.custNo = custNo == null ? null : custNo.trim();
    }

    /**
     * 获取放款日期
     *
     * @return BEGIN_DT - 放款日期
     */
    public String getBeginDt() {
        return beginDt;
    }

    /**
     * 设置放款日期
     *
     * @param beginDt 放款日期
     */
    public void setBeginDt(String beginDt) {
        this.beginDt = beginDt == null ? null : beginDt.trim();
    }

    /**
     * 获取贷款金额
     *
     * @return LN_BAL - 贷款金额
     */
    public BigDecimal getLnBal() {
        return lnBal;
    }

    /**
     * 设置贷款金额
     *
     * @param lnBal 贷款金额
     */
    public void setLnBal(BigDecimal lnBal) {
        this.lnBal = lnBal;
    }

    /**
     * 获取期限
     *
     * @return LN_PRIOD - 期限
     */
    public String getLnPriod() {
        return lnPriod;
    }

    /**
     * 设置期限
     *
     * @param lnPriod 期限
     */
    public void setLnPriod(String lnPriod) {
        this.lnPriod = lnPriod == null ? null : lnPriod.trim();
    }

    /**
     * 获取手续费率
     *
     * @return FEE_RATE - 手续费率
     */
    public BigDecimal getFeeRate() {
        return feeRate;
    }

    /**
     * 设置手续费率
     *
     * @param feeRate 手续费率
     */
    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    /**
     * 获取年利率
     *
     * @return LN_INIT_D - 年利率
     */
    public BigDecimal getLnInitD() {
        return lnInitD;
    }

    /**
     * 设置年利率
     *
     * @param lnInitD 年利率
     */
    public void setLnInitD(BigDecimal lnInitD) {
        this.lnInitD = lnInitD;
    }

    /**
     * 获取业务区域
     *
     * @return PRODUCT_AREA - 业务区域
     */
    public String getProductArea() {
        return productArea;
    }

    /**
     * 设置业务区域
     *
     * @param productArea 业务区域
     */
    public void setProductArea(String productArea) {
        this.productArea = productArea == null ? null : productArea.trim();
    }

    /**
     * 获取合同编号
     *
     * @return CONTRACT_NO - 合同编号
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * 设置合同编号
     *
     * @param contractNo 合同编号
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    /**
     * 获取担保公司
     *
     * @return GUARANTEE_COMPANG - 担保公司
     */
    public String getGuaranteeCompang() {
        return guaranteeCompang;
    }

    /**
     * 设置担保公司
     *
     * @param guaranteeCompang 担保公司
     */
    public void setGuaranteeCompang(String guaranteeCompang) {
        this.guaranteeCompang = guaranteeCompang == null ? null : guaranteeCompang.trim();
    }

    /**
     * 获取担保方式
     *
     * @return GUARANTEE_TYPE - 担保方式
     */
    public String getGuaranteeType() {
        return guaranteeType;
    }

    /**
     * 设置担保方式
     *
     * @param guaranteeType 担保方式
     */
    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType == null ? null : guaranteeType.trim();
    }

    /**
     * 获取上牌公司
     *
     * @return SP_COMPANY - 上牌公司
     */
    public String getSpCompany() {
        return spCompany;
    }

    /**
     * 设置上牌公司
     *
     * @param spCompany 上牌公司
     */
    public void setSpCompany(String spCompany) {
        this.spCompany = spCompany == null ? null : spCompany.trim();
    }

    /**
     * 获取业务类型
     *
     * @return PRODUCT_TYPE - 业务类型
     */
    public String getProductType() {
        return productType;
    }

    /**
     * 设置业务类型
     *
     * @param productType 业务类型
     */
    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    /**
     * 获取产品名称
     *
     * @return PRODUCT_NAME - 产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置产品名称
     *
     * @param productName 产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * @return ID
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param id
     */
    public void setState(Integer state) {
        this.state = state;
    }

  
}