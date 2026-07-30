package p153l;

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
public abstract class k5d0 implements Closeable {
    private Reader reader;

    /* JADX INFO: renamed from: l.k5d0$a */
    public static class C18099a extends k5d0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e7y f124013a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f124014b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BufferedSource f124015c;

        public C18099a(e7y e7yVar, long j, BufferedSource bufferedSource) {
            this.f124013a = e7yVar;
            this.f124014b = j;
            this.f124015c = bufferedSource;
        }

        @Override // p153l.k5d0
        public long contentLength() {
            return this.f124014b;
        }

        @Override // p153l.k5d0
        public e7y contentType() {
            return this.f124013a;
        }

        @Override // p153l.k5d0
        public BufferedSource source() {
            return this.f124015c;
        }
    }

    /* JADX INFO: renamed from: l.k5d0$b */
    public static final class C18100b extends Reader {

        /* JADX INFO: renamed from: a */
        public final BufferedSource f124016a;

        /* JADX INFO: renamed from: b */
        public final Charset f124017b;

        /* JADX INFO: renamed from: c */
        public boolean f124018c;

        /* JADX INFO: renamed from: d */
        public Reader f124019d;

        public C18100b(BufferedSource bufferedSource, Charset charset) {
            this.f124016a = bufferedSource;
            this.f124017b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f124018c = true;
            Reader reader = this.f124019d;
            if (reader != null) {
                reader.close();
            } else {
                this.f124016a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (this.f124018c) {
                zpg0.m220844a("Stream closed");
                return 0;
            }
            Reader reader = this.f124019d;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.f124016a.inputStream(), zlk0.m220241c(this.f124016a, this.f124017b));
                this.f124019d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    private Charset charset() {
        e7y e7yVarContentType = contentType();
        return e7yVarContentType != null ? e7yVarContentType.m119775b(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    public static k5d0 create(e7y e7yVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (e7yVar != null) {
            Charset charsetM119774a = e7yVar.m119774a();
            if (charsetM119774a == null) {
                e7yVar = e7y.m119773d(e7yVar + "; charset=utf-8");
            } else {
                charset = charsetM119774a;
            }
        }
        Buffer bufferWriteString = new Buffer().writeString(str, charset);
        return create(e7yVar, bufferWriteString.size(), bufferWriteString);
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
        C18100b c18100b = new C18100b(source(), charset());
        this.reader = c18100b;
        return c18100b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zlk0.m220245g(source());
    }

    public abstract long contentLength();

    public abstract e7y contentType();

    public abstract BufferedSource source();

    public final String string() throws IOException {
        BufferedSource bufferedSourceSource = source();
        try {
            String string = bufferedSourceSource.readString(zlk0.m220241c(bufferedSourceSource, charset()));
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

    public static k5d0 create(e7y e7yVar, byte[] bArr) {
        return create(e7yVar, bArr.length, new Buffer().write(bArr));
    }

    public static k5d0 create(e7y e7yVar, ByteString byteString) {
        return create(e7yVar, byteString.size(), new Buffer().write(byteString));
    }

    public static k5d0 create(e7y e7yVar, long j, BufferedSource bufferedSource) {
        if (bufferedSource != null) {
            return new C18099a(e7yVar, j, bufferedSource);
        }
        mnd0.m159157a("source == null");
        return null;
    }
}
