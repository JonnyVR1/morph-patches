package p153l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class bys0 extends wws0 {

    /* JADX INFO: renamed from: a */
    public final Object f79051a;

    /* JADX INFO: renamed from: b */
    public cys0 f79052b;

    /* JADX INFO: renamed from: c */
    public e7t0 f79053c;

    /* JADX INFO: renamed from: d */
    public p1m f79054d;

    /* JADX INFO: renamed from: e */
    public View f79055e;

    /* JADX INFO: renamed from: f */
    public nxj0 f79056f;

    /* JADX INFO: renamed from: g */
    public final String f79057g = "";

    public bys0(@NonNull b80 b80Var) {
        this.f79051a = b80Var;
    }

    /* JADX INFO: renamed from: q8 */
    public static final boolean m107052q8(zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        k6s0.m148569b();
        return obt0.m167043t();
    }

    @Nullable
    /* JADX INFO: renamed from: r8 */
    public static final String m107053r8(String str, zzl zzlVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzlVar.zzu;
        }
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: D3 */
    public final void mo107055D3(p1m p1mVar, zzl zzlVar, String str, String str2, jxs0 jxs0Var) throws RemoteException {
        Object obj = this.f79051a;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof b80)) {
            dct0.m115298g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + b80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            pqy0.m173422a();
            return;
        }
        dct0.m115293b("Requesting interstitial ad from adapter.");
        Object obj2 = this.f79051a;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof b80) {
                try {
                    ((b80) obj2).loadInterstitialAd(new a8y((Context) h950.m134037P2(p1mVar), "", m107073p8(str, zzlVar, str2), m107071o8(zzlVar), m107052q8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m107053r8(str, zzlVar), this.f79057g), new xxs0(this, jxs0Var));
                    return;
                } catch (Throwable th) {
                    dct0.m115296e("", th);
                    rws0.m183461a(p1mVar, th, "adapter.loadInterstitialAd");
                    pqy0.m173422a();
                    return;
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List list = zzlVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzlVar.zzb;
            txs0 txs0Var = new txs0(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, m107052q8(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, m107053r8(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) h950.m134037P2(p1mVar), new cys0(jxs0Var), m107073p8(str, zzlVar, str2), txs0Var, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            dct0.m115296e("", th2);
            rws0.m183461a(p1mVar, th2, "adapter.requestInterstitialAd");
            pqy0.m173422a();
        }
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: D5 */
    public final void mo107056D5(p1m p1mVar, zzq zzqVar, zzl zzlVar, String str, String str2, jxs0 jxs0Var) throws RemoteException {
        Object obj = this.f79051a;
        if (!(obj instanceof b80)) {
            dct0.m115298g(b80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            pqy0.m173422a();
            return;
        }
        dct0.m115293b("Requesting interscroller ad from adapter.");
        try {
            b80 b80Var = (b80) this.f79051a;
            b80Var.loadInterscrollerAd(new x7y((Context) h950.m134037P2(p1mVar), "", m107073p8(str, zzlVar, str2), m107071o8(zzlVar), m107052q8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m107053r8(str, zzlVar), l9s0.m153450e(zzqVar.zze, zzqVar.zzb), ""), new uxs0(this, jxs0Var, b80Var));
        } catch (Exception e) {
            dct0.m115296e("", e);
            rws0.m183461a(p1mVar, e, "adapter.loadInterscrollerAd");
            pqy0.m173422a();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.xws0
    /* JADX INFO: renamed from: E1 */
    public final void mo107057E1(p1m p1mVar, iss0 iss0Var, List list) throws RemoteException {
        if (!(this.f79051a instanceof b80)) {
            pqy0.m173422a();
            return;
        }
        vxs0 vxs0Var = new vxs0(this, iss0Var);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbpn zzbpnVar = (zzbpn) it.next();
            String str = zzbpnVar.zza;
            AdFormat adFormat = null;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        adFormat = AdFormat.BANNER;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        adFormat = AdFormat.NATIVE;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        adFormat = AdFormat.REWARDED;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        adFormat = AdFormat.INTERSTITIAL;
                    }
                    break;
                case 1167692200:
                    if (str.equals(FirebaseAnalytics.Event.APP_OPEN)) {
                        adFormat = AdFormat.APP_OPEN_AD;
                    }
                    break;
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168343ib)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                        }
                    }
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                    }
                    break;
            }
            if (adFormat != null) {
                arrayList.add(new z7y(adFormat, zzbpnVar.zzb));
            }
        }
        ((b80) this.f79051a).initialize((Context) h950.m134037P2(p1mVar), vxs0Var, arrayList);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: L4 */
    public final void mo107058L4(p1m p1mVar) throws RemoteException {
        Object obj = this.f79051a;
        if (obj instanceof b80) {
            dct0.m115293b("Show rewarded ad from adapter.");
            dct0.m115295d("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        dct0.m115298g(b80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: M */
    public final void mo107059M() throws RemoteException {
        Object obj = this.f79051a;
        if (obj instanceof v7y) {
            try {
                ((v7y) obj).onPause();
            } catch (Throwable th) {
                dct0.m115296e("", th);
                pqy0.m173422a();
            }
        }
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: N2 */
    public final void mo107060N2(p1m p1mVar, zzl zzlVar, String str, e7t0 e7t0Var, String str2) throws RemoteException {
        Object obj = this.f79051a;
        if ((obj instanceof b80) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f79054d = p1mVar;
            this.f79053c = e7t0Var;
            e7t0Var.mo108330Z3(h950.m134038Y2(this.f79051a));
            return;
        }
        Object obj2 = this.f79051a;
        dct0.m115298g(b80.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        pqy0.m173422a();
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: O3 */
    public final void mo107061O3(p1m p1mVar, zzl zzlVar, String str, jxs0 jxs0Var) throws RemoteException {
        Object obj = this.f79051a;
        if (obj instanceof b80) {
            dct0.m115293b("Requesting rewarded interstitial ad from adapter.");
            try {
                ((b80) this.f79051a).loadRewardedInterstitialAd(new e8y((Context) h950.m134037P2(p1mVar), "", m107073p8(str, zzlVar, null), m107071o8(zzlVar), m107052q8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m107053r8(str, zzlVar), ""), new zxs0(this, jxs0Var));
                return;
            } catch (Exception e) {
                rws0.m183461a(p1mVar, e, "adapter.loadRewardedInterstitialAd");
                pqy0.m173422a();
                return;
            }
        }
        dct0.m115298g(b80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        pqy0.m173422a();
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: S1 */
    public final void mo107062S1(zzl zzlVar, String str) throws RemoteException {
        mo107069l6(zzlVar, str, null);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: T4 */
    public final void mo107063T4(p1m p1mVar) throws RemoteException {
        Object obj = this.f79051a;
        if ((obj instanceof b80) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                mo107072p();
                return;
            }
            dct0.m115293b("Show interstitial ad from adapter.");
            dct0.m115295d("Can not show null mediation interstitial ad.");
            pqy0.m173422a();
            return;
        }
        dct0.m115298g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + b80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        pqy0.m173422a();
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: X5 */
    public final void mo107064X5(p1m p1mVar, zzq zzqVar, zzl zzlVar, String str, jxs0 jxs0Var) throws RemoteException {
        mo107070m6(p1mVar, zzqVar, zzlVar, str, null, jxs0Var);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: c7 */
    public final void mo107065c7(p1m p1mVar, zzl zzlVar, String str, jxs0 jxs0Var) throws RemoteException {
        mo107055D3(p1mVar, zzlVar, str, null, jxs0Var);
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: g8 */
    public final void mo107066g8(p1m p1mVar, zzl zzlVar, String str, jxs0 jxs0Var) throws RemoteException {
        Object obj = this.f79051a;
        if (!(obj instanceof b80)) {
            dct0.m115298g(b80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            pqy0.m173422a();
            return;
        }
        dct0.m115293b("Requesting app open ad from adapter.");
        try {
            ((b80) this.f79051a).loadAppOpenAd(new w7y((Context) h950.m134037P2(p1mVar), "", m107073p8(str, zzlVar, null), m107071o8(zzlVar), m107052q8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m107053r8(str, zzlVar), ""), new ays0(this, jxs0Var));
        } catch (Exception e) {
            dct0.m115296e("", e);
            rws0.m183461a(p1mVar, e, "adapter.loadAppOpenAd");
            pqy0.m173422a();
        }
    }

    @Override // p153l.xws0
    @Nullable
    /* JADX INFO: renamed from: h */
    public final oxs0 mo107067h() {
        return null;
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: l4 */
    public final void mo107068l4(p1m p1mVar, zzl zzlVar, String str, jxs0 jxs0Var) throws RemoteException {
        Object obj = this.f79051a;
        if (!(obj instanceof b80)) {
            dct0.m115298g(b80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            pqy0.m173422a();
            return;
        }
        dct0.m115293b("Requesting rewarded ad from adapter.");
        try {
            ((b80) this.f79051a).loadRewardedAd(new e8y((Context) h950.m134037P2(p1mVar), "", m107073p8(str, zzlVar, null), m107071o8(zzlVar), m107052q8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m107053r8(str, zzlVar), ""), new zxs0(this, jxs0Var));
        } catch (Exception e) {
            dct0.m115296e("", e);
            rws0.m183461a(p1mVar, e, "adapter.loadRewardedAd");
            pqy0.m173422a();
        }
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: l6 */
    public final void mo107069l6(zzl zzlVar, String str, String str2) throws RemoteException {
        Object obj = this.f79051a;
        if (obj instanceof b80) {
            mo107068l4(this.f79054d, zzlVar, str, new dys0((b80) obj, this.f79053c));
            return;
        }
        dct0.m115298g(b80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        pqy0.m173422a();
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: m6 */
    public final void mo107070m6(p1m p1mVar, zzq zzqVar, zzl zzlVar, String str, String str2, jxs0 jxs0Var) throws RemoteException {
        Object obj = this.f79051a;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof b80)) {
            dct0.m115298g(MediationBannerAdapter.class.getCanonicalName() + " or " + b80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            pqy0.m173422a();
            return;
        }
        dct0.m115293b("Requesting banner ad from adapter.");
        boolean z = zzqVar.zzn;
        int i = zzqVar.zze;
        w70 w70VarM153449d = z ? l9s0.m153449d(i, zzqVar.zzb) : l9s0.m153448c(i, zzqVar.zzb, zzqVar.zza);
        Object obj2 = this.f79051a;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof b80) {
                try {
                    ((b80) obj2).loadBannerAd(new x7y((Context) h950.m134037P2(p1mVar), "", m107073p8(str, zzlVar, str2), m107071o8(zzlVar), m107052q8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m107053r8(str, zzlVar), w70VarM153449d, this.f79057g), new wxs0(this, jxs0Var));
                    return;
                } catch (Throwable th) {
                    dct0.m115296e("", th);
                    rws0.m183461a(p1mVar, th, "adapter.loadBannerAd");
                    pqy0.m173422a();
                    return;
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List list = zzlVar.zze;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j = zzlVar.zzb;
            txs0 txs0Var = new txs0(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, m107052q8(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, m107053r8(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            mediationBannerAdapter.requestBannerAd((Context) h950.m134037P2(p1mVar), new cys0(jxs0Var), m107073p8(str, zzlVar, str2), w70VarM153449d, txs0Var, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            dct0.m115296e("", th2);
            rws0.m183461a(p1mVar, th2, "adapter.requestBannerAd");
            pqy0.m173422a();
        }
    }

    /* JADX INFO: renamed from: o8 */
    public final Bundle m107071o8(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f79051a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: p */
    public final void mo107072p() throws RemoteException {
        Object obj = this.f79051a;
        if (obj instanceof MediationInterstitialAdapter) {
            dct0.m115293b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f79051a).showInterstitial();
                return;
            } catch (Throwable th) {
                dct0.m115296e("", th);
                pqy0.m173422a();
                return;
            }
        }
        dct0.m115298g(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        pqy0.m173422a();
    }

    /* JADX INFO: renamed from: p8 */
    public final Bundle m107073p8(String str, zzl zzlVar, String str2) throws RemoteException {
        dct0.m115293b("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f79051a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            dct0.m115296e("", th);
            pqy0.m173422a();
            return null;
        }
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: s3 */
    public final void mo107074s3(p1m p1mVar, zzl zzlVar, String str, String str2, jxs0 jxs0Var, zzbjb zzbjbVar, List list) throws RemoteException {
        Object obj = this.f79051a;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof b80)) {
            dct0.m115298g(MediationNativeAdapter.class.getCanonicalName() + " or " + b80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            pqy0.m173422a();
            return;
        }
        dct0.m115293b("Requesting native ad from adapter.");
        Object obj2 = this.f79051a;
        if (!(obj2 instanceof MediationNativeAdapter)) {
            if (obj2 instanceof b80) {
                try {
                    ((b80) obj2).loadNativeAd(new c8y((Context) h950.m134037P2(p1mVar), "", m107073p8(str, zzlVar, str2), m107071o8(zzlVar), m107052q8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m107053r8(str, zzlVar), this.f79057g, zzbjbVar), new yxs0(this, jxs0Var));
                    return;
                } catch (Throwable th) {
                    dct0.m115296e("", th);
                    rws0.m183461a(p1mVar, th, "adapter.loadNativeAd");
                    pqy0.m173422a();
                    return;
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
            List list2 = zzlVar.zze;
            HashSet hashSet = list2 != null ? new HashSet(list2) : null;
            long j = zzlVar.zzb;
            eys0 eys0Var = new eys0(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, m107052q8(zzlVar), zzlVar.zzg, zzbjbVar, list, zzlVar.zzr, zzlVar.zzt, m107053r8(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.f79052b = new cys0(jxs0Var);
            mediationNativeAdapter.requestNativeAd((Context) h950.m134037P2(p1mVar), this.f79052b, m107073p8(str, zzlVar, str2), eys0Var, bundle2);
        } catch (Throwable th2) {
            dct0.m115296e("", th2);
            rws0.m183461a(p1mVar, th2, "adapter.requestNativeAd");
            pqy0.m173422a();
        }
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: t3 */
    public final void mo107075t3(p1m p1mVar) throws RemoteException {
        Context context = (Context) h950.m134037P2(p1mVar);
        Object obj = this.f79051a;
        if (obj instanceof ul50) {
            ((ul50) obj).m196537a(context);
        }
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: v4 */
    public final void mo107076v4(p1m p1mVar) throws RemoteException {
        Object obj = this.f79051a;
        if (obj instanceof b80) {
            dct0.m115293b("Show app open ad from adapter.");
            dct0.m115295d("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        dct0.m115298g(b80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: w4 */
    public final void mo107077w4(p1m p1mVar, e7t0 e7t0Var, List list) throws RemoteException {
        dct0.m115298g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // p153l.xws0
    /* JADX INFO: renamed from: y */
    public final boolean mo107078y() {
        return false;
    }

    @Override // p153l.xws0
    public final void zzF() throws RemoteException {
        Object obj = this.f79051a;
        if (obj instanceof v7y) {
            try {
                ((v7y) obj).onResume();
            } catch (Throwable th) {
                dct0.m115296e("", th);
                pqy0.m173422a();
            }
        }
    }

    @Override // p153l.xws0
    public final void zzG(boolean z) throws RemoteException {
        Object obj = this.f79051a;
        if (obj instanceof lm50) {
            try {
                ((lm50) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                dct0.m115296e("", th);
                return;
            }
        }
        dct0.m115293b(lm50.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // p153l.xws0
    public final void zzL() throws RemoteException {
        Object obj = this.f79051a;
        if (obj instanceof b80) {
            dct0.m115295d("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        dct0.m115298g(b80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // p153l.xws0
    public final boolean zzN() throws RemoteException {
        Object obj = this.f79051a;
        if ((obj instanceof b80) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f79053c != null;
        }
        Object obj2 = this.f79051a;
        dct0.m115298g(b80.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        pqy0.m173422a();
        return false;
    }

    @Override // p153l.xws0
    @Nullable
    public final nxs0 zzO() {
        return null;
    }

    @Override // p153l.xws0
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // p153l.xws0
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // p153l.xws0
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // p153l.xws0
    @Nullable
    public final lpu0 zzh() {
        Object obj = this.f79051a;
        if (obj instanceof lar0) {
            try {
                return ((lar0) obj).getVideoController();
            } catch (Throwable th) {
                dct0.m115296e("", th);
            }
        }
        return null;
    }

    @Override // p153l.xws0
    @Nullable
    public final bms0 zzi() {
        cms0 cms0VarM113247u;
        cys0 cys0Var = this.f79052b;
        if (cys0Var == null || (cms0VarM113247u = cys0Var.m113247u()) == null) {
            return null;
        }
        return cms0VarM113247u.m111314a();
    }

    @Override // p153l.xws0
    @Nullable
    public final mxs0 zzj() {
        return null;
    }

    @Override // p153l.xws0
    @Nullable
    public final rxs0 zzk() {
        nxj0 nxj0Var;
        nxj0 nxj0VarM113246t;
        Object obj = this.f79051a;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof b80) || (nxj0Var = this.f79056f) == null) {
                return null;
            }
            return new pys0(nxj0Var);
        }
        cys0 cys0Var = this.f79052b;
        if (cys0Var == null || (nxj0VarM113246t = cys0Var.m113246t()) == null) {
            return null;
        }
        return new pys0(nxj0VarM113246t);
    }

    @Override // p153l.xws0
    @Nullable
    public final zzbvg zzl() {
        Object obj = this.f79051a;
        if (!(obj instanceof b80)) {
            return null;
        }
        ((b80) obj).getVersionInfo();
        return zzbvg.m13602g(null);
    }

    @Override // p153l.xws0
    @Nullable
    public final zzbvg zzm() {
        Object obj = this.f79051a;
        if (!(obj instanceof b80)) {
            return null;
        }
        ((b80) obj).getSDKVersionInfo();
        return zzbvg.m13602g(null);
    }

    @Override // p153l.xws0
    public final p1m zzn() throws RemoteException {
        Object obj = this.f79051a;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return h950.m134038Y2(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                dct0.m115296e("", th);
                pqy0.m173422a();
                return null;
            }
        }
        if (obj instanceof b80) {
            return h950.m134038Y2(this.f79055e);
        }
        dct0.m115298g(MediationBannerAdapter.class.getCanonicalName() + " or " + b80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        pqy0.m173422a();
        return null;
    }

    @Override // p153l.xws0
    public final void zzo() throws RemoteException {
        Object obj = this.f79051a;
        if (obj instanceof v7y) {
            try {
                ((v7y) obj).onDestroy();
            } catch (Throwable th) {
                dct0.m115296e("", th);
                pqy0.m173422a();
            }
        }
    }

    public bys0(@NonNull v7y v7yVar) {
        this.f79051a = v7yVar;
    }
}
