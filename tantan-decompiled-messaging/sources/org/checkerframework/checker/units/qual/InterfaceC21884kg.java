package org.checkerframework.checker.units.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/* JADX INFO: renamed from: org.checkerframework.checker.units.qual.kg */
/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UnitsMultiple(prefix = Prefix.kilo, quantity = InterfaceC21882g.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@SubtypeOf({Mass.class})
public @interface InterfaceC21884kg {
}
