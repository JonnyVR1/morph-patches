package com.vivo.push.p111b;

import com.tencent.connect.common.Constants;
import com.vivo.push.C14532a;

/* JADX INFO: renamed from: com.vivo.push.b.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C14543i extends C14553s {

    /* JADX INFO: renamed from: a */
    private String f60917a;

    /* JADX INFO: renamed from: b */
    private String f60918b;

    /* JADX INFO: renamed from: c */
    private String f60919c;

    public C14543i(int i) {
        super(i);
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        super.mo84743c(c14532a);
        c14532a.m84716a(Constants.JumpUrlConstants.URL_KEY_APPID, this.f60917a);
        c14532a.m84716a("client_id", this.f60918b);
        c14532a.m84716a("client_token", this.f60919c);
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        super.mo84744d(c14532a);
        this.f60917a = c14532a.m84712a(Constants.JumpUrlConstants.URL_KEY_APPID);
        this.f60918b = c14532a.m84712a("client_id");
        this.f60919c = c14532a.m84712a("client_token");
    }

    /* JADX INFO: renamed from: e */
    public final String m84755e() {
        return this.f60919c;
    }

    @Override // com.vivo.push.p111b.C14553s, com.vivo.push.AbstractC14621o
    public final String toString() {
        return "OnBindCommand";
    }

    /* JADX INFO: renamed from: d */
    public final String m84754d() {
        return this.f60917a;
    }
}
