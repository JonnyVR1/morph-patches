package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okhttp3.internal.connection.C13716f;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.i */
/* JADX INFO: loaded from: classes13.dex */
public final class C13703i {

    /* JADX INFO: renamed from: a */
    public final C13716f f56452a;

    public C13703i(int i, long j, TimeUnit timeUnit) {
        this.f56452a = new C13716f(i, j, timeUnit);
    }

    public C13703i() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
