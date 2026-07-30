package org.aspectj.lang.reflect;

/* JADX INFO: loaded from: classes2.dex */
public interface InterTypeDeclaration {
    AjType<?> getDeclaringType();

    int getModifiers();

    AjType<?> getTargetType() throws ClassNotFoundException;
}
