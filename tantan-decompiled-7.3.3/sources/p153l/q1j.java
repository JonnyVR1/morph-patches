package p153l;

import com.google.android.gms.common.api.Api;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.tencent.rtmp.TXLiveConstants;

/* JADX INFO: loaded from: classes7.dex */
public final class q1j {

    /* JADX INFO: renamed from: c */
    public static final int[][] f155193c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{TXLiveConstants.PLAY_WARNING_VIDEO_DISCONTINUITY, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* JADX INFO: renamed from: a */
    public final ErrorCorrectionLevel f155194a;

    /* JADX INFO: renamed from: b */
    public final byte f155195b;

    public q1j(int i) {
        this.f155194a = ErrorCorrectionLevel.forBits((i >> 3) & 3);
        this.f155195b = (byte) (i & 7);
    }

    /* JADX INFO: renamed from: a */
    public static q1j m174887a(int i, int i2) {
        q1j q1jVarM174888b = m174888b(i, i2);
        return q1jVarM174888b != null ? q1jVarM174888b : m174888b(i ^ 21522, i2 ^ 21522);
    }

    /* JADX INFO: renamed from: b */
    public static q1j m174888b(int i, int i2) {
        int iM174889e;
        int[][] iArr = f155193c;
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i4 = 0;
        for (int[] iArr2 : iArr) {
            int i5 = iArr2[0];
            if (i5 == i || i5 == i2) {
                return new q1j(iArr2[1]);
            }
            int iM174889e2 = m174889e(i, i5);
            if (iM174889e2 < i3) {
                i4 = iArr2[1];
                i3 = iM174889e2;
            }
            if (i != i2 && (iM174889e = m174889e(i2, i5)) < i3) {
                i4 = iArr2[1];
                i3 = iM174889e;
            }
        }
        if (i3 <= 3) {
            return new q1j(i4);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static int m174889e(int i, int i2) {
        return Integer.bitCount(i ^ i2);
    }

    /* JADX INFO: renamed from: c */
    public byte m174890c() {
        return this.f155195b;
    }

    /* JADX INFO: renamed from: d */
    public ErrorCorrectionLevel m174891d() {
        return this.f155194a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q1j)) {
            return false;
        }
        q1j q1jVar = (q1j) obj;
        return this.f155194a == q1jVar.f155194a && this.f155195b == q1jVar.f155195b;
    }

    public int hashCode() {
        return this.f155195b | (this.f155194a.ordinal() << 3);
    }
}
