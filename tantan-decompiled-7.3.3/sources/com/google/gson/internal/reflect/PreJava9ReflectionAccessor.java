package com.google.gson.internal.reflect;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: loaded from: classes7.dex */
final class PreJava9ReflectionAccessor extends ReflectionAccessor {
    @Override // com.google.gson.internal.reflect.ReflectionAccessor
    public void makeAccessible(AccessibleObject accessibleObject) {
        accessibleObject.setAccessible(true);
    }
}
