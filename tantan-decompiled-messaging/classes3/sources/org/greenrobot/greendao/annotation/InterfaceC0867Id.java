package org.greenrobot.greendao.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: org.greenrobot.greendao.annotation.Id */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.SOURCE)
public @interface InterfaceC0867Id {
    boolean autoincrement() default false;
}
