package com.tencent.cloud.p080ai.network.okio;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.m */
/* JADX INFO: loaded from: classes12.dex */
public class C13947m implements InterfaceC13956v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13958x f57839a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OutputStream f57840b;

    public C13947m(C13958x c13958x, OutputStream outputStream) {
        this.f57839a = c13958x;
        this.f57840b = outputStream;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f57840b.close();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Flushable
    public void flush() throws IOException {
        this.f57840b.flush();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
    public C13958x timeout() {
        return this.f57839a;
    }

    public String toString() {
        return "sink(" + this.f57840b + ")";
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
    public void write(C13939e c13939e, long j) throws IOException {
        C13959y.m83164a(c13939e.f57818b, 0L, j);
        while (j > 0) {
            this.f57839a.mo83138e();
            C13953s c13953s = c13939e.f57817a;
            int iMin = (int) Math.min(j, c13953s.f57855c - c13953s.f57854b);
            this.f57840b.write(c13953s.f57853a, c13953s.f57854b, iMin);
            int i = c13953s.f57854b + iMin;
            c13953s.f57854b = i;
            long j2 = iMin;
            j -= j2;
            c13939e.f57818b -= j2;
            if (i == c13953s.f57855c) {
                c13939e.f57817a = c13953s.m83154a();
                C13954t.m83159a(c13953s);
            }
        }
    }
}
