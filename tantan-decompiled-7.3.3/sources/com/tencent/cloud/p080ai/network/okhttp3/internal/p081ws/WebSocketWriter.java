package com.tencent.cloud.p080ai.network.okhttp3.internal.p081ws;

import com.tencent.cloud.p080ai.network.okio.ByteString;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import com.tencent.cloud.p080ai.network.okio.C13953s;
import com.tencent.cloud.p080ai.network.okio.C13958x;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13940f;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13956v;
import java.io.IOException;
import java.util.Random;
import p153l.mnd0;
import p153l.wg3;
import p153l.zpg0;

/* JADX INFO: loaded from: classes12.dex */
public final class WebSocketWriter {

    /* JADX INFO: renamed from: a */
    public final boolean f57708a;

    /* JADX INFO: renamed from: b */
    public final Random f57709b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC13940f f57710c;

    /* JADX INFO: renamed from: d */
    public final C13939e f57711d;

    /* JADX INFO: renamed from: e */
    public boolean f57712e;

    /* JADX INFO: renamed from: f */
    public final C13939e f57713f = new C13939e();

    /* JADX INFO: renamed from: g */
    public final FrameSink f57714g = new FrameSink();

    /* JADX INFO: renamed from: h */
    public boolean f57715h;

    /* JADX INFO: renamed from: i */
    public final byte[] f57716i;

    /* JADX INFO: renamed from: j */
    public final C13939e.b f57717j;

    public final class FrameSink implements InterfaceC13956v {

        /* JADX INFO: renamed from: a */
        public int f57718a;

        /* JADX INFO: renamed from: b */
        public long f57719b;

        /* JADX INFO: renamed from: c */
        public boolean f57720c;

        /* JADX INFO: renamed from: d */
        public boolean f57721d;

