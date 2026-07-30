package org.checkerframework.checker.lock.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.InvisibleQualifier;
import org.checkerframework.framework.qual.SubtypeOf;

/* JADX INFO: loaded from: classes2.dex */
@Target({})
@InvisibleQualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({LockPossiblyHeld.class})
public @interface LockHeld {
}
