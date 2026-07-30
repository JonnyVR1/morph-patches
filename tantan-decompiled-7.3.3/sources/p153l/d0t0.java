package p153l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class d0t0 extends gzs0 {

    /* JADX INFO: renamed from: a */
    public final RtbAdapter f84604a;

    /* JADX INFO: renamed from: b */
    public String f84605b = "";

    public d0t0(RtbAdapter rtbAdapter) {
        this.f84604a = rtbAdapter;
    }

    /* JADX INFO: renamed from: q8 */
    public static final Bundle m113440q8(String str) throws RemoteException {
        dct0.m115298g("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            dct0.m115296e("", e);
            pqy0.m173422a();
            return null;
        }
    }

    /* JADX INFO: renamed from: r8 */
    public static final boolean m113441r8(zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        k6s0.m148569b();
        return obt0.m167043t();
    }

    @Nullable
    /* JADX INFO: renamed from: s8 */
    public static final String m113442s8(String str, zzl zzlVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzlVar.zzu;
        }
    }

    @Override // p153l.hzs0
    /* JADX INFO: renamed from: H */
    public final boolean mo113443H(p1m p1mVar) throws RemoteException {
        return false;
    }

    @Override // p153l.hzs0
    /* JADX INFO: renamed from: I7 */
    public final void mo113444I7(String str, String str2, zzl zzlVar, p1m p1mVar, ezs0 ezs0Var, jxs0 jxs0Var) throws RemoteException {
        try {
            this.f84604a.loadRtbRewardedInterstitialAd(new e8y((Context) h950.m134037P2(p1mVar), str, m113440q8(str2), m113452p8(zzlVar), m113441r8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m113442s8(str2, zzlVar), this.f84605b), new c0t0(this, ezs0Var, jxs0Var));
        } catch (Throwable th) {
            dct0.m115296e("Adapter failed to render rewarded interstitial ad.", th);
            rws0.m183461a(p1mVar, th, "adapter.loadRtbRewardedInterstitialAd");
            pqy0.m173422a();
        }
    }

    @Override // p153l.hzs0
    /* JADX INFO: renamed from: O1 */
    public final void mo113445O1(String str, String str2, zzl zzlVar, p1m p1mVar, vys0 vys0Var, jxs0 jxs0Var, zzq zzqVar) throws RemoteException {
        try {
            this.f84604a.loadRtbBannerAd(new x7y((Context) h950.m134037P2(p1mVar), str, m113440q8(str2), m113452p8(zzlVar), m113441r8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m113442s8(str2, zzlVar), l9s0.m153448c(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.f84605b), new mzs0(this, vys0Var, jxs0Var));
        } catch (Throwable th) {
            dct0.m115296e("Adapter failed to render banner ad.", th);
            rws0.m183461a(p1mVar, th, "adapter.loadRtbBannerAd");
            pqy0.m173422a();
        }
    }

    @Override // p153l.hzs0
    /* JADX INFO: renamed from: T */
    public final void mo113446T(String str) {
        this.f84605b = str;
    }

    @Override // p153l.hzs0
    /* JADX INFO: renamed from: T0 */
    public final void mo113447T0(String str, String str2, zzl zzlVar, p1m p1mVar, bzs0 bzs0Var, jxs0 jxs0Var) throws RemoteException {
        mo113448X3(str, str2, zzlVar, p1mVar, bzs0Var, jxs0Var, null);
    }

    @Override // p153l.hzs0
    /* JADX INFO: renamed from: X3 */
    public final void mo113448X3(String str, String str2, zzl zzlVar, p1m p1mVar, bzs0 bzs0Var, jxs0 jxs0Var, zzbjb zzbjbVar) throws RemoteException {
        try {
            this.f84604a.loadRtbNativeAd(new c8y((Context) h950.m134037P2(p1mVar), str, m113440q8(str2), m113452p8(zzlVar), m113441r8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m113442s8(str2, zzlVar), this.f84605b, zzbjbVar), new zzs0(this, bzs0Var, jxs0Var));
        } catch (Throwable th) {
            dct0.m115296e("Adapter failed to render native ad.", th);
            rws0.m183461a(p1mVar, th, "adapter.loadRtbNativeAd");
            pqy0.m173422a();
        }
    }

    @Override // p153l.hzs0
    /* JADX INFO: renamed from: b3 */
    public final void mo113449b3(String str, String str2, zzl zzlVar, p1m p1mVar, yys0 yys0Var, jxs0 jxs0Var) throws RemoteException {
        try {
            this.f84604a.loadRtbInterstitialAd(new a8y((Context) h950.m134037P2(p1mVar), str, m113440q8(str2), m113452p8(zzlVar), m113441r8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m113442s8(str2, zzlVar), this.f84605b), new ozs0(this, yys0Var, jxs0Var));
        } catch (Throwable th) {
            dct0.m115296e("Adapter failed to render interstitial ad.", th);
            rws0.m183461a(p1mVar, th, "adapter.loadRtbInterstitialAd");
            pqy0.m173422a();
        }
    }

    @Override // p153l.hzs0
    /* JADX INFO: renamed from: e6 */
    public final boolean mo113450e6(p1m p1mVar) throws RemoteException {
        return false;
    }

    @Override // p153l.hzs0
    /* JADX INFO: renamed from: o0 */
    public final boolean mo113451o0(p1m p1mVar) throws RemoteException {
        return false;
    }

    /* JADX INFO: renamed from: p8 */
    public final Bundle m113452p8(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f84604a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.hzs0
    /* JADX INFO: renamed from: s6 */
    public final void mo113453s6(p1m p1mVar, String str, Bundle bundle, Bundle bundle2, zzq zzqVar, kzs0 kzs0Var) throws RemoteException {
        AdFormat adFormat;
        try {
            b0t0 b0t0Var = new b0t0(this, kzs0Var);
            RtbAdapter rtbAdapter = this.f84604a;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        adFormat = AdFormat.BANNER;
                        z7y z7yVar = new z7y(adFormat, bundle2);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(z7yVar);
                        rtbAdapter.collectSignals(new wnd0((Context) h950.m134037P2(p1mVar), arrayList, bundle, l9s0.m153448c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), b0t0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case -1052618729:
                    if (str.equals("native")) {
                        adFormat = AdFormat.NATIVE;
                        z7y z7yVar2 = new z7y(adFormat, bundle2);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(z7yVar2);
                        rtbAdapter.collectSignals(new wnd0((Context) h950.m134037P2(p1mVar), arrayList2, bundle, l9s0.m153448c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), b0t0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case -239580146:
                    if (str.equals("rewarded")) {
                        adFormat = AdFormat.REWARDED;
                        z7y z7yVar3 = new z7y(adFormat, bundle2);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(z7yVar3);
                        rtbAdapter.collectSignals(new wnd0((Context) h950.m134037P2(p1mVar), arrayList3, bundle, l9s0.m153448c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), b0t0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 604727084:
                    if (str.equals("interstitial")) {
                        adFormat = AdFormat.INTERSTITIAL;
                        z7y z7yVar4 = new z7y(adFormat, bundle2);
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(z7yVar4);
                        rtbAdapter.collectSignals(new wnd0((Context) h950.m134037P2(p1mVar), arrayList4, bundle, l9s0.m153448c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), b0t0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1167692200:
                    if (str.equals(FirebaseAnalytics.Event.APP_OPEN)) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        z7y z7yVar5 = new z7y(adFormat, bundle2);
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(z7yVar5);
                        rtbAdapter.collectSignals(new wnd0((Context) h950.m134037P2(p1mVar), arrayList5, bundle, l9s0.m153448c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), b0t0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168343ib)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            z7y z7yVar6 = new z7y(adFormat, bundle2);
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(z7yVar6);
                            rtbAdapter.collectSignals(new wnd0((Context) h950.m134037P2(p1mVar), arrayList6, bundle, l9s0.m153448c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), b0t0Var);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        z7y z7yVar7 = new z7y(adFormat, bundle2);
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(z7yVar7);
                        rtbAdapter.collectSignals(new wnd0((Context) h950.m134037P2(p1mVar), arrayList7, bundle, l9s0.m153448c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), b0t0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            dct0.m115296e("Error generating signals for RTB", th);
            rws0.m183461a(p1mVar, th, "adapter.collectSignals");
            pqy0.m173422a();
        }
    }

    @Override // p153l.hzs0
    /* JADX INFO: renamed from: t7 */
    public final void mo113454t7(String str, String str2, zzl zzlVar, p1m p1mVar, ezs0 ezs0Var, jxs0 jxs0Var) throws RemoteException {
        try {
            this.f84604a.loadRtbRewardedAd(new e8y((Context) h950.m134037P2(p1mVar), str, m113440q8(str2), m113452p8(zzlVar), m113441r8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m113442s8(str2, zzlVar), this.f84605b), new c0t0(this, ezs0Var, jxs0Var));
        } catch (Throwable th) {
            dct0.m115296e("Adapter failed to render rewarded ad.", th);
            rws0.m183461a(p1mVar, th, "adapter.loadRtbRewardedAd");
            pqy0.m173422a();
        }
    }

    @Override // p153l.hzs0
    /* JADX INFO: renamed from: z1 */
    public final void mo113455z1(String str, String str2, zzl zzlVar, p1m p1mVar, vys0 vys0Var, jxs0 jxs0Var, zzq zzqVar) throws RemoteException {
        try {
            this.f84604a.loadRtbInterscrollerAd(new x7y((Context) h950.m134037P2(p1mVar), str, m113440q8(str2), m113452p8(zzlVar), m113441r8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m113442s8(str2, zzlVar), l9s0.m153448c(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.f84605b), new nzs0(this, vys0Var, jxs0Var));
        } catch (Throwable th) {
            dct0.m115296e("Adapter failed to render interscroller ad.", th);
            rws0.m183461a(p1mVar, th, "adapter.loadRtbInterscrollerAd");
            pqy0.m173422a();
        }
    }

    @Override // p153l.hzs0
    /* JADX INFO: renamed from: z6 */
    public final void mo113456z6(String str, String str2, zzl zzlVar, p1m p1mVar, sys0 sys0Var, jxs0 jxs0Var) throws RemoteException {
        try {
            this.f84604a.loadRtbAppOpenAd(new w7y((Context) h950.m134037P2(p1mVar), str, m113440q8(str2), m113452p8(zzlVar), m113441r8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m113442s8(str2, zzlVar), this.f84605b), new a0t0(this, sys0Var, jxs0Var));
        } catch (Throwable th) {
            dct0.m115296e("Adapter failed to render app open ad.", th);
            rws0.m183461a(p1mVar, th, "adapter.loadRtbAppOpenAd");
            pqy0.m173422a();
        }
    }

    @Override // p153l.hzs0
    @Nullable
    public final lpu0 zze() {
        Object obj = this.f84604a;
        if (obj instanceof lar0) {
            try {
                return ((lar0) obj).getVideoController();
            } catch (Throwable th) {
                dct0.m115296e("", th);
            }
        }
        return null;
    }

    @Override // p153l.hzs0
    public final zzbvg zzf() throws RemoteException {
        this.f84604a.getVersionInfo();
        return zzbvg.m13602g(null);
    }

    @Override // p153l.hzs0
    public final zzbvg zzg() throws RemoteException {
        this.f84604a.getSDKVersionInfo();
        return zzbvg.m13602g(null);
    }
}
