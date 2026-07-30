package com.alibaba.fastjson.support.jaxrs;

import javax.annotation.Priority;
import javax.ws.rs.core.FeatureContext;
import org.glassfish.jersey.internal.spi.AutoDiscoverable;

/* JADX INFO: loaded from: classes.dex */
@Priority(1999)
public class FastJsonAutoDiscoverable implements AutoDiscoverable {
    public static volatile boolean autoDiscover = true;

    public void configure(FeatureContext featureContext) {
        if (featureContext.getConfiguration().isRegistered(FastJsonFeature.class) || !autoDiscover) {
            return;
        }
        featureContext.register(FastJsonFeature.class);
    }
}
