package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.tencent.ugc.TXRecordCommon;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class i710 {

    /* JADX INFO: renamed from: a */
    public static final String[] f113219a = {"audio/mpeg-L1", "audio/mpeg-L2", DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG};

    /* JADX INFO: renamed from: b */
    public static final int[] f113220b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f113221c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d */
    public static final int[] f113222d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e */
    public static final int[] f113223e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f */
    public static final int[] f113224f = {32000, TantanException.Client.AccountService.GENERAL_BAD_REQUEST, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g */
    public static final int[] f113225g = {TXRecordCommon.AUDIO_SAMPLERATE_8000, 16000, 24000, 32000, TantanException.Client.AccountService.GENERAL_BAD_REQUEST, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: l.i710$a */
    public static final class C17660a {

        /* JADX INFO: renamed from: a */
        public int f113226a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public String f113227b;

        /* JADX INFO: renamed from: c */
        public int f113228c;

        /* JADX INFO: renamed from: d */
        public int f113229d;

        /* JADX INFO: renamed from: e */
        public int f113230e;

        /* JADX INFO: renamed from: f */
        public int f113231f;

        /* JADX INFO: renamed from: g */
        public int f113232g;

        /* JADX INFO: renamed from: a */
        public boolean m138914a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!i710.m138912l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f113226a = i2;
            this.f113227b = i710.f113219a[3 - i3];
            int i6 = i710.f113220b[i5];
            this.f113229d = i6;
            if (i2 == 2) {
                this.f113229d = i6 / 2;
            } else if (i2 == 0) {
                this.f113229d = i6 / 4;
            }
            int i7 = (i >>> 9) & 1;
            this.f113232g = i710.m138911k(i2, i3);
            if (i3 == 3) {
                int i8 = i2 == 3 ? i710.f113221c[i4 - 1] : i710.f113222d[i4 - 1];
                this.f113231f = i8;
                this.f113228c = (((i8 * 12) / this.f113229d) + i7) * 4;
            } else {
                if (i2 == 3) {
                    int i9 = i3 == 2 ? i710.f113223e[i4 - 1] : i710.f113224f[i4 - 1];
                    this.f113231f = i9;
                    this.f113228c = ((i9 * 144) / this.f113229d) + i7;
                } else {
                    int i10 = i710.f113225g[i4 - 1];
                    this.f113231f = i10;
                    this.f113228c = (((i3 == 1 ? 72 : 144) * i10) / this.f113229d) + i7;
                }
            }
            this.f113230e = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m138910j(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!m138912l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f113220b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f113221c[i4 - 1] : f113222d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f113223e[i4 - 1] : f113224f[i4 - 1];
        } else {
            i6 = f113225g[i4 - 1];
        }
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        return (((i3 == 1 ? 72 : 144) * i6) / i7) + i8;
    }

    /* JADX INFO: renamed from: k */
    public static int m138911k(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        fig0.m125680a();
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m138912l(int i) {
        return (i & (-2097152)) == -2097152;
    }

    /* JADX INFO: renamed from: m */
    public static int m138913m(int i) {
        int i2;
        int i3;
        if (!m138912l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m138911k(i2, i3);
    }
}
