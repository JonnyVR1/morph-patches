package com.tencent.cloud.p080ai.network.okhttp3.internal.cache;

import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import com.tencent.cloud.p080ai.network.okio.C13958x;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13940f;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13941g;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13957w;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.cache.a */
/* JADX INFO: loaded from: classes12.dex */
public class C13870a implements InterfaceC13957w {

    /* JADX INFO: renamed from: a */
    public boolean f57315a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC13941g f57316b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC13871b f57317c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC13940f f57318d;

    public C13870a(CacheInterceptor cacheInterceptor, InterfaceC13941g interfaceC13941g, InterfaceC13871b interfaceC13871b, InterfaceC13940f interfaceC13940f) {
        this.f57316b = interfaceC13941g;
        this.f57317c = interfaceC13871b;
        this.f57318d = interfaceC13940f;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
    /* JADX INFO: renamed from: a */
    public long mo82814a(C13939e c13939e, long j) throws IOException {
        try {
            long jMo82814a = this.f57316b.mo82814a(c13939e, j);
            if (jMo82814a != -1) {
                c13939e.m83088a(this.f57318d.mo83087a(), c13939e.f57818b - jMo82814a, jMo82814a);
                this.f57318d.mo83115f();
                return jMo82814a;
            }
            if (!this.f57315a) {
                this.f57315a = true;
                this.f57318d.close();
            }
            return -1L;
        } catch (IOException e) {
            if (this.f57315a) {
                throw e;
            }
            this.f57315a = true;
            this.f57317c.m82816b();
            throw e;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f57315a && !C13869c.m82801a(this, 100, TimeUnit.MILLISECONDS)) {
            this.f57315a = true;
            this.f57317c.m82816b();
        }
        this.f57316b.close();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
    public C13958x timeout() {
        return this.f57316b.timeout();
    }
}
