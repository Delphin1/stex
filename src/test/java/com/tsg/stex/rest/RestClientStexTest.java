package com.tsg.stex.rest;

import com.tsg.stex.model.Item;
import com.tsg.stex.model.Message;

import com.tsg.stex.service.stexService;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by tsg on 11.04.2016.
 */
public class RestClientStexTest {

    @Test
    public void restClientStexTest() {
        RestClientStex clnt = new RestClientStex();
        Message message = clnt.req("java");

        assertTrue(message.getItems().size()>0);
/*
        for (Item i : message.getItems()) {
            System.out.println(i.getTitle());
        }*/

        }

    @Test
    public void stexServiceTest() {
        Message message = stexService.stexSearch("java");
        assertTrue(message.getItems().size()>0);
       /* for (Item i : message.getItems()) {
            System.out.println(i.getTitle());
        }*/

    }


    }


