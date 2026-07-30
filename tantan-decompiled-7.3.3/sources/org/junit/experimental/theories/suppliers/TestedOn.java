package org.junit.experimental.theories.suppliers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.experimental.theories.ParametersSuppliedBy;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.PARAMETER})
@ParametersSuppliedBy(TestedOnSupplier.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestedOn {
    int[] ints();
}
