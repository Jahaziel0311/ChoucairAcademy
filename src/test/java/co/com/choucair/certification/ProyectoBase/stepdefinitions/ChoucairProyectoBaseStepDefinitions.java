package co.com.choucair.certification.ProyectoBase.stepdefinitions;


import co.com.choucair.certification.ProyectoBase.questions.Answer;
import co.com.choucair.certification.ProyectoBase.tasks.Login;
import co.com.choucair.certification.ProyectoBase.tasks.OpenUp;
import co.com.choucair.certification.ProyectoBase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class ChoucairProyectoBaseStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Brandon wants to learn automation at the academy Choucair$")
    public void thatBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));


    }


    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {

        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

    }

    @Then("^he find the course called course (.*)$")
    public void heFindsTheCourseCalledResourcesMetodologíaBancolombia(String question) {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }
}
