package p149l;

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
public final class xqs0 extends aqs0 {

    /* JADX INFO: renamed from: a */
    public final RtbAdapter f194039a;

    /* JADX INFO: renamed from: b */
    public String f194040b = "";

    public xqs0(RtbAdapter rtbAdapter) {
        this.f194039a = rtbAdapter;
    }

    /* JADX INFO: renamed from: q8 */
    public static final Bundle m210608q8(String str) throws RemoteException {
        x2t0.m206869g("Server parameters: ".concat(String.valueOf(str)));
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
            x2t0.m206867e("", e);
            jhy0.m141614a();
            return null;
        }
    }

    /* JADX INFO: renamed from: r8 */
    public static final boolean m210609r8(zzl zzlVar) {
        if (zzlVar.zzf) {
            return true;
        }
        exr0.m118703b();
        return i2t0.m134090t();
    }

    @Nullable
    /* JADX INFO: renamed from: s8 */
    public static final String m210610s8(String str, zzl zzlVar) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return zzlVar.zzu;
        }
    }

    @Override // p149l.bqs0
    /* JADX INFO: renamed from: H */
    public final boolean mo103410H(uyl uylVar) throws RemoteException {
        return false;
    }

    @Override // p149l.bqs0
    /* JADX INFO: renamed from: I7 */
    public final void mo103411I7(String str, String str2, zzl zzlVar, uyl uylVar, yps0 yps0Var, dos0 dos0Var) throws RemoteException {
        try {
            this.f194039a.loadRtbRewardedInterstitialAd(new hzx((Context) s050.m181847P2(uylVar), str, m210608q8(str2), m210611p8(zzlVar), m210609r8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m210610s8(str2, zzlVar), this.f194040b), new wqs0(this, yps0Var, dos0Var));
        } catch (Throwable th) {
            x2t0.m206867e("Adapter failed to render rewarded interstitial ad.", th);
            lns0.m150719a(uylVar, th, "adapter.loadRtbRewardedInterstitialAd");
            jhy0.m141614a();
        }
    }

    @Override // p149l.bqs0
    /* JADX INFO: renamed from: O1 */
    public final void mo103412O1(String str, String str2, zzl zzlVar, uyl uylVar, pps0 pps0Var, dos0 dos0Var, zzq zzqVar) throws RemoteException {
        try {
            this.f194039a.loadRtbBannerAd(new azx((Context) s050.m181847P2(uylVar), str, m210608q8(str2), m210611p8(zzlVar), m210609r8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m210610s8(str2, zzlVar), f0s0.m119045c(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.f194040b), new gqs0(this, pps0Var, dos0Var));
        } catch (Throwable th) {
            x2t0.m206867e("Adapter failed to render banner ad.", th);
            lns0.m150719a(uylVar, th, "adapter.loadRtbBannerAd");
            jhy0.m141614a();
        }
    }

    @Override // p149l.bqs0
    /* JADX INFO: renamed from: T */
    public final void mo103413T(String str) {
        this.f194040b = str;
    }

    @Override // p149l.bqs0
    /* JADX INFO: renamed from: T0 */
    public final void mo103414T0(String str, String str2, zzl zzlVar, uyl uylVar, vps0 vps0Var, dos0 dos0Var) throws RemoteException {
        mo103415X3(str, str2, zzlVar, uylVar, vps0Var, dos0Var, null);
    }

    @Override // p149l.bqs0
    /* JADX INFO: renamed from: X3 */
    public final void mo103415X3(String str, String str2, zzl zzlVar, uyl uylVar, vps0 vps0Var, dos0 dos0Var, zzbjb zzbjbVar) throws RemoteException {
        try {
            this.f194039a.loadRtbNativeAd(new fzx((Context) s050.m181847P2(uylVar), str, m210608q8(str2), m210611p8(zzlVar), m210609r8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m210610s8(str2, zzlVar), this.f194040b, zzbjbVar), new tqs0(this, vps0Var, dos0Var));
        } catch (Throwable th) {
            x2t0.m206867e("Adapter failed to render native ad.", th);
            lns0.m150719a(uylVar, th, "adapter.loadRtbNativeAd");
            jhy0.m141614a();
        }
    }

    @Override // p149l.bqs0
    /* JADX INFO: renamed from: b3 */
    public final void mo103416b3(String str, String str2, zzl zzlVar, uyl uylVar, sps0 sps0Var, dos0 dos0Var) throws RemoteException {
        try {
            this.f194039a.loadRtbInterstitialAd(new dzx((Context) s050.m181847P2(uylVar), str, m210608q8(str2), m210611p8(zzlVar), m210609r8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m210610s8(str2, zzlVar), this.f194040b), new iqs0(this, sps0Var, dos0Var));
        } catch (Throwable th) {
            x2t0.m206867e("Adapter failed to render interstitial ad.", th);
            lns0.m150719a(uylVar, th, "adapter.loadRtbInterstitialAd");
            jhy0.m141614a();
        }
    }

    @Override // p149l.bqs0
    /* JADX INFO: renamed from: e6 */
    public final boolean mo103417e6(uyl uylVar) throws RemoteException {
        return false;
    }

    @Override // p149l.bqs0
    /* JADX INFO: renamed from: o0 */
    public final boolean mo103418o0(uyl uylVar) throws RemoteException {
        return false;
    }

    /* JADX INFO: renamed from: p8 */
    public final Bundle m210611p8(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f194039a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.bqs0
    /* JADX INFO: renamed from: s6 */
    public final void mo103419s6(uyl uylVar, String str, Bundle bundle, Bundle bundle2, zzq zzqVar, eqs0 eqs0Var) throws RemoteException {
        AdFormat adFormat;
        try {
            vqs0 vqs0Var = new vqs0(this, eqs0Var);
            RtbAdapter rtbAdapter = this.f194039a;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        adFormat = AdFormat.BANNER;
                        czx czxVar = new czx(adFormat, bundle2);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(czxVar);
                        rtbAdapter.collectSignals(new tfd0((Context) s050.m181847P2(uylVar), arrayList, bundle, f0s0.m119045c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), vqs0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case -1052618729:
                    if (str.equals("native")) {
                        adFormat = AdFormat.NATIVE;
                        czx czxVar2 = new czx(adFormat, bundle2);
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(czxVar2);
                        rtbAdapter.collectSignals(new tfd0((Context) s050.m181847P2(uylVar), arrayList2, bundle, f0s0.m119045c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), vqs0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case -239580146:
                    if (str.equals("rewarded")) {
                        adFormat = AdFormat.REWARDED;
                        czx czxVar3 = new czx(adFormat, bundle2);
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(czxVar3);
                        rtbAdapter.collectSignals(new tfd0((Context) s050.m181847P2(uylVar), arrayList3, bundle, f0s0.m119045c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), vqs0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 604727084:
                    if (str.equals("interstitial")) {
                        adFormat = AdFormat.INTERSTITIAL;
                        czx czxVar4 = new czx(adFormat, bundle2);
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(czxVar4);
                        rtbAdapter.collectSignals(new tfd0((Context) s050.m181847P2(uylVar), arrayList4, bundle, f0s0.m119045c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), vqs0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1167692200:
                    if (str.equals(FirebaseAnalytics.Event.APP_OPEN)) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        czx czxVar5 = new czx(adFormat, bundle2);
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(czxVar5);
                        rtbAdapter.collectSignals(new tfd0((Context) s050.m181847P2(uylVar), arrayList5, bundle, f0s0.m119045c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), vqs0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1778294298:
                    if (str.equals("app_open_ad")) {
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132272ib)).booleanValue()) {
                            adFormat = AdFormat.APP_OPEN_AD;
                            czx czxVar6 = new czx(adFormat, bundle2);
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(czxVar6);
                            rtbAdapter.collectSignals(new tfd0((Context) s050.m181847P2(uylVar), arrayList6, bundle, f0s0.m119045c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), vqs0Var);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Internal Error");
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        czx czxVar7 = new czx(adFormat, bundle2);
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(czxVar7);
                        rtbAdapter.collectSignals(new tfd0((Context) s050.m181847P2(uylVar), arrayList7, bundle, f0s0.m119045c(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), vqs0Var);
                        return;
                    }
                    throw new IllegalArgumentException("Internal Error");
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            x2t0.m206867e("Error generating signals for RTB", th);
            lns0.m150719a(uylVar, th, "adapter.collectSignals");
            jhy0.m141614a();
        }
    }

    @Override // p149l.bqs0
    /* JADX INFO: renamed from: t7 */
    public final void mo103420t7(String str, String str2, zzl zzlVar, uyl uylVar, yps0 yps0Var, dos0 dos0Var) throws RemoteException {
        try {
            this.f194039a.loadRtbRewardedAd(new hzx((Context) s050.m181847P2(uylVar), str, m210608q8(str2), m210611p8(zzlVar), m210609r8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m210610s8(str2, zzlVar), this.f194040b), new wqs0(this, yps0Var, dos0Var));
        } catch (Throwable th) {
            x2t0.m206867e("Adapter failed to render rewarded ad.", th);
            lns0.m150719a(uylVar, th, "adapter.loadRtbRewardedAd");
            jhy0.m141614a();
        }
    }

    @Override // p149l.bqs0
    /* JADX INFO: renamed from: z1 */
    public final void mo103421z1(String str, String str2, zzl zzlVar, uyl uylVar, pps0 pps0Var, dos0 dos0Var, zzq zzqVar) throws RemoteException {
        try {
            this.f194039a.loadRtbInterscrollerAd(new azx((Context) s050.m181847P2(uylVar), str, m210608q8(str2), m210611p8(zzlVar), m210609r8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m210610s8(str2, zzlVar), f0s0.m119045c(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.f194040b), new hqs0(this, pps0Var, dos0Var));
        } catch (Throwable th) {
            x2t0.m206867e("Adapter failed to render interscroller ad.", th);
            lns0.m150719a(uylVar, th, "adapter.loadRtbInterscrollerAd");
            jhy0.m141614a();
        }
    }

    @Override // p149l.bqs0
    /* JADX INFO: renamed from: z6 */
    public final void mo103422z6(String str, String str2, zzl zzlVar, uyl uylVar, mps0 mps0Var, dos0 dos0Var) throws RemoteException {
        try {
            this.f194039a.loadRtbAppOpenAd(new zyx((Context) s050.m181847P2(uylVar), str, m210608q8(str2), m210611p8(zzlVar), m210609r8(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m210610s8(str2, zzlVar), this.f194040b), new uqs0(this, mps0Var, dos0Var));
        } catch (Throwable th) {
            x2t0.m206867e("Adapter failed to render app open ad.", th);
            lns0.m150719a(uylVar, th, "adapter.loadRtbAppOpenAd");
            jhy0.m141614a();
        }
    }

    @Override // p149l.bqs0
    @Nullable
    public final fgu0 zze() {
        Object obj = this.f194039a;
        if (obj instanceof f1r0) {
            try {
                return ((f1r0) obj).getVideoController();
            } catch (Throwable th) {
                x2t0.m206867e("", th);
            }
        }
        return null;
    }

    @Override // p149l.bqs0
    public final zzbvg zzf() throws RemoteException {
        this.f194039a.getVersionInfo();
        return zzbvg.m13548g(null);
    }

    @Override // p149l.bqs0
    public final zzbvg zzg() throws RemoteException {
        this.f194039a.getSDKVersionInfo();
        return zzbvg.m13548g(null);
    }
}
