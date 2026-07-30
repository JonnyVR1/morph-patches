package org.greenrobot.greendao.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface ToMany {
    JoinProperty[] joinProperties() default {};

    String referencedJoinProperty() default "";
}
