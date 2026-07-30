package com.p051p1.mobile.putong.core.p058ui.messages.sogou;

import java.io.IOException;
import java.io.InputStream;
import p153l.p7f;
import p153l.xn80;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.sogou.a */
/* JADX INFO: loaded from: classes4.dex */
public class C8747a implements ImageHeaderParser {

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.sogou.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        int mo50941a() throws IOException;

        /* JADX INFO: renamed from: b */
        int mo50942b() throws IOException;

        long skip(long j) throws IOException;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.sogou.a$b */
    public static final class b implements a {

        /* JADX INFO: renamed from: a */
        public final InputStream f33135a;

        public b(InputStream inputStream) {
            this.f33135a = inputStream;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.sogou.C8747a.a
        /* JADX INFO: renamed from: a */
        public int mo50941a() throws IOException {
            return (this.f33135a.read() & 255) | ((this.f33135a.read() << 8) & 65280);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.sogou.C8747a.a
        /* JADX INFO: renamed from: b */
        public int mo50942b() throws IOException {
            return this.f33135a.read();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.sogou.C8747a.a
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.f33135a.skip(j2);
                if (jSkip <= 0) {
                    if (this.f33135a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.sogou.ImageHeaderParser
    /* JADX INFO: renamed from: a */
    public ImageHeaderParser.ImageType mo50939a(InputStream inputStream) throws IOException {
        return m50940b(new b((InputStream) xn80.m212111p(inputStream)));
    }

    /* JADX INFO: renamed from: b */
    public final ImageHeaderParser.ImageType m50940b(a aVar) throws IOException {
        int iMo50941a = aVar.mo50941a();
        if (iMo50941a == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int iMo50941a2 = ((iMo50941a << 16) & (-65536)) | (aVar.mo50941a() & p7f.COLOR_SPACE_UNCALIBRATED);
        if (iMo50941a2 == -1991225785) {
            aVar.skip(21L);
            return aVar.mo50942b() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        }
        if ((iMo50941a2 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        }
        if (iMo50941a2 != 1380533830) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        aVar.skip(4L);
        if ((((aVar.mo50941a() << 16) & (-65536)) | (aVar.mo50941a() & p7f.COLOR_SPACE_UNCALIBRATED)) != 1464156752) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iMo50941a3 = ((aVar.mo50941a() << 16) & (-65536)) | (aVar.mo50941a() & p7f.COLOR_SPACE_UNCALIBRATED);
        if ((iMo50941a3 & (-256)) != 1448097792) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int i = iMo50941a3 & 255;
        if (i == 88) {
            aVar.skip(4L);
            return (aVar.mo50942b() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        }
        if (i != 76) {
            return ImageHeaderParser.ImageType.WEBP;
        }
        aVar.skip(4L);
        return (aVar.mo50942b() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
    }
}
