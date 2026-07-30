package com.tencent.cloud.p080ai.network.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p153l.fcg0;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.l */
/* JADX INFO: loaded from: classes12.dex */
public final class C13946l implements InterfaceC13957w {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13941g f57835a;

    /* JADX INFO: renamed from: b */
    public final Inflater f57836b;

    /* JADX INFO: renamed from: c */
    public int f57837c;

    /* JADX INFO: renamed from: d */
    public boolean f57838d;

    public C13946l(InterfaceC13941g interfaceC13941g, Inflater inflater) {
        if (inflater == null) {
            wg3.m206174a("inflater == null");
            throw null;
        }
        this.f57835a = interfaceC13941g;
        this.f57836b = inflater;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
    /* JADX INFO: renamed from: a */
    public long mo82814a(C13939e c13939e, long j) throws IOException {
        boolean z;
        if (j < 0) {
            fcg0.m125008a("byteCount < 0: ", j);
            return 0L;
        }
        if (this.f57838d) {
            wtq0.m207906a("closed");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        do {
            z = false;
            if (this.f57836b.needsInput()) {
                m83142k();
                if (this.f57836b.getRemaining() != 0) {
                    wtq0.m207906a("?");
                    return 0L;
                }
                if (this.f57835a.mo83118g()) {
                    z = true;
                } else {
                    C13953s c13953s = this.f57835a.mo83087a().f57817a;
                    int i = c13953s.f57855c;
                    int i2 = c13953s.f57854b;
                    int i3 = i - i2;
                    this.f57837c = i3;
                    this.f57836b.setInput(c13953s.f57853a, i2, i3);
                }
            }
            try {
                C13953s c13953sM83108d = c13939e.m83108d(1);
                int iInflate = this.f57836b.inflate(c13953sM83108d.f57853a, c13953sM83108d.f57855c, (int) Math.min(j, 8192 - c13953sM83108d.f57855c));
                if (iInflate > 0) {
                    c13953sM83108d.f57855c += iInflate;
                    long j2 = iInflate;
                    c13939e.f57818b += j2;
                    return j2;
                }
                if (!this.f57836b.finished() && !this.f57836b.needsDictionary()) {
                }
                m83142k();
                if (c13953sM83108d.f57854b != c13953sM83108d.f57855c) {
                    return -1L;
                }
                c13939e.f57817a = c13953sM83108d.m83154a();
                C13954t.m83159a(c13953sM83108d);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!z);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f57838d) {
            return;
        }
        this.f57836b.end();
        this.f57838d = true;
        this.f57835a.close();
    }

    /* JADX INFO: renamed from: k */
    public final void m83142k() {
        int i = this.f57837c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f57836b.getRemaining();
        this.f57837c -= remaining;
        this.f57835a.mo83110d(remaining);
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
    public C13958x timeout() {
        return this.f57835a.timeout();
    }
}
