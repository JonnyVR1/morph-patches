package org.aspectj.lang.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface SuppressAjWarnings {
    String[] value() default {""};
}
