package org.aspectj.lang.reflect;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public interface AdviceSignature extends CodeSignature {
    Method getAdvice();

    Class getReturnType();
}
