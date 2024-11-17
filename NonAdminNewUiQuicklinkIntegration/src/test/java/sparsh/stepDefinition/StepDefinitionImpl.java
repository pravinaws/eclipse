package sparsh.stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import sparsh.TestComponents.BaseTest;
import sparsh.pageObjects.HomePage;

public class StepDefinitionImpl extends BaseTest
{
	public HomePage HPage;
//	public QuickLink // ql;
//	public HomePage hp;
	
	@Before
	public void setup() throws Exception
	{
		HPage=launchApplication();
	}
	
//	@Given("^Logged in with username (.+) and password (.+)$")
//	public void Logged_in_with_username_and_password(String uname, String password) throws Exception
//	{
//		// ql = lPage.Validlogin(uname, password);
//	}
	
//	User clicks on valid customer quicklink
//	@When("User clicks on valid customer quicklink")
//	public void User_clicks_on_valid_customer_quicklink() throws Exception
//	{
//		hp= // ql.getQuickLink();
//	}
	
	@Then ("Verify the application text")
	public void Verify_the_application_text() throws Exception
	{
//		// ql.validateApplicationVersion();
		HPage.validateApplicationVersion();
	}
	
	@Then("click on serachtype dropdown and varify all searchtypes are visible")
	public void click_on_serachtype_dropdown_and_varify_all_searchtypes_are_visible()
			throws InterruptedException, Exception {
		HPage.ClickSearchType();
	}
	
	@Then("select the  SearchType and enter the custID\\/Mobileno\\/email\\/ApplicationID in searchbox and click on search")
	public void select_the_search_type_and_enter_the_cust_id_mobileno_email_application_id_in_searchbox_and_click_on_search() throws InterruptedException, Exception {
		HPage.SearchByCustID();
	}
	@Then("click on search buttun")
	public void click_on_search_buttun() throws InterruptedException, Exception {
		HPage.VarifyAlertMesaage();

	}
	
	@Then("Enter the custID in serchbox and paste in same searchbox")
	public void enter_the_cust_id_in_serchbox_and_paste_in_same_searchbox() throws InterruptedException {
		HPage.CopyPasteCustID();
	}
	
	@Then("select the searchtype as custID and enterCustID in textbox and check the info")
	public void select_the_searchtype_as_cust_id_and_enter_cust_id_in_textbox_and_check_the_info()
			throws Exception {
		HPage.CheckByCustID();
	}
	
	@Then("select the searchtype as Mobile Number and enter  Mob No  in textbox and check the info")
	public void select_the_searchtype_as_mobile_number_and_enter_mob_no_in_textbox_and_check_the_info() throws InterruptedException, Exception {
		HPage.CheckByMobNo();
	    
	}
	
	@Then("select the searchtype as Email ID and enter Email ID in textbox and check the info")
	public void select_the_searchtype_as_email_id_and_enter_email_id_in_textbox_and_check_the_info() throws InterruptedException, Exception {
		HPage.CheckByEmailID();
	}
	
	@Then("select the searchtype as applicationNo and enter applicationNo in textbox and check info")
	public void select_the_searchtype_as_application_no_and_enter_application_no_in_textbox_and_check_info() throws InterruptedException, Exception {
		
		HPage.CheckByAppID();
	}
	
	@Then("select the searchtype as custID and enter the value {string} and check ythe error msg")
	public void select_the_searchtype_as_cust_id_and_enter_the_value_and_check_ythe_error_msg(String ValueLessThanThree) throws InterruptedException {
		HPage.CheckError(ValueLessThanThree);
	}
	
