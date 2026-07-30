package org.checkerframework.checker.lock.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.InvisibleQualifier;
import org.checkerframework.framework.qual.LiteralKind;
import org.checkerframework.framework.qual.QualifierForLiterals;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TypeUseLocation;

/* JADX INFO: loaded from: classes2.dex */
@Target({})
@QualifierForLiterals({LiteralKind.NULL})
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({})
@InvisibleQualifier
@DefaultFor(types = {Void.class}, value = {TypeUseLocation.LOWER_BOUND})
@Documented
@DefaultQualifierInHierarchy
public @interface LockPossiblyHeld {
}
