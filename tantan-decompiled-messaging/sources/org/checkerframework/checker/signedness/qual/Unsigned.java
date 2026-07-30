package org.checkerframework.checker.signedness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TypeKind;
import org.checkerframework.framework.qual.UpperBoundFor;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@DefaultFor(typeKinds = {TypeKind.CHAR}, types = {Character.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({UnknownSignedness.class})
@UpperBoundFor(typeKinds = {TypeKind.CHAR}, types = {Character.class})
public @interface Unsigned {
}
