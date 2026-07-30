package p153l;

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
public final class fml implements Closeable {

    /* JADX INFO: renamed from: e */
    public static final Logger f99786e = Logger.getLogger(cml.class.getName());

    /* JADX INFO: renamed from: a */
    public final BufferedSource f99787a;

    /* JADX INFO: renamed from: b */
    public final C17014a f99788b;

    /* JADX INFO: renamed from: c */
    public final boolean f99789c;

    /* JADX INFO: renamed from: d */
    public final zll.C21835a f99790d;

    /* JADX INFO: renamed from: l.fml$b */
    public interface InterfaceC17015b {
        /* JADX INFO: renamed from: a */
        void mo117011a(int i, int i2, List<xzk> list) throws IOException;

        /* JADX INFO: renamed from: b */
        void mo117012b(boolean z, int i, int i2);

        /* JADX INFO: renamed from: c */
        void mo117013c(int i, ErrorCode errorCode);

        /* JADX INFO: renamed from: d */
        void mo117014d(int i, ErrorCode errorCode, ByteString byteString);

        /* JADX INFO: renamed from: e */
        void mo117015e(boolean z, int i, int i2, List<xzk> list);

        /* JADX INFO: renamed from: f */
        void mo117016f(int i, long j);

        /* JADX INFO: renamed from: g */
        void mo117017g();

        /* JADX INFO: renamed from: h */
        void mo117018h(boolean z, vve0 vve0Var);

        /* JADX INFO: renamed from: i */
        void mo117019i(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException;

        /* JADX INFO: renamed from: j */
        void mo117020j(int i, int i2, int i3, boolean z);
    }

    public fml(BufferedSource bufferedSource, boolean z) {
        this.f99787a = bufferedSource;
        this.f99789c = z;
        C17014a c17014a = new C17014a(bufferedSource);
        this.f99788b = c17014a;
        this.f99790d = new zll.C21835a(4096, c17014a);
    }

