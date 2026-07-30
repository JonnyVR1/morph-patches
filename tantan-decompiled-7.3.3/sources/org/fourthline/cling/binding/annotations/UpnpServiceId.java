package org.fourthline.cling.binding.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({})
@Retention(RetentionPolicy.RUNTIME)
public @interface UpnpServiceId {
    String namespace() default "upnp-org";

    String value();
}
