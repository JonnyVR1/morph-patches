package p149l;

import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes2.dex */
public final class ojl implements Closeable {

    /* JADX INFO: renamed from: e */
    public static final Logger f144301e = Logger.getLogger(ljl.class.getName());

    /* JADX INFO: renamed from: a */
    public final BufferedSource f144302a;

    /* JADX INFO: renamed from: b */
    public final C18962a f144303b;

    /* JADX INFO: renamed from: c */
    public final boolean f144304c;

    /* JADX INFO: renamed from: d */
    public final ijl.C17565a f144305d;

    /* JADX INFO: renamed from: l.ojl$b */
    public interface InterfaceC18963b {
        /* JADX INFO: renamed from: a */
        void mo154886a(int i, int i2, List<hxk> list) throws IOException;

        /* JADX INFO: renamed from: b */
        void mo154887b(boolean z, int i, int i2);

        /* JADX INFO: renamed from: c */
        void mo154888c(int i, ErrorCode errorCode);

        /* JADX INFO: renamed from: d */
        void mo154889d(int i, ErrorCode errorCode, ByteString byteString);

        /* JADX INFO: renamed from: e */
        void mo154890e(boolean z, int i, int i2, List<hxk> list);

        /* JADX INFO: renamed from: f */
        void mo154891f(int i, long j);

        /* JADX INFO: renamed from: g */
        void mo154892g();

        /* JADX INFO: renamed from: h */
        void mo154893h(boolean z, one0 one0Var);

        /* JADX INFO: renamed from: i */
        void mo154894i(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException;

        /* JADX INFO: renamed from: j */
        void mo154895j(int i, int i2, int i3, boolean z);
    }

    public ojl(BufferedSource bufferedSource, boolean z) {
        this.f144302a = bufferedSource;
        this.f144304c = z;
        C18962a c18962a = new C18962a(bufferedSource);
        this.f144303b = c18962a;
        this.f144305d = new ijl.C17565a(4096, c18962a);
    }

