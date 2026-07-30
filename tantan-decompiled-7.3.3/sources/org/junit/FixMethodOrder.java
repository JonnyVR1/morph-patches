package org.junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.runners.MethodSorters;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FixMethodOrder {
    MethodSorters value() default MethodSorters.DEFAULT;
}
