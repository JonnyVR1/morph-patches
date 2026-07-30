package tech.sud.runtime.core;

import tech.sud.runtime.p018a.InterfaceC1194b;

/* JADX INFO: renamed from: tech.sud.runtime.core.h */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1242h {

    /* JADX INFO: renamed from: a */
    private InterfaceC1194b f11546a;

    public C1242h(InterfaceC1194b interfaceC1194b) {
        this.f11546a = interfaceC1194b;
    }

    public void onLog(int i, int i2, String str, String str2, String str3) {
        if (this.f11546a != null) {
            this.f11546a.m10061a(i, i2, str == null ? null : new String(str), str2 == null ? null : new String(str2), str3 != null ? new String(str3) : null);
        }
    }
}