    /* JADX INFO: renamed from: b */
    public static int m164661b(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw ljl.m149985d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k */
    public static int m164662k(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: B */
    public final void m164663B(InterfaceC18963b interfaceC18963b, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw ljl.m149985d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
        long j = ((long) this.f144302a.readInt()) & 2147483647L;
        if (j == 0) {
            throw ljl.m149985d("windowSizeIncrement was 0", Long.valueOf(j));
        }
        interfaceC18963b.mo154891f(i2, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f144302a.close();
    }

    /* JADX INFO: renamed from: d */
    public boolean m164664d(boolean z, InterfaceC18963b interfaceC18963b) throws IOException {
        try {
            this.f144302a.require(9L);
            int iM164662k = m164662k(this.f144302a);
            if (iM164662k < 0 || iM164662k > 16384) {
                throw ljl.m149985d("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM164662k));
            }
            byte b = (byte) (this.f144302a.readByte() & 255);
            if (z && b != 4) {
                throw ljl.m149985d("Expected a SETTINGS frame but was %s", Byte.valueOf(b));
            }
            byte b2 = (byte) (this.f144302a.readByte() & 255);
            int i = this.f144302a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            Logger logger = f144301e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(ljl.m149983b(true, i, iM164662k, b, b2));
            }
            switch (b) {
                case 0:
                    m164666g(interfaceC18963b, iM164662k, b2, i);
                    return true;
                case 1:
                    m164669j(interfaceC18963b, iM164662k, b2, i);
                    return true;
                case 2:
                    m164672q(interfaceC18963b, iM164662k, b2, i);
                    return true;
                case 3:
                    m164674u(interfaceC18963b, iM164662k, b2, i);
                    return true;
                case 4:
                    m164675v(interfaceC18963b, iM164662k, b2, i);
                    return true;
                case 5:
                    m164673t(interfaceC18963b, iM164662k, b2, i);
                    return true;
                case 6:
                    m164670m(interfaceC18963b, iM164662k, b2, i);
                    return true;
                case 7:
                    m164667h(interfaceC18963b, iM164662k, b2, i);
                    return true;
                case 8:
                    m164663B(interfaceC18963b, iM164662k, b2, i);
                    return true;
                default:
                    this.f144302a.skip(iM164662k);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m164665e(InterfaceC18963b interfaceC18963b) throws IOException {
        if (this.f144304c) {
            if (!m164664d(true, interfaceC18963b)) {
                throw ljl.m149985d("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        BufferedSource bufferedSource = this.f144302a;
        ByteString byteString = ljl.f128336a;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger = f144301e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(tck0.m188016q("<< CONNECTION %s", byteString2.hex()));
        }
        if (!byteString.equals(byteString2)) {
            throw ljl.m149985d("Expected a connection header but was %s", byteString2.utf8());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m164666g(InterfaceC18963b interfaceC18963b, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw ljl.m149985d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z = (b & 1) != 0;
        if ((b & HttpTokens.SPACE) != 0) {
            throw ljl.m149985d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short s = (b & 8) != 0 ? (short) (this.f144302a.readByte() & 255) : (short) 0;
        interfaceC18963b.mo154894i(z, i2, this.f144302a, m164661b(i, b, s));
        this.f144302a.skip(s);
    }

    /* JADX INFO: renamed from: h */
    public final void m164667h(InterfaceC18963b interfaceC18963b, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            throw ljl.m149985d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw ljl.m149985d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int i3 = this.f144302a.readInt();
        int i4 = this.f144302a.readInt();
        int i5 = i - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.fromHttp2(i4);
        if (errorCodeFromHttp2 == null) {
            throw ljl.m149985d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
        }
        ByteString byteString = ByteString.EMPTY;
        if (i5 > 0) {
            byteString = this.f144302a.readByteString(i5);
        }
        interfaceC18963b.mo154889d(i3, errorCodeFromHttp2, byteString);
    }

    /* JADX INFO: renamed from: i */
    public final List<hxk> m164668i(int i, short s, byte b, int i2) throws IOException {
        C18962a c18962a = this.f144303b;
        c18962a.f144310e = i;
        c18962a.f144307b = i;
        c18962a.f144311f = s;
        c18962a.f144308c = b;
        c18962a.f144309d = i2;
        this.f144305d.m136638k();
        return this.f144305d.m136632e();
    }

    /* JADX INFO: renamed from: j */
    public final void m164669j(InterfaceC18963b interfaceC18963b, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw ljl.m149985d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z = (b & 1) != 0;
        short s = (b & 8) != 0 ? (short) (this.f144302a.readByte() & 255) : (short) 0;
        if ((b & HttpTokens.SPACE) != 0) {
            m164671n(interfaceC18963b, i2);
            i -= 5;
        }
        interfaceC18963b.mo154890e(z, i2, -1, m164668i(m164661b(i, b, s), s, b, i2));
    }

    /* JADX INFO: renamed from: m */
    public final void m164670m(InterfaceC18963b interfaceC18963b, int i, byte b, int i2) throws IOException {
        if (i != 8) {
            throw ljl.m149985d("TYPE_PING length != 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw ljl.m149985d("TYPE_PING streamId != 0", new Object[0]);
        }
        interfaceC18963b.mo154887b((b & 1) != 0, this.f144302a.readInt(), this.f144302a.readInt());
    }

    /* JADX INFO: renamed from: n */
    public final void m164671n(InterfaceC18963b interfaceC18963b, int i) throws IOException {
        int i2 = this.f144302a.readInt();
        interfaceC18963b.mo154895j(i, i2 & Api.BaseClientBuilder.API_PRIORITY_OTHER, (this.f144302a.readByte() & 255) + 1, (Integer.MIN_VALUE & i2) != 0);
    }

    /* JADX INFO: renamed from: q */
    public final void m164672q(InterfaceC18963b interfaceC18963b, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            throw ljl.m149985d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw ljl.m149985d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        m164671n(interfaceC18963b, i2);
    }

    /* JADX INFO: renamed from: t */
    public final void m164673t(InterfaceC18963b interfaceC18963b, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw ljl.m149985d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short s = (b & 8) != 0 ? (short) (this.f144302a.readByte() & 255) : (short) 0;
        interfaceC18963b.mo154886a(i2, this.f144302a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER, m164668i(m164661b(i - 4, b, s), s, b, i2));
    }

    /* JADX INFO: renamed from: u */
    public final void m164674u(InterfaceC18963b interfaceC18963b, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw ljl.m149985d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw ljl.m149985d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int i3 = this.f144302a.readInt();
        ErrorCode errorCodeFromHttp2 = ErrorCode.fromHttp2(i3);
        if (errorCodeFromHttp2 == null) {
            throw ljl.m149985d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
        }
        interfaceC18963b.mo154888c(i2, errorCodeFromHttp2);
    }

    /* JADX INFO: renamed from: v */
    public final void m164675v(InterfaceC18963b interfaceC18963b, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            throw ljl.m149985d("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b & 1) != 0) {
            if (i != 0) {
                throw ljl.m149985d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            interfaceC18963b.mo154892g();
            return;
        }
        if (i % 6 != 0) {
            throw ljl.m149985d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
        one0 one0Var = new one0();
        for (int i3 = 0; i3 < i; i3 += 6) {
            int i4 = this.f144302a.readShort() & 65535;
            int i5 = this.f144302a.readInt();
            if (i4 == 2) {
                if (i5 != 0 && i5 != 1) {
                    throw ljl.m149985d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            } else if (i4 == 3) {
                i4 = 4;
            } else if (i4 != 4) {
                if (i4 == 5 && (i5 < 16384 || i5 > 16777215)) {
                    throw ljl.m149985d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i5));
                }
            } else {
                if (i5 < 0) {
                    throw ljl.m149985d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                }
                i4 = 7;
            }
            one0Var.m165178i(i4, i5);
        }
        interfaceC18963b.mo154893h(false, one0Var);
    }

    /* JADX INFO: renamed from: l.ojl$a */
    public static final class C18962a implements Source {

        /* JADX INFO: renamed from: a */
        public final BufferedSource f144306a;

        /* JADX INFO: renamed from: b */
        public int f144307b;

        /* JADX INFO: renamed from: c */
        public byte f144308c;

        /* JADX INFO: renamed from: d */
        public int f144309d;

        /* JADX INFO: renamed from: e */
        public int f144310e;

        /* JADX INFO: renamed from: f */
        public short f144311f;

        public C18962a(BufferedSource bufferedSource) {
            this.f144306a = bufferedSource;
        }

        /* JADX INFO: renamed from: k */
        public final void m164676k() throws IOException {
            int i = this.f144309d;
            int iM164662k = ojl.m164662k(this.f144306a);
            this.f144310e = iM164662k;
            this.f144307b = iM164662k;
            byte b = (byte) (this.f144306a.readByte() & 255);
            this.f144308c = (byte) (this.f144306a.readByte() & 255);
            Logger logger = ojl.f144301e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(ljl.m149983b(true, this.f144309d, this.f144307b, b, this.f144308c));
            }
            int i2 = this.f144306a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f144309d = i2;
            if (b != 9) {
                throw ljl.m149985d("%s != TYPE_CONTINUATION", Byte.valueOf(b));
            }
            if (i2 != i) {
                throw ljl.m149985d("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            while (true) {
                int i = this.f144310e;
                BufferedSource bufferedSource = this.f144306a;
                if (i != 0) {
                    long j2 = bufferedSource.read(buffer, Math.min(j, i));
                    if (j2 == -1) {
                        return -1L;
                    }
                    this.f144310e = (int) (((long) this.f144310e) - j2);
                    return j2;
                }
                bufferedSource.skip(this.f144311f);
                this.f144311f = (short) 0;
                if ((this.f144308c & 4) != 0) {
                    return -1L;
                }
                m164676k();
            }
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return this.f144306a.getTimeout();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
