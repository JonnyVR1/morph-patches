package com.google.common.base;

import java.io.Serializable;
import p153l.adj;
import p153l.xn80;

/* JADX INFO: loaded from: classes7.dex */
class Functions$FunctionComposition<A, B, C> implements adj<A, C>, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: f */
    private final adj<A, ? extends B> f10652f;

    /* JADX INFO: renamed from: g */
    private final adj<B, C> f10653g;

    public Functions$FunctionComposition(adj<B, C> adjVar, adj<A, ? extends B> adjVar2) {
        this.f10653g = (adj) xn80.m212111p(adjVar);
        this.f10652f = (adj) xn80.m212111p(adjVar2);
    }

    @Override // p153l.adj
    public C apply(A a) {
        return (C) this.f10653g.apply(this.f10652f.apply(a));
    }

    @Override // p153l.adj
    public boolean equals(Object obj) {
        if (obj instanceof Functions$FunctionComposition) {
            Functions$FunctionComposition functions$FunctionComposition = (Functions$FunctionComposition) obj;
            if (this.f10652f.equals(functions$FunctionComposition.f10652f) && this.f10653g.equals(functions$FunctionComposition.f10653g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f10653g.hashCode() ^ this.f10652f.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f10653g);
        String strValueOf2 = String.valueOf(this.f10652f);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 2 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append("(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
