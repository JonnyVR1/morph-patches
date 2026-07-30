package com.google.common.base;

import p149l.gaj;

/* JADX INFO: loaded from: classes7.dex */
enum Functions$IdentityFunction implements gaj<Object, Object> {
    INSTANCE;

    @Override // p149l.gaj
    public Object apply(Object obj) {
        return obj;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Functions.identity()";
    }
}
