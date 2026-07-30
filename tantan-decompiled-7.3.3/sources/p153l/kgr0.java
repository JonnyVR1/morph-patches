package p153l;

import com.google.android.gms.internal.ads.zzbbz;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class kgr0 {

    /* JADX INFO: renamed from: a */
    public final String f126644a;

    public /* synthetic */ kgr0(ndr0 ndr0Var, zer0 zer0Var) {
        this.f126644a = ndr0Var.f141527a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final zzbbz m149757a() {
        String str = this.f126644a;
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
    public final String m149758b() {
        return this.f126644a.toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: c */
    public final Set m149759c() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f126644a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
