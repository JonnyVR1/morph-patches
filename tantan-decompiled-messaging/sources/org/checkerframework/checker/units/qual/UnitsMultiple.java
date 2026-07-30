package org.checkerframework.checker.units.qual;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface UnitsMultiple {
    Prefix prefix() default Prefix.one;

    Class<? extends Annotation> quantity();
}
