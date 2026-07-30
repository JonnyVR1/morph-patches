package com.tencent.cloud.p080ai.network.okhttp3;

import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import com.tencent.cloud.p080ai.network.okio.ByteString;
import com.tencent.cloud.p080ai.network.okio.C13948n;
import com.tencent.cloud.p080ai.network.okio.C13951q;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13940f;
import com.tencent.cloud.p080ai.network.okio.InterfaceC13957w;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p153l.mnd0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class RequestBody {

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.RequestBody$a */
    public class C13853a extends RequestBody {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MediaType f57213a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ByteString f57214b;

        public C13853a(MediaType mediaType, ByteString byteString) {
            this.f57213a = mediaType;
            this.f57214b = byteString;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.RequestBody
        public long contentLength() {
            return this.f57214b.size();
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.RequestBody
        public MediaType contentType() {
            return this.f57213a;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.RequestBody
        public void writeTo(InterfaceC13940f interfaceC13940f) {
            ((C13951q) interfaceC13940f).m83151a(this.f57214b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.RequestBody$b */
    public class C13854b extends RequestBody {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MediaType f57215a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f57216b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ byte[] f57217c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f57218d;

        public C13854b(MediaType mediaType, int i, byte[] bArr, int i2) {
            this.f57215a = mediaType;
            this.f57216b = i;
            this.f57217c = bArr;
            this.f57218d = i2;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.RequestBody
        public long contentLength() {
            return this.f57216b;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.RequestBody
        public MediaType contentType() {
            return this.f57215a;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.RequestBody
        public void writeTo(InterfaceC13940f interfaceC13940f) {
            ((C13951q) interfaceC13940f).m83152a(this.f57217c, this.f57218d, this.f57216b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.RequestBody$c */
    public class C13855c extends RequestBody {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MediaType f57219a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ File f57220b;

        public C13855c(MediaType mediaType, File file) {
            this.f57219a = mediaType;
            this.f57220b = file;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.RequestBody
        public long contentLength() {
            return this.f57220b.length();
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.RequestBody
        public MediaType contentType() {
            return this.f57219a;
        }

        @Override // com.tencent.cloud.p080ai.network.okhttp3.RequestBody
        public void writeTo(InterfaceC13940f interfaceC13940f) throws IOException {
            InterfaceC13957w interfaceC13957wM83146a = C13948n.m83146a(this.f57220b);
            try {
                ((C13951q) interfaceC13940f).m83150a(interfaceC13957wM83146a);
                ((C13948n.a) interfaceC13957wM83146a).f57843b.close();
            } catch (Throwable th) {
                try {
                    ((C13948n.a) interfaceC13957wM83146a).f57843b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static RequestBody create(MediaType mediaType, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (mediaType != null) {
            Charset charset2 = mediaType.charset();
            if (charset2 == null) {
                mediaType = MediaType.parse(mediaType + "; charset=utf-8");
            } else {
                charset = charset2;
            }
        }
        return create(mediaType, str.getBytes(charset));
    }

    public long contentLength() {
        return -1L;
    }

    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC13940f interfaceC13940f);

    public static RequestBody create(MediaType mediaType, ByteString byteString) {
        return new C13853a(mediaType, byteString);
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C13869c.m82797a(bArr.length, i, i2);
            return new C13854b(mediaType, i2, bArr, i);
        }
        mnd0.m159157a("content == null");
        return null;
    }

    public static RequestBody create(MediaType mediaType, File file) {
        if (file != null) {
            return new C13855c(mediaType, file);
        }
        mnd0.m159157a("file == null");
        return null;
    }
}
