package p153l;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes2.dex */
public final class dtp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f90611a;

    /* JADX INFO: renamed from: b */
    public final BufferedSource f90612b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC16620a f90613c;

    /* JADX INFO: renamed from: d */
    public boolean f90614d;

    /* JADX INFO: renamed from: e */
    public int f90615e;

    /* JADX INFO: renamed from: f */
    public long f90616f;

    /* JADX INFO: renamed from: g */
    public boolean f90617g;

    /* JADX INFO: renamed from: h */
    public boolean f90618h;

    /* JADX INFO: renamed from: i */
    public final Buffer f90619i = new Buffer();

    /* JADX INFO: renamed from: j */
    public final Buffer f90620j = new Buffer();

    /* JADX INFO: renamed from: k */
    public final byte[] f90621k;

    /* JADX INFO: renamed from: l */
    public final Buffer.UnsafeCursor f90622l;

    /* JADX INFO: renamed from: l.dtp0$a */
    public interface InterfaceC16620a {
        /* JADX INFO: renamed from: a */
        void mo117895a(ByteString byteString);

        /* JADX INFO: renamed from: b */
        void mo117896b(ByteString byteString);

        /* JADX INFO: renamed from: d */
        void mo117897d(ByteString byteString) throws IOException;

        void onReadClose(int i, String str);

        void onReadMessage(String str) throws IOException;
    }

    public dtp0(boolean z, BufferedSource bufferedSource, InterfaceC16620a interfaceC16620a) {
        if (bufferedSource == null) {
            mnd0.m159157a("source == null");
            throw null;
        }
        if (interfaceC16620a == null) {
            mnd0.m159157a("frameCallback == null");
            throw null;
        }
        this.f90611a = z;
        this.f90612b = bufferedSource;
        this.f90613c = interfaceC16620a;
        this.f90621k = z ? null : new byte[4];
        this.f90622l = z ? null : new Buffer.UnsafeCursor();
    }

    /* JADX INFO: renamed from: a */
    public void m117889a() throws IOException {
        m117891c();
        if (this.f90618h) {
            m117890b();
        } else {
            m117893e();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m117890b() throws IOException {
        short s;
        String utf8;
        long j = this.f90616f;
        if (j > 0) {
            this.f90612b.readFully(this.f90619i, j);
            if (!this.f90611a) {
                this.f90619i.readAndWriteUnsafe(this.f90622l);
                this.f90622l.seek(0L);
                atp0.m100225b(this.f90622l, this.f90621k);
                this.f90622l.close();
            }
        }
        switch (this.f90615e) {
            case 8:
                long size = this.f90619i.size();
                if (size == 1) {
                    e7b0.m119688a("Malformed close payload length of 1.");
                    return;
                }
                if (size != 0) {
                    s = this.f90619i.readShort();
                    utf8 = this.f90619i.readUtf8();
                    String strM100224a = atp0.m100224a(s);
                    if (strM100224a != null) {
                        e7b0.m119688a(strM100224a);
                        return;
                    }
                } else {
                    s = 1005;
                    utf8 = "";
                }
                this.f90613c.onReadClose(s, utf8);
                this.f90614d = true;
                return;
            case 9:
                this.f90613c.mo117895a(this.f90619i.readByteString());
                return;
            case 10:
                this.f90613c.mo117896b(this.f90619i.readByteString());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f90615e));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m117891c() throws IOException {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f90614d) {
            zpg0.m220844a("closed");
            return;
        }
        long timeoutNanos = this.f90612b.getTimeout().getTimeoutNanos();
        this.f90612b.getTimeout().clearTimeout();
        try {
            byte b = this.f90612b.readByte();
            this.f90612b.getTimeout().timeout(timeoutNanos, timeUnit);
            this.f90615e = b & 15;
            boolean z = (b & 128) != 0;
            this.f90617g = z;
            boolean z2 = (b & 8) != 0;
            this.f90618h = z2;
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
            byte b2 = this.f90612b.readByte();
            boolean z6 = (b2 & 128) != 0;
            if (z6 == this.f90611a) {
                throw new ProtocolException(this.f90611a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = b2 & 127;
            this.f90616f = j;
            if (j == 126) {
                this.f90616f = ((long) this.f90612b.readShort()) & 65535;
            } else if (j == 127) {
                long j2 = this.f90612b.readLong();
                this.f90616f = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f90616f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f90618h && this.f90616f > 125) {
                e7b0.m119688a("Control frame must be less than 125B.");
            } else if (z6) {
                this.f90612b.readFully(this.f90621k);
            }
        } catch (Throwable th) {
            this.f90612b.getTimeout().timeout(timeoutNanos, timeUnit);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m117892d() throws IOException {
        while (!this.f90614d) {
            long j = this.f90616f;
            if (j > 0) {
                this.f90612b.readFully(this.f90620j, j);
                if (!this.f90611a) {
                    this.f90620j.readAndWriteUnsafe(this.f90622l);
                    this.f90622l.seek(this.f90620j.size() - this.f90616f);
                    atp0.m100225b(this.f90622l, this.f90621k);
                    this.f90622l.close();
                }
            }
            if (this.f90617g) {
                return;
            }
            m117894f();
            if (this.f90615e != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.f90615e));
            }
        }
        zpg0.m220844a("closed");
    }

    /* JADX INFO: renamed from: e */
    public final void m117893e() throws IOException {
        int i = this.f90615e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        m117892d();
        InterfaceC16620a interfaceC16620a = this.f90613c;
        if (i == 1) {
            interfaceC16620a.onReadMessage(this.f90620j.readUtf8());
        } else {
            interfaceC16620a.mo117897d(this.f90620j.readByteString());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m117894f() throws IOException {
        while (!this.f90614d) {
            m117891c();
            if (!this.f90618h) {
                return;
            } else {
                m117890b();
            }
        }
    }
}
