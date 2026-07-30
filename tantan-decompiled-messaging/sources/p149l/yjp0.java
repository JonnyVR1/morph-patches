package p149l;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes8.dex */
public class yjp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f198656a;

    /* JADX INFO: renamed from: b */
    public final BufferedSource f198657b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21421a f198658c;

    /* JADX INFO: renamed from: d */
    public boolean f198659d;

    /* JADX INFO: renamed from: e */
    public int f198660e;

    /* JADX INFO: renamed from: f */
    public long f198661f;

    /* JADX INFO: renamed from: g */
    public long f198662g;

    /* JADX INFO: renamed from: h */
    public boolean f198663h;

    /* JADX INFO: renamed from: i */
    public boolean f198664i;

    /* JADX INFO: renamed from: j */
    public boolean f198665j;

    /* JADX INFO: renamed from: k */
    public final byte[] f198666k = new byte[4];

    /* JADX INFO: renamed from: l */
    public final byte[] f198667l = new byte[8192];

    /* JADX INFO: renamed from: l.yjp0$a */
    public interface InterfaceC21421a {
        /* JADX INFO: renamed from: a */
        void mo121608a(ByteString byteString);

        /* JADX INFO: renamed from: b */
        void mo121609b(ByteString byteString);

        /* JADX INFO: renamed from: d */
        void mo121610d(ByteString byteString) throws IOException;

        void onReadClose(int i, String str);

        void onReadMessage(String str) throws IOException;
    }

    public yjp0(boolean z, BufferedSource bufferedSource, InterfaceC21421a interfaceC21421a) {
        if (bufferedSource == null) {
            jfd0.m141176a("source == null");
            throw null;
        }
        if (interfaceC21421a == null) {
            jfd0.m141176a("frameCallback == null");
            throw null;
        }
        this.f198656a = z;
        this.f198657b = bufferedSource;
        this.f198658c = interfaceC21421a;
    }

    /* JADX INFO: renamed from: a */
    public void m215077a() throws IOException {
        m215079c();
        if (this.f198664i) {
            m215078b();
        } else {
            m215081e();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m215078b() throws IOException {
        short s;
        String utf8;
        Buffer buffer = new Buffer();
        long j = this.f198662g;
        long j2 = this.f198661f;
        if (j < j2) {
            if (!this.f198656a) {
                while (true) {
                    long j3 = this.f198662g;
                    long j4 = this.f198661f;
                    if (j3 >= j4) {
                        break;
                    }
                    int i = this.f198657b.read(this.f198667l, 0, (int) Math.min(j4 - j3, this.f198667l.length));
                    if (i == -1) {
                        hg3.m130807a();
                        return;
                    }
                    long j5 = i;
                    xjp0.m209733b(this.f198667l, j5, this.f198666k, this.f198662g);
                    buffer.write(this.f198667l, 0, i);
                    this.f198662g += j5;
                }
            } else {
                this.f198657b.readFully(buffer, j2);
            }
        }
        switch (this.f198660e) {
            case 8:
                long size = buffer.size();
                if (size == 1) {
                    aza0.m99642a("Malformed close payload length of 1.");
                    return;
                }
                if (size != 0) {
                    s = buffer.readShort();
                    utf8 = buffer.readUtf8();
                    String strM209732a = xjp0.m209732a(s);
                    if (strM209732a != null) {
                        aza0.m99642a(strM209732a);
                        return;
                    }
                } else {
                    s = 1005;
                    utf8 = "";
                }
                this.f198658c.onReadClose(s, utf8);
                this.f198659d = true;
                return;
            case 9:
                this.f198658c.mo121608a(buffer.readByteString());
                return;
            case 10:
                this.f198658c.mo121609b(buffer.readByteString());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f198660e));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m215079c() throws IOException {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f198659d) {
            rhg0.m179353a("closed");
            return;
        }
        long timeoutNanos = this.f198657b.getTimeout().getTimeoutNanos();
        this.f198657b.getTimeout().clearTimeout();
        try {
            byte b = this.f198657b.readByte();
            this.f198657b.getTimeout().timeout(timeoutNanos, timeUnit);
            this.f198660e = b & 15;
            boolean z = (b & 128) != 0;
            this.f198663h = z;
            boolean z2 = (b & 8) != 0;
            this.f198664i = z2;
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
            byte b2 = this.f198657b.readByte();
            boolean z6 = (b2 & 128) != 0;
            this.f198665j = z6;
            if (z6 == this.f198656a) {
                throw new ProtocolException(this.f198656a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = b2 & 127;
            this.f198661f = j;
            if (j == 126) {
                this.f198661f = ((long) this.f198657b.readShort()) & 65535;
            } else if (j == 127) {
                long j2 = this.f198657b.readLong();
                this.f198661f = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f198661f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            this.f198662g = 0L;
            if (this.f198664i && this.f198661f > 125) {
                aza0.m99642a("Control frame must be less than 125B.");
            } else if (this.f198665j) {
                this.f198657b.readFully(this.f198666k);
            }
        } catch (Throwable th) {
            this.f198657b.getTimeout().timeout(timeoutNanos, timeUnit);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m215080d(Buffer buffer) throws IOException {
        long j;
        while (!this.f198659d) {
            if (this.f198662g == this.f198661f) {
                if (this.f198663h) {
                    return;
                }
                m215082f();
                if (this.f198660e != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.f198660e));
                }
                if (this.f198663h && this.f198661f == 0) {
                    return;
                }
            }
            long j2 = this.f198661f - this.f198662g;
            if (this.f198665j) {
                j = this.f198657b.read(this.f198667l, 0, (int) Math.min(j2, this.f198667l.length));
                if (j == -1) {
                    hg3.m130807a();
                    return;
                } else {
                    xjp0.m209733b(this.f198667l, j, this.f198666k, this.f198662g);
                    buffer.write(this.f198667l, 0, (int) j);
                }
            } else {
                j = this.f198657b.read(buffer, j2);
                if (j == -1) {
                    hg3.m130807a();
                    return;
                }
            }
            this.f198662g += j;
        }
        rhg0.m179353a("closed");
    }

    /* JADX INFO: renamed from: e */
    public final void m215081e() throws IOException {
        int i = this.f198660e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        Buffer buffer = new Buffer();
        m215080d(buffer);
        InterfaceC21421a interfaceC21421a = this.f198658c;
        if (i == 1) {
            interfaceC21421a.onReadMessage(buffer.readUtf8());
        } else {
            interfaceC21421a.mo121610d(buffer.readByteString());
        }
    }

    /* JADX INFO: renamed from: f */
    public void m215082f() throws IOException {
        while (!this.f198659d) {
            m215079c();
            if (!this.f198664i) {
                return;
            } else {
                m215078b();
            }
        }
    }
}
