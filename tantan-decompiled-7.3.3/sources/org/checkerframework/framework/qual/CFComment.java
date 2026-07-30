package org.checkerframework.framework.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface CFComment {
    String[] value();
}
