package com.vivo.push.p111b;

import com.vivo.push.AbstractC14621o;
import com.vivo.push.C14532a;

/* JADX INFO: renamed from: com.vivo.push.b.s */
/* JADX INFO: loaded from: classes2.dex */
public class C14553s extends AbstractC14621o {

    /* JADX INFO: renamed from: a */
    private String f60936a;

    /* JADX INFO: renamed from: b */
    private int f60937b;

    public C14553s(int i) {
        super(i);
        this.f60936a = null;
        this.f60937b = 0;
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public void mo84743c(C14532a c14532a) {
        c14532a.m84716a("req_id", this.f60936a);
        c14532a.m84713a("status_msg_code", this.f60937b);
    }

    @Override // com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public void mo84744d(C14532a c14532a) {
        this.f60936a = c14532a.m84712a("req_id");
        this.f60937b = c14532a.m84720b("status_msg_code", this.f60937b);
    }

    /* JADX INFO: renamed from: g */
    public final String m84774g() {
        return this.f60936a;
    }

    /* JADX INFO: renamed from: h */
    public final int m84775h() {
        return this.f60937b;
    }

    @Override // com.vivo.push.AbstractC14621o
    public String toString() {
        return "OnReceiveCommand";
    }
}
