package com.tencent.cloud.p075ai.network.okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p149l.hg3;
import p149l.ig3;
import p149l.rhg0;
import p149l.y3g0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.k */
/* JADX INFO: loaded from: classes13.dex */
public final class C13782k implements InterfaceC13794w {

    /* JADX INFO: renamed from: b */
    public final InterfaceC13778g f56983b;

    /* JADX INFO: renamed from: c */
    public final Inflater f56984c;

    /* JADX INFO: renamed from: d */
    public final C13783l f56985d;

    /* JADX INFO: renamed from: a */
    public int f56982a = 0;

    /* JADX INFO: renamed from: e */
    public final CRC32 f56986e = new CRC32();

    public C13782k(InterfaceC13794w interfaceC13794w) {
        if (interfaceC13794w == null) {
            ig3.m135964a("source == null");
            throw null;
        }
        Inflater inflater = new Inflater(true);
        this.f56984c = inflater;
        InterfaceC13778g interfaceC13778gM81961a = C13785n.m81961a(interfaceC13794w);
        this.f56983b = interfaceC13778gM81961a;
        this.f56985d = new C13783l(interfaceC13778gM81961a, inflater);
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
    /* JADX INFO: renamed from: a */
    public long mo81631a(C13776e c13776e, long j) throws IOException {
        if (j < 0) {
            y3g0.m212802a("byteCount < 0: ", j);
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        if (this.f56982a == 0) {
            this.f56983b.mo81933f(10L);
            byte bM81937h = this.f56983b.mo81904a().m81937h(3L);
            boolean z = ((bM81937h >> 1) & 1) == 1;
            if (z) {
                m81957a(this.f56983b.mo81904a(), 0L, 10L);
            }
            m81958a("ID1ID2", 8075, this.f56983b.readShort());
            this.f56983b.mo81927d(8L);
            if (((bM81937h >> 2) & 1) == 1) {
                this.f56983b.mo81933f(2L);
                if (z) {
                    m81957a(this.f56983b.mo81904a(), 0L, 2L);
                }
                long jM81980a = C13796y.m81980a(this.f56983b.mo81904a().readShort());
                this.f56983b.mo81933f(jM81980a);
                if (z) {
                    m81957a(this.f56983b.mo81904a(), 0L, jM81980a);
                }
                this.f56983b.mo81927d(jM81980a);
            }
            if (((bM81937h >> 3) & 1) == 1) {
                long jMo81898a = this.f56983b.mo81898a((byte) 0);
                if (jMo81898a == -1) {
                    hg3.m130807a();
                    return 0L;
                }
                if (z) {
                    m81957a(this.f56983b.mo81904a(), 0L, jMo81898a + 1);
                }
                this.f56983b.mo81927d(jMo81898a + 1);
            }
            if (((bM81937h >> 4) & 1) == 1) {
                long jMo81898a2 = this.f56983b.mo81898a((byte) 0);
                if (jMo81898a2 == -1) {
                    hg3.m130807a();
                    return 0L;
                }
                if (z) {
                    m81957a(this.f56983b.mo81904a(), 0L, jMo81898a2 + 1);
                }
                this.f56983b.mo81927d(jMo81898a2 + 1);
            }
            if (z) {
                m81958a("FHCRC", this.f56983b.mo81943j(), (short) this.f56986e.getValue());
                this.f56986e.reset();
            }
            this.f56982a = 1;
        }
        if (this.f56982a == 1) {
            long j2 = c13776e.f56970b;
            long jMo81631a = this.f56985d.mo81631a(c13776e, j);
            if (jMo81631a != -1) {
                m81957a(c13776e, j2, jMo81631a);
                return jMo81631a;
            }
            this.f56982a = 2;
        }
        if (this.f56982a == 2) {
            m81958a("CRC", this.f56983b.mo81914b(), (int) this.f56986e.getValue());
            m81958a("ISIZE", this.f56983b.mo81914b(), (int) this.f56984c.getBytesWritten());
            this.f56982a = 3;
            if (!this.f56983b.mo81935g()) {
                rhg0.m179353a("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f56985d.close();
    }

    @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13794w
    public C13795x timeout() {
        return this.f56983b.timeout();
    }

    /* JADX INFO: renamed from: a */
    public final void m81957a(C13776e c13776e, long j, long j2) {
        C13790s c13790s = c13776e.f56969a;
        while (true) {
            long j3 = c13790s.f57007c - c13790s.f57006b;
            if (j < j3) {
                break;
            }
            j -= j3;
            c13790s = c13790s.f57010f;
        }
        while (j2 > 0) {
            int i = (int) (((long) c13790s.f57006b) + j);
            int iMin = (int) Math.min(c13790s.f57007c - i, j2);
            this.f56986e.update(c13790s.f57005a, i, iMin);
            j2 -= (long) iMin;
            c13790s = c13790s.f57010f;
            j = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m81958a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
