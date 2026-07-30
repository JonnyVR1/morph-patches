package p149l;

import android.annotation.SuppressLint;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.C2275w2;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgad;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class tfy0 {

    /* JADX INFO: renamed from: c */
    public static final tfy0 f170032c = new tfy0(new int[]{2}, 10);

    /* JADX INFO: renamed from: d */
    @SuppressLint({"InlinedApi"})
    public static final zzgaa f170033d = zzgaa.zzo(2, 5, 6);

    /* JADX INFO: renamed from: e */
    public static final zzgad f170034e;

    /* JADX INFO: renamed from: a */
    public final int[] f170035a;

    /* JADX INFO: renamed from: b */
    public final int f170036b;

    static {
        C2275w2 c2275w2 = new C2275w2();
        c2275w2.m13419a(5, 6);
        c2275w2.m13419a(17, 6);
        c2275w2.m13419a(7, 6);
        c2275w2.m13419a(30, 10);
        c2275w2.m13419a(18, 6);
        c2275w2.m13419a(6, 8);
        c2275w2.m13419a(8, 8);
        c2275w2.m13419a(14, 8);
        f170034e = c2275w2.m13421c();
    }

    public tfy0(@Nullable int[] iArr, int i) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, 1);
        this.f170035a = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
        this.f170036b = 10;
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
    public final Pair m188754a(mhr0 mhr0Var, qux0 qux0Var) {
        String str = mhr0Var.f133892l;
        str.getClass();
        int iM196364a = uys0.m196364a(str, mhr0Var.f133889i);
        zzgad zzgadVar = f170034e;
        if (!zzgadVar.containsKey(Integer.valueOf(iM196364a))) {
            return null;
        }
        int i = 8;
        if (iM196364a != 18) {
            if (iM196364a != 8) {
                if (iM196364a == 30 && !m188755b(30)) {
                    iM196364a = 7;
                }
            } else if (m188755b(8)) {
                iM196364a = 8;
                if (iM196364a == 30) {
                    iM196364a = 7;
                }
            } else {
                iM196364a = 7;
            }
        } else if (m188755b(18)) {
            iM196364a = 18;
            if (iM196364a != 8) {
                if (iM196364a == 30) {
                    iM196364a = 7;
                }
            } else if (m188755b(8)) {
                iM196364a = 8;
                if (iM196364a == 30) {
                    iM196364a = 7;
                }
            } else {
                iM196364a = 7;
            }
        } else {
            iM196364a = 6;
        }
        if (!m188755b(iM196364a)) {
            return null;
        }
        int iIntValue = mhr0Var.f133905y;
        if (iIntValue == -1 || iM196364a == 18) {
            int i2 = mhr0Var.f133906z;
            if (i2 == -1) {
                i2 = 48000;
            }
            if (ggw0.f102568a >= 29) {
                iIntValue = rfy0.m179152a(iM196364a, i2, qux0Var);
            } else {
                Integer num = (Integer) zzgadVar.getOrDefault(Integer.valueOf(iM196364a), 0);
                num.getClass();
                iIntValue = num.intValue();
            }
        } else if (mhr0Var.f133892l.equals("audio/vnd.dts.uhd;profile=p2")) {
            if (iIntValue > 10) {
                return null;
            }
        } else if (iIntValue > 10) {
            return null;
        }
        int i3 = ggw0.f102568a;
        if (i3 > 28) {
            i = iIntValue;
        } else if (iIntValue != 7) {
            if (iIntValue == 3 || iIntValue == 4 || iIntValue == 5) {
                i = 6;
            } else {
                i = iIntValue;
            }
        }
        if (i3 <= 26 && "fugu".equals(ggw0.f102569b) && i == 1) {
            i = 2;
        }
        int iM126080v = ggw0.m126080v(i);
        if (iM126080v != 0) {
            return Pair.create(Integer.valueOf(iM196364a), Integer.valueOf(iM126080v));
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m188755b(int i) {
        return Arrays.binarySearch(this.f170035a, i) >= 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfy0) && Arrays.equals(this.f170035a, ((tfy0) obj).f170035a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f170035a) * 31) + 10;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=10, supportedEncodings=" + Arrays.toString(this.f170035a) + Constants.AES_SUFFIX;
    }
}
