package p149l;

import com.google.android.gms.internal.ads.zzbbz;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class e7r0 {

    /* JADX INFO: renamed from: a */
    public final String f89745a;

    public /* synthetic */ e7r0(h4r0 h4r0Var, t5r0 t5r0Var) {
        this.f89745a = h4r0Var.f105870a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final zzbbz m115209a() {
        String str = this.f89745a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    return zzbbz.AD_LOADER;
                }
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    return zzbbz.INTERSTITIAL;
                }
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    return zzbbz.REWARD_BASED_VIDEO_AD;
                }
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    return zzbbz.BANNER;
                }
                break;
        }
        return zzbbz.AD_INITIATER_UNSPECIFIED;
    }

    /* JADX INFO: renamed from: b */
    public final String m115210b() {
        return this.f89745a.toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: c */
    public final Set m115211c() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f89745a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
