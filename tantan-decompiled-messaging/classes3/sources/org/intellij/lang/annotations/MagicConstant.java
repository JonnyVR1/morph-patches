package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NonNls;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface MagicConstant {
    long[] flags() default {};

    Class<?> flagsFromClass() default void.class;

    long[] intValues() default {};

    @NonNls
    String[] stringValues() default {};

    Class<?> valuesFromClass() default void.class;
}
