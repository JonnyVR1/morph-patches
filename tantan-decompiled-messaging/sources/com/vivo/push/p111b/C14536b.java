package com.vivo.push.p111b;

import com.tencent.connect.common.Constants;
import com.vivo.push.C14532a;

/* JADX INFO: renamed from: com.vivo.push.b.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C14536b extends C14537c {

    /* JADX INFO: renamed from: a */
    private String f60904a;

    /* JADX INFO: renamed from: b */
    private String f60905b;

    /* JADX INFO: renamed from: c */
    private String f60906c;

    /* JADX INFO: renamed from: d */
    private String f60907d;

    /* JADX INFO: renamed from: e */
    private boolean f60908e;

    public C14536b(boolean z, String str) {
        super(z ? 2006 : 2007, str);
        this.f60908e = false;
    }

    @Override // com.vivo.push.p111b.C14537c, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: c */
    public final void mo84743c(C14532a c14532a) {
        super.mo84743c(c14532a);
        c14532a.m84716a("sdk_clients", this.f60904a);
        c14532a.m84714a(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, 323L);
        c14532a.m84716a("BaseAppCommand.EXTRA_APPID", this.f60906c);
        c14532a.m84716a("BaseAppCommand.EXTRA_APPKEY", this.f60905b);
        c14532a.m84716a("PUSH_REGID", this.f60907d);
    }

    @Override // com.vivo.push.p111b.C14537c, com.vivo.push.AbstractC14621o
    /* JADX INFO: renamed from: d */
    public final void mo84744d(C14532a c14532a) {
        super.mo84744d(c14532a);
        this.f60904a = c14532a.m84712a("sdk_clients");
        this.f60906c = c14532a.m84712a("BaseAppCommand.EXTRA_APPID");
        this.f60905b = c14532a.m84712a("BaseAppCommand.EXTRA_APPKEY");
        this.f60907d = c14532a.m84712a("PUSH_REGID");
    }

    /* JADX INFO: renamed from: e */
    public final void m84746e() {
        this.f60905b = null;
    }

    @Override // com.vivo.push.p111b.C14537c, com.vivo.push.AbstractC14621o
    public final String toString() {
        return "AppCommand:" + m84933b();
    }

    /* JADX INFO: renamed from: d */
    public final void m84745d() {
        this.f60906c = null;
    }
}
