package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import p149l.j6f;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.u */
/* JADX INFO: loaded from: classes13.dex */
public final class C13748u {

    /* JADX INFO: renamed from: a */
    public int f56784a;

    /* JADX INFO: renamed from: b */
    public final int[] f56785b = new int[10];

    /* JADX INFO: renamed from: a */
    public C13748u m81781a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f56785b;
            if (i < iArr.length) {
                this.f56784a = (1 << i) | this.f56784a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: a */
    public int m81780a() {
        return (this.f56784a & 128) != 0 ? this.f56785b[7] : j6f.COLOR_SPACE_UNCALIBRATED;
    }
}
