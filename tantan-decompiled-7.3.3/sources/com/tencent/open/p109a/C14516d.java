package com.tencent.open.p109a;

import java.io.IOException;
import p153l.i5d0;
import p153l.k5d0;

/* JADX INFO: renamed from: com.tencent.open.a.d */
/* JADX INFO: loaded from: classes2.dex */
class C14516d implements InterfaceC14519g {

    /* JADX INFO: renamed from: a */
    private i5d0 f61026a;

    /* JADX INFO: renamed from: b */
    private String f61027b = null;

    /* JADX INFO: renamed from: c */
    private int f61028c;

    /* JADX INFO: renamed from: d */
    private int f61029d;

    /* JADX INFO: renamed from: e */
    private int f61030e;

    public C14516d(i5d0 i5d0Var, int i) {
        this.f61026a = i5d0Var;
        this.f61029d = i;
        this.f61028c = i5d0Var.m138673q();
        k5d0 k5d0VarM138670k = this.f61026a.m138670k();
        if (k5d0VarM138670k != null) {
            this.f61030e = (int) k5d0VarM138670k.contentLength();
        } else {
            this.f61030e = 0;
        }
    }

    @Override // com.tencent.open.p109a.InterfaceC14519g
    /* JADX INFO: renamed from: a */
    public String mo85404a() throws IOException {
        if (this.f61027b == null) {
            k5d0 k5d0VarM138670k = this.f61026a.m138670k();
            if (k5d0VarM138670k != null) {
                this.f61027b = k5d0VarM138670k.string();
            }
            if (this.f61027b == null) {
                this.f61027b = "";
            }
        }
        return this.f61027b;
    }

    @Override // com.tencent.open.p109a.InterfaceC14519g
    /* JADX INFO: renamed from: b */
    public int mo85405b() {
        return this.f61030e;
    }

    @Override // com.tencent.open.p109a.InterfaceC14519g
    /* JADX INFO: renamed from: c */
    public int mo85406c() {
        return this.f61029d;
    }

    @Override // com.tencent.open.p109a.InterfaceC14519g
    /* JADX INFO: renamed from: d */
    public int mo85407d() {
        return this.f61028c;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + hashCode() + this.f61027b + this.f61028c + this.f61029d + this.f61030e;
    }
}
