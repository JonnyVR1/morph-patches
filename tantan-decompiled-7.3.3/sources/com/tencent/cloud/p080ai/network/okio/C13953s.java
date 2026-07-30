package com.tencent.cloud.p080ai.network.okio;

import p153l.fig0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.s */
/* JADX INFO: loaded from: classes12.dex */
public final class C13953s {

    /* JADX INFO: renamed from: a */
    public final byte[] f57853a;

    /* JADX INFO: renamed from: b */
    public int f57854b;

    /* JADX INFO: renamed from: c */
    public int f57855c;

    /* JADX INFO: renamed from: d */
    public boolean f57856d;

    /* JADX INFO: renamed from: e */
    public boolean f57857e;

    /* JADX INFO: renamed from: f */
    public C13953s f57858f;

    /* JADX INFO: renamed from: g */
    public C13953s f57859g;

    public C13953s() {
        this.f57853a = new byte[8192];
        this.f57857e = true;
        this.f57856d = false;
    }

    /* JADX INFO: renamed from: a */
    public void m83156a(C13953s c13953s, int i) {
        if (!c13953s.f57857e) {
            fig0.m125680a();
            return;
        }
        int i2 = c13953s.f57855c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c13953s.f57856d) {
                fig0.m125680a();
                return;
            }
            int i4 = c13953s.f57854b;
            if (i3 - i4 > 8192) {
                fig0.m125680a();
                return;
            }
            byte[] bArr = c13953s.f57853a;
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            c13953s.f57855c -= c13953s.f57854b;
            c13953s.f57854b = 0;
        }
        System.arraycopy(this.f57853a, this.f57854b, c13953s.f57853a, c13953s.f57855c, i);
        c13953s.f57855c += i;
        this.f57854b += i;
    }

    /* JADX INFO: renamed from: b */
    public C13953s m83157b() {
        this.f57856d = true;
        return new C13953s(this.f57853a, this.f57854b, this.f57855c, true, false);
    }

    public C13953s(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f57853a = bArr;
        this.f57854b = i;
        this.f57855c = i2;
        this.f57856d = z;
        this.f57857e = z2;
    }

    /* JADX INFO: renamed from: a */
    public C13953s m83155a(C13953s c13953s) {
        c13953s.f57859g = this;
        c13953s.f57858f = this.f57858f;
        this.f57858f.f57859g = c13953s;
        this.f57858f = c13953s;
        return c13953s;
    }

    /* JADX INFO: renamed from: a */
    public C13953s m83154a() {
        C13953s c13953s = this.f57858f;
        C13953s c13953s2 = c13953s != this ? c13953s : null;
        C13953s c13953s3 = this.f57859g;
        c13953s3.f57858f = c13953s;
        this.f57858f.f57859g = c13953s3;
        this.f57858f = null;
        this.f57859g = null;
        return c13953s2;
    }
}
