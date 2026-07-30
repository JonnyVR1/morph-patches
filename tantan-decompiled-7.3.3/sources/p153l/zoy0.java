package p153l;

import android.annotation.SuppressLint;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.C2298w2;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgad;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class zoy0 {

    /* JADX INFO: renamed from: c */
    public static final zoy0 f205401c = new zoy0(new int[]{2}, 10);

    /* JADX INFO: renamed from: d */
    @SuppressLint({"InlinedApi"})
    public static final zzgaa f205402d = zzgaa.zzo(2, 5, 6);

    /* JADX INFO: renamed from: e */
    public static final zzgad f205403e;

    /* JADX INFO: renamed from: a */
    public final int[] f205404a;

    /* JADX INFO: renamed from: b */
    public final int f205405b;

    static {
        C2298w2 c2298w2 = new C2298w2();
        c2298w2.m13473a(5, 6);
        c2298w2.m13473a(17, 6);
        c2298w2.m13473a(7, 6);
        c2298w2.m13473a(30, 10);
        c2298w2.m13473a(18, 6);
        c2298w2.m13473a(6, 8);
        c2298w2.m13473a(8, 8);
        c2298w2.m13473a(14, 8);
        f205403e = c2298w2.m13475c();
    }

    public zoy0(@Nullable int[] iArr, int i) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, 1);
        this.f205404a = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
        this.f205405b = 10;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[PHI: r0
      0x0036: PHI (r0v3 int) = (r0v2 int), (r0v6 int) binds: [B:11:0x002a, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Pair m220804a(sqr0 sqr0Var, w3y0 w3y0Var) {
        String str = sqr0Var.f170251l;
        str.getClass();
        int iM96489a = a8t0.m96489a(str, sqr0Var.f170248i);
        zzgad zzgadVar = f205403e;
        if (!zzgadVar.containsKey(Integer.valueOf(iM96489a))) {
            return null;
        }
        int i = 8;
        if (iM96489a != 18) {
            if (iM96489a != 8) {
                if (iM96489a == 30 && !m220805b(30)) {
                    iM96489a = 7;
                }
            } else if (m220805b(8)) {
                iM96489a = 8;
                if (iM96489a == 30) {
                    iM96489a = 7;
                }
            } else {
                iM96489a = 7;
            }
        } else if (m220805b(18)) {
            iM96489a = 18;
            if (iM96489a != 8) {
                if (iM96489a == 30) {
                    iM96489a = 7;
                }
            } else if (m220805b(8)) {
                iM96489a = 8;
                if (iM96489a == 30) {
                    iM96489a = 7;
                }
            } else {
                iM96489a = 7;
            }
        } else {
            iM96489a = 6;
        }
        if (!m220805b(iM96489a)) {
            return null;
        }
        int iIntValue = sqr0Var.f170264y;
        if (iIntValue == -1 || iM96489a == 18) {
            int i2 = sqr0Var.f170265z;
            if (i2 == -1) {
                i2 = 48000;
            }
            if (mpw0.f137957a >= 29) {
                iIntValue = xoy0.m212487a(iM96489a, i2, w3y0Var);
            } else {
                Integer num = (Integer) zzgadVar.getOrDefault(Integer.valueOf(iM96489a), 0);
                num.getClass();
                iIntValue = num.intValue();
            }
        } else if (sqr0Var.f170251l.equals("audio/vnd.dts.uhd;profile=p2")) {
            if (iIntValue > 10) {
                return null;
            }
        } else if (iIntValue > 10) {
            return null;
        }
        int i3 = mpw0.f137957a;
        if (i3 > 28) {
            i = iIntValue;
        } else if (iIntValue != 7) {
            if (iIntValue == 3 || iIntValue == 4 || iIntValue == 5) {
                i = 6;
            } else {
                i = iIntValue;
            }
        }
        if (i3 <= 26 && "fugu".equals(mpw0.f137958b) && i == 1) {
            i = 2;
        }
        int iM159424v = mpw0.m159424v(i);
        if (iM159424v != 0) {
            return Pair.create(Integer.valueOf(iM96489a), Integer.valueOf(iM159424v));
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m220805b(int i) {
        return Arrays.binarySearch(this.f205404a, i) >= 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoy0) && Arrays.equals(this.f205404a, ((zoy0) obj).f205404a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f205404a) * 31) + 10;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=10, supportedEncodings=" + Arrays.toString(this.f205404a) + Constants.AES_SUFFIX;
    }
}
