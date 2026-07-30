package com.google.common.base;

import p153l.adj;

/* JADX INFO: loaded from: classes7.dex */
enum Functions$IdentityFunction implements adj<Object, Object> {
    INSTANCE;

    @Override // p153l.adj
    public Object apply(Object obj) {
        return obj;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Functions.identity()";
    }
}
