package p153l;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes9.dex */
public class ctp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f83738a;

    /* JADX INFO: renamed from: b */
    public final BufferedSource f83739b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC16360a f83740c;

    /* JADX INFO: renamed from: d */
    public boolean f83741d;

    /* JADX INFO: renamed from: e */
    public int f83742e;

    /* JADX INFO: renamed from: f */
    public long f83743f;

    /* JADX INFO: renamed from: g */
    public long f83744g;

    /* JADX INFO: renamed from: h */
    public boolean f83745h;

    /* JADX INFO: renamed from: i */
    public boolean f83746i;

    /* JADX INFO: renamed from: j */
    public boolean f83747j;

    /* JADX INFO: renamed from: k */
    public final byte[] f83748k = new byte[4];

    /* JADX INFO: renamed from: l */
    public final byte[] f83749l = new byte[8192];

    /* JADX INFO: renamed from: l.ctp0$a */
    public interface InterfaceC16360a {
        /* JADX INFO: renamed from: a */
        void mo112543a(ByteString byteString);

        /* JADX INFO: renamed from: b */
        void mo112544b(ByteString byteString);

        /* JADX INFO: renamed from: d */
        void mo112545d(ByteString byteString) throws IOException;

        void onReadClose(int i, String str);

        void onReadMessage(String str) throws IOException;
    }

    public ctp0(boolean z, BufferedSource bufferedSource, InterfaceC16360a interfaceC16360a) {
        if (bufferedSource == null) {
            mnd0.m159157a("source == null");
            throw null;
        }
        if (interfaceC16360a == null) {
            mnd0.m159157a("frameCallback == null");
            throw null;
        }
        this.f83738a = z;
        this.f83739b = bufferedSource;
        this.f83740c = interfaceC16360a;
    }

    /* JADX INFO: renamed from: a */
    public void m112537a() throws IOException {
        m112539c();
        if (this.f83746i) {
            m112538b();
        } else {
            m112541e();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m112538b() throws IOException {
        short s;
        String utf8;
        Buffer buffer = new Buffer();
        long j = this.f83744g;
        long j2 = this.f83743f;
        if (j < j2) {
            if (!this.f83738a) {
                while (true) {
                    long j3 = this.f83744g;
                    long j4 = this.f83743f;
                    if (j3 >= j4) {
                        break;
                    }
                    int i = this.f83739b.read(this.f83749l, 0, (int) Math.min(j4 - j3, this.f83749l.length));
                    if (i == -1) {
                        vg3.m201207a();
                        return;
                    }
                    long j5 = i;
                    btp0.m106376b(this.f83749l, j5, this.f83748k, this.f83744g);
                    buffer.write(this.f83749l, 0, i);
                    this.f83744g += j5;
                }
            } else {
                this.f83739b.readFully(buffer, j2);
            }
        }
        switch (this.f83742e) {
            case 8:
                long size = buffer.size();
                if (size == 1) {
                    e7b0.m119688a("Malformed close payload length of 1.");
                    return;
                }
                if (size != 0) {
                    s = buffer.readShort();
                    utf8 = buffer.readUtf8();
                    String strM106375a = btp0.m106375a(s);
                    if (strM106375a != null) {
                        e7b0.m119688a(strM106375a);
                        return;
                    }
                } else {
                    s = 1005;
                    utf8 = "";
                }
                this.f83740c.onReadClose(s, utf8);
                this.f83741d = true;
                return;
            case 9:
                this.f83740c.mo112543a(buffer.readByteString());
                return;
            case 10:
                this.f83740c.mo112544b(buffer.readByteString());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f83742e));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m112539c() throws IOException {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f83741d) {
            zpg0.m220844a("closed");
            return;
        }
        long timeoutNanos = this.f83739b.getTimeout().getTimeoutNanos();
        this.f83739b.getTimeout().clearTimeout();
        try {
            byte b = this.f83739b.readByte();
            this.f83739b.getTimeout().timeout(timeoutNanos, timeUnit);
            this.f83742e = b & 15;
            boolean z = (b & 128) != 0;
            this.f83745h = z;
            boolean z2 = (b & 8) != 0;
            this.f83746i = z2;
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
            byte b2 = this.f83739b.readByte();
            boolean z6 = (b2 & 128) != 0;
            this.f83747j = z6;
            if (z6 == this.f83738a) {
                throw new ProtocolException(this.f83738a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = b2 & 127;
            this.f83743f = j;
            if (j == 126) {
                this.f83743f = ((long) this.f83739b.readShort()) & 65535;
            } else if (j == 127) {
                long j2 = this.f83739b.readLong();
                this.f83743f = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f83743f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            this.f83744g = 0L;
            if (this.f83746i && this.f83743f > 125) {
                e7b0.m119688a("Control frame must be less than 125B.");
            } else if (this.f83747j) {
                this.f83739b.readFully(this.f83748k);
            }
        } catch (Throwable th) {
            this.f83739b.getTimeout().timeout(timeoutNanos, timeUnit);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m112540d(Buffer buffer) throws IOException {
        long j;
        while (!this.f83741d) {
            if (this.f83744g == this.f83743f) {
                if (this.f83745h) {
                    return;
                }
                m112542f();
                if (this.f83742e != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.f83742e));
                }
                if (this.f83745h && this.f83743f == 0) {
                    return;
                }
            }
            long j2 = this.f83743f - this.f83744g;
            if (this.f83747j) {
                j = this.f83739b.read(this.f83749l, 0, (int) Math.min(j2, this.f83749l.length));
                if (j == -1) {
                    vg3.m201207a();
                    return;
                } else {
                    btp0.m106376b(this.f83749l, j, this.f83748k, this.f83744g);
                    buffer.write(this.f83749l, 0, (int) j);
                }
            } else {
                j = this.f83739b.read(buffer, j2);
                if (j == -1) {
                    vg3.m201207a();
                    return;
                }
            }
            this.f83744g += j;
        }
        zpg0.m220844a("closed");
    }

    /* JADX INFO: renamed from: e */
    public final void m112541e() throws IOException {
        int i = this.f83742e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        Buffer buffer = new Buffer();
        m112540d(buffer);
        InterfaceC16360a interfaceC16360a = this.f83740c;
        if (i == 1) {
            interfaceC16360a.onReadMessage(buffer.readUtf8());
        } else {
            interfaceC16360a.mo112545d(buffer.readByteString());
        }
    }

    /* JADX INFO: renamed from: f */
    public void m112542f() throws IOException {
        while (!this.f83741d) {
            m112539c();
            if (!this.f83746i) {
                return;
            } else {
                m112538b();
            }
        }
    }
}
