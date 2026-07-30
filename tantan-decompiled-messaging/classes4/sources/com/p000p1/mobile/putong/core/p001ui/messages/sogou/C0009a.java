package com.p000p1.mobile.putong.core.p001ui.messages.sogou;

import java.io.IOException;
import java.io.InputStream;
import l.sf80;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.sogou.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0009a implements ImageHeaderParser {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.sogou.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        int mo176a() throws IOException;

        /* JADX INFO: renamed from: b */
        int mo177b() throws IOException;

        long skip(long j) throws IOException;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.sogou.a$b */
    public static final class b implements a {

        /* JADX INFO: renamed from: a */
        public final InputStream f109a;

        public b(InputStream inputStream) {
            this.f109a = inputStream;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.sogou.C0009a.a
        /* JADX INFO: renamed from: a */
        public int mo176a() throws IOException {
            return (this.f109a.read() & 255) | ((this.f109a.read() << 8) & 65280);
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.sogou.C0009a.a
        /* JADX INFO: renamed from: b */
        public int mo177b() throws IOException {
            return this.f109a.read();
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.sogou.C0009a.a
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.f109a.skip(j2);
                if (jSkip <= 0) {
                    if (this.f109a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.sogou.ImageHeaderParser
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo174a(InputStream inputStream) throws IOException {
        return m175b(new b((InputStream) sf80.p(inputStream)));
    }

    /* JADX INFO: renamed from: b */
    public final ImageHeaderParser.ImageType m175b(a aVar) throws IOException {
        int iMo176a = aVar.mo176a();
        if (iMo176a == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int iMo176a2 = ((iMo176a << 16) & (-65536)) | (aVar.mo176a() & 65535);
        if (iMo176a2 == -1991225785) {
            aVar.skip(21L);
            return aVar.mo177b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        }
        if ((iMo176a2 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        }
        if (iMo176a2 != 1380533830) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        aVar.skip(4L);
        if ((((aVar.mo176a() << 16) & (-65536)) | (aVar.mo176a() & 65535)) != 1464156752) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iMo176a3 = ((aVar.mo176a() << 16) & (-65536)) | (aVar.mo176a() & 65535);
        if ((iMo176a3 & (-256)) != 1448097792) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int i = iMo176a3 & 255;
        if (i == 88) {
            aVar.skip(4L);
            return (aVar.mo177b() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        }
        if (i != 76) {
            return ImageHeaderParser.ImageType.WEBP;
        }
        aVar.skip(4L);
        return (aVar.mo177b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
    }
}
