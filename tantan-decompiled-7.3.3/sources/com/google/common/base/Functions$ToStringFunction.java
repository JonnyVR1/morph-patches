package com.google.common.base;

import p153l.adj;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
enum Functions$ToStringFunction implements adj<Object, String> {
    INSTANCE;

    @Override // p153l.adj
    public String apply(Object obj) {
        xn80.m212111p(obj);
        return obj.toString();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "Functions.toStringFunction()";
    }
}
