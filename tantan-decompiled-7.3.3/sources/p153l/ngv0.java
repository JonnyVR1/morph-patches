package p153l;

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
public abstract class ngv0 implements pcv0 {
    /* JADX INFO: renamed from: d */
    public static Bundle m163013d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: a */
    public final boolean mo98488a(b7w0 b7w0Var, q6w0 q6w0Var) {
        return !TextUtils.isEmpty(q6w0Var.f155916w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // p153l.pcv0
    /* JADX INFO: renamed from: b */
    public final hpr mo98489b(b7w0 b7w0Var, q6w0 q6w0Var) {
        String strOptString = q6w0Var.f155916w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        o7w0 o7w0Var = b7w0Var.f75342a.f197721a;
        m7w0 m7w0Var = new m7w0();
        m7w0Var.m157312G(o7w0Var);
        m7w0Var.m157315J(strOptString);
        Bundle bundleM163013d = m163013d(o7w0Var.f145318d.zzm);
        Bundle bundleM163013d2 = m163013d(bundleM163013d.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleM163013d2.putInt("gw", 1);
        String strOptString2 = q6w0Var.f155916w.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleM163013d2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = q6w0Var.f155916w.optString("adJson", null);
        if (strOptString3 != null) {
            bundleM163013d2.putString("_ad", strOptString3);
        }
        bundleM163013d2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = q6w0Var.f155851E.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = q6w0Var.f155851E.optString(next, null);
            if (next != null) {
                bundleM163013d2.putString(next, strOptString4);
            }
        }
        bundleM163013d.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleM163013d2);
        zzl zzlVar = o7w0Var.f145318d;
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
        m7w0Var.m157327e(new zzl(zzlVar.zza, zzlVar.zzb, bundleM163013d2, i, list2, z2, i2, z3, str4, zzfhVar, zzlVar.zzk, zzlVar.zzl, bundleM163013d, bundle, list, str, str2, z, zzcVar, i3, str3, list3, i4, zzlVar.zzx, zzlVar.zzy));
        o7w0 o7w0VarM157329g = m7w0Var.m157329g();
        Bundle bundle2 = new Bundle();
        t6w0 t6w0Var = b7w0Var.f75343b.f68854b;
        Bundle bundle3 = new Bundle();
        bundle3.putStringArrayList("nofill_urls", new ArrayList<>(t6w0Var.f172367a));
        bundle3.putInt("refresh_interval", t6w0Var.f172369c);
        bundle3.putString("gws_query_id", t6w0Var.f172368b);
        bundle2.putBundle("parent_common_config", bundle3);
        o7w0 o7w0Var2 = b7w0Var.f75342a.f197721a;
        Bundle bundle4 = new Bundle();
        bundle4.putString("initial_ad_unit_id", o7w0Var2.f145320f);
        bundle4.putString("allocation_id", q6w0Var.f155917x);
        bundle4.putStringArrayList("click_urls", new ArrayList<>(q6w0Var.f155877c));
        bundle4.putStringArrayList("imp_urls", new ArrayList<>(q6w0Var.f155879d));
        bundle4.putStringArrayList("manual_tracking_urls", new ArrayList<>(q6w0Var.f155905q));
        bundle4.putStringArrayList("fill_urls", new ArrayList<>(q6w0Var.f155899n));
        bundle4.putStringArrayList("video_start_urls", new ArrayList<>(q6w0Var.f155887h));
        bundle4.putStringArrayList("video_reward_urls", new ArrayList<>(q6w0Var.f155889i));
        bundle4.putStringArrayList("video_complete_urls", new ArrayList<>(q6w0Var.f155891j));
        bundle4.putString(FirebaseAnalytics.Param.TRANSACTION_ID, q6w0Var.f155893k);
        bundle4.putString("valid_from_timestamp", q6w0Var.f155895l);
        bundle4.putBoolean("is_closable_area_disabled", q6w0Var.f155863Q);
        bundle4.putString("recursive_server_response_data", q6w0Var.f155904p0);
        if (q6w0Var.f155897m != null) {
            Bundle bundle5 = new Bundle();
            bundle5.putInt("rb_amount", q6w0Var.f155897m.zzb);
            bundle5.putString("rb_type", q6w0Var.f155897m.zza);
            bundle4.putParcelableArray("rewards", new Bundle[]{bundle5});
        }
        bundle2.putBundle("parent_ad_config", bundle4);
        return mo97934c(o7w0VarM157329g, bundle2, q6w0Var, b7w0Var);
    }

    /* JADX INFO: renamed from: c */
    public abstract hpr mo97934c(o7w0 o7w0Var, Bundle bundle, q6w0 q6w0Var, b7w0 b7w0Var);
}
