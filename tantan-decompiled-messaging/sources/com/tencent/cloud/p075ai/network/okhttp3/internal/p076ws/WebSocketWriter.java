package com.tencent.cloud.p075ai.network.okhttp3.internal.p076ws;

import com.tencent.cloud.p075ai.network.okio.ByteString;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.cloud.p075ai.network.okio.C13790s;
import com.tencent.cloud.p075ai.network.okio.C13795x;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13777f;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13793v;
import java.io.IOException;
import java.util.Random;
import p149l.ig3;
import p149l.jfd0;
import p149l.rhg0;

/* JADX INFO: loaded from: classes13.dex */
public final class WebSocketWriter {

    /* JADX INFO: renamed from: a */
    public final boolean f56860a;

    /* JADX INFO: renamed from: b */
    public final Random f56861b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13777f f56862c;

    /* JADX INFO: renamed from: d */
    public final C13776e f56863d;

    /* JADX INFO: renamed from: e */
    public boolean f56864e;

    /* JADX INFO: renamed from: f */
    public final C13776e f56865f = new C13776e();

    /* JADX INFO: renamed from: g */
    public final FrameSink f56866g = new FrameSink();

    /* JADX INFO: renamed from: h */
    public boolean f56867h;

    /* JADX INFO: renamed from: i */
    public final byte[] f56868i;

    /* JADX INFO: renamed from: j */
    public final C13776e.b f56869j;

    public final class FrameSink implements InterfaceC13793v {

        /* JADX INFO: renamed from: a */
        public int f56870a;

        /* JADX INFO: renamed from: b */
        public long f56871b;

        /* JADX INFO: renamed from: c */
        public boolean f56872c;

        /* JADX INFO: renamed from: d */
        public boolean f56873d;

