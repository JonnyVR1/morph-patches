package org.checkerframework.checker.lock.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.InheritedAnnotation;
import org.checkerframework.framework.qual.PostconditionAnnotation;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@PostconditionAnnotation(qualifier = LockHeld.class)
@InheritedAnnotation
@Documented
@Repeatable(List.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnsuresLockHeld {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @PostconditionAnnotation(qualifier = LockHeld.class)
    @InheritedAnnotation
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface List {
        EnsuresLockHeld[] value();
    }

    String[] value();
}
