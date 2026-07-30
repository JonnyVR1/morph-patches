package org.checkerframework.common.value.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.PolymorphicQualifier;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@PolymorphicQualifier(UnknownVal.class)
public @interface PolyValue {
}
