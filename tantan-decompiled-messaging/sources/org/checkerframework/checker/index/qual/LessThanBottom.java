package org.checkerframework.checker.index.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({LessThan.class})
public @interface LessThanBottom {
}