	@Then("select the searchtype as custumerID and enter the value {string} and check tthe error msg")
	public void select_the_searchtype_as_custumer_id_and_enter_the_value_and_check_tthe_error_msg(String valuemorethanlimit) throws InterruptedException {
		HPage.CheckError2(valuemorethanlimit);
	}
	
//	Implemented by Suhas 
	@Then("Checks  name ,employee ID,Role and logout elements are displayed")
	public void checks_name_employee_id_role_and_logout_elements_are_displayed() throws InterruptedException{
		HPage.check_Name_ID_Role_logout_Isdisplayed();
	}
	@Then("search infon with searchtype and check mobile number is masked except last {int} digits.")
	public void search_infon_with_searchtype_and_check_mobile_number_is_masked_except_last_digits(Integer int1)
			throws InterruptedException {
		HPage.CheckMobileNoMasked();
	}
	@Then("search info with searchtype and check email is masked except last {int} charactor")
	public void search_info_with_searchtype_and_check_email_is_masked_except_last_charactor(Integer int1) throws InterruptedException {
		HPage.CheckemailMasked();
	}
	@Then("search info with searchtype and check user should be able to see the no. of activiites found")
	public void search_info_with_searchtype_and_check_user_should_be_able_to_see_the_no_of_activiites_found() throws InterruptedException {
		HPage.ActivitiesAreDisplyed();
	}
	@Then("search info with searchtype and check user should be able to see the seven days window date")
	public void search_info_with_searchtype_and_check_user_should_be_able_to_see_the_seven_days_window_date() throws  InterruptedException {
		HPage.CheckSevenDayWindow();
	}
	@Then("search info with searchtype and check user should be able to  click on Filters  arrow button")
	public void search_info_with_searchtype_and_check_user_should_be_able_to_click_on_filters_arrow_button() throws InterruptedException {
		HPage.ClickOnFilterFormArrow();
	}
	
	@Then("search info with searchtype and check user should be able to see the Filters Headline in FiltersFrame")
	public void search_info_with_searchtype_and_check_user_should_be_able_to_see_the_filters_headline_in_filters_frame() throws InterruptedException{
		HPage.CheckFilterHeadline();
	}
	@Then("search info with searchtype and check user should be able to see the ProductType and ProcessType titles is diplayed")
	public void search_info_with_searchtype_and_check_user_should_be_able_to_see_the_product_type_and_process_type_titles_is_diplayed() throws InterruptedException{
		HPage.CheckProcessProductTitlesDispalyed();
	}
	@Then("Search info with Searchtype and check user should be able to see Clear Filters and Apply Filters tabs in Filters frame.")
	public void search_info_with_searchtype_and_check_user_should_be_able_to_see_clear_filters_and_apply_filters_tabs_in_filters_frame() throws InterruptedException {
		HPage.CheckClearApplyFilterTabs();
	}
	@Then("search info with searchtype and check user should be able to see the correct options are getting displayed in the Process Type Filters")
	public void search_info_with_searchtype_and_check_user_should_be_able_to_see_the_correct_options_are_getting_displayed_in_the_process_type_filters() throws InterruptedException{
		HPage.CheckProcessType();
	}
	
	
	@Then("date picker functionality;")
	public void date_picker_functionality() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		HPage.getDatePicker();
	}
	
	
//	@Then("select the  SearchType and enter the custID\\/Mobileno\\/email\\/ApplicationID in searchbox and click on search")
//	public void select_the_search_type_and_enter_the_cust_id_mobileno_email_application_id_in_searchbox_and_click_on_search() throws InterruptedException, IOException {
////		HPage.SearchByCustID();
//	}
	@Then("search info with searchtype and check user should be able to see the correct options are getting displayed in the product Type Filters")
	public void search_info_with_searchtype_and_check_user_should_be_able_to_see_the_correct_options_are_getting_displayed_in_the_product_type_filters() throws InterruptedException {
		HPage.CheckProductType();
	}
	@Then("search info with searchtype and check Filter section is scrollable;")
	public void search_info_with_searchtype_and_check_filter_section_is_scrollable() throws InterruptedException {
		HPage.CheckFilterScrollbarScrollable();
	}
	
	
	@After(order=0)
	public void after_scenario(Scenario scenario) throws InterruptedException
	{
//		this.driver.quit();
		Thread.sleep(2000);
	    TakesScreenshot ts=(TakesScreenshot) driver;
	    byte[] src=ts.getScreenshotAs(OutputType.BYTES);
	    scenario.attach(src, "image/png", "screenshot");
//	    this.driver.close();
	    this.driver.quit();
	}
	
	@After(order=1)
  public void takeScraenshotOnFailure(Scenario scenario)
  {
      if (scenario.isFailed())
      {
          TakesScreenshot ts=(TakesScreenshot) driver;
          byte[] src=ts.getScreenshotAs(OutputType.BYTES);
          scenario.attach(src, "image/png", "screenshot");
      }
  }
	
}