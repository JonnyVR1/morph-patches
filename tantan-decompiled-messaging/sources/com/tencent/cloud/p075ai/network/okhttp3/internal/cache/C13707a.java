package com.tencent.cloud.p075ai.network.okhttp3.internal.cache;

import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.cloud.p075ai.network.okio.C13795x;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13777f;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13778g;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13794w;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.cache.a */
/* JADX INFO: loaded from: classes13.dex */
public class C13707a implements InterfaceC13794w {

    /* JADX INFO: renamed from: a */
    public boolean f56467a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC13778g f56468b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC13708b f56469c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC13777f f56470d;

    public C13707a(CacheInterceptor cacheInterceptor, InterfaceC13778g interfaceC13778g, InterfaceC13708b interfaceC13708b, InterfaceC13777f interfaceC13777f) {
        this.f56468b = interfaceC13778g;
        this.f56469c = interfaceC13708b;
        this.f56470d = interfaceC13777f;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
    /* JADX INFO: renamed from: a */
    public long mo81631a(C13776e c13776e, long j) throws IOException {
        try {
            long jMo81631a = this.f56468b.mo81631a(c13776e, j);
            if (jMo81631a != -1) {
                c13776e.m81905a(this.f56470d.mo81904a(), c13776e.f56970b - jMo81631a, jMo81631a);
                this.f56470d.mo81932f();
                return jMo81631a;
            }
            if (!this.f56467a) {
                this.f56467a = true;
                this.f56470d.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.f56467a) {
                throw e;
            }
            this.f56467a = true;
            this.f56469c.m81633b();
            throw e;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f56467a && !C13706c.m81618a(this, 100, TimeUnit.MILLISECONDS)) {
            this.f56467a = true;
            this.f56469c.m81633b();
        }
        this.f56468b.close();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
    public C13795x timeout() {
        return this.f56468b.timeout();
    }
}
