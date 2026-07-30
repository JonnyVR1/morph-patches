package com.tencent.cloud.p080ai.network.okio;

import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.a */
/* JADX INFO: loaded from: classes12.dex */
public class C13935a implements InterfaceC13956v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC13956v f57804a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C13937c f57805b;

    public C13935a(C13937c c13937c, InterfaceC13956v interfaceC13956v) {
        this.f57805b = c13937c;
        this.f57804a = interfaceC13956v;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f57805b.m83076h();
        try {
            try {
                this.f57804a.close();
                this.f57805b.m83075a(true);
            } catch (IOException e) {
                C13937c c13937c = this.f57805b;
                if (!c13937c.m83077i()) {
                    throw e;
                }
                throw c13937c.mo82951a(e);
            }
        } catch (Throwable th) {
            this.f57805b.m83075a(false);
            throw th;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Flushable
    public void flush() throws IOException {
        this.f57805b.m83076h();
        try {
            try {
                this.f57804a.flush();
                this.f57805b.m83075a(true);
            } catch (IOException e) {
                C13937c c13937c = this.f57805b;
                if (!c13937c.m83077i()) {
                    throw e;
                }
                throw c13937c.mo82951a(e);
            }
        } catch (Throwable th) {
            this.f57805b.m83075a(false);
            throw th;
        }
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
    public C13958x timeout() {
        return this.f57805b;
    }

    public String toString() {
        return "AsyncTimeout.sink(" + this.f57804a + ")";
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
    public void write(C13939e c13939e, long j) throws IOException {
        C13959y.m83164a(c13939e.f57818b, 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            C13953s c13953s = c13939e.f57817a;
            while (j2 < 65536) {
                j2 += (long) (c13953s.f57855c - c13953s.f57854b);
                if (j2 >= j) {
                    j2 = j;
                    break;
                }
                c13953s = c13953s.f57858f;
            }
            this.f57805b.m83076h();
            try {
                try {
                    this.f57804a.write(c13939e, j2);
                    j -= j2;
                    this.f57805b.m83075a(true);
                } catch (IOException e) {
                    C13937c c13937c = this.f57805b;
                    if (!c13937c.m83077i()) {
                        throw e;
                    }
                    throw c13937c.mo82951a(e);
                }
            } catch (Throwable th) {
                this.f57805b.m83075a(false);
                throw th;
            }
        }
    }
}
