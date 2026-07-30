package org.checkerframework.checker.nullness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.ConditionalPostconditionAnnotation;
import org.checkerframework.framework.qual.InheritedAnnotation;
import org.checkerframework.framework.qual.JavaExpression;
import org.checkerframework.framework.qual.QualifierArgument;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@InheritedAnnotation
@ConditionalPostconditionAnnotation(qualifier = KeyFor.class)
@Documented
@Repeatable(List.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnsuresKeyForIf {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @InheritedAnnotation
    @ConditionalPostconditionAnnotation(qualifier = KeyFor.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface List {
        EnsuresKeyForIf[] value();
    }

    String[] expression();

    @QualifierArgument("value")
    @JavaExpression
    String[] map();

    boolean result();
}
