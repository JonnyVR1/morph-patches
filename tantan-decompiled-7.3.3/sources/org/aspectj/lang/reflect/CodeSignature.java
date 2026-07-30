package org.aspectj.lang.reflect;

/* JADX INFO: loaded from: classes2.dex */
public interface CodeSignature extends MemberSignature {
    Class[] getExceptionTypes();

    String[] getParameterNames();

    Class[] getParameterTypes();
}
