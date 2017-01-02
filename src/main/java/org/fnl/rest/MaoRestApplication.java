package org.fnl.rest;

import org.onlab.rest.AbstractWebApplication;

import java.util.Set;

/**
 * Created by mao on 9/7/16.
 */
public class MaoRestApplication extends AbstractWebApplication {

    @Override
    public Set<Class<?>> getClasses(){
        return getClasses(MaoRestResource.class);
    }
}
