package com.ledzedev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * Source code generated by Gerado Pucheta Figueroa
 * Twitter: @ledzedev
 * http://ledze.mx
 * 1/20/2017
 */
@Component
public class Receptor {

    private static Logger log = LoggerFactory.getLogger(Receptor.class);

    //Solo se agrega este contador para darle mas sentido al ejemplo, pero no se recomienda en un ambiente productivo.
    private CountDownLatch latch = new CountDownLatch(1);

    public void recibirMensaje(String mensaje){
        log.info("Mensaje recibido: " +mensaje);
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
