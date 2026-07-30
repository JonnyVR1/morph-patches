package com.tencent.cloud.p080ai.network.okio;

import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.b */
/* JADX INFO: loaded from: classes12.dex */
public class C13936b implements InterfaceC13957w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC13957w f57806a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13937c f57807b;

    public C13936b(C13937c c13937c, InterfaceC13957w interfaceC13957w) {
        this.f57807b = c13937c;
        this.f57806a = interfaceC13957w;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
    /* JADX INFO: renamed from: a */
    public long mo82814a(C13939e c13939e, long j) throws IOException {
        this.f57807b.m83076h();
        try {
            try {
                long jMo82814a = this.f57806a.mo82814a(c13939e, j);
                this.f57807b.m83075a(true);
                return jMo82814a;
            } catch (IOException e) {
                C13937c c13937c = this.f57807b;
                if (c13937c.m83077i()) {
                    throw c13937c.mo82951a(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            this.f57807b.m83075a(false);
            throw th;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            try {
                this.f57806a.close();
                this.f57807b.m83075a(true);
            } catch (IOException e) {
                C13937c c13937c = this.f57807b;
                if (!c13937c.m83077i()) {
                    throw e;
                }
                throw c13937c.mo82951a(e);
            }
        } catch (Throwable th) {
            this.f57807b.m83075a(false);
            throw th;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
    public C13958x timeout() {
        return this.f57807b;
    }

    public String toString() {
        return "AsyncTimeout.source(" + this.f57806a + ")";
    }
}
