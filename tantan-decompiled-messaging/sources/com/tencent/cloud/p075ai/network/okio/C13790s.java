package com.tencent.cloud.p075ai.network.okio;

import p149l.x9g0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.s */
/* JADX INFO: loaded from: classes13.dex */
public final class C13790s {

    /* JADX INFO: renamed from: a */
    public final byte[] f57005a;

    /* JADX INFO: renamed from: b */
    public int f57006b;

    /* JADX INFO: renamed from: c */
    public int f57007c;

    /* JADX INFO: renamed from: d */
    public boolean f57008d;

    /* JADX INFO: renamed from: e */
    public boolean f57009e;

    /* JADX INFO: renamed from: f */
    public C13790s f57010f;

    /* JADX INFO: renamed from: g */
    public C13790s f57011g;

    public C13790s() {
        this.f57005a = new byte[8192];
        this.f57009e = true;
        this.f57008d = false;
    }

    /* JADX INFO: renamed from: a */
    public void m81973a(C13790s c13790s, int i) {
        if (!c13790s.f57009e) {
            x9g0.m207497a();
            return;
        }
        int i2 = c13790s.f57007c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c13790s.f57008d) {
                x9g0.m207497a();
                return;
            }
            int i4 = c13790s.f57006b;
            if (i3 - i4 > 8192) {
                x9g0.m207497a();
                return;
            }
            byte[] bArr = c13790s.f57005a;
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            c13790s.f57007c -= c13790s.f57006b;
            c13790s.f57006b = 0;
        }
        System.arraycopy(this.f57005a, this.f57006b, c13790s.f57005a, c13790s.f57007c, i);
        c13790s.f57007c += i;
        this.f57006b += i;
    }

    /* JADX INFO: renamed from: b */
    public C13790s m81974b() {
        this.f57008d = true;
        return new C13790s(this.f57005a, this.f57006b, this.f57007c, true, false);
    }

    public C13790s(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f57005a = bArr;
        this.f57006b = i;
        this.f57007c = i2;
        this.f57008d = z;
        this.f57009e = z2;
    }

    /* JADX INFO: renamed from: a */
    public C13790s m81972a(C13790s c13790s) {
        c13790s.f57011g = this;
        c13790s.f57010f = this.f57010f;
        this.f57010f.f57011g = c13790s;
        this.f57010f = c13790s;
        return c13790s;
    }

    /* JADX INFO: renamed from: a */
    public C13790s m81971a() {
        C13790s c13790s = this.f57010f;
        C13790s c13790s2 = c13790s != this ? c13790s : null;
        C13790s c13790s3 = this.f57011g;
        c13790s3.f57010f = c13790s;
        this.f57010f.f57011g = c13790s3;
        this.f57010f = null;
        this.f57011g = null;
        return c13790s2;
    }
}
