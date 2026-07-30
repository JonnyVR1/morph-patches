package org.junit.validator;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidateWith {
    Class<? extends AnnotationValidator> value();
}
