package com.tencent.liteav.basic.license;

import android.content.Context;

/* JADX INFO: renamed from: com.tencent.liteav.basic.license.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14036g implements InterfaceC14034e {

    /* JADX INFO: renamed from: a */
    private Context f58443a;

    public C14036g(Context context) {
        this.f58443a = context;
    }

    @Override // com.tencent.liteav.basic.license.InterfaceC14034e
    /* JADX INFO: renamed from: a */
    public boolean mo82961a() {
        if (this.f58443a != null) {
            LicenceCheck.m82924a().m82951a((C14035f) null, this.f58443a);
        }
        return LicenceCheck.m82924a().m82955b() >= 2;
    }
}
