package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzfh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h7v0 implements j3v0 {
    /* JADX INFO: renamed from: d */
    public static Bundle m129805d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: a */
    public final boolean mo120127a(vxv0 vxv0Var, kxv0 kxv0Var) {
        return !TextUtils.isEmpty(kxv0Var.f125226w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: b */
    public final gnr mo120128b(vxv0 vxv0Var, kxv0 kxv0Var) {
        String strOptString = kxv0Var.f125226w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        iyv0 iyv0Var = vxv0Var.f183477a.f166831a;
        gyv0 gyv0Var = new gyv0();
        gyv0Var.m128755G(iyv0Var);
        gyv0Var.m128758J(strOptString);
        Bundle bundleM129805d = m129805d(iyv0Var.f115494d.zzm);
        Bundle bundleM129805d2 = m129805d(bundleM129805d.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleM129805d2.putInt("gw", 1);
        String strOptString2 = kxv0Var.f125226w.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleM129805d2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = kxv0Var.f125226w.optString("adJson", null);
        if (strOptString3 != null) {
            bundleM129805d2.putString("_ad", strOptString3);
        }
        bundleM129805d2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = kxv0Var.f125161E.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = kxv0Var.f125161E.optString(next, null);
            if (next != null) {
                bundleM129805d2.putString(next, strOptString4);
            }
        }
        bundleM129805d.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleM129805d2);
        zzl zzlVar = iyv0Var.f115494d;
        Bundle bundle = zzlVar.zzn;
        List list = zzlVar.zzo;
        String str = zzlVar.zzp;
        int i = zzlVar.zzd;
        String str2 = zzlVar.zzq;
        List list2 = zzlVar.zze;
        boolean z = zzlVar.zzr;
        boolean z2 = zzlVar.zzf;
        zzc zzcVar = zzlVar.zzs;
        int i2 = zzlVar.zzg;
        int i3 = zzlVar.zzt;
        boolean z3 = zzlVar.zzh;
        String str3 = zzlVar.zzu;
        String str4 = zzlVar.zzi;
        List list3 = zzlVar.zzv;
        zzfh zzfhVar = zzlVar.zzj;
        int i4 = zzlVar.zzw;
        gyv0Var.m128770e(new zzl(zzlVar.zza, zzlVar.zzb, bundleM129805d2, i, list2, z2, i2, z3, str4, zzfhVar, zzlVar.zzk, zzlVar.zzl, bundleM129805d, bundle, list, str, str2, z, zzcVar, i3, str3, list3, i4, zzlVar.zzx, zzlVar.zzy));
        iyv0 iyv0VarM128772g = gyv0Var.m128772g();
        Bundle bundle2 = new Bundle();
        nxv0 nxv0Var = vxv0Var.f183478b.f178773b;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList<>(nxv0Var.f141054a));
        bundle3.putInt("refresh_interval", nxv0Var.f141056c);
        bundle3.putString("gws_query_id", nxv0Var.f141055b);
        bundle2.putBundle("parent_common_config", bundle3);
        iyv0 iyv0Var2 = vxv0Var.f183477a.f166831a;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", iyv0Var2.f115496f);
        bundle4.putString("allocation_id", kxv0Var.f125227x);
        bundle4.putStringArrayList("click_urls", new ArrayList<>(kxv0Var.f125187c));
        bundle4.putStringArrayList("imp_urls", new ArrayList<>(kxv0Var.f125189d));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList<>(kxv0Var.f125215q));
        bundle4.putStringArrayList("fill_urls", new ArrayList<>(kxv0Var.f125209n));
        bundle4.putStringArrayList("video_start_urls", new ArrayList<>(kxv0Var.f125197h));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList<>(kxv0Var.f125199i));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList<>(kxv0Var.f125201j));
        bundle4.putString(FirebaseAnalytics.Param.TRANSACTION_ID, kxv0Var.f125203k);
        bundle4.putString("valid_from_timestamp", kxv0Var.f125205l);
        bundle4.putBoolean("is_closable_area_disabled", kxv0Var.f125173Q);
        bundle4.putString("recursive_server_response_data", kxv0Var.f125214p0);
        if (kxv0Var.f125207m != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", kxv0Var.f125207m.zzb);
            bundle5.putString("rb_type", kxv0Var.f125207m.zza);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return mo119844c(iyv0VarM128772g, bundle2, kxv0Var, vxv0Var);
    }

    /* JADX INFO: renamed from: c */
    public abstract gnr mo119844c(iyv0 iyv0Var, Bundle bundle, kxv0 kxv0Var, vxv0 vxv0Var);
}
