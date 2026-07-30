package com.google.common.base;

import p149l.gaj;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
enum Functions$ToStringFunction implements gaj<Object, String> {
    INSTANCE;

    @Override // p149l.gaj
    public String apply(Object obj) {
        sf80.m183894p(obj);
        return obj.toString();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Functions.toStringFunction()";
    }
}
