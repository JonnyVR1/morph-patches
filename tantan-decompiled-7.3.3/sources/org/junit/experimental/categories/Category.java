package org.junit.experimental.categories;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.junit.validator.ValidateWith;

/* JADX INFO: loaded from: classes3.dex */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@ValidateWith(CategoryValidator.class)
public @interface Category {
    Class<?>[] value();
}
