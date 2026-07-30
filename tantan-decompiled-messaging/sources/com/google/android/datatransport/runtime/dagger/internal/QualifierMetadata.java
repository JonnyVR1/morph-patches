package com.google.android.datatransport.runtime.dagger.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface QualifierMetadata {
    String[] value() default {};
}
