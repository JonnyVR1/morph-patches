package com.tencent.cloud.p080ai.network.okhttp3.internal.p081ws;

import com.tencent.cloud.p080ai.network.okio.ByteString;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13941g;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.e7b0;
import p153l.mnd0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes12.dex */
public final class WebSocketReader {

    /* JADX INFO: renamed from: a */
    public final boolean f57696a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13941g f57697b;

    /* JADX INFO: renamed from: c */
    public final FrameCallback f57698c;

    /* JADX INFO: renamed from: d */
    public boolean f57699d;

    /* JADX INFO: renamed from: e */
    public int f57700e;

    /* JADX INFO: renamed from: f */
    public long f57701f;

    /* JADX INFO: renamed from: g */
    public boolean f57702g;

    /* JADX INFO: renamed from: h */
    public boolean f57703h;

    /* JADX INFO: renamed from: i */
    public final C13939e f57704i = new C13939e();

    /* JADX INFO: renamed from: j */
    public final C13939e f57705j = new C13939e();

    /* JADX INFO: renamed from: k */
    public final byte[] f57706k;

    /* JADX INFO: renamed from: l */
    public final C13939e.b f57707l;

    public interface FrameCallback {
        void onReadClose(int i, String str);

        void onReadMessage(ByteString byteString);

        void onReadMessage(String str);

        void onReadPing(ByteString byteString);

        void onReadPong(ByteString byteString);
    }

    public WebSocketReader(boolean z, InterfaceC13941g interfaceC13941g, FrameCallback frameCallback) {
        if (interfaceC13941g == null) {
            mnd0.m159157a("source == null");
            throw null;
        }
        this.f57696a = z;
        this.f57697b = interfaceC13941g;
        this.f57698c = frameCallback;
        this.f57706k = z ? null : new byte[4];
        this.f57707l = z ? null : new C13939e.b();
    }

    /* JADX INFO: renamed from: a */
    public final void m83002a() {
        short s;
        String strM83130n;
        long j = this.f57701f;
        if (j > 0) {
            this.f57697b.mo83103b(this.f57704i, j);
            if (!this.f57696a) {
                this.f57704i.m83086a(this.f57707l);
                this.f57707l.m83131h(0L);
                WebSocketProtocol.m83001a(this.f57707l, this.f57706k);
                this.f57707l.close();
            }
        }
        switch (this.f57700e) {
            case 8:
                C13939e c13939e = this.f57704i;
                long j2 = c13939e.f57818b;
                if (j2 == 1) {
                    e7b0.m119688a("Malformed close payload length of 1.");
                    return;
                }
                if (j2 != 0) {
                    s = c13939e.readShort();
                    strM83130n = this.f57704i.m83130n();
                    String strM83000a = WebSocketProtocol.m83000a(s);
                    if (strM83000a != null) {
                        e7b0.m119688a(strM83000a);
                        return;
                    }
                } else {
                    s = 1005;
                    strM83130n = "";
                }
                this.f57698c.onReadClose(s, strM83130n);
                this.f57699d = true;
                return;
            case 9:
                this.f57698c.onReadPing(this.f57704i.m83129m());
                return;
            case 10:
                this.f57698c.onReadPong(this.f57704i.m83129m());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f57700e));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m83003b() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f57699d) {
            zpg0.m220844a("closed");
            return;
        }
        long jMo83139f = this.f57697b.timeout().mo83139f();
        this.f57697b.timeout().mo83135b();
        try {
            byte b = this.f57697b.readByte();
            this.f57697b.timeout().mo83134a(jMo83139f, timeUnit);
            this.f57700e = b & 15;
            boolean z = (b & 128) != 0;
            this.f57702g = z;
            boolean z2 = (b & 8) != 0;
            this.f57703h = z2;
            if (z2 && !z) {
                e7b0.m119688a("Control frames must be final.");
                return;
            }
            boolean z3 = (b & 64) != 0;
            boolean z4 = (b & HttpTokens.SPACE) != 0;
            boolean z5 = (b & Tnaf.POW_2_WIDTH) != 0;
            if (z3 || z4 || z5) {
                e7b0.m119688a("Reserved flags are unsupported.");
                return;
            }
            byte b2 = this.f57697b.readByte();
            boolean z6 = (b2 & 128) != 0;
            if (z6 == this.f57696a) {
                throw new ProtocolException(this.f57696a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = b2 & 127;
            this.f57701f = j;
            if (j == 126) {
                this.f57701f = ((long) this.f57697b.readShort()) & 65535;
            } else if (j == 127) {
                long j2 = this.f57697b.readLong();
                this.f57701f = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f57701f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f57703h && this.f57701f > 125) {
                e7b0.m119688a("Control frame must be less than 125B.");
            } else if (z6) {
                this.f57697b.readFully(this.f57706k);
            }
        } catch (Throwable th) {
            this.f57697b.timeout().mo83134a(jMo83139f, timeUnit);
            throw th;
        }
    }
}
