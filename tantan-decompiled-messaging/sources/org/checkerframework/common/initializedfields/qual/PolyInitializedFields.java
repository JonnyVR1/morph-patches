package org.checkerframework.common.initializedfields.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.PolymorphicQualifier;

/* JADX INFO: loaded from: classes2.dex */
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@PolymorphicQualifier(InitializedFields.class)
public @interface PolyInitializedFields {
}
