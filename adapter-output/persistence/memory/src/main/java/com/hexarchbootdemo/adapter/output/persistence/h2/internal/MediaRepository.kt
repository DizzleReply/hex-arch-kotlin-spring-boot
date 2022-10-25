package com.hexarchbootdemo.adapter.output.persistence.h2.internal

import com.hexarchbootdemo.application.port.input.FindMediaUseCase
import com.hexarchbootdemo.application.port.output.repository.FindMediaPort
import com.hexarchbootdemo.domain.model.Media
import com.hexarchbootdemo.domain.model.Voter
import jdk.nashorn.internal.parser.JSONParser
import kotlinx.coroutines.flow.Flow
import org.jooq.tools.json.JSONObject
import org.springframework.stereotype.Repository
import java.net.HttpURLConnection
import java.net.URL
import java.util.*


@Repository("MediaPersistenceMemoryAdapter")
class MediaRepository : FindMediaPort {

    private final val databaseMap = mutableMapOf<Int, Media>()



    // format:
    // metadat
    // a

    interface response {
        val curser :
    }


    // Request From https://www.wieheisstdaslied.de/lyrics/?q=<input>
    // fetch data from Request with given String

    fun downloadMediaByUrl(input: String): Int {
        val url : URL = URL("https://cse.google.com/cse/element/v1?rsz=filtered_cse&num=10&hl=de&source=gcsc&gss=.de&cselibv=f275a300093f201a&cx=partner-pub-7524682787227502:9l3wirvcbyb&q=bla&safe=off&cse_tok=AB1-RNXc7_AKxn3G8Xkmal-u6O_o:1666732505463&exp=csqr,cc,4861326&callback=google.search.cse.api851");
        val connection : HttpURLConnection = url.openConnection() as HttpURLConnection
        connection.setRequestMethod("GET");
        connection.connect();

        val responsecode = connection.getResponseCode();

        if (responsecode !== 200) {
            throw RuntimeException("HttpResponseCode: $responsecode")
        } else {
            var inline = ""
            val scanner = Scanner(url.openStream())

            //Write all the JSON data into a string using a scanner
            while (scanner.hasNext()) {
                inline += scanner.nextLine()
            }

            //Close the scanner
            scanner.close()

            //Using the JSON simple library parse the string into a json object
            val parse = JSONParser()
            val data_obj: JSONObject = parse.parse(inline) as JSONObject

            //Get the required object from the above created object
            val obj: JSONObject = data_obj.get("Global") as JSONObject

            //Get the required data using its key
            println(obj.get("" +
                    "" +
                    ""))
        }

    }

//    fun fetch(){
//        fetch("https://cse.google.com/cse/element/v1?rsz=filtered_cse&num=10&hl=de&source=gcsc&gss=.de&cselibv=f275a300093f201a&cx=partner-pub-7524682787227502:9l3wirvcbyb&q=bla&safe=off&cse_tok=AB1-RNXc7_AKxn3G8Xkmal-u6O_o:1666732505463&exp=csqr,cc,4861326&callback=google.search.cse.api851", {
//            "headers": {
//            "accept": "*/*",
//            "accept-language": "en-US,en;q=0.9",
//            "sec-ch-ua": "\"Chromium\";v=\"106\", \"Google Chrome\";v=\"106\", \"Not;A=Brand\";v=\"99\"",
//            "sec-ch-ua-mobile": "?0",
//            "sec-ch-ua-platform": "\"Linux\"",
//            "sec-fetch-dest": "script",
//            "sec-fetch-mode": "no-cors",
//            "sec-fetch-site": "cross-site",
//            "x-client-data": "CJO2yQEIo7bJAQipncoBCNGgygEIk6HLAQjuu8wBCP28zAEIxeHMAQ=="
//        },
//            "referrer": "https://www.wieheisstdaslied.de/",
//            "referrerPolicy": "strict-origin-when-cross-origin",
//            "body": null,
//            "method": "GET",
//            "mode": "cors",
//            "credentials": "include"
//        });
//    }

    fun downloadMetadataByUrl(url: String) {
            return;
    }

    override fun findMediaById(query: FindMediaUseCase.FindByIdQuery) : List<Media>{
        return findAll().filter{it.id.equals(query.idContains)}
    }

    override fun findMediaInfoQuery(query: FindMediaUseCase.FindMediaInfoQuery): String {
        return downloadMediaByUrl();
    }

    override suspend fun findVotersByLastNameReactive(query: FindMediaUseCase.FindByIdQuery): Flow<Voter> {
        TODO("Not yet implemented")
    }

    fun downloadMetadataByUrl1(url: String) {}

    init {
        val media1 = Media(1,"You Can Get It If You Really Want","Desmond Dekker","Mp3","Reggae");
        val media2 = Media(2,"Duality","Slipknot","mp3","Death Metal");
        val media3 = Media(3,"Weltschmerz","Klangkuenstler","mp3","Techno");
        val media4 = Media(4,"Rattlesnake","King Gizzard & the Lizard Wizard","mp3","Indie")
        databaseMap[media1.id] = media1;
        databaseMap[media2.id] = media2;
        databaseMap[media3.id] = media3;
        databaseMap[media4.id] = media4;

    }

    private fun findAll(): List<Media> {
        return databaseMap.values.toList()
    }

    private fun fetch(): List<Media> {
        return databaseMap.values.toList()
    }
    private fun find(id: Int): Media? {
        return databaseMap.values.find { it.id == id }
    }

}