package p153l;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2295w;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzeih;
import com.google.android.gms.internal.ads.zzeii;
import com.google.android.gms.internal.ads.zzgaa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ilu0 extends kzt0 {

    /* JADX INFO: renamed from: H */
    public static final zzgaa f115610H = zzgaa.zzq("3010", "3008", "1005", "1009", "2011", "2007");

    /* JADX INFO: renamed from: A */
    public final zzcei f115611A;

    /* JADX INFO: renamed from: B */
    public final Context f115612B;

    /* JADX INFO: renamed from: C */
    public final klu0 f115613C;

    /* JADX INFO: renamed from: D */
    public final zlv0 f115614D;

    /* JADX INFO: renamed from: E */
    public final Map f115615E;

    /* JADX INFO: renamed from: F */
    public final List f115616F;

    /* JADX INFO: renamed from: G */
    public final z6s0 f115617G;

    /* JADX INFO: renamed from: j */
    public final Executor f115618j;

    /* JADX INFO: renamed from: k */
    public final ulu0 f115619k;

    /* JADX INFO: renamed from: l */
    public final cmu0 f115620l;

    /* JADX INFO: renamed from: m */
    public final anu0 f115621m;

    /* JADX INFO: renamed from: n */
    public final zlu0 f115622n;

    /* JADX INFO: renamed from: o */
    public final fmu0 f115623o;

    /* JADX INFO: renamed from: p */
    public final kpx0 f115624p;

    /* JADX INFO: renamed from: q */
    public final kpx0 f115625q;

    /* JADX INFO: renamed from: r */
    public final kpx0 f115626r;

    /* JADX INFO: renamed from: s */
    public final kpx0 f115627s;

    /* JADX INFO: renamed from: t */
    public final kpx0 f115628t;

    /* JADX INFO: renamed from: u */
    public wnu0 f115629u;

    /* JADX INFO: renamed from: v */
    public boolean f115630v;

    /* JADX INFO: renamed from: w */
    public boolean f115631w;

    /* JADX INFO: renamed from: x */
    public boolean f115632x;

    /* JADX INFO: renamed from: y */
    public final o9t0 f115633y;

    /* JADX INFO: renamed from: z */
    public final v2s0 f115634z;

    public ilu0(jzt0 jzt0Var, Executor executor, ulu0 ulu0Var, cmu0 cmu0Var, anu0 anu0Var, zlu0 zlu0Var, fmu0 fmu0Var, kpx0 kpx0Var, kpx0 kpx0Var2, kpx0 kpx0Var3, kpx0 kpx0Var4, kpx0 kpx0Var5, o9t0 o9t0Var, v2s0 v2s0Var, zzcei zzceiVar, Context context, klu0 klu0Var, zlv0 zlv0Var, z6s0 z6s0Var) {
        super(jzt0Var);
        this.f115618j = executor;
        this.f115619k = ulu0Var;
        this.f115620l = cmu0Var;
        this.f115621m = anu0Var;
        this.f115622n = zlu0Var;
        this.f115623o = fmu0Var;
        this.f115624p = kpx0Var;
        this.f115625q = kpx0Var2;
        this.f115626r = kpx0Var3;
        this.f115627s = kpx0Var4;
        this.f115628t = kpx0Var5;
        this.f115633y = o9t0Var;
        this.f115634z = v2s0Var;
        this.f115611A = zzceiVar;
        this.f115612B = context;
        this.f115613C = klu0Var;
        this.f115614D = zlv0Var;
        this.f115615E = new HashMap();
        this.f115616F = new ArrayList();
        this.f115617G = z6s0Var;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m140672E(View view) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168290ea)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        bxy0.m106934r();
        long jM12357X = C2098b.m12357X(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (jM12357X >= ((Integer) jas0.m144075c().m176505a(sgs0.f168303fa)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m140676W(ilu0 ilu0Var) {
        try {
            ulu0 ulu0Var = ilu0Var.f115619k;
            int iM196580P = ulu0Var.m196580P();
            if (iM196580P == 1) {
                if (ilu0Var.f115623o.m126326b() != null) {
                    ilu0Var.m140686J(ThirdPushManager.VENDOR_TYPE_FCM, true);
                    ilu0Var.f115623o.m126326b().mo130830i4((yls0) ilu0Var.f115624p.zzb());
                    return;
                }
                return;
            }
            if (iM196580P == 2) {
                if (ilu0Var.f115623o.m126325a() != null) {
                    ilu0Var.m140686J(ThirdPushManager.VENDOR_TYPE_FCM, true);
                    ilu0Var.f115623o.m126325a().mo117022O2((wls0) ilu0Var.f115625q.zzb());
                    return;
                }
                return;
            }
            if (iM196580P == 3) {
                if (ilu0Var.f115623o.m126328d(ulu0Var.m196591a()) != null) {
                    if (ilu0Var.f115619k.m196602f0() != null) {
                        ilu0Var.m140692R(ThirdPushManager.VENDOR_TYPE_FCM, true);
                    }
                    ilu0Var.f115623o.m126328d(ilu0Var.f115619k.m196591a()).mo159098A3((bms0) ilu0Var.f115628t.zzb());
                    return;
                }
                return;
            }
            if (iM196580P == 6) {
                if (ilu0Var.f115623o.m126330f() != null) {
                    ilu0Var.m140686J(ThirdPushManager.VENDOR_TYPE_FCM, true);
                    ilu0Var.f115623o.m126330f().mo126378w3((nns0) ilu0Var.f115626r.zzb());
                    return;
                }
                return;
            }
            if (iM196580P != 7) {
                dct0.m115295d("Wrong native template id!");
                return;
            }
            fmu0 fmu0Var = ilu0Var.f115623o;
            if (fmu0Var.m126331g() != null) {
                fmu0Var.m126331g().mo202663S3((rss0) ilu0Var.f115627s.zzb());
            }
        } catch (RemoteException e) {
            dct0.m115296e("RemoteException when notifyAdLoad is called", e);
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m140678A() {
        return this.f115622n.mo216637e();
    }

    /* JADX INFO: renamed from: B */
    public final synchronized boolean m140679B() {
        return this.f115620l.mo111333t();
    }

    /* JADX INFO: renamed from: C */
    public final synchronized boolean m140680C() {
        return this.f115620l.mo111316J();
    }

    /* JADX INFO: renamed from: D */
    public final boolean m140681D() {
        return this.f115622n.mo216636d();
    }

    /* JADX INFO: renamed from: F */
    public final synchronized boolean m140682F(Bundle bundle) {
        if (this.f115631w) {
            return true;
        }
        boolean zMo111320d = this.f115620l.mo111320d(bundle);
        this.f115631w = zMo111320d;
        return zMo111320d;
    }

    @Nullable
    /* JADX INFO: renamed from: G */
    public final synchronized View m140683G(Map map) {
        if (map != null) {
            zzgaa zzgaaVar = f115610H;
            int size = zzgaaVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzgaaVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public final synchronized ImageView.ScaleType m140684H() {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168115Q7)).booleanValue()) {
            return null;
        }
        wnu0 wnu0Var = this.f115629u;
        if (wnu0Var == null) {
            dct0.m115293b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        p1m p1mVarZzj = wnu0Var.zzj();
        if (p1mVarZzj != null) {
            return (ImageView.ScaleType) h950.m134037P2(p1mVarZzj);
        }
        return anu0.f72384k;
    }

    /* JADX INFO: renamed from: I */
    public final synchronized int m140685I() {
        return this.f115620l.zza();
    }

    /* JADX INFO: renamed from: J */
    public final void m140686J(String str, boolean z) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168233a5)).booleanValue()) {
            m140692R(ThirdPushManager.VENDOR_TYPE_FCM, true);
            return;
        }
        hpr hprVarM196609j0 = this.f115619k.m196609j0();
        if (hprVarM196609j0 == null) {
            return;
        }
        pvw0.m173991r(hprVarM196609j0, new glu0(this, ThirdPushManager.VENDOR_TYPE_FCM, true), this.f115618j);
    }

    /* JADX INFO: renamed from: K */
    public final synchronized void m140687K(View view, Map map, Map map2) {
        this.f115621m.m99033d(this.f115629u);
        this.f115620l.mo111325i(view, map, map2, m140684H());
        this.f115631w = true;
    }

    /* JADX INFO: renamed from: L */
    public final void m140688L(View view, @Nullable hfw0 hfw0Var) {
        wit0 wit0VarM196600e0 = this.f115619k.m196600e0();
        if (!this.f115622n.mo216636d() || hfw0Var == null || wit0VarM196600e0 == null || view == null) {
            return;
        }
        bxy0.m106917a().mo144391e(hfw0Var, view);
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final synchronized void m140702d0(wnu0 wnu0Var) {
        Iterator<String> itKeys;
        View view;
        try {
            if (!this.f115630v) {
                this.f115629u = wnu0Var;
                this.f115621m.m99034e(wnu0Var);
                this.f115620l.mo111329m(wnu0Var.zzf(), wnu0Var.zzm(), wnu0Var.zzn(), wnu0Var, wnu0Var);
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168500v2)).booleanValue()) {
                    this.f115634z.m199147c().mo165758e(wnu0Var.zzf());
                }
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168037K1)).booleanValue()) {
                    q6w0 q6w0Var = this.f129454b;
                    if (q6w0Var.f155896l0 && (itKeys = q6w0Var.f155894k0.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            WeakReference weakReference = (WeakReference) this.f115629u.zzl().get(next);
                            this.f115615E.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                ViewOnAttachStateChangeListenerC2295w viewOnAttachStateChangeListenerC2295w = new ViewOnAttachStateChangeListenerC2295w(this.f115612B, view);
                                this.f115616F.add(viewOnAttachStateChangeListenerC2295w);
                                viewOnAttachStateChangeListenerC2295w.m13456c(new flu0(this, next));
                            }
                        }
                    }
                }
                if (wnu0Var.zzi() != null) {
                    wnu0Var.zzi().m13456c(this.f115633y);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void m140703e0(wnu0 wnu0Var) {
        this.f115620l.mo111327k(wnu0Var.zzf(), wnu0Var.zzl());
        if (wnu0Var.zzh() != null) {
            wnu0Var.zzh().setClickable(false);
            wnu0Var.zzh().removeAllViews();
        }
        if (wnu0Var.zzi() != null) {
            wnu0Var.zzi().m13458e(this.f115633y);
        }
        this.f115629u = null;
    }

    /* JADX INFO: renamed from: O */
    public final klu0 m140691O() {
        return this.f115613C;
    }

    @Nullable
    /* JADX INFO: renamed from: R */
    public final hfw0 m140692R(String str, boolean z) {
        String str2;
        zzeii zzeiiVar;
        zzeih zzeihVar;
        String str3;
        if (!this.f115622n.mo216636d() || TextUtils.isEmpty(str)) {
            return null;
        }
        ulu0 ulu0Var = this.f115619k;
        wit0 wit0VarM196600e0 = ulu0Var.m196600e0();
        wit0 wit0VarM196602f0 = ulu0Var.m196602f0();
        if (wit0VarM196600e0 == null && wit0VarM196602f0 == null) {
            dct0.m115298g("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z2 = false;
        boolean z3 = wit0VarM196600e0 != null;
        boolean z4 = wit0VarM196602f0 != null;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168208Y4)).booleanValue()) {
            this.f115622n.mo216633a();
            int iM180166b = this.f115622n.mo216633a().m180166b();
            int i = iM180166b - 1;
            if (i != 0) {
                if (i != 1) {
                    if (iM180166b != 1) {
                        str3 = iM180166b != 2 ? "UNKNOWN" : "DISPLAY";
                    } else {
                        str3 = "VIDEO";
                    }
                    dct0.m115298g("Unknown omid media type: " + str3 + ". Not initializing Omid.");
                    return null;
                }
                if (wit0VarM196600e0 == null) {
                    dct0.m115298g("Omid media type was display but there was no display webview.");
                    return null;
                }
                z4 = false;
                z2 = true;
            } else {
                if (wit0VarM196602f0 == null) {
                    dct0.m115298g("Omid media type was video but there was no video webview.");
                    return null;
                }
                z4 = true;
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            str2 = null;
        } else {
            str2 = "javascript";
            wit0VarM196600e0 = wit0VarM196602f0;
        }
        wit0VarM196600e0.mo13715L();
        if (!bxy0.m106917a().mo144388b(this.f115612B)) {
            dct0.m115298g("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        zzcei zzceiVar = this.f115611A;
        String str4 = zzceiVar.zzb + "." + zzceiVar.zzc;
        if (z4) {
            zzeihVar = zzeih.VIDEO;
            zzeiiVar = zzeii.DEFINED_BY_JAVASCRIPT;
        } else {
            ulu0 ulu0Var2 = this.f115619k;
            zzeih zzeihVar2 = zzeih.NATIVE_DISPLAY;
            zzeiiVar = ulu0Var2.m196580P() == 3 ? zzeii.UNSPECIFIED : zzeii.ONE_PIXEL;
            zzeihVar = zzeihVar2;
        }
        hfw0 hfw0VarMo144392f = bxy0.m106917a().mo144392f(str4, wit0VarM196600e0.mo13715L(), "", "javascript", str2, str, zzeiiVar, zzeihVar, this.f129454b.f155898m0);
        if (hfw0VarMo144392f == null) {
            dct0.m115298g("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.f115619k.m196625w(hfw0VarMo144392f);
        wit0VarM196600e0.mo13725W(hfw0VarMo144392f);
        if (z4) {
            bxy0.m106917a().mo144391e(hfw0VarMo144392f, wit0VarM196602f0.zzF());
            this.f115632x = true;
        }
        if (z) {
            bxy0.m106917a().mo144394h(hfw0VarMo144392f);
            wit0VarM196600e0.mo13728Z("onSdkLoaded", new l01());
        }
        return hfw0VarMo144392f;
    }

    /* JADX INFO: renamed from: S */
    public final String m140693S() {
        return this.f115622n.mo216634b();
    }

    /* JADX INFO: renamed from: U */
    public final synchronized JSONObject m140694U(View view, Map map, Map map2) {
        return this.f115620l.mo111321e(view, map, map2, m140684H());
    }

    /* JADX INFO: renamed from: V */
    public final synchronized JSONObject m140695V(View view, Map map, Map map2) {
        return this.f115620l.mo111323g(view, map, map2, m140684H());
    }

    /* JADX INFO: renamed from: Y */
    public final void m140696Y(View view) {
        hfw0 hfw0VarM196605h0 = this.f115619k.m196605h0();
        if (!this.f115622n.mo216636d() || hfw0VarM196605h0 == null || view == null) {
            return;
        }
        bxy0.m106917a().mo144387a(hfw0VarM196605h0, view);
    }

    /* JADX INFO: renamed from: Z */
    public final synchronized void m140697Z() {
        this.f115620l.zzh();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m140698a0() {
        this.f115620l.zzi();
        this.f115619k.m196606i();
    }

    @Override // p153l.kzt0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo127848b() {
        this.f115630v = true;
        this.f115618j.execute(new Runnable() { // from class: l.dlu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f89582a.m140698a0();
            }
        });
        super.mo127848b();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m140699b0(View view, boolean z, int i) {
        this.f115620l.mo111322f(view, this.f115629u.zzf(), this.f115629u.zzl(), this.f115629u.zzm(), z, m140684H(), i);
    }

    @Override // p153l.kzt0
    @AnyThread
    /* JADX INFO: renamed from: c */
    public final void mo140700c() {
        this.f115618j.execute(new Runnable() { // from class: l.alu0
            @Override // java.lang.Runnable
            public final void run() {
                ilu0.m140676W(this.f72153a);
            }
        });
        if (this.f115619k.m196580P() != 7) {
            Executor executor = this.f115618j;
            final cmu0 cmu0Var = this.f115620l;
            Objects.requireNonNull(cmu0Var);
            executor.execute(new Runnable() { // from class: l.blu0
                @Override // java.lang.Runnable
                public final void run() {
                    cmu0Var.zzp();
                }
            });
        }
        super.mo140700c();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m140701c0(boolean z) {
        this.f115620l.mo111322f(null, this.f115629u.zzf(), this.f115629u.zzl(), this.f115629u.zzm(), z, m140684H(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x004a, B:22:0x005e, B:23:0x0066, B:25:0x006c, B:27:0x0080, B:29:0x0086, B:32:0x008b, B:34:0x0091, B:37:0x0096, B:39:0x00a8, B:41:0x00ae, B:44:0x00b3, B:46:0x00c5, B:48:0x00d1, B:50:0x00db, B:52:0x00e5, B:57:0x00ec), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x006c A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x004a, B:22:0x005e, B:23:0x0066, B:25:0x006c, B:27:0x0080, B:29:0x0086, B:32:0x008b, B:34:0x0091, B:37:0x0096, B:39:0x00a8, B:41:0x00ae, B:44:0x00b3, B:46:0x00c5, B:48:0x00d1, B:50:0x00db, B:52:0x00e5, B:57:0x00ec), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008b A[Catch: all -> 0x0045, TRY_ENTER, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x004a, B:22:0x005e, B:23:0x0066, B:25:0x006c, B:27:0x0080, B:29:0x0086, B:32:0x008b, B:34:0x0091, B:37:0x0096, B:39:0x00a8, B:41:0x00ae, B:44:0x00b3, B:46:0x00c5, B:48:0x00d1, B:50:0x00db, B:52:0x00e5, B:57:0x00ec), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0091 A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x004a, B:22:0x005e, B:23:0x0066, B:25:0x006c, B:27:0x0080, B:29:0x0086, B:32:0x008b, B:34:0x0091, B:37:0x0096, B:39:0x00a8, B:41:0x00ae, B:44:0x00b3, B:46:0x00c5, B:48:0x00d1, B:50:0x00db, B:52:0x00e5, B:57:0x00ec), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0096 A[Catch: all -> 0x0045, TRY_ENTER, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x004a, B:22:0x005e, B:23:0x0066, B:25:0x006c, B:27:0x0080, B:29:0x0086, B:32:0x008b, B:34:0x0091, B:37:0x0096, B:39:0x00a8, B:41:0x00ae, B:44:0x00b3, B:46:0x00c5, B:48:0x00d1, B:50:0x00db, B:52:0x00e5, B:57:0x00ec), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x004a, B:22:0x005e, B:23:0x0066, B:25:0x006c, B:27:0x0080, B:29:0x0086, B:32:0x008b, B:34:0x0091, B:37:0x0096, B:39:0x00a8, B:41:0x00ae, B:44:0x00b3, B:46:0x00c5, B:48:0x00d1, B:50:0x00db, B:52:0x00e5, B:57:0x00ec), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x004a, B:22:0x005e, B:23:0x0066, B:25:0x006c, B:27:0x0080, B:29:0x0086, B:32:0x008b, B:34:0x0091, B:37:0x0096, B:39:0x00a8, B:41:0x00ae, B:44:0x00b3, B:46:0x00c5, B:48:0x00d1, B:50:0x00db, B:52:0x00e5, B:57:0x00ec), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3 A[Catch: all -> 0x0045, TRY_ENTER, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x004a, B:22:0x005e, B:23:0x0066, B:25:0x006c, B:27:0x0080, B:29:0x0086, B:32:0x008b, B:34:0x0091, B:37:0x0096, B:39:0x00a8, B:41:0x00ae, B:44:0x00b3, B:46:0x00c5, B:48:0x00d1, B:50:0x00db, B:52:0x00e5, B:57:0x00ec), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x004a, B:22:0x005e, B:23:0x0066, B:25:0x006c, B:27:0x0080, B:29:0x0086, B:32:0x008b, B:34:0x0091, B:37:0x0096, B:39:0x00a8, B:41:0x00ae, B:44:0x00b3, B:46:0x00c5, B:48:0x00d1, B:50:0x00db, B:52:0x00e5, B:57:0x00ec), top: B:62:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec A[Catch: all -> 0x0045, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:6:0x0007, B:8:0x0019, B:10:0x001f, B:11:0x0029, B:13:0x002f, B:19:0x004a, B:22:0x005e, B:23:0x0066, B:25:0x006c, B:27:0x0080, B:29:0x0086, B:32:0x008b, B:34:0x0091, B:37:0x0096, B:39:0x00a8, B:41:0x00ae, B:44:0x00b3, B:46:0x00c5, B:48:0x00d1, B:50:0x00db, B:52:0x00e5, B:57:0x00ec), top: B:62:0x0001 }] */
    /* JADX INFO: renamed from: i */
    public final synchronized void m140704i(View view, Map map, Map map2, boolean z) {
        View viewM140683G;
        Rect rect;
        Iterator it;
        View view2;
        try {
            if (!this.f115631w) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168037K1)).booleanValue() && this.f129454b.f155896l0) {
                    Iterator it2 = this.f115615E.keySet().iterator();
                    while (it2.hasNext()) {
                        if (!((Boolean) this.f115615E.get((String) it2.next())).booleanValue()) {
                        }
                    }
                    if (z) {
                        viewM140683G = m140683G(map);
                        if (viewM140683G == null) {
                            m140687K(view, map, map2);
                            return;
                        }
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168063M3)).booleanValue()) {
                            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168075N3)).booleanValue()) {
                                m140687K(view, map, map2);
                                return;
                            }
                            rect = new Rect();
                            if (viewM140683G.getGlobalVisibleRect(rect, null)) {
                                m140687K(view, map, map2);
                            }
                        } else if (m140672E(viewM140683G)) {
                            m140687K(view, map, map2);
                        }
                    } else {
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168051L3)).booleanValue()) {
                            it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                                if (view2 == null) {
                                }
                            }
                        }
                    }
                } else if (z) {
                    if (((Boolean) jas0.m144075c().m176505a(sgs0.f168051L3)).booleanValue() && map != null) {
                        it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                            if (view2 == null && m140672E(view2)) {
                                m140687K(view, map, map2);
                                return;
                            }
                        }
                    }
                } else {
                    viewM140683G = m140683G(map);
                    if (viewM140683G == null) {
                        m140687K(view, map, map2);
                        return;
                    }
                    if (((Boolean) jas0.m144075c().m176505a(sgs0.f168063M3)).booleanValue()) {
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168075N3)).booleanValue()) {
                            m140687K(view, map, map2);
                            return;
                        }
                        rect = new Rect();
                        if (viewM140683G.getGlobalVisibleRect(rect, null) && viewM140683G.getHeight() == rect.height() && viewM140683G.getWidth() == rect.width()) {
                            m140687K(view, map, map2);
                        }
                    } else if (m140672E(viewM140683G)) {
                        m140687K(view, map, map2);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m140705j(@Nullable czt0 czt0Var) {
        this.f115620l.mo111319c(czt0Var);
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m140706k(View view, View view2, Map map, Map map2, boolean z) {
        this.f115621m.m99032c(this.f115629u);
        this.f115620l.mo111317a(view, view2, map, map2, z, m140684H());
        if (this.f115632x) {
            ulu0 ulu0Var = this.f115619k;
            if (ulu0Var.m196602f0() != null) {
                ulu0Var.m196602f0().mo13728Z("onSdkAdUserInteractionClick", new l01());
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m140707l(@Nullable final View view, final int i) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168166Ua)).booleanValue()) {
            wnu0 wnu0Var = this.f115629u;
            if (wnu0Var == null) {
                dct0.m115293b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = wnu0Var instanceof omu0;
                this.f115618j.execute(new Runnable() { // from class: l.clu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f82427a.m140699b0(view, z, i);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m140708m(String str) {
        this.f115620l.mo111334u(str);
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m140709n(Bundle bundle) {
        this.f115620l.mo111326j(bundle);
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m140710o() {
        wnu0 wnu0Var = this.f115629u;
        if (wnu0Var == null) {
            dct0.m115293b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = wnu0Var instanceof omu0;
            this.f115618j.execute(new Runnable() { // from class: l.elu0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f94587a.m140701c0(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m140711p() {
        if (this.f115631w) {
            return;
        }
        this.f115620l.zzr();
    }

    /* JADX INFO: renamed from: q */
    public final void m140712q(View view) {
        boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168233a5)).booleanValue();
        ulu0 ulu0Var = this.f115619k;
        if (!zBooleanValue) {
            m140688L(view, ulu0Var.m196605h0());
            return;
        }
        tct0 tct0VarM196596c0 = ulu0Var.m196596c0();
        if (tct0VarM196596c0 == null) {
            return;
        }
        pvw0.m173991r(tct0VarM196596c0, new hlu0(this, view), this.f115618j);
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m140713r(View view, MotionEvent motionEvent, View view2) {
        this.f115620l.mo111324h(view, motionEvent, view2);
    }

    /* JADX INFO: renamed from: s */
    public final synchronized void m140714s(Bundle bundle) {
        this.f115620l.mo111330n(bundle);
    }

    /* JADX INFO: renamed from: t */
    public final synchronized void m140715t(View view) {
        this.f115620l.mo111328l(view);
    }

    /* JADX INFO: renamed from: u */
    public final synchronized void m140716u() {
        this.f115620l.mo111318b();
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m140717v(ytt0 ytt0Var) {
        this.f115620l.mo111332p(ytt0Var);
    }

    /* JADX INFO: renamed from: w */
    public final synchronized void m140718w(ycu0 ycu0Var) {
        this.f115614D.m220303a(ycu0Var);
    }

    /* JADX INFO: renamed from: x */
    public final synchronized void m140719x(kns0 kns0Var) {
        this.f115620l.mo111331o(kns0Var);
    }

    /* JADX INFO: renamed from: y */
    public final synchronized void m140720y(final wnu0 wnu0Var) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168013I1)).booleanValue()) {
            C2098b.f9751l.post(new Runnable() { // from class: l.yku0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f200493a.m140702d0(wnu0Var);
                }
            });
        } else {
            m140702d0(wnu0Var);
        }
    }

    /* JADX INFO: renamed from: z */
    public final synchronized void m140721z(final wnu0 wnu0Var) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168013I1)).booleanValue()) {
            C2098b.f9751l.post(new Runnable() { // from class: l.zku0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f204858a.m140703e0(wnu0Var);
                }
            });
        } else {
            m140703e0(wnu0Var);
        }
    }
}
