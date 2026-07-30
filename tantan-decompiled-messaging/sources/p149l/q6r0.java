package p149l;

import com.p046p1.mobile.putong.api.api.TantanException;
import com.tencent.ugc.TXRecordCommon;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class q6r0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f152947a = {"audio/mpeg-L1", "audio/mpeg-L2", DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG};

    /* JADX INFO: renamed from: b */
    public static final int[] f152948b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f152949c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d */
    public static final int[] f152950d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e */
    public static final int[] f152951e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f */
    public static final int[] f152952f = {32000, TantanException.Client.AccountService.GENERAL_BAD_REQUEST, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g */
    public static final int[] f152953g = {TXRecordCommon.AUDIO_SAMPLERATE_8000, 16000, 24000, 32000, TantanException.Client.AccountService.GENERAL_BAD_REQUEST, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: b */
    public static int m173160b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!m173171m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = i4 - 1;
        int i8 = f152948b[i5];
        if (i2 == 2) {
            i8 /= 2;
        } else if (i2 == 0) {
            i8 /= 4;
        }
        int i9 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f152949c[i7] : f152950d[i7]) * 12) / i8) + i9) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f152951e[i7] : f152952f[i7];
        } else {
            i6 = f152953g[i7];
        }
        if (i2 == 3) {
            return ((i6 * 144) / i8) + i9;
        }
        return (((i3 == 1 ? 72 : 144) * i6) / i8) + i9;
    }

    /* JADX INFO: renamed from: c */
    public static int m173161c(int i) {
        int i2;
        int i3;
        if (!m173171m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = i >>> 12;
        int i5 = (i >>> 10) & 3;
        int i6 = i4 & 15;
        if (i6 == 0 || i6 == 15 || i5 == 3) {
            return -1;
        }
        return m173170l(i2, i3);
    }

    /* JADX INFO: renamed from: l */
    public static int m173170l(int i, int i2) {
        if (i2 != 1) {
            return i2 != 2 ? 384 : 1152;
        }
        return i == 3 ? 1152 : 576;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m173171m(int i) {
        return (i & (-2097152)) == -2097152;
    }
}
