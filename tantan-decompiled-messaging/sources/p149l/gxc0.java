package p149l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gxc0 implements Closeable {
    private Reader reader;

    /* JADX INFO: renamed from: l.gxc0$a */
    public static class C17191a extends gxc0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ hyx f104863a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f104864b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BufferedSource f104865c;

        public C17191a(hyx hyxVar, long j, BufferedSource bufferedSource) {
            this.f104863a = hyxVar;
            this.f104864b = j;
            this.f104865c = bufferedSource;
        }

        @Override // p149l.gxc0
        public long contentLength() {
            return this.f104864b;
        }

        @Override // p149l.gxc0
        public hyx contentType() {
            return this.f104863a;
        }

        @Override // p149l.gxc0
        public BufferedSource source() {
            return this.f104865c;
        }
    }

    /* JADX INFO: renamed from: l.gxc0$b */
    public static final class C17192b extends Reader {

        /* JADX INFO: renamed from: a */
        public final BufferedSource f104866a;

        /* JADX INFO: renamed from: b */
        public final Charset f104867b;

        /* JADX INFO: renamed from: c */
        public boolean f104868c;

        /* JADX INFO: renamed from: d */
        public Reader f104869d;

        public C17192b(BufferedSource bufferedSource, Charset charset) {
            this.f104866a = bufferedSource;
            this.f104867b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f104868c = true;
            Reader reader = this.f104869d;
            if (reader != null) {
                reader.close();
            } else {
                this.f104866a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (this.f104868c) {
                rhg0.m179353a("Stream closed");
                return 0;
            }
            Reader reader = this.f104869d;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.f104866a.inputStream(), tck0.m188002c(this.f104866a, this.f104867b));
                this.f104869d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    private Charset charset() {
        hyx hyxVarContentType = contentType();
        return hyxVarContentType != null ? hyxVarContentType.m133630b(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    public static gxc0 create(hyx hyxVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (hyxVar != null) {
            Charset charsetM133629a = hyxVar.m133629a();
            if (charsetM133629a == null) {
                hyxVar = hyx.m133628d(hyxVar + "; charset=utf-8");
            } else {
                charset = charsetM133629a;
            }
        }
        Buffer bufferWriteString = new Buffer().writeString(str, charset);
        return create(hyxVar, bufferWriteString.size(), bufferWriteString);
    }

    public final InputStream byteStream() {
        return source().inputStream();
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        BufferedSource bufferedSourceSource = source();
        try {
            byte[] byteArray = bufferedSourceSource.readByteArray();
            bufferedSourceSource.close();
            if (jContentLength == -1 || jContentLength == byteArray.length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + byteArray.length + ") disagree");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (bufferedSourceSource != null) {
                    try {
                        bufferedSourceSource.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        C17192b c17192b = new C17192b(source(), charset());
        this.reader = c17192b;
        return c17192b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        tck0.m188006g(source());
    }

    public abstract long contentLength();

    public abstract hyx contentType();

    public abstract BufferedSource source();

    public final String string() throws IOException {
        BufferedSource bufferedSourceSource = source();
        try {
            String string = bufferedSourceSource.readString(tck0.m188002c(bufferedSourceSource, charset()));
            bufferedSourceSource.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (bufferedSourceSource != null) {
                    try {
                        bufferedSourceSource.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public static gxc0 create(hyx hyxVar, byte[] bArr) {
        return create(hyxVar, bArr.length, new Buffer().write(bArr));
    }

    public static gxc0 create(hyx hyxVar, ByteString byteString) {
        return create(hyxVar, byteString.size(), new Buffer().write(byteString));
    }

    public static gxc0 create(hyx hyxVar, long j, BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            return new C17191a(hyxVar, j, bufferedSource);
        }
        jfd0.m141176a("source == null");
        return null;
    }
}
