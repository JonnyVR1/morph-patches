package com.google.common.base;

import java.io.Serializable;
import p149l.gaj;
import p149l.sf80;

/* JADX INFO: loaded from: classes7.dex */
class Functions$FunctionComposition<A, B, C> implements gaj<A, C>, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: f */
    private final gaj<A, ? extends B> f10615f;

    /* JADX INFO: renamed from: g */
    private final gaj<B, C> f10616g;

    public Functions$FunctionComposition(gaj<B, C> gajVar, gaj<A, ? extends B> gajVar2) {
        this.f10616g = (gaj) sf80.m183894p(gajVar);
        this.f10615f = (gaj) sf80.m183894p(gajVar2);
    }

    @Override // p149l.gaj
    public C apply(A a) {
        return (C) this.f10616g.apply(this.f10615f.apply(a));
    }

    @Override // p149l.gaj
    public boolean equals(Object obj) {
        if (obj instanceof Functions$FunctionComposition) {
            Functions$FunctionComposition functions$FunctionComposition = (Functions$FunctionComposition) obj;
            if (this.f10615f.equals(functions$FunctionComposition.f10615f) && this.f10616g.equals(functions$FunctionComposition.f10616g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f10616g.hashCode() ^ this.f10615f.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f10616g);
        String strValueOf2 = String.valueOf(this.f10615f);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 2 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
