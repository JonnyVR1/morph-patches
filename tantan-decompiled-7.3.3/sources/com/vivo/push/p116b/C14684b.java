package com.vivo.push.p116b;

import com.tencent.connect.common.Constants;
import com.vivo.push.C14680a;

/* JADX INFO: renamed from: com.vivo.push.b.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C14684b extends C14685c {

    /* JADX INFO: renamed from: a */
    private String f61751a;

    /* JADX INFO: renamed from: b */
    private String f61752b;

    /* JADX INFO: renamed from: c */
    private String f61753c;

    /* JADX INFO: renamed from: d */
    private String f61754d;

    /* JADX INFO: renamed from: e */
    private boolean f61755e;

    public C14684b(boolean z, String str) {
        super(z ? 2006 : 2007, str);
        this.f61755e = false;
    }

    @Override // com.vivo.push.p116b.C14685c, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: c */
    public final void mo85914c(C14680a c14680a) {
        super.mo85914c(c14680a);
        c14680a.m85887a("sdk_clients", this.f61751a);
        c14680a.m85885a(Constants.JumpUrlConstants.URL_KEY_SDK_VERSION, 323L);
        c14680a.m85887a("BaseAppCommand.EXTRA_APPID", this.f61753c);
        c14680a.m85887a("BaseAppCommand.EXTRA_APPKEY", this.f61752b);
        c14680a.m85887a("PUSH_REGID", this.f61754d);
    }

    @Override // com.vivo.push.p116b.C14685c, com.vivo.push.AbstractC14769o
    /* JADX INFO: renamed from: d */
    public final void mo85915d(C14680a c14680a) {
        super.mo85915d(c14680a);
        this.f61751a = c14680a.m85883a("sdk_clients");
        this.f61753c = c14680a.m85883a("BaseAppCommand.EXTRA_APPID");
        this.f61752b = c14680a.m85883a("BaseAppCommand.EXTRA_APPKEY");
        this.f61754d = c14680a.m85883a("PUSH_REGID");
    }

    /* JADX INFO: renamed from: e */
    public final void m85917e() {
        this.f61752b = null;
    }

    @Override // com.vivo.push.p116b.C14685c, com.vivo.push.AbstractC14769o
    public final String toString() {
        return "AppCommand:" + m86104b();
    }

    /* JADX INFO: renamed from: d */
    public final void m85916d() {
        this.f61753c = null;
    }
}
