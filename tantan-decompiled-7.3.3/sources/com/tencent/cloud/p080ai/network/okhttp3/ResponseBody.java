package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okio.ByteString;
import com.tencent.cloud.p080ai.network.okio.C13939e;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13941g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p153l.mnd0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: a */
    public Reader f57235a;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.ResponseBody$a */
    public class C13856a extends ResponseBody {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MediaType f57236b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f57237c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC13941g f57238d;

        public C13856a(MediaType mediaType, long j, InterfaceC13941g interfaceC13941g) {
            this.f57236b = mediaType;
            this.f57237c = j;
            this.f57238d = interfaceC13941g;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.ResponseBody
        public long contentLength() {
            return this.f57237c;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.ResponseBody
        public MediaType contentType() {
            return this.f57236b;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.ResponseBody
        public InterfaceC13941g source() {
            return this.f57238d;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.ResponseBody$b */
    public static final class C13857b extends Reader {

        /* JADX INFO: renamed from: a */
        public final InterfaceC13941g f57239a;

        /* JADX INFO: renamed from: b */
        public final Charset f57240b;

        /* JADX INFO: renamed from: c */
        public boolean f57241c;

        /* JADX INFO: renamed from: d */
        public Reader f57242d;

        public C13857b(InterfaceC13941g interfaceC13941g, Charset charset) {
            this.f57239a = interfaceC13941g;
            this.f57240b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f57241c = true;
            Reader reader = this.f57242d;
            if (reader != null) {
                reader.close();
            } else {
                this.f57239a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (this.f57241c) {
                zpg0.m220844a("Stream closed");
                return 0;
            }
            Reader reader = this.f57242d;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.f57239a.mo83109d(), C13869c.m82791a(this.f57239a, this.f57240b));
                this.f57242d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }
    }

    public static ResponseBody create(MediaType mediaType, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (mediaType != null) {
            Charset charset2 = mediaType.charset();
            if (charset2 == null) {
                mediaType = MediaType.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charset2;
            }
        }
        C13939e c13939eM83090a = new C13939e().m83090a(str, 0, str.length(), charset);
        return create(mediaType, c13939eM83090a.f57818b, c13939eM83090a);
    }

    public final InputStream byteStream() {
        return source().mo83109d();
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        InterfaceC13941g interfaceC13941gSource = source();
        try {
            byte[] bArrMo83122h = interfaceC13941gSource.mo83122h();
            interfaceC13941gSource.close();
            if (jContentLength == -1 || jContentLength == bArrMo83122h.length) {
                return bArrMo83122h;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + bArrMo83122h.length + ") disagree");
        } catch (Throwable th) {
            if (interfaceC13941gSource != null) {
                try {
                    interfaceC13941gSource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final Reader charStream() {
        Reader reader = this.f57235a;
        if (reader != null) {
            return reader;
        }
        InterfaceC13941g interfaceC13941gSource = source();
        MediaType mediaTypeContentType = contentType();
        C13857b c13857b = new C13857b(interfaceC13941gSource, mediaTypeContentType != null ? mediaTypeContentType.charset(StandardCharsets.UTF_8) : StandardCharsets.UTF_8);
        this.f57235a = c13857b;
        return c13857b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C13869c.m82798a(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract InterfaceC13941g source();

    public final String string() {
        InterfaceC13941g interfaceC13941gSource = source();
        try {
            MediaType mediaTypeContentType = contentType();
            String strMo83095a = interfaceC13941gSource.mo83095a(C13869c.m82791a(interfaceC13941gSource, mediaTypeContentType != null ? mediaTypeContentType.charset(StandardCharsets.UTF_8) : StandardCharsets.UTF_8));
            interfaceC13941gSource.close();
            return strMo83095a;
        } catch (Throwable th) {
            if (interfaceC13941gSource != null) {
                try {
                    interfaceC13941gSource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr.length, new C13939e().mo83093a(bArr));
    }

    public static ResponseBody create(MediaType mediaType, ByteString byteString) {
        return create(mediaType, byteString.size(), new C13939e().m83098b(byteString));
    }

    public static ResponseBody create(MediaType mediaType, long j, InterfaceC13941g interfaceC13941g) {
        if (interfaceC13941g != null) {
            return new C13856a(mediaType, j, interfaceC13941g);
        }
        mnd0.m159157a("source == null");
        return null;
    }
}
