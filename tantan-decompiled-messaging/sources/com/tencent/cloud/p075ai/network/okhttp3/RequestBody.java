package com.tencent.cloud.p075ai.network.okhttp3;

import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okio.ByteString;
import com.tencent.cloud.p075ai.network.okio.C13785n;
import com.tencent.cloud.p075ai.network.okio.C13788q;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13777f;
import com.tencent.cloud.p075ai.network.okio.InterfaceC13794w;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p149l.jfd0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class RequestBody {

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.RequestBody$a */
    public class C13690a extends RequestBody {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MediaType f56365a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ByteString f56366b;

        public C13690a(MediaType mediaType, ByteString byteString) {
            this.f56365a = mediaType;
            this.f56366b = byteString;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.RequestBody
        public long contentLength() {
            return this.f56366b.size();
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.RequestBody
        public MediaType contentType() {
            return this.f56365a;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.RequestBody
        public void writeTo(InterfaceC13777f interfaceC13777f) {
            ((C13788q) interfaceC13777f).m81968a(this.f56366b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.RequestBody$b */
    public class C13691b extends RequestBody {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MediaType f56367a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f56368b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ byte[] f56369c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f56370d;

        public C13691b(MediaType mediaType, int i, byte[] bArr, int i2) {
            this.f56367a = mediaType;
            this.f56368b = i;
            this.f56369c = bArr;
            this.f56370d = i2;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.RequestBody
        public long contentLength() {
            return this.f56368b;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.RequestBody
        public MediaType contentType() {
            return this.f56367a;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.RequestBody
        public void writeTo(InterfaceC13777f interfaceC13777f) {
            ((C13788q) interfaceC13777f).m81969a(this.f56369c, this.f56370d, this.f56368b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.RequestBody$c */
    public class C13692c extends RequestBody {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MediaType f56371a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ File f56372b;

        public C13692c(MediaType mediaType, File file) {
            this.f56371a = mediaType;
            this.f56372b = file;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.RequestBody
        public long contentLength() {
            return this.f56372b.length();
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.RequestBody
        public MediaType contentType() {
            return this.f56371a;
        }

        @Override // com.tencent.cloud.p075ai.network.okhttp3.RequestBody
        public void writeTo(InterfaceC13777f interfaceC13777f) throws IOException {
            InterfaceC13794w interfaceC13794wM81963a = C13785n.m81963a(this.f56372b);
            try {
                ((C13788q) interfaceC13777f).m81967a(interfaceC13794wM81963a);
                ((C13785n.a) interfaceC13794wM81963a).f56995b.close();
            } catch (Throwable th) {
                try {
                    ((C13785n.a) interfaceC13794wM81963a).f56995b.close();
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

    public abstract void writeTo(InterfaceC13777f interfaceC13777f);

    public static RequestBody create(MediaType mediaType, ByteString byteString) {
        return new C13690a(mediaType, byteString);
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr) {
        return create(mediaType, bArr, 0, bArr.length);
    }

    public static RequestBody create(MediaType mediaType, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            C13706c.m81614a(bArr.length, i, i2);
            return new C13691b(mediaType, i2, bArr, i);
        }
        jfd0.m141176a("content == null");
        return null;
    }

    public static RequestBody create(MediaType mediaType, File file) {
        if (file != null) {
            return new C13692c(mediaType, file);
        }
        jfd0.m141176a("file == null");
        return null;
    }
}
