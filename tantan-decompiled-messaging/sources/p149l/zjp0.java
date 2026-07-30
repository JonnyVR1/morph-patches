package p149l;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes2.dex */
public final class zjp0 {

    /* JADX INFO: renamed from: a */
    public final boolean f203438a;

    /* JADX INFO: renamed from: b */
    public final BufferedSource f203439b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21716a f203440c;

    /* JADX INFO: renamed from: d */
    public boolean f203441d;

    /* JADX INFO: renamed from: e */
    public int f203442e;

    /* JADX INFO: renamed from: f */
    public long f203443f;

    /* JADX INFO: renamed from: g */
    public boolean f203444g;

    /* JADX INFO: renamed from: h */
    public boolean f203445h;

    /* JADX INFO: renamed from: i */
    public final Buffer f203446i = new Buffer();

    /* JADX INFO: renamed from: j */
    public final Buffer f203447j = new Buffer();

    /* JADX INFO: renamed from: k */
    public final byte[] f203448k;

    /* JADX INFO: renamed from: l */
    public final Buffer.UnsafeCursor f203449l;

    /* JADX INFO: renamed from: l.zjp0$a */
    public interface InterfaceC21716a {
        /* JADX INFO: renamed from: a */
        void mo106490a(ByteString byteString);

        /* JADX INFO: renamed from: b */
        void mo106491b(ByteString byteString);

        /* JADX INFO: renamed from: d */
        void mo106493d(ByteString byteString) throws IOException;

        void onReadClose(int i, String str);

        void onReadMessage(String str) throws IOException;
    }

    public zjp0(boolean z, BufferedSource bufferedSource, InterfaceC21716a interfaceC21716a) {
        if (bufferedSource == null) {
            jfd0.m141176a("source == null");
            throw null;
        }
        if (interfaceC21716a == null) {
            jfd0.m141176a("frameCallback == null");
            throw null;
        }
        this.f203438a = z;
        this.f203439b = bufferedSource;
        this.f203440c = interfaceC21716a;
        this.f203448k = z ? null : new byte[4];
        this.f203449l = z ? null : new Buffer.UnsafeCursor();
    }

    /* JADX INFO: renamed from: a */
    public void m219128a() throws IOException {
        m219130c();
        if (this.f203445h) {
            m219129b();
        } else {
            m219132e();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m219129b() throws IOException {
        short s;
        String utf8;
        long j = this.f203443f;
        if (j > 0) {
            this.f203439b.readFully(this.f203446i, j);
            if (!this.f203438a) {
                this.f203446i.readAndWriteUnsafe(this.f203449l);
                this.f203449l.seek(0L);
                wjp0.m203481b(this.f203449l, this.f203448k);
                this.f203449l.close();
            }
        }
        switch (this.f203442e) {
            case 8:
                long size = this.f203446i.size();
                if (size == 1) {
                    aza0.m99642a("Malformed close payload length of 1.");
                    return;
                }
                if (size != 0) {
                    s = this.f203446i.readShort();
                    utf8 = this.f203446i.readUtf8();
                    String strM203480a = wjp0.m203480a(s);
                    if (strM203480a != null) {
                        aza0.m99642a(strM203480a);
                        return;
                    }
                } else {
                    s = 1005;
                    utf8 = "";
                }
                this.f203440c.onReadClose(s, utf8);
                this.f203441d = true;
                return;
            case 9:
                this.f203440c.mo106490a(this.f203446i.readByteString());
                return;
            case 10:
                this.f203440c.mo106491b(this.f203446i.readByteString());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.f203442e));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m219130c() throws IOException {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f203441d) {
            rhg0.m179353a("closed");
            return;
        }
        long timeoutNanos = this.f203439b.getTimeout().getTimeoutNanos();
        this.f203439b.getTimeout().clearTimeout();
        try {
            byte b = this.f203439b.readByte();
            this.f203439b.getTimeout().timeout(timeoutNanos, timeUnit);
            this.f203442e = b & 15;
            boolean z = (b & 128) != 0;
            this.f203444g = z;
            boolean z2 = (b & 8) != 0;
            this.f203445h = z2;
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
            byte b2 = this.f203439b.readByte();
            boolean z6 = (b2 & 128) != 0;
            if (z6 == this.f203438a) {
                throw new ProtocolException(this.f203438a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j = b2 & 127;
            this.f203443f = j;
            if (j == 126) {
                this.f203443f = ((long) this.f203439b.readShort()) & 65535;
            } else if (j == 127) {
                long j2 = this.f203439b.readLong();
                this.f203443f = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.f203443f) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f203445h && this.f203443f > 125) {
                aza0.m99642a("Control frame must be less than 125B.");
            } else if (z6) {
                this.f203439b.readFully(this.f203448k);
            }
        } catch (Throwable th) {
            this.f203439b.getTimeout().timeout(timeoutNanos, timeUnit);
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m219131d() throws IOException {
        while (!this.f203441d) {
            long j = this.f203443f;
            if (j > 0) {
                this.f203439b.readFully(this.f203447j, j);
                if (!this.f203438a) {
                    this.f203447j.readAndWriteUnsafe(this.f203449l);
                    this.f203449l.seek(this.f203447j.size() - this.f203443f);
                    wjp0.m203481b(this.f203449l, this.f203448k);
                    this.f203449l.close();
                }
            }
            if (this.f203444g) {
                return;
            }
            m219133f();
            if (this.f203442e != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(this.f203442e));
            }
        }
        rhg0.m179353a("closed");
    }

    /* JADX INFO: renamed from: e */
    public final void m219132e() throws IOException {
        int i = this.f203442e;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
        }
        m219131d();
        InterfaceC21716a interfaceC21716a = this.f203440c;
        if (i == 1) {
            interfaceC21716a.onReadMessage(this.f203447j.readUtf8());
        } else {
            interfaceC21716a.mo106493d(this.f203447j.readByteString());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m219133f() throws IOException {
        while (!this.f203441d) {
            m219130c();
            if (!this.f203445h) {
                return;
            } else {
                m219129b();
            }
        }
    }
}
