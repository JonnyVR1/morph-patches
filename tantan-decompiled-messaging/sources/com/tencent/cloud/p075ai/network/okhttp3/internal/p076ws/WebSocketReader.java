package com.tencent.cloud.p075ai.network.okhttp3.internal.p076ws;

import com.tencent.cloud.p075ai.network.okio.ByteString;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13778g;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;
import p149l.aza0;
import p149l.jfd0;
import p149l.rhg0;

/* JADX INFO: loaded from: classes13.dex */
public final class WebSocketReader {

    /* JADX INFO: renamed from: a */
    public final boolean f56848a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13778g f56849b;

    /* JADX INFO: renamed from: c */
    public final FrameCallback f56850c;

    /* JADX INFO: renamed from: d */
    public boolean f56851d;

    /* JADX INFO: renamed from: e */
    public int f56852e;

    /* JADX INFO: renamed from: f */
    public long f56853f;

    /* JADX INFO: renamed from: g */
    public boolean f56854g;

    /* JADX INFO: renamed from: h */
    public boolean f56855h;

    /* JADX INFO: renamed from: i */
    public final C13776e f56856i = new C13776e();

    /* JADX INFO: renamed from: j */
    public final C13776e f56857j = new C13776e();

    /* JADX INFO: renamed from: k */
    public final byte[] f56858k;

    /* JADX INFO: renamed from: l */
    public final C13776e.b f56859l;

    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(ByteString byteString);

        void onReadMessage(String str);

        void onReadPing(ByteString byteString);

        void onReadPong(ByteString byteString);
    }

    public WebSocketReader(boolean z, InterfaceC13778g interfaceC13778g, FrameCallback frameCallback) {
        if (interfaceC13778g == null) {
            jfd0.m141176a("source == null");
            throw null;
        }
        this.f56848a = z;
        this.f56849b = interfaceC13778g;
        this.f56850c = frameCallback;
        this.f56858k = z ? null : new byte[4];
        this.f56859l = z ? null : new C13776e.b();
    }

    /* JADX INFO: renamed from: a */
    public final void m81819a() {
        short s;
        String strM81947n;
        long j = this.f56853f;
        if (j > 0) {
            this.f56849b.mo81920b(this.f56856i, j);
            if (!this.f56848a) {
                this.f56856i.m81903a(this.f56859l);
                this.f56859l.m81948h(0L);
                WebSocketProtocol.m81818a(this.f56859l, this.f56858k);
                this.f56859l.close();
            }
        }
        switch (this.f56852e) {
            case 8:
                C13776e c13776e = this.f56856i;
                long j2 = c13776e.f56970b;
                if (j2 == 1) {
                    aza0.m99642a("Malformed close payload length of 1.");
                    return;
                }
                if (j2 != 0) {
                    s = c13776e.readShort();
                    strM81947n = this.f56856i.m81947n();
                    String strM81817a = WebSocketProtocol.m81817a(s);
                    if (strM81817a != null) {
                        aza0.m99642a(strM81817a);
                        return;
                    }
                } else {
                    s = 1005;
                    strM81947n = "";
                }
                this.f56850c.onReadClose(s, strM81947n);
                this.f56851d = true;
                return;
            case 9:
                this.f56850c.onReadPing(this.f56856i.m81946m());
                return;
            case 10:
                this.f56850c.onReadPong(this.f56856i.m81946m());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f56852e));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m81820b() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f56851d) {
            rhg0.m179353a("closed");
            return;
        }
        long jMo81956f = this.f56849b.timeout().mo81956f();
        this.f56849b.timeout().mo81952b();
        try {
            byte b = this.f56849b.readByte();
            this.f56849b.timeout().mo81951a(jMo81956f, timeUnit);
            this.f56852e = b & 15;
            boolean z = (b & 128) != 0;
            this.f56854g = z;
            boolean z2 = (b & 8) != 0;
            this.f56855h = z2;
            if (z2 && !z) {
                aza0.m99642a("Control frames must be final.");
                return;
            }
            boolean z3 = (b & 64) != 0;
            boolean z4 = (b & HttpTokens.SPACE) != 0;
            boolean z5 = (b & Tnaf.POW_2_WIDTH) != 0;
            if (z3 || z4 || z5) {
                aza0.m99642a("Reserved flags are unsupported.");
                return;
            }
            byte b2 = this.f56849b.readByte();
            boolean z6 = (b2 & 128) != 0;
            if (z6 == this.f56848a) {
                throw new ProtocolException(this.f56848a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = b2 & 127;
            this.f56853f = j;
            if (j == 126) {
                this.f56853f = ((long) this.f56849b.readShort()) & 65535;
            } else if (j == 127) {
                long j2 = this.f56849b.readLong();
                this.f56853f = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f56853f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f56855h && this.f56853f > 125) {
                aza0.m99642a("Control frame must be less than 125B.");
            } else if (z6) {
                this.f56849b.readFully(this.f56858k);
            }
        } catch (Throwable th) {
            this.f56849b.timeout().mo81951a(jMo81956f, timeUnit);
            throw th;
        }
    }
}
