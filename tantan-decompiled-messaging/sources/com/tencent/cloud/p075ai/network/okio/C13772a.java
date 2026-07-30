package com.tencent.cloud.p075ai.network.okio;

import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.a */
/* JADX INFO: loaded from: classes13.dex */
public class C13772a implements InterfaceC13793v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC13793v f56956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13774c f56957b;

    public C13772a(C13774c c13774c, InterfaceC13793v interfaceC13793v) {
        this.f56957b = c13774c;
        this.f56956a = interfaceC13793v;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56957b.m81893h();
        try {
            try {
                this.f56956a.close();
                this.f56957b.m81892a(true);
            } catch (IOException e) {
                C13774c c13774c = this.f56957b;
                if (!c13774c.m81894i()) {
                    throw e;
                }
                throw c13774c.mo81768a(e);
            }
        } catch (Throwable th) {
            this.f56957b.m81892a(false);
            throw th;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Flushable
    public void flush() throws IOException {
        this.f56957b.m81893h();
        try {
            try {
                this.f56956a.flush();
                this.f56957b.m81892a(true);
            } catch (IOException e) {
                C13774c c13774c = this.f56957b;
                if (!c13774c.m81894i()) {
                    throw e;
                }
                throw c13774c.mo81768a(e);
            }
        } catch (Throwable th) {
            this.f56957b.m81892a(false);
            throw th;
        }
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
    public C13795x timeout() {
        return this.f56957b;
    }

    public String toString() {
        return "AsyncTimeout.sink(" + this.f56956a + ")";
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
    public void write(C13776e c13776e, long j) throws IOException {
        C13796y.m81981a(c13776e.f56970b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            C13790s c13790s = c13776e.f56969a;
            while (j2 < 65536) {
                j2 += (long) (c13790s.f57007c - c13790s.f57006b);
                if (j2 >= j) {
                    j2 = j;
                    break;
                }
                c13790s = c13790s.f57010f;
            }
            this.f56957b.m81893h();
            try {
                try {
                    this.f56956a.write(c13776e, j2);
                    j -= j2;
                    this.f56957b.m81892a(true);
                } catch (IOException e) {
                    C13774c c13774c = this.f56957b;
                    if (!c13774c.m81894i()) {
                        throw e;
                    }
                    throw c13774c.mo81768a(e);
                }
            } catch (Throwable th) {
                this.f56957b.m81892a(false);
                throw th;
            }
        }
    }
}
