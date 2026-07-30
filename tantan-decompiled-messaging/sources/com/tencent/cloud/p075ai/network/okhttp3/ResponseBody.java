package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okio.ByteString;
import com.tencent.cloud.p075ai.network.okio.C13776e;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13778g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p149l.jfd0;
import p149l.rhg0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: a */
    public Reader f56387a;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.ResponseBody$a */
    public class C13693a extends ResponseBody {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MediaType f56388b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f56389c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC13778g f56390d;

        public C13693a(MediaType mediaType, long j, InterfaceC13778g interfaceC13778g) {
            this.f56388b = mediaType;
            this.f56389c = j;
            this.f56390d = interfaceC13778g;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.ResponseBody
        public long contentLength() {
            return this.f56389c;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.ResponseBody
        public MediaType contentType() {
            return this.f56388b;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.ResponseBody
        public InterfaceC13778g source() {
            return this.f56390d;
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.ResponseBody$b */
    public static final class C13694b extends Reader {

        /* JADX INFO: renamed from: a */
        public final InterfaceC13778g f56391a;

        /* JADX INFO: renamed from: b */
        public final Charset f56392b;

        /* JADX INFO: renamed from: c */
        public boolean f56393c;

        /* JADX INFO: renamed from: d */
        public Reader f56394d;

        public C13694b(InterfaceC13778g interfaceC13778g, Charset charset) {
            this.f56391a = interfaceC13778g;
            this.f56392b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f56393c = true;
            Reader reader = this.f56394d;
            if (reader != null) {
                reader.close();
            } else {
                this.f56391a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (this.f56393c) {
                rhg0.m179353a("Stream closed");
                return 0;
            }
            Reader reader = this.f56394d;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.f56391a.mo81926d(), C13706c.m81608a(this.f56391a, this.f56392b));
                this.f56394d = inputStreamReader;
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
        C13776e c13776eM81907a = new C13776e().m81907a(str, 0, str.length(), charset);
        return create(mediaType, c13776eM81907a.f56970b, c13776eM81907a);
    }

    public final InputStream byteStream() {
        return source().mo81926d();
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        InterfaceC13778g interfaceC13778gSource = source();
        try {
            byte[] bArrMo81939h = interfaceC13778gSource.mo81939h();
            interfaceC13778gSource.close();
            if (jContentLength == -1 || jContentLength == bArrMo81939h.length) {
                return bArrMo81939h;
            }
            throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + bArrMo81939h.length + ") disagree");
        } catch (Throwable th) {
            if (interfaceC13778gSource != null) {
                try {
                    interfaceC13778gSource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final Reader charStream() {
        Reader reader = this.f56387a;
        if (reader != null) {
            return reader;
        }
        InterfaceC13778g interfaceC13778gSource = source();
        MediaType mediaTypeContentType = contentType();
        C13694b c13694b = new C13694b(interfaceC13778gSource, mediaTypeContentType != null ? mediaTypeContentType.charset(StandardCharsets.UTF_8) : StandardCharsets.UTF_8);
        this.f56387a = c13694b;
        return c13694b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C13706c.m81615a(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract InterfaceC13778g source();

    public final String string() {
        InterfaceC13778g interfaceC13778gSource = source();
        try {
            MediaType mediaTypeContentType = contentType();
            String strMo81912a = interfaceC13778gSource.mo81912a(C13706c.m81608a(interfaceC13778gSource, mediaTypeContentType != null ? mediaTypeContentType.charset(StandardCharsets.UTF_8) : StandardCharsets.UTF_8));
            interfaceC13778gSource.close();
            return strMo81912a;
        } catch (Throwable th) {
            if (interfaceC13778gSource != null) {
                try {
                    interfaceC13778gSource.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static ResponseBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr.length, new C13776e().mo81910a(bArr));
    }

    public static ResponseBody create(MediaType mediaType, ByteString byteString) {
        return create(mediaType, byteString.size(), new C13776e().m81915b(byteString));
    }

    public static ResponseBody create(MediaType mediaType, long j, InterfaceC13778g interfaceC13778g) {
        if (interfaceC13778g != null) {
            return new C13693a(mediaType, j, interfaceC13778g);
        }
        jfd0.m141176a("source == null");
        return null;
    }
}
