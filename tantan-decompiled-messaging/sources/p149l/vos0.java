package p149l;

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
public final class vos0 extends qns0 {

    /* JADX INFO: renamed from: a */
    public final Object f182416a;

    /* JADX INFO: renamed from: b */
    public wos0 f182417b;

    /* JADX INFO: renamed from: c */
    public yxs0 f182418c;

    /* JADX INFO: renamed from: d */
    public uyl f182419d;

    /* JADX INFO: renamed from: e */
    public View f182420e;

    /* JADX INFO: renamed from: f */
    public koj0 f182421f;

    /* JADX INFO: renamed from: g */
    public final String f182422g = "";

    public vos0(@NonNull f80 f80Var) {
        this.f182416a = f80Var;
    }

    /* JADX INFO: renamed from: q8 */
    public static final boolean m199195q8(zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        exr0.m118703b();
        return i2t0.m134090t();
    }

    @Nullable
    /* JADX INFO: renamed from: r8 */
    public static final String m199196r8(String str, zzl zzlVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzlVar.zzu;
        }
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: D3 */
    public final void mo170444D3(uyl uylVar, zzl zzlVar, String str, String str2, dos0 dos0Var) throws RemoteException {
        Object obj = this.f182416a;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof f80)) {
            x2t0.m206869g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + f80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            jhy0.m141614a();
            return;
        }
        x2t0.m206864b("Requesting interstitial ad from adapter.");
        Object obj2 = this.f182416a;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof f80) {
                try {
                    ((f80) obj2).loadInterstitialAd(new dzx((Context) s050.m181847P2(uylVar), "", m199199p8(str, zzlVar, str2), m199198o8(zzlVar), m199195q8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m199196r8(str, zzlVar), this.f182422g), new ros0(this, dos0Var));
                    return;
                } catch (Throwable th) {
                    x2t0.m206867e("", th);
                    lns0.m150719a(uylVar, th, "adapter.loadInterstitialAd");
                    jhy0.m141614a();
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
            nos0 nos0Var = new nos0(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, m199195q8(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, m199196r8(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            mediationInterstitialAdapter.requestInterstitialAd((Context) s050.m181847P2(uylVar), new wos0(dos0Var), m199199p8(str, zzlVar, str2), nos0Var, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            x2t0.m206867e("", th2);
            lns0.m150719a(uylVar, th2, "adapter.requestInterstitialAd");
            jhy0.m141614a();
        }
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: D5 */
    public final void mo170445D5(uyl uylVar, zzq zzqVar, zzl zzlVar, String str, String str2, dos0 dos0Var) throws RemoteException {
        Object obj = this.f182416a;
        if (!(obj instanceof f80)) {
            x2t0.m206869g(f80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            jhy0.m141614a();
            return;
        }
        x2t0.m206864b("Requesting interscroller ad from adapter.");
        try {
            f80 f80Var = (f80) this.f182416a;
            f80Var.loadInterscrollerAd(new azx((Context) s050.m181847P2(uylVar), "", m199199p8(str, zzlVar, str2), m199198o8(zzlVar), m199195q8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m199196r8(str, zzlVar), f0s0.m119047e(zzqVar.zze, zzqVar.zzb), ""), new oos0(this, dos0Var, f80Var));
        } catch (Exception e) {
            x2t0.m206867e("", e);
            lns0.m150719a(uylVar, e, "adapter.loadInterscrollerAd");
            jhy0.m141614a();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.rns0
    /* JADX INFO: renamed from: E1 */
    public final void mo170446E1(uyl uylVar, cjs0 cjs0Var, List list) throws RemoteException {
        if (!(this.f182416a instanceof f80)) {
            jhy0.m141614a();
            return;
        }
        pos0 pos0Var = new pos0(this, cjs0Var);
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
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132272ib)).booleanValue()) {
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
                arrayList.add(new czx(adFormat, zzbpnVar.zzb));
            }
        }
        ((f80) this.f182416a).initialize((Context) s050.m181847P2(uylVar), pos0Var, arrayList);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: L4 */
    public final void mo170447L4(uyl uylVar) throws RemoteException {
        Object obj = this.f182416a;
        if (obj instanceof f80) {
            x2t0.m206864b("Show rewarded ad from adapter.");
            x2t0.m206866d("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        x2t0.m206869g(f80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: M */
    public final void mo170448M() throws RemoteException {
        Object obj = this.f182416a;
        if (obj instanceof yyx) {
            try {
                ((yyx) obj).onPause();
            } catch (Throwable th) {
                x2t0.m206867e("", th);
                jhy0.m141614a();
            }
        }
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: N2 */
    public final void mo170449N2(uyl uylVar, zzl zzlVar, String str, yxs0 yxs0Var, String str2) throws RemoteException {
        Object obj = this.f182416a;
        if ((obj instanceof f80) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f182419d = uylVar;
            this.f182418c = yxs0Var;
            yxs0Var.mo145122Z3(s050.m181848Y2(this.f182416a));
            return;
        }
        Object obj2 = this.f182416a;
        x2t0.m206869g(f80.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        jhy0.m141614a();
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: O3 */
    public final void mo170450O3(uyl uylVar, zzl zzlVar, String str, dos0 dos0Var) throws RemoteException {
        Object obj = this.f182416a;
        if (obj instanceof f80) {
            x2t0.m206864b("Requesting rewarded interstitial ad from adapter.");
            try {
                ((f80) this.f182416a).loadRewardedInterstitialAd(new hzx((Context) s050.m181847P2(uylVar), "", m199199p8(str, zzlVar, null), m199198o8(zzlVar), m199195q8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m199196r8(str, zzlVar), ""), new tos0(this, dos0Var));
                return;
            } catch (Exception e) {
                lns0.m150719a(uylVar, e, "adapter.loadRewardedInterstitialAd");
                jhy0.m141614a();
                return;
            }
        }
        x2t0.m206869g(f80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        jhy0.m141614a();
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: S1 */
    public final void mo170451S1(zzl zzlVar, String str) throws RemoteException {
        mo180158l6(zzlVar, str, null);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: T4 */
    public final void mo170452T4(uyl uylVar) throws RemoteException {
        Object obj = this.f182416a;
        if ((obj instanceof f80) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                mo170457p();
                return;
            }
            x2t0.m206864b("Show interstitial ad from adapter.");
            x2t0.m206866d("Can not show null mediation interstitial ad.");
            jhy0.m141614a();
            return;
        }
        x2t0.m206869g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + f80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        jhy0.m141614a();
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: X5 */
    public final void mo180156X5(uyl uylVar, zzq zzqVar, zzl zzlVar, String str, dos0 dos0Var) throws RemoteException {
        mo170456m6(uylVar, zzqVar, zzlVar, str, null, dos0Var);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: c7 */
    public final void mo180157c7(uyl uylVar, zzl zzlVar, String str, dos0 dos0Var) throws RemoteException {
        mo170444D3(uylVar, zzlVar, str, null, dos0Var);
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: g8 */
    public final void mo170453g8(uyl uylVar, zzl zzlVar, String str, dos0 dos0Var) throws RemoteException {
        Object obj = this.f182416a;
        if (!(obj instanceof f80)) {
            x2t0.m206869g(f80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            jhy0.m141614a();
            return;
        }
        x2t0.m206864b("Requesting app open ad from adapter.");
        try {
            ((f80) this.f182416a).loadAppOpenAd(new zyx((Context) s050.m181847P2(uylVar), "", m199199p8(str, zzlVar, null), m199198o8(zzlVar), m199195q8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m199196r8(str, zzlVar), ""), new uos0(this, dos0Var));
        } catch (Exception e) {
            x2t0.m206867e("", e);
            lns0.m150719a(uylVar, e, "adapter.loadAppOpenAd");
            jhy0.m141614a();
        }
    }

    @Override // p149l.rns0
    @Nullable
    /* JADX INFO: renamed from: h */
    public final ios0 mo170454h() {
        return null;
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: l4 */
    public final void mo170455l4(uyl uylVar, zzl zzlVar, String str, dos0 dos0Var) throws RemoteException {
        Object obj = this.f182416a;
        if (!(obj instanceof f80)) {
            x2t0.m206869g(f80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            jhy0.m141614a();
            return;
        }
        x2t0.m206864b("Requesting rewarded ad from adapter.");
        try {
            ((f80) this.f182416a).loadRewardedAd(new hzx((Context) s050.m181847P2(uylVar), "", m199199p8(str, zzlVar, null), m199198o8(zzlVar), m199195q8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m199196r8(str, zzlVar), ""), new tos0(this, dos0Var));
        } catch (Exception e) {
            x2t0.m206867e("", e);
            lns0.m150719a(uylVar, e, "adapter.loadRewardedAd");
            jhy0.m141614a();
        }
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: l6 */
    public final void mo180158l6(zzl zzlVar, String str, String str2) throws RemoteException {
        Object obj = this.f182416a;
        if (obj instanceof f80) {
            mo170455l4(this.f182419d, zzlVar, str, new xos0((f80) obj, this.f182418c));
            return;
        }
        x2t0.m206869g(f80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        jhy0.m141614a();
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: m6 */
    public final void mo170456m6(uyl uylVar, zzq zzqVar, zzl zzlVar, String str, String str2, dos0 dos0Var) throws RemoteException {
        Object obj = this.f182416a;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof f80)) {
            x2t0.m206869g(MediationBannerAdapter.class.getCanonicalName() + " or " + f80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            jhy0.m141614a();
            return;
        }
        x2t0.m206864b("Requesting banner ad from adapter.");
        boolean z = zzqVar.zzn;
        int i = zzqVar.zze;
        a80 a80VarM119046d = z ? f0s0.m119046d(i, zzqVar.zzb) : f0s0.m119045c(i, zzqVar.zzb, zzqVar.zza);
        Object obj2 = this.f182416a;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof f80) {
                try {
                    ((f80) obj2).loadBannerAd(new azx((Context) s050.m181847P2(uylVar), "", m199199p8(str, zzlVar, str2), m199198o8(zzlVar), m199195q8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m199196r8(str, zzlVar), a80VarM119046d, this.f182422g), new qos0(this, dos0Var));
                    return;
                } catch (Throwable th) {
                    x2t0.m206867e("", th);
                    lns0.m150719a(uylVar, th, "adapter.loadBannerAd");
                    jhy0.m141614a();
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
            nos0 nos0Var = new nos0(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, m199195q8(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, m199196r8(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            mediationBannerAdapter.requestBannerAd((Context) s050.m181847P2(uylVar), new wos0(dos0Var), m199199p8(str, zzlVar, str2), a80VarM119046d, nos0Var, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            x2t0.m206867e("", th2);
            lns0.m150719a(uylVar, th2, "adapter.requestBannerAd");
            jhy0.m141614a();
        }
    }

    /* JADX INFO: renamed from: o8 */
    public final Bundle m199198o8(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f182416a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: p */
    public final void mo170457p() throws RemoteException {
        Object obj = this.f182416a;
        if (obj instanceof MediationInterstitialAdapter) {
            x2t0.m206864b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f182416a).showInterstitial();
                return;
            } catch (Throwable th) {
                x2t0.m206867e("", th);
                jhy0.m141614a();
                return;
            }
        }
        x2t0.m206869g(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        jhy0.m141614a();
    }

    /* JADX INFO: renamed from: p8 */
    public final Bundle m199199p8(String str, zzl zzlVar, String str2) throws RemoteException {
        x2t0.m206864b("Server parameters: ".concat(String.valueOf(str)));
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
            if (this.f182416a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            x2t0.m206867e("", th);
            jhy0.m141614a();
            return null;
        }
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: s3 */
    public final void mo170458s3(uyl uylVar, zzl zzlVar, String str, String str2, dos0 dos0Var, zzbjb zzbjbVar, List list) throws RemoteException {
        Object obj = this.f182416a;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof f80)) {
            x2t0.m206869g(MediationNativeAdapter.class.getCanonicalName() + " or " + f80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            jhy0.m141614a();
            return;
        }
        x2t0.m206864b("Requesting native ad from adapter.");
        Object obj2 = this.f182416a;
        if (!(obj2 instanceof MediationNativeAdapter)) {
            if (obj2 instanceof f80) {
                try {
                    ((f80) obj2).loadNativeAd(new fzx((Context) s050.m181847P2(uylVar), "", m199199p8(str, zzlVar, str2), m199198o8(zzlVar), m199195q8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m199196r8(str, zzlVar), this.f182422g, zzbjbVar), new sos0(this, dos0Var));
                    return;
                } catch (Throwable th) {
                    x2t0.m206867e("", th);
                    lns0.m150719a(uylVar, th, "adapter.loadNativeAd");
                    jhy0.m141614a();
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
            yos0 yos0Var = new yos0(j == -1 ? null : new Date(j), zzlVar.zzd, hashSet, zzlVar.zzk, m199195q8(zzlVar), zzlVar.zzg, zzbjbVar, list, zzlVar.zzr, zzlVar.zzt, m199196r8(str, zzlVar));
            Bundle bundle = zzlVar.zzm;
            Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.f182417b = new wos0(dos0Var);
            mediationNativeAdapter.requestNativeAd((Context) s050.m181847P2(uylVar), this.f182417b, m199199p8(str, zzlVar, str2), yos0Var, bundle2);
        } catch (Throwable th2) {
            x2t0.m206867e("", th2);
            lns0.m150719a(uylVar, th2, "adapter.requestNativeAd");
            jhy0.m141614a();
        }
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: t3 */
    public final void mo170459t3(uyl uylVar) throws RemoteException {
        Context context = (Context) s050.m181847P2(uylVar);
        Object obj = this.f182416a;
        if (obj instanceof nd50) {
            ((nd50) obj).m158986a(context);
        }
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: v4 */
    public final void mo170460v4(uyl uylVar) throws RemoteException {
        Object obj = this.f182416a;
        if (obj instanceof f80) {
            x2t0.m206864b("Show app open ad from adapter.");
            x2t0.m206866d("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        x2t0.m206869g(f80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: w4 */
    public final void mo170461w4(uyl uylVar, yxs0 yxs0Var, List list) throws RemoteException {
        x2t0.m206869g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // p149l.rns0
    /* JADX INFO: renamed from: y */
    public final boolean mo170462y() {
        return false;
    }

    @Override // p149l.rns0
    public final void zzF() throws RemoteException {
        Object obj = this.f182416a;
        if (obj instanceof yyx) {
            try {
                ((yyx) obj).onResume();
            } catch (Throwable th) {
                x2t0.m206867e("", th);
                jhy0.m141614a();
            }
        }
    }

    @Override // p149l.rns0
    public final void zzG(boolean z) throws RemoteException {
        Object obj = this.f182416a;
        if (obj instanceof ee50) {
            try {
                ((ee50) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                x2t0.m206867e("", th);
                return;
            }
        }
        x2t0.m206864b(ee50.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // p149l.rns0
    public final void zzL() throws RemoteException {
        Object obj = this.f182416a;
        if (obj instanceof f80) {
            x2t0.m206866d("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        x2t0.m206869g(f80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // p149l.rns0
    public final boolean zzN() throws RemoteException {
        Object obj = this.f182416a;
        if ((obj instanceof f80) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f182418c != null;
        }
        Object obj2 = this.f182416a;
        x2t0.m206869g(f80.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        jhy0.m141614a();
        return false;
    }

    @Override // p149l.rns0
    @Nullable
    public final hos0 zzO() {
        return null;
    }

    @Override // p149l.rns0
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // p149l.rns0
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // p149l.rns0
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // p149l.rns0
    @Nullable
    public final fgu0 zzh() {
        Object obj = this.f182416a;
        if (obj instanceof f1r0) {
            try {
                return ((f1r0) obj).getVideoController();
            } catch (Throwable th) {
                x2t0.m206867e("", th);
            }
        }
        return null;
    }

    @Override // p149l.rns0
    @Nullable
    public final vcs0 zzi() {
        wcs0 wcs0VarM204872u;
        wos0 wos0Var = this.f182417b;
        if (wos0Var == null || (wcs0VarM204872u = wos0Var.m204872u()) == null) {
            return null;
        }
        return wcs0VarM204872u.m202677a();
    }

    @Override // p149l.rns0
    @Nullable
    public final gos0 zzj() {
        return null;
    }

    @Override // p149l.rns0
    @Nullable
    public final los0 zzk() {
        koj0 koj0Var;
        koj0 koj0VarM204871t;
        Object obj = this.f182416a;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof f80) || (koj0Var = this.f182421f) == null) {
                return null;
            }
            return new jps0(koj0Var);
        }
        wos0 wos0Var = this.f182417b;
        if (wos0Var == null || (koj0VarM204871t = wos0Var.m204871t()) == null) {
            return null;
        }
        return new jps0(koj0VarM204871t);
    }

    @Override // p149l.rns0
    @Nullable
    public final zzbvg zzl() {
        Object obj = this.f182416a;
        if (!(obj instanceof f80)) {
            return null;
        }
        ((f80) obj).getVersionInfo();
        return zzbvg.m13548g(null);
    }

    @Override // p149l.rns0
    @Nullable
    public final zzbvg zzm() {
        Object obj = this.f182416a;
        if (!(obj instanceof f80)) {
            return null;
        }
        ((f80) obj).getSDKVersionInfo();
        return zzbvg.m13548g(null);
    }

    @Override // p149l.rns0
    public final uyl zzn() throws RemoteException {
        Object obj = this.f182416a;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return s050.m181848Y2(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                x2t0.m206867e("", th);
                jhy0.m141614a();
                return null;
            }
        }
        if (obj instanceof f80) {
            return s050.m181848Y2(this.f182420e);
        }
        x2t0.m206869g(MediationBannerAdapter.class.getCanonicalName() + " or " + f80.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        jhy0.m141614a();
        return null;
    }

    @Override // p149l.rns0
    public final void zzo() throws RemoteException {
        Object obj = this.f182416a;
        if (obj instanceof yyx) {
            try {
                ((yyx) obj).onDestroy();
            } catch (Throwable th) {
                x2t0.m206867e("", th);
                jhy0.m141614a();
            }
        }
    }

    public vos0(@NonNull yyx yyxVar) {
        this.f182416a = yyxVar;
    }
}
