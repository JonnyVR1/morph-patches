package p149l;

import com.google.android.gms.internal.ads.zzbbz;

/* JADX INFO: loaded from: classes6.dex */
public final class i3s0 implements t8x0 {

    /* JADX INFO: renamed from: a */
    public static final t8x0 f111370a = new i3s0();

    @Override // p149l.t8x0
    public final boolean zza(int i) {
        zzbbz zzbbzVar;
        zzbbz zzbbzVar2 = zzbbz.AD_INITIATER_UNSPECIFIED;
        switch (i) {
            case 0:
                zzbbzVar = zzbbz.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                zzbbzVar = zzbbz.BANNER;
                break;
            case 2:
                zzbbzVar = zzbbz.DFP_BANNER;
                break;
            case 3:
                zzbbzVar = zzbbz.INTERSTITIAL;
                break;
            case 4:
                zzbbzVar = zzbbz.DFP_INTERSTITIAL;
                break;
            case 5:
                zzbbzVar = zzbbz.NATIVE_EXPRESS;
                break;
            case 6:
                zzbbzVar = zzbbz.AD_LOADER;
                break;
            case 7:
                zzbbzVar = zzbbz.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                zzbbzVar = zzbbz.BANNER_SEARCH_ADS;
                break;
            case 9:
                zzbbzVar = zzbbz.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                zzbbzVar = zzbbz.APP_OPEN;
                break;
            case 11:
                zzbbzVar = zzbbz.REWARDED_INTERSTITIAL;
                break;
            default:
                zzbbzVar = null;
                break;
        }
        return zzbbzVar != null;
    }
}