    /* JADX INFO: renamed from: b */
    public static int m126242b(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw cml.m111285d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k */
    public static int m126243k(BufferedSource bufferedSource) throws IOException {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: B */
    public final void m126244B(InterfaceC17015b interfaceC17015b, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw cml.m111285d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
        long j = ((long) this.f99787a.readInt()) & 2147483647L;
        if (j == 0) {
            throw cml.m111285d("windowSizeIncrement was 0", Long.valueOf(j));
        }
        interfaceC17015b.mo117016f(i2, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f99787a.close();
    }

    /* JADX INFO: renamed from: d */
    public boolean m126245d(boolean z, InterfaceC17015b interfaceC17015b) throws IOException {
        try {
            this.f99787a.require(9L);
            int iM126243k = m126243k(this.f99787a);
            if (iM126243k < 0 || iM126243k > 16384) {
                throw cml.m111285d("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM126243k));
            }
            byte b = (byte) (this.f99787a.readByte() & 255);
            if (z && b != 4) {
                throw cml.m111285d("Expected a SETTINGS frame but was %s", Byte.valueOf(b));
            }
            byte b2 = (byte) (this.f99787a.readByte() & 255);
            int i = this.f99787a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            Logger logger = f99786e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(cml.m111283b(true, i, iM126243k, b, b2));
            }
            switch (b) {
                case 0:
                    m126247g(interfaceC17015b, iM126243k, b2, i);
                    return true;
                case 1:
                    m126250j(interfaceC17015b, iM126243k, b2, i);
                    return true;
                case 2:
                    m126253q(interfaceC17015b, iM126243k, b2, i);
                    return true;
                case 3:
                    m126255u(interfaceC17015b, iM126243k, b2, i);
                    return true;
                case 4:
                    m126256v(interfaceC17015b, iM126243k, b2, i);
                    return true;
                case 5:
                    m126254t(interfaceC17015b, iM126243k, b2, i);
                    return true;
                case 6:
                    m126251m(interfaceC17015b, iM126243k, b2, i);
                    return true;
                case 7:
                    m126248h(interfaceC17015b, iM126243k, b2, i);
                    return true;
                case 8:
                    m126244B(interfaceC17015b, iM126243k, b2, i);
                    return true;
                default:
                    this.f99787a.skip(iM126243k);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m126246e(InterfaceC17015b interfaceC17015b) throws IOException {
        if (this.f99789c) {
            if (!m126245d(true, interfaceC17015b)) {
                throw cml.m111285d("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        BufferedSource bufferedSource = this.f99787a;
        ByteString byteString = cml.f82622a;
        ByteString byteString2 = bufferedSource.readByteString(byteString.size());
        Logger logger = f99786e;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(zlk0.m220255q("<< CONNECTION %s", byteString2.hex()));
        }
        if (!byteString.equals(byteString2)) {
            throw cml.m111285d("Expected a connection header but was %s", byteString2.utf8());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m126247g(InterfaceC17015b interfaceC17015b, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw cml.m111285d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z = (b & 1) != 0;
        if ((b & HttpTokens.SPACE) != 0) {
            throw cml.m111285d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short s = (b & 8) != 0 ? (short) (this.f99787a.readByte() & 255) : (short) 0;
        interfaceC17015b.mo117019i(z, i2, this.f99787a, m126242b(i, b, s));
        this.f99787a.skip(s);
    }

    /* JADX INFO: renamed from: h */
    public final void m126248h(InterfaceC17015b interfaceC17015b, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            throw cml.m111285d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw cml.m111285d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int i3 = this.f99787a.readInt();
        int i4 = this.f99787a.readInt();
        int i5 = i - 8;
        ErrorCode errorCodeFromHttp2 = ErrorCode.fromHttp2(i4);
        if (errorCodeFromHttp2 == null) {
            throw cml.m111285d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i4));
        }
        ByteString byteString = ByteString.EMPTY;
        if (i5 > 0) {
            byteString = this.f99787a.readByteString(i5);
        }
        interfaceC17015b.mo117014d(i3, errorCodeFromHttp2, byteString);
    }

    /* JADX INFO: renamed from: i */
    public final List<xzk> m126249i(int i, short s, byte b, int i2) throws IOException {
        C17014a c17014a = this.f99788b;
        c17014a.f99795e = i;
        c17014a.f99792b = i;
        c17014a.f99796f = s;
        c17014a.f99793c = b;
        c17014a.f99794d = i2;
        this.f99790d.m220277k();
        return this.f99790d.m220271e();
    }

    /* JADX INFO: renamed from: j */
    public final void m126250j(InterfaceC17015b interfaceC17015b, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw cml.m111285d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z = (b & 1) != 0;
        short s = (b & 8) != 0 ? (short) (this.f99787a.readByte() & 255) : (short) 0;
        if ((b & HttpTokens.SPACE) != 0) {
            m126252n(interfaceC17015b, i2);
            i -= 5;
        }
        interfaceC17015b.mo117015e(z, i2, -1, m126249i(m126242b(i, b, s), s, b, i2));
    }

    /* JADX INFO: renamed from: m */
    public final void m126251m(InterfaceC17015b interfaceC17015b, int i, byte b, int i2) throws IOException {
        if (i != 8) {
            throw cml.m111285d("TYPE_PING length != 8: %s", Integer.valueOf(i));
        }
        if (i2 != 0) {
            throw cml.m111285d("TYPE_PING streamId != 0", new Object[0]);
        }
        interfaceC17015b.mo117012b((b & 1) != 0, this.f99787a.readInt(), this.f99787a.readInt());
    }

    /* JADX INFO: renamed from: n */
    public final void m126252n(InterfaceC17015b interfaceC17015b, int i) throws IOException {
        int i2 = this.f99787a.readInt();
        interfaceC17015b.mo117020j(i, i2 & Api.BaseClientBuilder.API_PRIORITY_OTHER, (this.f99787a.readByte() & 255) + 1, (Integer.MIN_VALUE & i2) != 0);
    }

    /* JADX INFO: renamed from: q */
    public final void m126253q(InterfaceC17015b interfaceC17015b, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            throw cml.m111285d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw cml.m111285d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        m126252n(interfaceC17015b, i2);
    }

    /* JADX INFO: renamed from: t */
    public final void m126254t(InterfaceC17015b interfaceC17015b, int i, byte b, int i2) throws IOException {
        if (i2 == 0) {
            throw cml.m111285d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short s = (b & 8) != 0 ? (short) (this.f99787a.readByte() & 255) : (short) 0;
        interfaceC17015b.mo117011a(i2, this.f99787a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER, m126249i(m126242b(i - 4, b, s), s, b, i2));
    }

    /* JADX INFO: renamed from: u */
    public final void m126255u(InterfaceC17015b interfaceC17015b, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw cml.m111285d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        }
        if (i2 == 0) {
            throw cml.m111285d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int i3 = this.f99787a.readInt();
        ErrorCode errorCodeFromHttp2 = ErrorCode.fromHttp2(i3);
        if (errorCodeFromHttp2 == null) {
            throw cml.m111285d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i3));
        }
        interfaceC17015b.mo117013c(i2, errorCodeFromHttp2);
    }

    /* JADX INFO: renamed from: v */
    public final void m126256v(InterfaceC17015b interfaceC17015b, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            throw cml.m111285d("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b & 1) != 0) {
            if (i != 0) {
                throw cml.m111285d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            interfaceC17015b.mo117017g();
            return;
        }
        if (i % 6 != 0) {
            throw cml.m111285d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
        vve0 vve0Var = new vve0();
        for (int i3 = 0; i3 < i; i3 += 6) {
            int i4 = this.f99787a.readShort() & 65535;
            int i5 = this.f99787a.readInt();
            if (i4 == 2) {
                if (i5 != 0 && i5 != 1) {
                    throw cml.m111285d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            } else if (i4 == 3) {
                i4 = 4;
            } else if (i4 != 4) {
                if (i4 == 5 && (i5 < 16384 || i5 > 16777215)) {
                    throw cml.m111285d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i5));
                }
            } else {
                if (i5 < 0) {
                    throw cml.m111285d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                }
                i4 = 7;
            }
            vve0Var.m203011i(i4, i5);
        }
        interfaceC17015b.mo117018h(false, vve0Var);
    }

    /* JADX INFO: renamed from: l.fml$a */
    public static final class C17014a implements Source {

        /* JADX INFO: renamed from: a */
        public final BufferedSource f99791a;

        /* JADX INFO: renamed from: b */
        public int f99792b;

        /* JADX INFO: renamed from: c */
        public byte f99793c;

        /* JADX INFO: renamed from: d */
        public int f99794d;

        /* JADX INFO: renamed from: e */
        public int f99795e;

        /* JADX INFO: renamed from: f */
        public short f99796f;

        public C17014a(BufferedSource bufferedSource) {
            this.f99791a = bufferedSource;
        }

        /* JADX INFO: renamed from: k */
        public final void m126257k() throws IOException {
            int i = this.f99794d;
            int iM126243k = fml.m126243k(this.f99791a);
            this.f99795e = iM126243k;
            this.f99792b = iM126243k;
            byte b = (byte) (this.f99791a.readByte() & 255);
            this.f99793c = (byte) (this.f99791a.readByte() & 255);
            Logger logger = fml.f99786e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(cml.m111283b(true, this.f99794d, this.f99792b, b, this.f99793c));
            }
            int i2 = this.f99791a.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f99794d = i2;
            if (b != 9) {
                throw cml.m111285d("%s != TYPE_CONTINUATION", Byte.valueOf(b));
            }
            if (i2 != i) {
                throw cml.m111285d("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            while (true) {
                int i = this.f99795e;
                BufferedSource bufferedSource = this.f99791a;
                if (i != 0) {
                    long j2 = bufferedSource.read(buffer, Math.min(j, i));
                    if (j2 == -1) {
                        return -1L;
                    }
                    this.f99795e = (int) (((long) this.f99795e) - j2);
                    return j2;
                }
                bufferedSource.skip(this.f99796f);
                this.f99796f = (short) 0;
                if ((this.f99793c & 4) != 0) {
                    return -1L;
                }
                m126257k();
            }
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return this.f99791a.getTimeout();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
