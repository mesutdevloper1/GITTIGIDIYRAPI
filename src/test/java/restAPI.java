import com.sun.org.apache.xpath.internal.operations.And;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class restAPI {
    @Test
    public void createList(){
        when().post("https://api.trello.com/1/lists?name=ListTestim&idBoard=6236c46d66b52640fd987d81&key=24b1f34190f83b193b8068ff5b94887f&token=2b0eaed8dbe5b1394a36bca815d8ce4e5878fab9263a11016750b4ddeb8f18ac").then().statusCode(403);
    }
    @Test
    public void Kartolusturma(){
        when().post("https://api.trello.com/1/cards?idList=623742aeadce0d688d47bcf0&token=2b0eaed8dbe5b1394a36bca815d8ce4e5878fab9263a11016750b4ddeb8f18ac&key=24b1f34190f83b193b8068ff5b94887f&name= kart1").then().statusCode(200);
    }
    @Test
    public void Kartolusturma2(){
        when().post("https://api.trello.com/1/cards?idList=623742aeadce0d688d47bcf0&token=2b0eaed8dbe5b1394a36bca815d8ce4e5878fab9263a11016750b4ddeb8f18ac&key=24b1f34190f83b193b8068ff5b94887f&name= kart2").then().statusCode(200);
    }

    @Test
    public void Delete1(){

        when().delete("https://api.trello.com/1/cards/:id?key=623742aeadce0d688d47bcf0&token=2b0eaed8dbe5b1394a36bca815d8ce4e5878fab9263a11016750b4ddeb8f18ac").then().statusCode("200");
    }

    @Test
    public void Delete2(){

        when().delete("https://api.trello.com/1/cards/:id?key=623742aeadce0d688d47bdf0&token=2b0eaed8dbe5b1394a36bca815d8ce4e5878fab9263a11016750b4ddeb8f18ac").then().statusCode("200");
    }

    @Test
    public void panoOlustur(){
        when().post("https://api.trello.com/1/boards/?name=Testim&key=24b1f34190f83b193b8068ff5b94887f&token=2b0eaed8dbe5b1394a36bca815d8ce4e5878fab9263a11016750b4ddeb8f18ac").then().statusCode(200);

    }

    @Test
    public void deleteBoard(){
        when().delete("https://api.trello.com/1/boards/:id?key=623742aeadce0d688d47bcf0&token=2b0eaed8dbe5b1394a36bca815d8ce4e5878fab9263a11016750b4ddeb8f18ac").then().statusCode(200);
    }

    @Test
    public void createBoard(){
      when().post("https://api.trello.com/1/boards/?name=Testim&key=24b1f34190f83b193b8068ff5b94887f&token=2b0eaed8dbe5b1394a36bca815d8ce4e5878fab9263a11016750b4ddeb8f18ac").statusCode(200);

    }


}
