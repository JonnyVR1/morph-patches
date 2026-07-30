package com.tencent.open.p104a;

import java.io.IOException;
import p149l.exc0;
import p149l.gxc0;

/* JADX INFO: renamed from: com.tencent.open.a.d */
/* JADX INFO: loaded from: classes2.dex */
class C14353d implements InterfaceC14356g {

    /* JADX INFO: renamed from: a */
    private exc0 f60178a;

    /* JADX INFO: renamed from: b */
    private String f60179b = null;

    /* JADX INFO: renamed from: c */
    private int f60180c;

    /* JADX INFO: renamed from: d */
    private int f60181d;

    /* JADX INFO: renamed from: e */
    private int f60182e;

    public C14353d(exc0 exc0Var, int i) {
        this.f60178a = exc0Var;
        this.f60181d = i;
        this.f60180c = exc0Var.m118609q();
        gxc0 gxc0VarM118606k = this.f60178a.m118606k();
        if (gxc0VarM118606k != null) {
            this.f60182e = (int) gxc0VarM118606k.contentLength();
        } else {
            this.f60182e = 0;
        }
    }

    @Override // com.tencent.open.p104a.InterfaceC14356g
    /* JADX INFO: renamed from: a */
    public String mo84221a() throws IOException {
        if (this.f60179b == null) {
            gxc0 gxc0VarM118606k = this.f60178a.m118606k();
            if (gxc0VarM118606k != null) {
                this.f60179b = gxc0VarM118606k.string();
            }
            if (this.f60179b == null) {
                this.f60179b = "";
            }
        }
        return this.f60179b;
    }

    @Override // com.tencent.open.p104a.InterfaceC14356g
    /* JADX INFO: renamed from: b */
    public int mo84222b() {
        return this.f60182e;
    }

    @Override // com.tencent.open.p104a.InterfaceC14356g
    /* JADX INFO: renamed from: c */
    public int mo84223c() {
        return this.f60181d;
    }

    @Override // com.tencent.open.p104a.InterfaceC14356g
    /* JADX INFO: renamed from: d */
    public int mo84224d() {
        return this.f60180c;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + hashCode() + this.f60179b + this.f60180c + this.f60181d + this.f60182e;
    }
}
