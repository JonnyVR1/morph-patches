package org.checkerframework.checker.nullness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.InheritedAnnotation;
import org.checkerframework.framework.qual.JavaExpression;
import org.checkerframework.framework.qual.PostconditionAnnotation;
import org.checkerframework.framework.qual.QualifierArgument;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@PostconditionAnnotation(qualifier = KeyFor.class)
@InheritedAnnotation
@Documented
@Repeatable(List.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnsuresKeyFor {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @PostconditionAnnotation(qualifier = KeyFor.class)
    @InheritedAnnotation
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface List {
        EnsuresKeyFor[] value();
    }

    @QualifierArgument("value")
    @JavaExpression
    String[] map();

    String[] value();
}
