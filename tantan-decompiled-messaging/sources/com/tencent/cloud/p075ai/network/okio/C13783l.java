package com.tencent.cloud.p075ai.network.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p149l.ig3;
import p149l.qkq0;
import p149l.y3g0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.l */
/* JADX INFO: loaded from: classes13.dex */
public final class C13783l implements InterfaceC13794w {

    /* JADX INFO: renamed from: a */
    public final InterfaceC13778g f56987a;

    /* JADX INFO: renamed from: b */
    public final Inflater f56988b;

    /* JADX INFO: renamed from: c */
    public int f56989c;

    /* JADX INFO: renamed from: d */
    public boolean f56990d;

    public C13783l(InterfaceC13778g interfaceC13778g, Inflater inflater) {
        if (inflater == null) {
            ig3.m135964a("inflater == null");
            throw null;
        }
        this.f56987a = interfaceC13778g;
        this.f56988b = inflater;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
    /* JADX INFO: renamed from: a */
    public long mo81631a(C13776e c13776e, long j) throws IOException {
        boolean z;
        if (j < 0) {
            y3g0.m212802a("byteCount < 0: ", j);
            return 0L;
        }
        if (this.f56990d) {
            qkq0.m175383a("closed");
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        do {
            z = false;
            if (this.f56988b.needsInput()) {
                m81959k();
                if (this.f56988b.getRemaining() != 0) {
                    qkq0.m175383a("?");
                    return 0L;
                }
                if (this.f56987a.mo81935g()) {
                    z = true;
                } else {
                    C13790s c13790s = this.f56987a.mo81904a().f56969a;
                    int i = c13790s.f57007c;
                    int i2 = c13790s.f57006b;
                    int i3 = i - i2;
                    this.f56989c = i3;
                    this.f56988b.setInput(c13790s.f57005a, i2, i3);
                }
            }
            try {
                C13790s c13790sM81925d = c13776e.m81925d(1);
                int iInflate = this.f56988b.inflate(c13790sM81925d.f57005a, c13790sM81925d.f57007c, (int) Math.min(j, 8192 - c13790sM81925d.f57007c));
                if (iInflate > 0) {
                    c13790sM81925d.f57007c += iInflate;
                    long j2 = iInflate;
                    c13776e.f56970b += j2;
                    return j2;
                }
                if (!this.f56988b.finished() && !this.f56988b.needsDictionary()) {
                }
                m81959k();
                if (c13790sM81925d.f57006b != c13790sM81925d.f57007c) {
                    return -1L;
                }
                c13776e.f56969a = c13790sM81925d.m81971a();
                C13791t.m81976a(c13790sM81925d);
                return -1L;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } while (!z);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f56990d) {
            return;
        }
        this.f56988b.end();
        this.f56990d = true;
        this.f56987a.close();
    }

    /* JADX INFO: renamed from: k */
    public final void m81959k() {
        int i = this.f56989c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.f56988b.getRemaining();
        this.f56989c -= remaining;
        this.f56987a.mo81927d(remaining);
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
    public C13795x timeout() {
        return this.f56987a.timeout();
    }
}
