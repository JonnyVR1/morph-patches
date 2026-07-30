package p149l;

import com.google.android.exoplayer2.ParserException;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: renamed from: l.z1 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C21594z1 {

    /* JADX INFO: renamed from: a */
    public static final int[] f201032a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, TXRecordCommon.AUDIO_SAMPLERATE_8000, 7350};

    /* JADX INFO: renamed from: b */
    public static final int[] f201033b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: l.z1$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f201034a;

        /* JADX INFO: renamed from: b */
        public final int f201035b;

        /* JADX INFO: renamed from: c */
        public final String f201036c;

        public b(int i, int i2, String str) {
            this.f201034a = i;
            this.f201035b = i2;
            this.f201036c = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m216773a(int i, int i2) {
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int[] iArr = f201032a;
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
            int[] iArr2 = f201033b;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return m216774b(2, i4, i6);
        }
        ckq0.m107426a("Invalid sample rate or number of channels: ", i, ", ", i2);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m216774b(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* JADX INFO: renamed from: c */
    public static int m216775c(c860 c860Var) {
        int iM105664h = c860Var.m105664h(5);
        return iM105664h == 31 ? c860Var.m105664h(6) + 32 : iM105664h;
    }

    /* JADX INFO: renamed from: d */
    public static int m216776d(c860 c860Var) throws ParserException {
        int iM105664h = c860Var.m105664h(4);
        if (iM105664h == 15) {
            if (c860Var.m105658b() >= 24) {
                return c860Var.m105664h(24);
            }
            throw ParserException.createForMalformedContainer("AAC header insufficient data", null);
        }
        if (iM105664h < 13) {
            return f201032a[iM105664h];
        }
        throw ParserException.createForMalformedContainer("AAC header wrong Sampling Frequency Index", null);
    }

    /* JADX INFO: renamed from: e */
    public static b m216777e(c860 c860Var, boolean z) throws ParserException {
        int iM216775c = m216775c(c860Var);
        int iM216776d = m216776d(c860Var);
        int iM105664h = c860Var.m105664h(4);
        String str = "mp4a.40." + iM216775c;
        if (iM216775c == 5 || iM216775c == 29) {
            iM216776d = m216776d(c860Var);
            iM216775c = m216775c(c860Var);
            if (iM216775c == 22) {
                iM105664h = c860Var.m105664h(4);
            }
        }
        if (z) {
            if (iM216775c != 1 && iM216775c != 2 && iM216775c != 3 && iM216775c != 4 && iM216775c != 6 && iM216775c != 7 && iM216775c != 17) {
                switch (iM216775c) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.createForUnsupportedContainerFeature("Unsupported audio object type: " + iM216775c);
                }
            }
            m216779g(c860Var, iM216775c, iM105664h);
            switch (iM216775c) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM105664h2 = c860Var.m105664h(2);
                    if (iM105664h2 == 2 || iM105664h2 == 3) {
                        throw ParserException.createForUnsupportedContainerFeature("Unsupported epConfig: " + iM105664h2);
                    }
                    break;
            }
        }
        int i = f201033b[iM105664h];
        if (i != -1) {
            return new b(iM216776d, i, str);
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    /* JADX INFO: renamed from: f */
    public static b m216778f(byte[] bArr) throws ParserException {
        return m216777e(new c860(bArr), false);
    }

    /* JADX INFO: renamed from: g */
    public static void m216779g(c860 c860Var, int i, int i2) {
        if (c860Var.m105663g()) {
            jwv.m143689i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (c860Var.m105663g()) {
            c860Var.m105674r(14);
        }
        boolean zM105663g = c860Var.m105663g();
        if (i2 == 0) {
            bz00.m104536a();
            return;
        }
        if (i == 6 || i == 20) {
            c860Var.m105674r(3);
        }
        if (zM105663g) {
            if (i == 22) {
                c860Var.m105674r(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                c860Var.m105674r(3);
            }
            c860Var.m105674r(1);
        }
    }
}
