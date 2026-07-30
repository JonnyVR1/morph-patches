package p149l;

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
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2272w;
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
public final class ccu0 extends eqt0 {

    /* JADX INFO: renamed from: H */
    public static final zzgaa f80304H = zzgaa.zzq("3010", "3008", "1005", "1009", "2011", "2007");

    /* JADX INFO: renamed from: A */
    public final zzcei f80305A;

    /* JADX INFO: renamed from: B */
    public final Context f80306B;

    /* JADX INFO: renamed from: C */
    public final ecu0 f80307C;

    /* JADX INFO: renamed from: D */
    public final tcv0 f80308D;

    /* JADX INFO: renamed from: E */
    public final Map f80309E;

    /* JADX INFO: renamed from: F */
    public final List f80310F;

    /* JADX INFO: renamed from: G */
    public final txr0 f80311G;

    /* JADX INFO: renamed from: j */
    public final Executor f80312j;

    /* JADX INFO: renamed from: k */
    public final ocu0 f80313k;

    /* JADX INFO: renamed from: l */
    public final wcu0 f80314l;

    /* JADX INFO: renamed from: m */
    public final udu0 f80315m;

    /* JADX INFO: renamed from: n */
    public final tcu0 f80316n;

    /* JADX INFO: renamed from: o */
    public final zcu0 f80317o;

    /* JADX INFO: renamed from: p */
    public final egx0 f80318p;

    /* JADX INFO: renamed from: q */
    public final egx0 f80319q;

    /* JADX INFO: renamed from: r */
    public final egx0 f80320r;

    /* JADX INFO: renamed from: s */
    public final egx0 f80321s;

    /* JADX INFO: renamed from: t */
    public final egx0 f80322t;

    /* JADX INFO: renamed from: u */
    public qeu0 f80323u;

    /* JADX INFO: renamed from: v */
    public boolean f80324v;

    /* JADX INFO: renamed from: w */
    public boolean f80325w;

    /* JADX INFO: renamed from: x */
    public boolean f80326x;

    /* JADX INFO: renamed from: y */
    public final i0t0 f80327y;

    /* JADX INFO: renamed from: z */
    public final ptr0 f80328z;

