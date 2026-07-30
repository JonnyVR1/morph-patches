package org.checkerframework.common.initializedfields.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.InheritedAnnotation;
import org.checkerframework.framework.qual.PostconditionAnnotation;
import org.checkerframework.framework.qual.QualifierArgument;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@PostconditionAnnotation(qualifier = InitializedFields.class)
@InheritedAnnotation
@Documented
@Repeatable(List.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnsuresInitializedFields {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @PostconditionAnnotation(qualifier = InitializedFields.class)
    @InheritedAnnotation
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface List {
        EnsuresInitializedFields[] value();
    }

    @QualifierArgument("value")
    String[] fields();

    String[] value() default {"this"};
}
