package com.p046p1.mobile.putong.core.p053ui.messages.sogou;

import java.io.IOException;
import java.io.InputStream;
import p149l.j6f;
import p149l.sf80;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.sogou.a */
/* JADX INFO: loaded from: classes4.dex */
public class C8584a implements ImageHeaderParser {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.sogou.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        int mo49758a() throws IOException;

        /* JADX INFO: renamed from: b */
        int mo49759b() throws IOException;

        long skip(long j) throws IOException;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.sogou.a$b */
    public static final class b implements a {

        /* JADX INFO: renamed from: a */
        public final InputStream f32287a;

        public b(InputStream inputStream) {
            this.f32287a = inputStream;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.sogou.C8584a.a
        /* JADX INFO: renamed from: a */
        public int mo49758a() throws IOException {
            return (this.f32287a.read() & 255) | ((this.f32287a.read() << 8) & 65280);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.sogou.C8584a.a
        /* JADX INFO: renamed from: b */
        public int mo49759b() throws IOException {
            return this.f32287a.read();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.sogou.C8584a.a
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.f32287a.skip(j2);
                if (jSkip <= 0) {
                    if (this.f32287a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.sogou.ImageHeaderParser
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo49756a(InputStream inputStream) throws IOException {
        return m49757b(new b((InputStream) sf80.m183894p(inputStream)));
    }

    /* JADX INFO: renamed from: b */
    public final ImageHeaderParser.ImageType m49757b(a aVar) throws IOException {
        int iMo49758a = aVar.mo49758a();
        if (iMo49758a == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int iMo49758a2 = ((iMo49758a << 16) & (-65536)) | (aVar.mo49758a() & j6f.COLOR_SPACE_UNCALIBRATED);
        if (iMo49758a2 == -1991225785) {
            aVar.skip(21L);
            return aVar.mo49759b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        }
        if ((iMo49758a2 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        }
        if (iMo49758a2 != 1380533830) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        aVar.skip(4L);
        if ((((aVar.mo49758a() << 16) & (-65536)) | (aVar.mo49758a() & j6f.COLOR_SPACE_UNCALIBRATED)) != 1464156752) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iMo49758a3 = ((aVar.mo49758a() << 16) & (-65536)) | (aVar.mo49758a() & j6f.COLOR_SPACE_UNCALIBRATED);
        if ((iMo49758a3 & (-256)) != 1448097792) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int i = iMo49758a3 & 255;
        if (i == 88) {
            aVar.skip(4L);
            return (aVar.mo49759b() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        }
        if (i != 76) {
            return ImageHeaderParser.ImageType.WEBP;
        }
        aVar.skip(4L);
        return (aVar.mo49759b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
    }
}
