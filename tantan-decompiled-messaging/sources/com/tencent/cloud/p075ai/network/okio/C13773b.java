package com.tencent.cloud.p075ai.network.okio;

import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.b */
/* JADX INFO: loaded from: classes13.dex */
public class C13773b implements InterfaceC13794w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC13794w f56958a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13774c f56959b;

    public C13773b(C13774c c13774c, InterfaceC13794w interfaceC13794w) {
        this.f56959b = c13774c;
        this.f56958a = interfaceC13794w;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
    /* JADX INFO: renamed from: a */
    public long mo81631a(C13776e c13776e, long j) throws IOException {
        this.f56959b.m81893h();
        try {
            try {
                long jMo81631a = this.f56958a.mo81631a(c13776e, j);
                this.f56959b.m81892a(true);
                return jMo81631a;
            } catch (IOException e) {
                C13774c c13774c = this.f56959b;
                if (c13774c.m81894i()) {
                    throw c13774c.mo81768a(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            this.f56959b.m81892a(false);
            throw th;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            try {
                this.f56958a.close();
                this.f56959b.m81892a(true);
            } catch (IOException e) {
                C13774c c13774c = this.f56959b;
                if (!c13774c.m81894i()) {
                    throw e;
                }
                throw c13774c.mo81768a(e);
            }
        } catch (Throwable th) {
            this.f56959b.m81892a(false);
            throw th;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
    public C13795x timeout() {
        return this.f56959b;
    }

    public String toString() {
        return "AsyncTimeout.source(" + this.f56958a + ")";
    }
}
