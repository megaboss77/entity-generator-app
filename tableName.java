import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
@Entity
@Table(name = "TABLE_NAME")
public class tableName {

	@Column(name = "RUNNING_NO" , length = 30)
	private String runningNo;

	@Column(name = "EXAMPLE_CODE" , length = 50)
	private Double exampleCode;

	@Column(name = "EXAMPLE_PLACE" , length = 50)
	private String examplePlace;

	@Column(name = "EXAMPLE_ADDRESS" , length = 500)
	private String exampleAddress;

	@Column(name = "EXAMPLE_ADDRESS_2" , length = 10)
	private String exampleAddress2;

	@Column(name = "EXAMPLE_SUB_DISTRICT" , length = 5)
	private String exampleSubDistrict;

	@Column(name = "EXAMPLE_DISTRICT" , nullable = false ,length = 20)
	private String exampleDistrict;

	@Column(name = "EXAMPLE_PROVINCE" , length = 200)
	private String exampleProvince;

	@Column(name = "EXAMPLE_POST_CODE" , length = 200)
	private String examplePostCode;

	@Column(name = "EXAMPLE_OPEN_DATE" , length = 50)
	private String exampleOpenDate;

	@Column(name = "EXAMPLE_OPEN_TIME" , length = 50)
	private String exampleOpenTime;

	@Column(name = "EXAMPLE_CREATE_DATE" , length = 10)
	private String exampleCreateDate;

	@Column(name = "EXAMPLE_INSTALLATION_DATE" , length = 20)
	private String exampleInstallationDate;

	@Column(name = "CASH_TOPUP_CENTER" , length = 10)
	private String cashTopupCenter;

	@Column(name = "OWN_BR_CODE" , length = 10)
	private String ownBrCode;

	@Column(name = "PROVINCE_OF_OWN_BR" , length = 20)
	private String provinceOfOwnBr;

	@Column(name = "CLEARING_BR_NAME" , length = 50)
	private String clearingBrName;

	@Column(name = "CODE_OF_CLEARING_BR" , nullable = false ,length = 50)
	private String codeOfClearingBr;

	@Column(name = "IN_OUT" , length = 100)
	private String inOut;

	@Column(name = "LO" , length = 100)
	private String lo;

	@Column(name = "REGION" , length = 200)
	private String region;

	@Column(name = "AREA" , length = 100)
	private String area;

	@Column(name = "LO_N" , length = 20)
	private String loN;

	@Column(name = "REG" , length = 20)
	private String reg;

	@Column(name = "NEW_REG" , length = 20)
	private String newReg;

	@Column(name = "BRANCH_CODE" , length = 20)
	private String branchCode;

	@Column(name = "EXAMPLE_TYPE" , length = 5)
	private String exampleType;

