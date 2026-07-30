package com.tencent.liteav.basic.license;

import android.content.Context;

/* JADX INFO: renamed from: com.tencent.liteav.basic.license.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14199g implements InterfaceC14197e {

    /* JADX INFO: renamed from: a */
    private Context f59291a;

    public C14199g(Context context) {
        this.f59291a = context;
    }

    @Override // com.tencent.liteav.basic.license.InterfaceC14197e
    /* JADX INFO: renamed from: a */
    public boolean mo84144a() {
        if (this.f59291a != null) {
            LicenceCheck.m84107a().m84134a((C14198f) null, this.f59291a);
        }
        return LicenceCheck.m84107a().m84138b() >= 2;
    }
}
