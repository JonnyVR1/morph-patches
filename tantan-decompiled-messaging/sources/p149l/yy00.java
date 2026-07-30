package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.tencent.ugc.TXRecordCommon;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class yy00 {

    /* JADX INFO: renamed from: a */
    public static final String[] f200692a = {"audio/mpeg-L1", "audio/mpeg-L2", DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG};

    /* JADX INFO: renamed from: b */
    public static final int[] f200693b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f200694c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d */
    public static final int[] f200695d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e */
    public static final int[] f200696e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f */
    public static final int[] f200697f = {32000, TantanException.Client.AccountService.GENERAL_BAD_REQUEST, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g */
    public static final int[] f200698g = {TXRecordCommon.AUDIO_SAMPLERATE_8000, 16000, 24000, 32000, TantanException.Client.AccountService.GENERAL_BAD_REQUEST, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: l.yy00$a */
    public static final class C21578a {

        /* JADX INFO: renamed from: a */
        public int f200699a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public String f200700b;

        /* JADX INFO: renamed from: c */
        public int f200701c;

        /* JADX INFO: renamed from: d */
        public int f200702d;

        /* JADX INFO: renamed from: e */
        public int f200703e;

        /* JADX INFO: renamed from: f */
        public int f200704f;

        /* JADX INFO: renamed from: g */
        public int f200705g;

        /* JADX INFO: renamed from: a */
        public boolean m216510a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!yy00.m216508l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f200699a = i2;
            this.f200700b = yy00.f200692a[3 - i3];
            int i6 = yy00.f200693b[i5];
            this.f200702d = i6;
            if (i2 == 2) {
                this.f200702d = i6 / 2;
            } else if (i2 == 0) {
                this.f200702d = i6 / 4;
            }
            int i7 = (i >>> 9) & 1;
            this.f200705g = yy00.m216507k(i2, i3);
            if (i3 == 3) {
                int i8 = i2 == 3 ? yy00.f200694c[i4 - 1] : yy00.f200695d[i4 - 1];
                this.f200704f = i8;
                this.f200701c = (((i8 * 12) / this.f200702d) + i7) * 4;
            } else {
                if (i2 == 3) {
                    int i9 = i3 == 2 ? yy00.f200696e[i4 - 1] : yy00.f200697f[i4 - 1];
                    this.f200704f = i9;
                    this.f200701c = ((i9 * 144) / this.f200702d) + i7;
                } else {
                    int i10 = yy00.f200698g[i4 - 1];
                    this.f200704f = i10;
                    this.f200701c = (((i3 == 1 ? 72 : 144) * i10) / this.f200702d) + i7;
                }
            }
            this.f200703e = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m216506j(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!m216508l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f200693b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f200694c[i4 - 1] : f200695d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f200696e[i4 - 1] : f200697f[i4 - 1];
        } else {
            i6 = f200698g[i4 - 1];
        }
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        return (((i3 == 1 ? 72 : 144) * i6) / i7) + i8;
    }

    /* JADX INFO: renamed from: k */
    public static int m216507k(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        x9g0.m207497a();
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m216508l(int i) {
        return (i & (-2097152)) == -2097152;
    }

    /* JADX INFO: renamed from: m */
    public static int m216509m(int i) {
        int i2;
        int i3;
        if (!m216508l(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m216507k(i2, i3);
    }
}
