package pvt.dolaicorp.bt.webApp.beans;

import java.sql.Blob;
import java.sql.Date;

public class BillingTrackerBean {

	private Long id; //1,2,3
	private String billType; //Electricity, Gas, Internet, Maintenance, MobileRecharge, DTH
	private Double billAmount;// 1000, 525.65, 100.01
	private Date billingDate; //Bill Date: 13-01-2022
	private String billStatus;//PAID, UNPAID, ISSUE_WITH_BILL
	private Long billNo; //1000345678, 127738043
	private String billAddress; //c-604,Kashi Darshan Building, D-211, Mahadev Nagar
	private boolean isHardCopyAvailable; //Yes , No
	private Date billPaymentDate;
	private Date createdDate;
	private Date updatedDate;
	private String comments;
	private Blob billImage;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBillType() {
		return billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}
	public Double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}
	public Date getBillingDate() {
		return billingDate;
	}
	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}
	public String getBillStatus() {
		return billStatus;
	}
	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}
	public Long getBillNo() {
		return billNo;
	}
	public void setBillNo(Long billNo) {
		this.billNo = billNo;
	}
	public String getBillAddress() {
		return billAddress;
	}
	public void setBillAddress(String billAddress) {
		this.billAddress = billAddress;
	}
	public boolean isHardCopyAvailable() {
		return isHardCopyAvailable;
	}
	public void setHardCopyAvailable(boolean isHardCopyAvailable) {
		this.isHardCopyAvailable = isHardCopyAvailable;
	}
	public Date getBillPaymentDate() {
		return billPaymentDate;
	}
	public void setBillPaymentDate(Date billPaymentDate) {
		this.billPaymentDate = billPaymentDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public Blob getBillImage() {
		return billImage;
	}
	public void setBillImage(Blob billImage) {
		this.billImage = billImage;
	}
	
	@Override
	public String toString() {
		return "BillingTrackerBean [id=" + id + ", billType=" + billType + ", billAmount=" + billAmount
				+ ", billingDate=" + billingDate + ", billStatus=" + billStatus + ", billNo=" + billNo
				+ ", billAddress=" + billAddress + ", isHardCopyAvailable=" + isHardCopyAvailable + ", billPaymentDate="
				+ billPaymentDate + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", comments="
				+ comments + ", billImage=" + billImage + "]";
	}
}
