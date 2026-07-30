package p153l;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z1d0 {

    /* JADX INFO: renamed from: l.z1d0$a */
    public static class C21739a extends z1d0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e7y f202504a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ByteString f202505b;

        public C21739a(e7y e7yVar, ByteString byteString) {
            this.f202504a = e7yVar;
            this.f202505b = byteString;
        }

        @Override // p153l.z1d0
        public long contentLength() throws IOException {
            return this.f202505b.size();
        }

        @Override // p153l.z1d0
        public e7y contentType() {
            return this.f202504a;
        }

        @Override // p153l.z1d0
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.f202505b);
        }
    }

    /* JADX INFO: renamed from: l.z1d0$b */
    public static class C21740b extends z1d0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e7y f202506a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f202507b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ byte[] f202508c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f202509d;

        public C21740b(e7y e7yVar, int i, byte[] bArr, int i2) {
            this.f202506a = e7yVar;
            this.f202507b = i;
            this.f202508c = bArr;
            this.f202509d = i2;
        }

        @Override // p153l.z1d0
        public long contentLength() {
            return this.f202507b;
        }

        @Override // p153l.z1d0
        public e7y contentType() {
            return this.f202506a;
        }

        @Override // p153l.z1d0
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.f202508c, this.f202509d, this.f202507b);
        }
    }

    /* JADX INFO: renamed from: l.z1d0$c */
    public static class C21741c extends z1d0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e7y f202510a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ File f202511b;

        public C21741c(e7y e7yVar, File file) {
            this.f202510a = e7yVar;
            this.f202511b = file;
        }

        @Override // p153l.z1d0
        public long contentLength() {
            return this.f202511b.length();
        }

        @Override // p153l.z1d0
        public e7y contentType() {
            return this.f202510a;
        }

        @Override // p153l.z1d0
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            Source source = Okio.source(this.f202511b);
            try {
                bufferedSink.writeAll(source);
                if (source != null) {
                    source.close();
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (source != null) {
                        try {
                            source.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }
    }

    public static z1d0 create(e7y e7yVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (e7yVar != null) {
            Charset charsetM119774a = e7yVar.m119774a();
            if (charsetM119774a == null) {
                e7yVar = e7y.m119773d(e7yVar + "; charset=utf-8");
            } else {
                charset = charsetM119774a;
            }
        }
        return create(e7yVar, str.getBytes(charset));
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract e7y contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink) throws IOException;

    public static z1d0 create(e7y e7yVar, ByteString byteString) {
        return new C21739a(e7yVar, byteString);
    }

    public static z1d0 create(e7y e7yVar, byte[] bArr) {
        return create(e7yVar, bArr, 0, bArr.length);
    }

    public static z1d0 create(e7y e7yVar, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            zlk0.m220244f(bArr.length, i, i2);
            return new C21740b(e7yVar, i2, bArr, i);
        }
        mnd0.m159157a("content == null");
        return null;
    }

    public static z1d0 create(e7y e7yVar, File file) {
        if (file != null) {
            return new C21741c(e7yVar, file);
        }
        mnd0.m159157a("file == null");
        return null;
    }
}
