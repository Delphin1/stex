package com.tsg.stex.service;

import com.tsg.stex.model.Message;
import com.tsg.stex.rest.RestClientStex;

/**
 * Created by tsg on 12.04.2016.
 */
public class stexService {
    public static Message stexSearch(String q) {
        RestClientStex client = new RestClientStex();
        return client.req(q);
    }
}
