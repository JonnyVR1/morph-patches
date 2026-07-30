package org.checkerframework.checker.index.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.JavaExpression;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface HasSubsequence {
    @JavaExpression
    String from();

    @JavaExpression
    String subsequence();

    @JavaExpression
    /* JADX INFO: renamed from: to */
    String m221095to();
}