        public FrameSink() {
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f57721d) {
                zpg0.m220844a("closed");
                return;
            }
            WebSocketWriter webSocketWriter = WebSocketWriter.this;
            webSocketWriter.m83004a(this.f57718a, webSocketWriter.f57713f.f57818b, this.f57720c, true);
            this.f57721d = true;
            WebSocketWriter.this.f57715h = false;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v, java.io.Flushable
        public void flush() throws IOException {
            if (this.f57721d) {
                zpg0.m220844a("closed");
                return;
            }
            WebSocketWriter webSocketWriter = WebSocketWriter.this;
            webSocketWriter.m83004a(this.f57718a, webSocketWriter.f57713f.f57818b, this.f57720c, false);
            this.f57720c = false;
        }

        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
        public C13958x timeout() {
            return WebSocketWriter.this.f57710c.timeout();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0027  */
        @Override // com.tencent.cloud.p080ai.network.okio.InterfaceC13956v
        public void write(C13939e c13939e, long j) throws IOException {
            boolean z;
            if (this.f57721d) {
                zpg0.m220844a("closed");
                return;
            }
            WebSocketWriter.this.f57713f.write(c13939e, j);
            if (this.f57720c) {
                long j2 = this.f57719b;
                if (j2 == -1 || WebSocketWriter.this.f57713f.f57818b <= j2 - 8192) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            long jM83128l = WebSocketWriter.this.f57713f.m83128l();
            if (jM83128l <= 0 || z) {
                return;
            }
            WebSocketWriter.this.m83004a(this.f57718a, jM83128l, this.f57720c, false);
            this.f57720c = false;
        }
    }

    public WebSocketWriter(boolean z, InterfaceC13940f interfaceC13940f, Random random) {
        if (interfaceC13940f == null) {
            mnd0.m159157a("sink == null");
            throw null;
        }
        if (random == null) {
            mnd0.m159157a("random == null");
            throw null;
        }
        this.f57708a = z;
        this.f57710c = interfaceC13940f;
        this.f57711d = interfaceC13940f.mo83087a();
        this.f57709b = random;
        this.f57716i = z ? new byte[4] : null;
        this.f57717j = z ? new C13939e.b() : null;
    }

    /* JADX INFO: renamed from: a */
    public void m83004a(int i, long j, boolean z, boolean z2) throws IOException {
        if (this.f57712e) {
            zpg0.m220844a("closed");
            return;
        }
        if (!z) {
            i = 0;
        }
        if (z2) {
            i |= 128;
        }
        this.f57711d.mo83106c(i);
        int i2 = this.f57708a ? 128 : 0;
        if (j <= 125) {
            this.f57711d.mo83106c(((int) j) | i2);
        } else {
            C13939e c13939e = this.f57711d;
            if (j <= 65535) {
                c13939e.mo83106c(i2 | 126);
                this.f57711d.mo83091a((int) j);
            } else {
                c13939e.mo83106c(i2 | 127);
                C13939e c13939e2 = this.f57711d;
                C13953s c13953sM83108d = c13939e2.m83108d(8);
                byte[] bArr = c13953sM83108d.f57853a;
                int i3 = c13953sM83108d.f57855c;
                bArr[i3] = (byte) ((j >>> 56) & 255);
                bArr[i3 + 1] = (byte) ((j >>> 48) & 255);
                bArr[i3 + 2] = (byte) ((j >>> 40) & 255);
                bArr[i3 + 3] = (byte) ((j >>> 32) & 255);
                bArr[i3 + 4] = (byte) ((j >>> 24) & 255);
                bArr[i3 + 5] = (byte) ((j >>> 16) & 255);
                bArr[i3 + 6] = (byte) ((j >>> 8) & 255);
                bArr[i3 + 7] = (byte) (j & 255);
                c13953sM83108d.f57855c = i3 + 8;
                c13939e2.f57818b += 8;
            }
        }
        if (this.f57708a) {
            this.f57709b.nextBytes(this.f57716i);
            this.f57711d.mo83093a(this.f57716i);
            if (j > 0) {
                C13939e c13939e3 = this.f57711d;
                long j2 = c13939e3.f57818b;
                c13939e3.write(this.f57713f, j);
                this.f57711d.m83086a(this.f57717j);
                this.f57717j.m83131h(j2);
                WebSocketProtocol.m83001a(this.f57717j, this.f57716i);
                this.f57717j.close();
            }
        } else {
            this.f57711d.write(this.f57713f, j);
        }
        this.f57710c.mo83123i();
    }

    /* JADX INFO: renamed from: b */
    public final void m83006b(int i, ByteString byteString) {
        if (this.f57712e) {
            zpg0.m220844a("closed");
            return;
        }
        int size = byteString.size();
        if (size > 125) {
            wg3.m206174a("Payload size must be less than or equal to 125");
            return;
        }
        this.f57711d.mo83106c(i | 128);
        boolean z = this.f57708a;
        C13939e c13939e = this.f57711d;
        if (z) {
            c13939e.mo83106c(size | 128);
            this.f57709b.nextBytes(this.f57716i);
            this.f57711d.mo83093a(this.f57716i);
            if (size > 0) {
                C13939e c13939e2 = this.f57711d;
                long j = c13939e2.f57818b;
                c13939e2.m83098b(byteString);
                this.f57711d.m83086a(this.f57717j);
                this.f57717j.m83131h(j);
                WebSocketProtocol.m83001a(this.f57717j, this.f57716i);
                this.f57717j.close();
            }
        } else {
            c13939e.mo83106c(size);
            this.f57711d.m83098b(byteString);
        }
        this.f57710c.flush();
    }

    /* JADX INFO: renamed from: a */
    public void m83005a(int i, ByteString byteString) {
        String strM83000a;
        ByteString byteStringM83129m = ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0 && (strM83000a = WebSocketProtocol.m83000a(i)) != null) {
                wg3.m206174a(strM83000a);
                return;
            }
            C13939e c13939e = new C13939e();
            c13939e.mo83091a(i);
            if (byteString != null) {
                c13939e.m83098b(byteString);
            }
            byteStringM83129m = c13939e.m83129m();
        }
        try {
            m83006b(8, byteStringM83129m);
        } finally {
            this.f57712e = true;
        }
    }
}
