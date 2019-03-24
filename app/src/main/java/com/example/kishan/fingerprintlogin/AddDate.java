package com.example.kishan.fingerprintlogin;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

public class AddDate extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "URL";
    private Map<String,String> params;

    public AddDate(String date , Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);

        params.put("date",date);
    }

    public Map<String, String> getParams() {
        return params;
    }
}
