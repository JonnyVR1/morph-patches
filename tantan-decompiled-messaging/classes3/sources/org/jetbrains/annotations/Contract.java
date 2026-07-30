package org.jetbrains.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Retention(RetentionPolicy.CLASS)
public @interface Contract {
    @NonNls
    String mutates() default "";

    boolean pure() default false;

    @NonNls
    String value() default "";
}
