package org.checkerframework.checker.lock.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.ConditionalPostconditionAnnotation;
import org.checkerframework.framework.qual.InheritedAnnotation;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@InheritedAnnotation
@ConditionalPostconditionAnnotation(qualifier = LockHeld.class)
@Documented
@Repeatable(List.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnsuresLockHeldIf {

    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @InheritedAnnotation
    @ConditionalPostconditionAnnotation(qualifier = LockHeld.class)
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface List {
        EnsuresLockHeldIf[] value();
    }

    String[] expression();

    boolean result();
}