        public FrameSink() {
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f56873d) {
                rhg0.m179353a("closed");
                return;
            }
            WebSocketWriter webSocketWriter = WebSocketWriter.this;
            webSocketWriter.m81821a(this.f56870a, webSocketWriter.f56865f.f56970b, this.f56872c, true);
            this.f56873d = true;
            WebSocketWriter.this.f56867h = false;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v, java.io.Flushable
        public void flush() throws IOException {
            if (this.f56873d) {
                rhg0.m179353a("closed");
                return;
            }
            WebSocketWriter webSocketWriter = WebSocketWriter.this;
            webSocketWriter.m81821a(this.f56870a, webSocketWriter.f56865f.f56970b, this.f56872c, false);
            this.f56872c = false;
        }

        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
        public C13795x timeout() {
            return WebSocketWriter.this.f56862c.timeout();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0027  */
        @Override // com.tencent.cloud.p075ai.network.okio.InterfaceC13793v
        public void write(C13776e c13776e, long j) throws IOException {
            boolean z;
            if (this.f56873d) {
                rhg0.m179353a("closed");
                return;
            }
            WebSocketWriter.this.f56865f.write(c13776e, j);
            if (this.f56872c) {
                long j2 = this.f56871b;
                if (j2 == -1 || WebSocketWriter.this.f56865f.f56970b <= j2 - 8192) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            long jM81945l = WebSocketWriter.this.f56865f.m81945l();
            if (jM81945l <= 0 || z) {
                return;
            }
            WebSocketWriter.this.m81821a(this.f56870a, jM81945l, this.f56872c, false);
            this.f56872c = false;
        }
    }

    public WebSocketWriter(boolean z, InterfaceC13777f interfaceC13777f, Random random) {
        if (interfaceC13777f == null) {
            jfd0.m141176a("sink == null");
            throw null;
        }
        if (random == null) {
            jfd0.m141176a("random == null");
            throw null;
        }
        this.f56860a = z;
        this.f56862c = interfaceC13777f;
        this.f56863d = interfaceC13777f.mo81904a();
        this.f56861b = random;
        this.f56868i = z ? new byte[4] : null;
        this.f56869j = z ? new C13776e.b() : null;
    }

    /* JADX INFO: renamed from: a */
    public void m81821a(int i, long j, boolean z, boolean z2) throws IOException {
        if (this.f56864e) {
            rhg0.m179353a("closed");
            return;
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.f56863d.mo81923c(i);
        int i2 = this.f56860a ? 128 : 0;
        if (j <= 125) {
            this.f56863d.mo81923c(((int) j) | i2);
        } else {
            C13776e c13776e = this.f56863d;
            if (j <= 65535) {
                c13776e.mo81923c(i2 | 126);
                this.f56863d.mo81908a((int) j);
            } else {
                c13776e.mo81923c(i2 | 127);
                C13776e c13776e2 = this.f56863d;
                C13790s c13790sM81925d = c13776e2.m81925d(8);
                byte[] bArr = c13790sM81925d.f57005a;
                int i3 = c13790sM81925d.f57007c;
                bArr[i3] = (byte) ((j >>> 56) & 255);
                bArr[i3 + 1] = (byte) ((j >>> 48) & 255);
                bArr[i3 + 2] = (byte) ((j >>> 40) & 255);
                bArr[i3 + 3] = (byte) ((j >>> 32) & 255);
                bArr[i3 + 4] = (byte) ((j >>> 24) & 255);
                bArr[i3 + 5] = (byte) ((j >>> 16) & 255);
                bArr[i3 + 6] = (byte) ((j >>> 8) & 255);
                bArr[i3 + 7] = (byte) (j & 255);
                c13790sM81925d.f57007c = i3 + 8;
                c13776e2.f56970b += 8;
            }
        }
        if (this.f56860a) {
            this.f56861b.nextBytes(this.f56868i);
            this.f56863d.mo81910a(this.f56868i);
            if (j > 0) {
                C13776e c13776e3 = this.f56863d;
                long j2 = c13776e3.f56970b;
                c13776e3.write(this.f56865f, j);
                this.f56863d.m81903a(this.f56869j);
                this.f56869j.m81948h(j2);
                WebSocketProtocol.m81818a(this.f56869j, this.f56868i);
                this.f56869j.close();
            }
        } else {
            this.f56863d.write(this.f56865f, j);
        }
        this.f56862c.mo81940i();
    }

    /* JADX INFO: renamed from: b */
    public final void m81823b(int i, ByteString byteString) {
        if (this.f56864e) {
            rhg0.m179353a("closed");
            return;
        }
        int size = byteString.size();
        if (size > 125) {
            ig3.m135964a("Payload size must be less than or equal to 125");
            return;
        }
        this.f56863d.mo81923c(i | 128);
        boolean z = this.f56860a;
        C13776e c13776e = this.f56863d;
        if (z) {
            c13776e.mo81923c(size | 128);
            this.f56861b.nextBytes(this.f56868i);
            this.f56863d.mo81910a(this.f56868i);
            if (size > 0) {
                C13776e c13776e2 = this.f56863d;
                long j = c13776e2.f56970b;
                c13776e2.m81915b(byteString);
                this.f56863d.m81903a(this.f56869j);
                this.f56869j.m81948h(j);
                WebSocketProtocol.m81818a(this.f56869j, this.f56868i);
                this.f56869j.close();
            }
        } else {
            c13776e.mo81923c(size);
            this.f56863d.m81915b(byteString);
        }
        this.f56862c.flush();
    }

    /* JADX INFO: renamed from: a */
    public void m81822a(int i, ByteString byteString) {
        String strM81817a;
        ByteString byteStringM81946m = ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0 && (strM81817a = WebSocketProtocol.m81817a(i)) != null) {
                ig3.m135964a(strM81817a);
                return;
            }
            C13776e c13776e = new C13776e();
            c13776e.mo81908a(i);
            if (byteString != null) {
                c13776e.m81915b(byteString);
            }
            byteStringM81946m = c13776e.m81946m();
        }
        try {
            m81823b(8, byteStringM81946m);
        } finally {
            this.f56864e = true;
        }
    }
}
