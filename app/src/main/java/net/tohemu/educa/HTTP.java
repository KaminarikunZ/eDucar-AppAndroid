package net.tohemu.educa;

import android.util.Log;

import com.github.kittinunf.fuel.Fuel;
import com.github.kittinunf.fuel.core.FuelError;
import com.github.kittinunf.fuel.core.Handler;
import com.github.kittinunf.fuel.core.Request;
import com.github.kittinunf.fuel.core.Response;
import com.github.kittinunf.result.Result;

import kotlin.Triple;

/**
 * Created by tohem on 5/2/2017.
 */
public class HTTP {

    private String URI = "";

    public HTTP(String URL){
        this.URI = URL;
    }

    public String GetRequest() {

        Fuel.get(URI).responseString(new Handler<String>() {
            @Override
            public void failure(Request request, Response response, FuelError error) {

            }

            @Override
            public void success(Request request, Response response, String data) {

            }
        });

        return "";
    }
}
