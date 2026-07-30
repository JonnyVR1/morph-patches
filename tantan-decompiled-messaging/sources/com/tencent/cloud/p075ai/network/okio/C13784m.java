package com.tencent.cloud.p075ai.network.okio;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.m */
/* JADX INFO: loaded from: classes13.dex */
public class C13784m implements InterfaceC13793v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C13795x f56991a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OutputStream f56992b;

    public C13784m(C13795x c13795x, OutputStream outputStream) {
        this.f56991a = c13795x;
        this.f56992b = outputStream;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56992b.close();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Flushable
    public void flush() throws IOException {
        this.f56992b.flush();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
    public C13795x timeout() {
        return this.f56991a;
    }

    public String toString() {
        return "sink(" + this.f56992b + ")";
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
    public void write(C13776e c13776e, long j) throws IOException {
        C13796y.m81981a(c13776e.f56970b, 0L, j);
        while (j > 0) {
            this.f56991a.mo81955e();
            C13790s c13790s = c13776e.f56969a;
            int iMin = (int) Math.min(j, c13790s.f57007c - c13790s.f57006b);
            this.f56992b.write(c13790s.f57005a, c13790s.f57006b, iMin);
            int i = c13790s.f57006b + iMin;
            c13790s.f57006b = i;
            long j2 = iMin;
            j -= j2;
            c13776e.f56970b -= j2;
            if (i == c13790s.f57007c) {
                c13776e.f56969a = c13790s.m81971a();
                C13791t.m81976a(c13790s);
            }
        }
    }
}
