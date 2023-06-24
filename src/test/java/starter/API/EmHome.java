package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class EmHome {
    protected String url = "https://34.128.85.215:8080";
    @Step("I set GET api endpoints EmHome") public String setGetApiEndpointEmHome() {return url + "/auth/users/weather/-3.577847/102.346390";}
    @Step("I set GET api endpoints EmHome2") public String setGetApiEndpointEmHome2() {return url + "/auth/users/weather/1";}
    @Step("I set GET api endpoints EmHome3") public String setGetApiEndpointEmHome3() {return url + "/auth/users/weather/99";}
    @Step("I set GET api endpoints EmHome4") public String setGetApiEndpointEmHome4() {return url + "/auth/plants";}
    @Step("I set GET api endpoints EmHome5") public String setGetApiEndpointEmHome5() {return url + "/auth/plants/search?name=Tomat";}
    @Step("I set GET api endpoints EmHome6") public String setGetApiEndpointEmHome6() {return url + "/auth/plants/6";}
    @Step("I set GET api endpoints EmHome7") public String setGetApiEndpointEmHome7() {return url + "/auth/plants/3";}
    @Step("I set GET api endpoints EmHome8") public String setGetApiEndpointEmHome8() {return url + "/auth/plants/6/location";}
    @Step("I set GET api endpoints EmHome9") public String setGetApiEndpointEmHome9() {return url + "/auth/articles/planting/6/ground";}
    @Step("I set GET api endpoints EmHome10") public String setGetApiEndpointEmHome10() {return url + "/auth/articles/planting/3/ground";}
    @Step("I set GET api endpoints EmHome11") public String setGetApiEndpointEmHome11() {return url + "/auth/articles/planting/6/trash";}

    @Step("When I send GET HTTP request EmHome")
    public void sendGetHttpEmHome() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome2")
    public void sendGetHttpEmHome2() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome2()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome3")
    public void sendGetHttpEmHome3() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome3()).then().statusCode(404);}
    @Step("When I send GET HTTP request EmHome4")
    public void sendGetHttpEmHome4() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome4()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome5")
    public void sendGetHttpEmHome5() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome5()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome6")
    public void sendGetHttpEmHome6() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome6()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome7")
    public void sendGetHttpEmHome7() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome7()).then().statusCode(404);}
    @Step("When I send GET HTTP request EmHome8")
    public void sendGetHttpEmHome8() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome8()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome9")
    public void sendGetHttpEmHome9() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome9()).then().statusCode(200);}
    @Step("When I send GET HTTP request EmHome10")
    public void sendGetHttpEmHome10() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome10()).then().statusCode(404);}
    @Step("When I send GET HTTP request EmHome11")
    public void sendGetHttpEmHome11() {SerenityRest.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiYW5ha3FlIiwicm9sZSI6InVzZXIiLCJ1c2VyX2lkIjozfQ.d_DwYth9wp72Dax1p3XBVTxtOWldjOMnn-6cqYfiQjA").get(setGetApiEndpointEmHome11()).then().statusCode(400);}

}
