package p149l;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* JADX INFO: loaded from: classes2.dex */
public abstract class utc0 {

    /* JADX INFO: renamed from: l.utc0$a */
    public static class C20509a extends utc0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ hyx f178247a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ByteString f178248b;

        public C20509a(hyx hyxVar, ByteString byteString) {
            this.f178247a = hyxVar;
            this.f178248b = byteString;
        }

        @Override // p149l.utc0
        public long contentLength() throws IOException {
            return this.f178248b.size();
        }

        @Override // p149l.utc0
        public hyx contentType() {
            return this.f178247a;
        }

        @Override // p149l.utc0
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.f178248b);
        }
    }

    /* JADX INFO: renamed from: l.utc0$b */
    public static class C20510b extends utc0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ hyx f178249a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f178250b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ byte[] f178251c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f178252d;

        public C20510b(hyx hyxVar, int i, byte[] bArr, int i2) {
            this.f178249a = hyxVar;
            this.f178250b = i;
            this.f178251c = bArr;
            this.f178252d = i2;
        }

        @Override // p149l.utc0
        public long contentLength() {
            return this.f178250b;
        }

        @Override // p149l.utc0
        public hyx contentType() {
            return this.f178249a;
        }

        @Override // p149l.utc0
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            bufferedSink.write(this.f178251c, this.f178252d, this.f178250b);
        }
    }

    /* JADX INFO: renamed from: l.utc0$c */
    public static class C20511c extends utc0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ hyx f178253a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ File f178254b;

        public C20511c(hyx hyxVar, File file) {
            this.f178253a = hyxVar;
            this.f178254b = file;
        }

        @Override // p149l.utc0
        public long contentLength() {
            return this.f178254b.length();
        }

        @Override // p149l.utc0
        public hyx contentType() {
            return this.f178253a;
        }

        @Override // p149l.utc0
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            Source source = Okio.source(this.f178254b);
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

    public static utc0 create(hyx hyxVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (hyxVar != null) {
            Charset charsetM133629a = hyxVar.m133629a();
            if (charsetM133629a == null) {
                hyxVar = hyx.m133628d(hyxVar + "; charset=utf-8");
            } else {
                charset = charsetM133629a;
            }
        }
        return create(hyxVar, str.getBytes(charset));
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    public abstract hyx contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink) throws IOException;

    public static utc0 create(hyx hyxVar, ByteString byteString) {
        return new C20509a(hyxVar, byteString);
    }

    public static utc0 create(hyx hyxVar, byte[] bArr) {
        return create(hyxVar, bArr, 0, bArr.length);
    }

    public static utc0 create(hyx hyxVar, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            tck0.m188005f(bArr.length, i, i2);
            return new C20510b(hyxVar, i2, bArr, i);
        }
        jfd0.m141176a("content == null");
        return null;
    }

    public static utc0 create(hyx hyxVar, File file) {
        if (file != null) {
            return new C20511c(hyxVar, file);
        }
        jfd0.m141176a("file == null");
        return null;
    }
}
