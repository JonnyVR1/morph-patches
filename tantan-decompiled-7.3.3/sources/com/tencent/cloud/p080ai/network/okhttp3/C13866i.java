package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okhttp3.internal.connection.C13879f;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.i */
/* JADX INFO: loaded from: classes12.dex */
public final class C13866i {

    /* JADX INFO: renamed from: a */
    public final C13879f f57300a;

    public C13866i(int i, long j, TimeUnit timeUnit) {
        this.f57300a = new C13879f(i, j, timeUnit);
    }

    public C13866i() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
