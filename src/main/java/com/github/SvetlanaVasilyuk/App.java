package com.github.SvetlanaVasilyuk;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class App
{
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void putToLog(){
        LOG.error("Сообщение об ошибке");
        LOG.warn("Сообщение с предупреждением");
        LOG.info("Информационное сообщение");
        LOG.trace("Сообщение-трассировка");
    }

    public static void main( String[] args )
    {
        putToLog();
    }
}
