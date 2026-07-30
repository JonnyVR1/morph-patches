package com.tencent.cloud.p080ai.network.okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p153l.fcg0;
import p153l.vg3;
import p153l.wg3;
import p153l.zpg0;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.k */
/* JADX INFO: loaded from: classes12.dex */
public final class C13945k implements InterfaceC13957w {

    /* JADX INFO: renamed from: b */
    public final InterfaceC13941g f57831b;

    /* JADX INFO: renamed from: c */
    public final Inflater f57832c;

    /* JADX INFO: renamed from: d */
    public final C13946l f57833d;

    /* JADX INFO: renamed from: a */
    public int f57830a = 0;

    /* JADX INFO: renamed from: e */
    public final CRC32 f57834e = new CRC32();

    public C13945k(InterfaceC13957w interfaceC13957w) {
        if (interfaceC13957w == null) {
            wg3.m206174a("source == null");
            throw null;
        }
        Inflater inflater = new Inflater(true);
        this.f57832c = inflater;
        InterfaceC13941g interfaceC13941gM83144a = C13948n.m83144a(interfaceC13957w);
        this.f57831b = interfaceC13941gM83144a;
        this.f57833d = new C13946l(interfaceC13941gM83144a, inflater);
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
    /* JADX INFO: renamed from: a */
    public long mo82814a(C13939e c13939e, long j) throws IOException {
        if (j < 0) {
            fcg0.m125008a("byteCount < 0: ", j);
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        if (this.f57830a == 0) {
            this.f57831b.mo83116f(10L);
            byte bM83120h = this.f57831b.mo83087a().m83120h(3L);
            boolean z = ((bM83120h >> 1) & 1) == 1;
            if (z) {
                m83140a(this.f57831b.mo83087a(), 0L, 10L);
            }
            m83141a("ID1ID2", 8075, this.f57831b.readShort());
            this.f57831b.mo83110d(8L);
            if (((bM83120h >> 2) & 1) == 1) {
                this.f57831b.mo83116f(2L);
                if (z) {
                    m83140a(this.f57831b.mo83087a(), 0L, 2L);
                }
                long jM83163a = C13959y.m83163a(this.f57831b.mo83087a().readShort());
                this.f57831b.mo83116f(jM83163a);
                if (z) {
                    m83140a(this.f57831b.mo83087a(), 0L, jM83163a);
                }
                this.f57831b.mo83110d(jM83163a);
            }
            if (((bM83120h >> 3) & 1) == 1) {
                long jMo83081a = this.f57831b.mo83081a((byte) 0);
                if (jMo83081a == -1) {
                    vg3.m201207a();
                    return 0L;
                }
                if (z) {
                    m83140a(this.f57831b.mo83087a(), 0L, jMo83081a + 1);
                }
                this.f57831b.mo83110d(jMo83081a + 1);
            }
            if (((bM83120h >> 4) & 1) == 1) {
                long jMo83081a2 = this.f57831b.mo83081a((byte) 0);
                if (jMo83081a2 == -1) {
                    vg3.m201207a();
                    return 0L;
                }
                if (z) {
                    m83140a(this.f57831b.mo83087a(), 0L, jMo83081a2 + 1);
                }
                this.f57831b.mo83110d(jMo83081a2 + 1);
            }
            if (z) {
                m83141a("FHCRC", this.f57831b.mo83126j(), (short) this.f57834e.getValue());
                this.f57834e.reset();
            }
            this.f57830a = 1;
        }
        if (this.f57830a == 1) {
            long j2 = c13939e.f57818b;
            long jMo82814a = this.f57833d.mo82814a(c13939e, j);
            if (jMo82814a != -1) {
                m83140a(c13939e, j2, jMo82814a);
                return jMo82814a;
            }
            this.f57830a = 2;
        }
        if (this.f57830a == 2) {
            m83141a("CRC", this.f57831b.mo83097b(), (int) this.f57834e.getValue());
            m83141a("ISIZE", this.f57831b.mo83097b(), (int) this.f57832c.getBytesWritten());
            this.f57830a = 3;
            if (!this.f57831b.mo83118g()) {
                zpg0.m220844a("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f57833d.close();
    }

    @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13957w
    public C13958x timeout() {
        return this.f57831b.timeout();
    }

    /* JADX INFO: renamed from: a */
    public final void m83140a(C13939e c13939e, long j, long j2) {
        C13953s c13953s = c13939e.f57817a;
        while (true) {
            long j3 = c13953s.f57855c - c13953s.f57854b;
            if (j < j3) {
                break;
            }
            j -= j3;
            c13953s = c13953s.f57858f;
        }
        while (j2 > 0) {
            int i = (int) (((long) c13953s.f57854b) + j);
            int iMin = (int) Math.min(c13953s.f57855c - i, j2);
            this.f57834e.update(c13953s.f57853a, i, iMin);
            j2 -= (long) iMin;
            c13953s = c13953s.f57858f;
            j = 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m83141a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }
}