    public ccu0(dqt0 dqt0Var, Executor executor, ocu0 ocu0Var, wcu0 wcu0Var, udu0 udu0Var, tcu0 tcu0Var, zcu0 zcu0Var, egx0 egx0Var, egx0 egx0Var2, egx0 egx0Var3, egx0 egx0Var4, egx0 egx0Var5, i0t0 i0t0Var, ptr0 ptr0Var, zzcei zzceiVar, Context context, ecu0 ecu0Var, tcv0 tcv0Var, txr0 txr0Var) {
        super(dqt0Var);
        this.f80312j = executor;
        this.f80313k = ocu0Var;
        this.f80314l = wcu0Var;
        this.f80315m = udu0Var;
        this.f80316n = tcu0Var;
        this.f80317o = zcu0Var;
        this.f80318p = egx0Var;
        this.f80319q = egx0Var2;
        this.f80320r = egx0Var3;
        this.f80321s = egx0Var4;
        this.f80322t = egx0Var5;
        this.f80327y = i0t0Var;
        this.f80328z = ptr0Var;
        this.f80305A = zzceiVar;
        this.f80306B = context;
        this.f80307C = ecu0Var;
        this.f80308D = tcv0Var;
        this.f80309E = new HashMap();
        this.f80310F = new ArrayList();
        this.f80311G = txr0Var;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m106150E(View view) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132219ea)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        vny0.m199080r();
        long jM12303X = C2075b.m12303X(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (jM12303X >= ((Integer) d1s0.m109677c().m144697a(m7s0.f132232fa)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m106154W(ccu0 ccu0Var) {
        try {
            ocu0 ocu0Var = ccu0Var.f80313k;
            int iM163573P = ocu0Var.m163573P();
            if (iM163573P == 1) {
                if (ccu0Var.f80317o.m218103b() != null) {
                    ccu0Var.m106164J(ThirdPushManager.VENDOR_TYPE_FCM, true);
                    ccu0Var.f80317o.m218103b().mo95918i4((scs0) ccu0Var.f80318p.zzb());
                    return;
                }
                return;
            }
            if (iM163573P == 2) {
                if (ccu0Var.f80317o.m218102a() != null) {
                    ccu0Var.m106164J(ThirdPushManager.VENDOR_TYPE_FCM, true);
                    ccu0Var.f80317o.m218102a().mo208132O2((qcs0) ccu0Var.f80319q.zzb());
                    return;
                }
                return;
            }
            if (iM163573P == 3) {
                if (ccu0Var.f80317o.m218105d(ocu0Var.m163584a()) != null) {
                    if (ccu0Var.f80313k.m163595f0() != null) {
                        ccu0Var.m106170R(ThirdPushManager.VENDOR_TYPE_FCM, true);
                    }
                    ccu0Var.f80317o.m218105d(ccu0Var.f80313k.m163584a()).mo125591A3((vcs0) ccu0Var.f80322t.zzb());
                    return;
                }
                return;
            }
            if (iM163573P == 6) {
                if (ccu0Var.f80317o.m218107f() != null) {
                    ccu0Var.m106164J(ThirdPushManager.VENDOR_TYPE_FCM, true);
                    ccu0Var.f80317o.m218107f().mo103723w3((hes0) ccu0Var.f80320r.zzb());
                    return;
                }
                return;
            }
            if (iM163573P != 7) {
                x2t0.m206866d("Wrong native template id!");
                return;
            }
            zcu0 zcu0Var = ccu0Var.f80317o;
            if (zcu0Var.m218108g() != null) {
                zcu0Var.m218108g().mo169932S3((ljs0) ccu0Var.f80321s.zzb());
            }
        } catch (RemoteException e) {
            x2t0.m206867e("RemoteException when notifyAdLoad is called", e);
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m106156A() {
        return this.f80316n.mo183427e();
    }

    /* JADX INFO: renamed from: B */
    public final synchronized boolean m106157B() {
        return this.f80314l.mo101584t();
    }

    /* JADX INFO: renamed from: C */
    public final synchronized boolean m106158C() {
        return this.f80314l.mo101566J();
    }

    /* JADX INFO: renamed from: D */
    public final boolean m106159D() {
        return this.f80316n.mo183426d();
    }

    /* JADX INFO: renamed from: F */
    public final synchronized boolean m106160F(Bundle bundle) {
        if (this.f80325w) {
            return true;
        }
        boolean zMo101570d = this.f80314l.mo101570d(bundle);
        this.f80325w = zMo101570d;
        return zMo101570d;
    }

    @Nullable
    /* JADX INFO: renamed from: G */
    public final synchronized View m106161G(Map map) {
        if (map != null) {
            zzgaa zzgaaVar = f80304H;
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
    public final synchronized ImageView.ScaleType m106162H() {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132044Q7)).booleanValue()) {
            return null;
        }
        qeu0 qeu0Var = this.f80323u;
        if (qeu0Var == null) {
            x2t0.m206864b("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        uyl uylVarZzj = qeu0Var.zzj();
        if (uylVarZzj != null) {
            return (ImageView.ScaleType) s050.m181847P2(uylVarZzj);
        }
        return udu0.f175961k;
    }

    /* JADX INFO: renamed from: I */
    public final synchronized int m106163I() {
        return this.f80314l.zza();
    }

    /* JADX INFO: renamed from: J */
    public final void m106164J(String str, boolean z) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132162a5)).booleanValue()) {
            m106170R(ThirdPushManager.VENDOR_TYPE_FCM, true);
            return;
        }
        gnr gnrVarM163602j0 = this.f80313k.m163602j0();
        if (gnrVarM163602j0 == null) {
            return;
        }
        jmw0.m142245r(gnrVarM163602j0, new acu0(this, ThirdPushManager.VENDOR_TYPE_FCM, true), this.f80312j);
    }

    /* JADX INFO: renamed from: K */
    public final synchronized void m106165K(View view, Map map, Map map2) {
        this.f80315m.m193160d(this.f80323u);
        this.f80314l.mo101575i(view, map, map2, m106162H());
        this.f80325w = true;
    }

    /* JADX INFO: renamed from: L */
    public final void m106166L(View view, @Nullable b6w0 b6w0Var) {
        q9t0 q9t0VarM163593e0 = this.f80313k.m163593e0();
        if (!this.f80316n.mo183426d() || b6w0Var == null || q9t0VarM163593e0 == null || view == null) {
            return;
        }
        vny0.m199063a().mo109956e(b6w0Var, view);
    }

    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final synchronized void m106181d0(qeu0 qeu0Var) {
        Iterator<String> itKeys;
        View view;
        try {
            if (!this.f80324v) {
                this.f80323u = qeu0Var;
                this.f80315m.m193161e(qeu0Var);
                this.f80314l.mo101579m(qeu0Var.zzf(), qeu0Var.zzm(), qeu0Var.zzn(), qeu0Var, qeu0Var);
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132429v2)).booleanValue()) {
                    this.f80328z.m171378c().mo136908e(qeu0Var.zzf());
                }
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131966K1)).booleanValue()) {
                    kxv0 kxv0Var = this.f92845b;
                    if (kxv0Var.f125206l0 && (itKeys = kxv0Var.f125204k0.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            WeakReference weakReference = (WeakReference) this.f80323u.zzl().get(next);
                            this.f80309E.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                ViewOnAttachStateChangeListenerC2272w viewOnAttachStateChangeListenerC2272w = new ViewOnAttachStateChangeListenerC2272w(this.f80306B, view);
                                this.f80310F.add(viewOnAttachStateChangeListenerC2272w);
                                viewOnAttachStateChangeListenerC2272w.m13402c(new zbu0(this, next));
                            }
                        }
                    }
                }
                if (qeu0Var.zzi() != null) {
                    qeu0Var.zzi().m13402c(this.f80327y);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void m106182e0(qeu0 qeu0Var) {
        this.f80314l.mo101577k(qeu0Var.zzf(), qeu0Var.zzl());
        if (qeu0Var.zzh() != null) {
            qeu0Var.zzh().setClickable(false);
            qeu0Var.zzh().removeAllViews();
        }
        if (qeu0Var.zzi() != null) {
            qeu0Var.zzi().m13404e(this.f80327y);
        }
        this.f80323u = null;
    }

    /* JADX INFO: renamed from: O */
    public final ecu0 m106169O() {
        return this.f80307C;
    }

    @Nullable
    /* JADX INFO: renamed from: R */
    public final b6w0 m106170R(String str, boolean z) {
        String str2;
        zzeii zzeiiVar;
        zzeih zzeihVar;
        String str3;
        if (!this.f80316n.mo183426d() || TextUtils.isEmpty(str)) {
            return null;
        }
        ocu0 ocu0Var = this.f80313k;
        q9t0 q9t0VarM163593e0 = ocu0Var.m163593e0();
        q9t0 q9t0VarM163595f0 = ocu0Var.m163595f0();
        if (q9t0VarM163593e0 == null && q9t0VarM163595f0 == null) {
            x2t0.m206869g("Omid display and video webview are null. Skipping initialization.");
            return null;
        }
        boolean z2 = false;
        boolean z3 = q9t0VarM163593e0 != null;
        boolean z4 = q9t0VarM163595f0 != null;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132137Y4)).booleanValue()) {
            this.f80316n.mo183423a();
            int iM152300b = this.f80316n.mo183423a().m152300b();
            int i = iM152300b - 1;
            if (i != 0) {
                if (i != 1) {
                    if (iM152300b != 1) {
                        str3 = iM152300b != 2 ? "UNKNOWN" : "DISPLAY";
                    } else {
                        str3 = "VIDEO";
                    }
                    x2t0.m206869g("Unknown omid media type: " + str3 + ". Not initializing Omid.");
                    return null;
                }
                if (q9t0VarM163593e0 == null) {
                    x2t0.m206869g("Omid media type was display but there was no display webview.");
                    return null;
                }
                z4 = false;
                z2 = true;
            } else {
                if (q9t0VarM163595f0 == null) {
                    x2t0.m206869g("Omid media type was video but there was no video webview.");
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
            q9t0VarM163593e0 = q9t0VarM163595f0;
        }
        q9t0VarM163593e0.mo13661L();
        if (!vny0.m199063a().mo109953b(this.f80306B)) {
            x2t0.m206869g("Failed to initialize omid in InternalNativeAd");
            return null;
        }
        zzcei zzceiVar = this.f80305A;
        String str4 = zzceiVar.zzb + "." + zzceiVar.zzc;
        if (z4) {
            zzeihVar = zzeih.VIDEO;
            zzeiiVar = zzeii.DEFINED_BY_JAVASCRIPT;
        } else {
            ocu0 ocu0Var2 = this.f80313k;
            zzeih zzeihVar2 = zzeih.NATIVE_DISPLAY;
            zzeiiVar = ocu0Var2.m163573P() == 3 ? zzeii.UNSPECIFIED : zzeii.ONE_PIXEL;
            zzeihVar = zzeihVar2;
        }
        b6w0 b6w0VarMo109957f = vny0.m199063a().mo109957f(str4, q9t0VarM163593e0.mo13661L(), "", "javascript", str2, str, zzeiiVar, zzeihVar, this.f92845b.f125208m0);
        if (b6w0VarMo109957f == null) {
            x2t0.m206869g("Failed to create omid session in InternalNativeAd");
            return null;
        }
        this.f80313k.m163618w(b6w0VarMo109957f);
        q9t0VarM163593e0.mo13671W(b6w0VarMo109957f);
        if (z4) {
            vny0.m199063a().mo109956e(b6w0VarMo109957f, q9t0VarM163595f0.zzF());
            this.f80326x = true;
        }
        if (z) {
            vny0.m199063a().mo109959h(b6w0VarMo109957f);
            q9t0VarM163593e0.mo13674Z("onSdkLoaded", new e01());
        }
        return b6w0VarMo109957f;
    }

    /* JADX INFO: renamed from: S */
    public final String m106171S() {
        return this.f80316n.mo183424b();
    }

    /* JADX INFO: renamed from: U */
    public final synchronized JSONObject m106172U(View view, Map map, Map map2) {
        return this.f80314l.mo101571e(view, map, map2, m106162H());
    }

    /* JADX INFO: renamed from: V */
    public final synchronized JSONObject m106173V(View view, Map map, Map map2) {
        return this.f80314l.mo101573g(view, map, map2, m106162H());
    }

    /* JADX INFO: renamed from: Y */
    public final void m106174Y(View view) {
        b6w0 b6w0VarM163598h0 = this.f80313k.m163598h0();
        if (!this.f80316n.mo183426d() || b6w0VarM163598h0 == null || view == null) {
            return;
        }
        vny0.m199063a().mo109952a(b6w0VarM163598h0, view);
    }

    /* JADX INFO: renamed from: Z */
    public final synchronized void m106175Z() {
        this.f80314l.zzh();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m106176a0() {
        this.f80314l.zzi();
        this.f80313k.m163599i();
    }

    @Override // p149l.eqt0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo106177b() {
        this.f80324v = true;
        this.f80312j.execute(new Runnable() { // from class: l.xbu0
            @Override // java.lang.Runnable
            public final void run() {
                this.f191966a.m106176a0();
            }
        });
        super.mo106177b();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m106178b0(View view, boolean z, int i) {
        this.f80314l.mo101572f(view, this.f80323u.zzf(), this.f80323u.zzl(), this.f80323u.zzm(), z, m106162H(), i);
    }

    @Override // p149l.eqt0
    @AnyThread
    /* JADX INFO: renamed from: c */
    public final void mo106179c() {
        this.f80312j.execute(new Runnable() { // from class: l.ubu0
            @Override // java.lang.Runnable
            public final void run() {
                ccu0.m106154W(this.f175758a);
            }
        });
        if (this.f80313k.m163573P() != 7) {
            Executor executor = this.f80312j;
            final wcu0 wcu0Var = this.f80314l;
            Objects.requireNonNull(wcu0Var);
            executor.execute(new Runnable() { // from class: l.vbu0
                @Override // java.lang.Runnable
                public final void run() {
                    wcu0Var.zzp();
                }
            });
        }
        super.mo106179c();
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m106180c0(boolean z) {
        this.f80314l.mo101572f(null, this.f80323u.zzf(), this.f80323u.zzl(), this.f80323u.zzm(), z, m106162H(), 0);
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
    public final synchronized void m106183i(View view, Map map, Map map2, boolean z) {
        View viewM106161G;
        Rect rect;
        Iterator it;
        View view2;
        try {
            if (!this.f80325w) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131966K1)).booleanValue() && this.f92845b.f125206l0) {
                    Iterator it2 = this.f80309E.keySet().iterator();
                    while (it2.hasNext()) {
                        if (!((Boolean) this.f80309E.get((String) it2.next())).booleanValue()) {
                        }
                    }
                    if (z) {
                        viewM106161G = m106161G(map);
                        if (viewM106161G == null) {
                            m106165K(view, map, map2);
                            return;
                        }
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131992M3)).booleanValue()) {
                            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132004N3)).booleanValue()) {
                                m106165K(view, map, map2);
                                return;
                            }
                            rect = new Rect();
                            if (viewM106161G.getGlobalVisibleRect(rect, null)) {
                                m106165K(view, map, map2);
                            }
                        } else if (m106150E(viewM106161G)) {
                            m106165K(view, map, map2);
                        }
                    } else {
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131980L3)).booleanValue()) {
                            it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                                if (view2 == null) {
                                }
                            }
                        }
                    }
                } else if (z) {
                    if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131980L3)).booleanValue() && map != null) {
                        it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                            if (view2 == null && m106150E(view2)) {
                                m106165K(view, map, map2);
                                return;
                            }
                        }
                    }
                } else {
                    viewM106161G = m106161G(map);
                    if (viewM106161G == null) {
                        m106165K(view, map, map2);
                        return;
                    }
                    if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131992M3)).booleanValue()) {
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132004N3)).booleanValue()) {
                            m106165K(view, map, map2);
                            return;
                        }
                        rect = new Rect();
                        if (viewM106161G.getGlobalVisibleRect(rect, null) && viewM106161G.getHeight() == rect.height() && viewM106161G.getWidth() == rect.width()) {
                            m106165K(view, map, map2);
                        }
                    } else if (m106150E(viewM106161G)) {
                        m106165K(view, map, map2);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m106184j(@Nullable wpt0 wpt0Var) {
        this.f80314l.mo101569c(wpt0Var);
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m106185k(View view, View view2, Map map, Map map2, boolean z) {
        this.f80315m.m193159c(this.f80323u);
        this.f80314l.mo101567a(view, view2, map, map2, z, m106162H());
        if (this.f80326x) {
            ocu0 ocu0Var = this.f80313k;
            if (ocu0Var.m163595f0() != null) {
                ocu0Var.m163595f0().mo13674Z("onSdkAdUserInteractionClick", new e01());
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m106186l(@Nullable final View view, final int i) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132095Ua)).booleanValue()) {
            qeu0 qeu0Var = this.f80323u;
            if (qeu0Var == null) {
                x2t0.m206864b("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z = qeu0Var instanceof idu0;
                this.f80312j.execute(new Runnable() { // from class: l.wbu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f185623a.m106178b0(view, z, i);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m106187m(String str) {
        this.f80314l.mo101585u(str);
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m106188n(Bundle bundle) {
        this.f80314l.mo101576j(bundle);
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m106189o() {
        qeu0 qeu0Var = this.f80323u;
        if (qeu0Var == null) {
            x2t0.m206864b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = qeu0Var instanceof idu0;
            this.f80312j.execute(new Runnable() { // from class: l.ybu0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f197366a.m106180c0(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m106190p() {
        if (this.f80325w) {
            return;
        }
        this.f80314l.zzr();
    }

    /* JADX INFO: renamed from: q */
    public final void m106191q(View view) {
        boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132162a5)).booleanValue();
        ocu0 ocu0Var = this.f80313k;
        if (!zBooleanValue) {
            m106166L(view, ocu0Var.m163598h0());
            return;
        }
        n3t0 n3t0VarM163589c0 = ocu0Var.m163589c0();
        if (n3t0VarM163589c0 == null) {
            return;
        }
        jmw0.m142245r(n3t0VarM163589c0, new bcu0(this, view), this.f80312j);
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m106192r(View view, MotionEvent motionEvent, View view2) {
        this.f80314l.mo101574h(view, motionEvent, view2);
    }

    /* JADX INFO: renamed from: s */
    public final synchronized void m106193s(Bundle bundle) {
        this.f80314l.mo101580n(bundle);
    }

    /* JADX INFO: renamed from: t */
    public final synchronized void m106194t(View view) {
        this.f80314l.mo101578l(view);
    }

    /* JADX INFO: renamed from: u */
    public final synchronized void m106195u() {
        this.f80314l.mo101568b();
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m106196v(skt0 skt0Var) {
        this.f80314l.mo101582p(skt0Var);
    }

    /* JADX INFO: renamed from: w */
    public final synchronized void m106197w(s3u0 s3u0Var) {
        this.f80308D.m188059a(s3u0Var);
    }

    /* JADX INFO: renamed from: x */
    public final synchronized void m106198x(ees0 ees0Var) {
        this.f80314l.mo101581o(ees0Var);
    }

    /* JADX INFO: renamed from: y */
    public final synchronized void m106199y(final qeu0 qeu0Var) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131942I1)).booleanValue()) {
            C2075b.f9714l.post(new Runnable() { // from class: l.sbu0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163635a.m106181d0(qeu0Var);
                }
            });
        } else {
            m106181d0(qeu0Var);
        }
    }

    /* JADX INFO: renamed from: z */
    public final synchronized void m106200z(final qeu0 qeu0Var) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131942I1)).booleanValue()) {
            C2075b.f9714l.post(new Runnable() { // from class: l.tbu0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f169361a.m106182e0(qeu0Var);
                }
            });
        } else {
            m106182e0(qeu0Var);
        }
    }
}
