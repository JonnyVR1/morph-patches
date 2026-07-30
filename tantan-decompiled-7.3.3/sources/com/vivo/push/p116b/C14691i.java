package com.vivo.push.p116b;

import com.tencent.connect.common.Constants;
import com.vivo.push.C14680a;

/* JADX INFO: renamed from: com.vivo.push.b.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C14691i extends C14701s {

    /* JADX INFO: renamed from: a */
    private String f61764a;

    /* JADX INFO: renamed from: b */
    private String f61765b;

    /* JADX INFO: renamed from: c */
    private String f61766c;

    public C14691i(int i) {
        super(i);
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        super.mo85914c(c14680a);
        c14680a.m85887a(Constants.JumpUrlConstants.URL_KEY_APPID, this.f61764a);
        c14680a.m85887a("client_id", this.f61765b);
        c14680a.m85887a("client_token", this.f61766c);
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        super.mo85915d(c14680a);
        this.f61764a = c14680a.m85883a(Constants.JumpUrlConstants.URL_KEY_APPID);
        this.f61765b = c14680a.m85883a("client_id");
        this.f61766c = c14680a.m85883a("client_token");
    }

    /* JADX INFO: renamed from: e */
    public final String m85926e() {
        return this.f61766c;
    }

    @Override // com.vivo.push.p116b.C14701s, com.vivo.push.AbstractC14769o
    public final String toString() {
        return "OnBindCommand";
    }

    /* JADX INFO: renamed from: d */
    public final String m85925d() {
        return this.f61764a;
    }
}
