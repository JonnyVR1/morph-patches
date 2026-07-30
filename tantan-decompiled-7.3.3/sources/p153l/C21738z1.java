package p153l;

import com.google.android.exoplayer2.ParserException;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: renamed from: l.z1 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C21738z1 {

    /* JADX INFO: renamed from: a */
    public static final int[] f202471a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, TXRecordCommon.AUDIO_SAMPLERATE_8000, 7350};

    /* JADX INFO: renamed from: b */
    public static final int[] f202472b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: l.z1$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f202473a;

        /* JADX INFO: renamed from: b */
        public final int f202474b;

        /* JADX INFO: renamed from: c */
        public final String f202475c;

        public b(int i, int i2, String str) {
            this.f202473a = i;
            this.f202474b = i2;
            this.f202475c = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m218266a(int i, int i2) {
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int[] iArr = f202471a;
            if (i5 >= iArr.length) {
                break;
            }
            if (i == iArr[i5]) {
                i4 = i5;
            }
            i5++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = f202472b;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return m218267b(2, i4, i6);
        }
        itq0.m142074a("Invalid sample rate or number of channels: ", i, ", ", i2);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m218267b(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* JADX INFO: renamed from: c */
    public static int m218268c(hg60 hg60Var) {
        int iM134905h = hg60Var.m134905h(5);
        return iM134905h == 31 ? hg60Var.m134905h(6) + 32 : iM134905h;
    }

    /* JADX INFO: renamed from: d */
    public static int m218269d(hg60 hg60Var) throws ParserException {
        int iM134905h = hg60Var.m134905h(4);
        if (iM134905h == 15) {
            if (hg60Var.m134899b() >= 24) {
                return hg60Var.m134905h(24);
            }
            throw ParserException.createForMalformedContainer("AAC header insufficient data", null);
        }
        if (iM134905h < 13) {
            return f202471a[iM134905h];
        }
        throw ParserException.createForMalformedContainer("AAC header wrong Sampling Frequency Index", null);
    }

    /* JADX INFO: renamed from: e */
    public static b m218270e(hg60 hg60Var, boolean z) throws ParserException {
        int iM218268c = m218268c(hg60Var);
        int iM218269d = m218269d(hg60Var);
        int iM134905h = hg60Var.m134905h(4);
        String str = "mp4a.40." + iM218268c;
        if (iM218268c == 5 || iM218268c == 29) {
            iM218269d = m218269d(hg60Var);
            iM218268c = m218268c(hg60Var);
            if (iM218268c == 22) {
                iM134905h = hg60Var.m134905h(4);
            }
        }
        if (z) {
            if (iM218268c != 1 && iM218268c != 2 && iM218268c != 3 && iM218268c != 4 && iM218268c != 6 && iM218268c != 7 && iM218268c != 17) {
                switch (iM218268c) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.createForUnsupportedContainerFeature("Unsupported audio object type: " + iM218268c);
                }
            }
            m218272g(hg60Var, iM218268c, iM134905h);
            switch (iM218268c) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM134905h2 = hg60Var.m134905h(2);
                    if (iM134905h2 == 2 || iM134905h2 == 3) {
                        throw ParserException.createForUnsupportedContainerFeature("Unsupported epConfig: " + iM134905h2);
                    }
                    break;
            }
        }
        int i = f202472b[iM134905h];
        if (i != -1) {
            return new b(iM218269d, i, str);
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    /* JADX INFO: renamed from: f */
    public static b m218271f(byte[] bArr) throws ParserException {
        return m218270e(new hg60(bArr), false);
    }

    /* JADX INFO: renamed from: g */
    public static void m218272g(hg60 hg60Var, int i, int i2) {
        if (hg60Var.m134904g()) {
            kyv.m152151i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (hg60Var.m134904g()) {
            hg60Var.m134915r(14);
        }
        boolean zM134904g = hg60Var.m134904g();
        if (i2 == 0) {
            l710.m153113a();
            return;
        }
        if (i == 6 || i == 20) {
            hg60Var.m134915r(3);
        }
        if (zM134904g) {
            if (i == 22) {
                hg60Var.m134915r(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                hg60Var.m134915r(3);
            }
            hg60Var.m134915r(1);
        }
    }
}
