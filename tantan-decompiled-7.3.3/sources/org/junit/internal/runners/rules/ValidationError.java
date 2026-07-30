package org.junit.internal.runners.rules;

import java.lang.annotation.Annotation;
import org.junit.runners.model.FrameworkMember;

/* JADX INFO: loaded from: classes3.dex */
class ValidationError extends Exception {
    public ValidationError(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, String str) {
        super(String.format("The @%s '%s' %s", cls.getSimpleName(), frameworkMember.getName(), str));
    }
}
