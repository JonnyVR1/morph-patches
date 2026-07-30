package tech.sud.runtime.core;

import tech.sud.runtime.p141a.InterfaceC22516b;

/* JADX INFO: renamed from: tech.sud.runtime.core.h */
/* JADX INFO: loaded from: classes3.dex */
public class C22564h {

    /* JADX INFO: renamed from: a */
    private InterfaceC22516b f208843a;

    public C22564h(InterfaceC22516b interfaceC22516b) {
        this.f208843a = interfaceC22516b;
    }

    public void onLog(int i, int i2, String str, String str2, String str3) {
        if (this.f208843a != null) {
            this.f208843a.mo130009a(i, i2, str == null ? null : new String(str), str2 == null ? null : new String(str2), str3 != null ? new String(str3) : null);
        }
    }
}
