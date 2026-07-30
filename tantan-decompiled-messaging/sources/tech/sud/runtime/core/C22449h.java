package tech.sud.runtime.core;

import tech.sud.runtime.p137a.InterfaceC22401b;

/* JADX INFO: renamed from: tech.sud.runtime.core.h */
/* JADX INFO: loaded from: classes3.dex */
public class C22449h {

    /* JADX INFO: renamed from: a */
    private InterfaceC22401b f207921a;

    public C22449h(InterfaceC22401b interfaceC22401b) {
        this.f207921a = interfaceC22401b;
    }

    public void onLog(int i, int i2, String str, String str2, String str3) {
        if (this.f207921a != null) {
            this.f207921a.mo212985a(i, i2, str == null ? null : new String(str), str2 == null ? null : new String(str2), str3 != null ? new String(str3) : null);
        }
    }
}
