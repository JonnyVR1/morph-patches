package org.checkerframework.common.value.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.InvisibleQualifier;
import org.checkerframework.framework.qual.SubtypeOf;
import org.checkerframework.framework.qual.TargetLocations;
import org.checkerframework.framework.qual.TypeUseLocation;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@TargetLocations({TypeUseLocation.EXPLICIT_LOWER_BOUND, TypeUseLocation.EXPLICIT_UPPER_BOUND})
@InvisibleQualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({ArrayLen.class, BoolVal.class, DoubleVal.class, IntVal.class, StringVal.class, MatchesRegex.class, ArrayLenRange.class, IntRange.class, IntRangeFromPositive.class, IntRangeFromGTENegativeOne.class, IntRangeFromNonNegative.class})
public @interface BottomVal {
}
