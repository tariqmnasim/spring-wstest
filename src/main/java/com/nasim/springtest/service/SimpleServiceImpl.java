package com.nasim.springtest.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

/**
 * Created by Nasim on 4/25/14.
 */
@Service
public class SimpleServiceImpl implements SimpleService {
    public String getSimple(BigInteger bigInteger) {
        return "The input number was: " + bigInteger;
    }
}
