package com.nasim.springtest.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class RNGServiceImpl implements RNGService {

    public BigInteger random(BigInteger bigInteger) {
        return BigInteger.ONE;
    }

}
