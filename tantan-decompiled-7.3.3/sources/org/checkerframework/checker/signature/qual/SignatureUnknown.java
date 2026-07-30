package org.checkerframework.checker.signature.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.SubtypeOf;

/* JADX INFO: loaded from: classes2.dex */
@Target({})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({})
@DefaultQualifierInHierarchy
public @interface SignatureUnknown {
}
