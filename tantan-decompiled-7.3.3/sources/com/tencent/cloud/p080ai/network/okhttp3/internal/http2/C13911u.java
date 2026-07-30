package com.tencent.cloud.p080ai.network.okhttp3.internal.http2;

import p153l.p7f;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.u */
/* JADX INFO: loaded from: classes12.dex */
public final class C13911u {

    /* JADX INFO: renamed from: a */
    public int f57632a;

    /* JADX INFO: renamed from: b */
    public final int[] f57633b = new int[10];

    /* JADX INFO: renamed from: a */
    public C13911u m82964a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f57633b;
            if (i < iArr.length) {
                this.f57632a = (1 << i) | this.f57632a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public int m82963a() {
        return (this.f57632a & 128) != 0 ? this.f57633b[7] : p7f.COLOR_SPACE_UNCALIBRATED;
    }
}
