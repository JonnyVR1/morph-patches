package p007l;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import l.aza0;
import l.hg3;
import l.jfd0;
import l.rhg0;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class yjp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f5433a;

    /* JADX INFO: renamed from: b */
    public final BufferedSource f5434b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0793a f5435c;

    /* JADX INFO: renamed from: d */
    public boolean f5436d;

    /* JADX INFO: renamed from: e */
    public int f5437e;

    /* JADX INFO: renamed from: f */
    public long f5438f;

    /* JADX INFO: renamed from: g */
    public long f5439g;

    /* JADX INFO: renamed from: h */
    public boolean f5440h;

    /* JADX INFO: renamed from: i */
    public boolean f5441i;

    /* JADX INFO: renamed from: j */
    public boolean f5442j;

    /* JADX INFO: renamed from: k */
    public final byte[] f5443k = new byte[4];

    /* JADX INFO: renamed from: l */
    public final byte[] f5444l = new byte[8192];

    /* JADX INFO: renamed from: l.yjp0$a */
    public interface InterfaceC0793a {
        /* JADX INFO: renamed from: a */
        void mo9131a(ByteString byteString);

        /* JADX INFO: renamed from: b */
        void mo9132b(ByteString byteString);

        /* JADX INFO: renamed from: d */
        void mo9133d(ByteString byteString) throws IOException;

        void onReadClose(int i, String str);

        void onReadMessage(String str) throws IOException;
    }

    public yjp0(boolean z, BufferedSource bufferedSource, InterfaceC0793a interfaceC0793a) {
        if (bufferedSource == null) {
            jfd0.a("source == null");
            throw null;
        }
        if (interfaceC0793a == null) {
            jfd0.a("frameCallback == null");
            throw null;
        }
        this.f5433a = z;
        this.f5434b = bufferedSource;
        this.f5435c = interfaceC0793a;
    }

    /* JADX INFO: renamed from: a */
    public void m11928a() throws IOException {
        m11930c();
        if (this.f5441i) {
            m11929b();
        } else {
            m11932e();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11929b() throws IOException {
        short s;
        String utf8;
        Buffer buffer = new Buffer();
        long j = this.f5439g;
        long j2 = this.f5438f;
        if (j < j2) {
            if (!this.f5433a) {
                while (true) {
                    long j3 = this.f5439g;
                    long j4 = this.f5438f;
                    if (j3 >= j4) {
                        break;
                    }
                    int i = this.f5434b.read(this.f5444l, 0, (int) Math.min(j4 - j3, this.f5444l.length));
                    if (i == -1) {
                        hg3.a();
                        return;
                    }
                    long j5 = i;
                    xjp0.m11837b(this.f5444l, j5, this.f5443k, this.f5439g);
                    buffer.write(this.f5444l, 0, i);
                    this.f5439g += j5;
                }
            } else {
                this.f5434b.readFully(buffer, j2);
            }
        }
        switch (this.f5437e) {
            case 8:
                long size = buffer.size();
                if (size == 1) {
                    aza0.a("Malformed close payload length of 1.");
                    return;
                }
                if (size != 0) {
                    s = buffer.readShort();
                    utf8 = buffer.readUtf8();
                    String strM11836a = xjp0.m11836a(s);
                    if (strM11836a != null) {
                        aza0.a(strM11836a);
                        return;
                    }
                } else {
                    s = 1005;
                    utf8 = "";
                }
                this.f5435c.onReadClose(s, utf8);
                this.f5436d = true;
                return;
            case 9:
                this.f5435c.mo9131a(buffer.readByteString());
                return;
            case 10:
                this.f5435c.mo9132b(buffer.readByteString());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f5437e));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11930c() throws IOException {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f5436d) {
            rhg0.a("closed");
            return;
        }
        long jTimeoutNanos = this.f5434b.timeout().timeoutNanos();
        this.f5434b.timeout().clearTimeout();
        try {
            byte b = this.f5434b.readByte();
            this.f5434b.timeout().timeout(jTimeoutNanos, timeUnit);
            this.f5437e = b & 15;
            boolean z = (b & 128) != 0;
            this.f5440h = z;
            boolean z2 = (b & 8) != 0;
            this.f5441i = z2;
            if (z2 && !z) {
                aza0.a("Control frames must be final.");
                return;
            }
            boolean z3 = (b & 64) != 0;
            boolean z4 = (b & 32) != 0;
            boolean z5 = (b & 16) != 0;
            if (z3 || z4 || z5) {
                aza0.a("Reserved flags are unsupported.");
                return;
            }
            byte b2 = this.f5434b.readByte();
            boolean z6 = (b2 & 128) != 0;
            this.f5442j = z6;
            if (z6 == this.f5433a) {
                throw new ProtocolException(this.f5433a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = b2 & 127;
            this.f5438f = j;
            if (j == 126) {
                this.f5438f = ((long) this.f5434b.readShort()) & 65535;
            } else if (j == 127) {
                long j2 = this.f5434b.readLong();
                this.f5438f = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f5438f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            this.f5439g = 0L;
            if (this.f5441i && this.f5438f > 125) {
                aza0.a("Control frame must be less than 125B.");
            } else if (this.f5442j) {
                this.f5434b.readFully(this.f5443k);
            }
        } catch (Throwable th) {
            this.f5434b.timeout().timeout(jTimeoutNanos, timeUnit);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11931d(Buffer buffer) throws IOException {
        long j;
        while (!this.f5436d) {
            if (this.f5439g == this.f5438f) {
                if (this.f5440h) {
                    return;
                }
                m11933f();
                if (this.f5437e != 0) {
                    throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.f5437e));
                }
                if (this.f5440h && this.f5438f == 0) {
                    return;
                }
            }
            long j2 = this.f5438f - this.f5439g;
            if (this.f5442j) {
                j = this.f5434b.read(this.f5444l, 0, (int) Math.min(j2, this.f5444l.length));
                if (j == -1) {
                    hg3.a();
                    return;
                } else {
                    xjp0.m11837b(this.f5444l, j, this.f5443k, this.f5439g);
                    buffer.write(this.f5444l, 0, (int) j);
                }
            } else {
                j = this.f5434b.read(buffer, j2);
                if (j == -1) {
                    hg3.a();
                    return;
                }
            }
            this.f5439g += j;
        }
        rhg0.a("closed");
    }

    /* JADX INFO: renamed from: e */
    public final void m11932e() throws IOException {
        int i = this.f5437e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        Buffer buffer = new Buffer();
        m11931d(buffer);
        InterfaceC0793a interfaceC0793a = this.f5435c;
        if (i == 1) {
            interfaceC0793a.onReadMessage(buffer.readUtf8());
        } else {
            interfaceC0793a.mo9133d(buffer.readByteString());
        }
    }

    /* JADX INFO: renamed from: f */
    public void m11933f() throws IOException {
        while (!this.f5436d) {
            m11930c();
            if (!this.f5441i) {
                return;
            } else {
                m11929b();
            }
        }
    }
}
