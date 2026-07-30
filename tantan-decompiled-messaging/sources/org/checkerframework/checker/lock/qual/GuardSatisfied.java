package org.checkerframework.checker.lock.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TargetLocations;
import org.checkerframework.framework.qual.TypeUseLocation;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE_USE})
@TargetLocations({TypeUseLocation.RECEIVER, TypeUseLocation.PARAMETER, TypeUseLocation.RETURN})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({GuardedByUnknown.class})
public @interface GuardSatisfied {
    int value() default -1;
}
