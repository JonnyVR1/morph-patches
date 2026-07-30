package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.internal.util.C2075b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class xru0 extends f6u0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final Map f194175a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f194176b;

    /* JADX INFO: renamed from: c */
    public final WeakReference f194177c;

    /* JADX INFO: renamed from: d */
    public final lru0 f194178d;

    /* JADX INFO: renamed from: e */
    public final rmw0 f194179e;

    /* JADX INFO: renamed from: f */
    public final yru0 f194180f;

    /* JADX INFO: renamed from: g */
    public dru0 f194181g;

    public xru0(Context context, WeakReference weakReference, lru0 lru0Var, yru0 yru0Var, rmw0 rmw0Var) {
        this.f194176b = context;
        this.f194177c = weakReference;
        this.f194178d = lru0Var;
        this.f194179e = rmw0Var;
        this.f194180f = yru0Var;
    }

    /* JADX INFO: renamed from: w8 */
    public static w70 m210714w8() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new w70.C20817a().m191883b(AdMobAdapter.class, bundle).m201999i();
    }

    /* JADX INFO: renamed from: x8 */
    public static String m210715x8(Object obj) {
        kxc0 kxc0VarMo98609g;
        ncu0 ncu0VarM147734f;
        if (obj instanceof irv) {
            kxc0VarMo98609g = ((irv) obj).m137917f();
        } else if (obj instanceof uw0) {
            kxc0VarMo98609g = ((uw0) obj).mo139377a();
        } else if (obj instanceof a0n) {
            kxc0VarMo98609g = ((a0n) obj).mo94454a();
        } else if (obj instanceof s0d0) {
            kxc0VarMo98609g = ((s0d0) obj).mo166695a();
        } else if (obj instanceof u0d0) {
            kxc0VarMo98609g = ((u0d0) obj).mo128910a();
        } else if (obj instanceof AdView) {
            kxc0VarMo98609g = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof e520)) {
                return "";
            }
            kxc0VarMo98609g = ((e520) obj).mo98609g();
        }
        if (kxc0VarMo98609g == null || (ncu0VarM147734f = kxc0VarMo98609g.m147734f()) == null) {
            return "";
        }
        try {
            return ncu0VarM147734f.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    @Override // p149l.n7u0
    /* JADX INFO: renamed from: X1 */
    public final void mo158163X1(String str, uyl uylVar, uyl uylVar2) {
        Context context = (Context) s050.m181847P2(uylVar);
        ViewGroup viewGroup = (ViewGroup) s050.m181847P2(uylVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.f194175a.get(str);
        if (obj != null) {
            this.f194175a.remove(str);
        }
        if (obj instanceof AdView) {
            yru0.m215858a(context, viewGroup, (AdView) obj);
        } else if (obj instanceof e520) {
            yru0.m215859b(context, viewGroup, (e520) obj);
        }
    }

    /* JADX INFO: renamed from: r8 */
    public final void m210716r8(dru0 dru0Var) {
        this.f194181g = dru0Var;
    }

    /* JADX INFO: renamed from: s8 */
    public final synchronized void m210717s8(String str, Object obj, String str2) {
        this.f194175a.put(str, obj);
        m210721y8(m210715x8(obj), str2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: t8 */
    public final synchronized void m210718t8(final String str, String str2, final String str3) {
        switch (str2.hashCode()) {
            case -1999289321:
                if (str2.equals("NATIVE")) {
                    j70.C17709a c17709a = new j70.C17709a(m210720v8(), str);
                    c17709a.m140068b(new e520.InterfaceC16544c() { // from class: l.mru0
                        @Override // p149l.e520.InterfaceC16544c
                        /* JADX INFO: renamed from: a */
                        public final void mo95151a(e520 e520Var) {
                            this.f135414a.m210717s8(str, e520Var, str3);
                        }
                    });
                    c17709a.m140069c(new uru0(this, str3));
                    c17709a.m140067a().m140064a(m210714w8());
                    return;
                }
                break;
            case -1372958932:
                if (str2.equals("INTERSTITIAL")) {
                    a0n.m94453b(m210720v8(), str, m210714w8(), new rru0(this, str, str3));
                    return;
                }
                break;
            case -428325382:
                if (str2.equals("APP_OPEN_AD")) {
                    uw0.m196099b(m210720v8(), str, m210714w8(), 1, new pru0(this, str, str3));
                    return;
                }
                break;
            case 543046670:
                if (str2.equals("REWARDED")) {
                    s0d0.m181858b(m210720v8(), str, m210714w8(), new sru0(this, str, str3));
                    return;
                }
                break;
            case 1854800829:
                if (str2.equals("REWARDED_INTERSTITIAL")) {
                    u0d0.m191339b(m210720v8(), str, m210714w8(), new tru0(this, str, str3));
                    return;
                }
                break;
            case 1951953708:
                if (str2.equals("BANNER")) {
                    AdView adView = new AdView(m210720v8());
                    adView.setAdSize(a80.f67968i);
                    adView.setAdUnitId(str);
                    adView.setAdListener(new qru0(this, str, adView, str3));
                    adView.m12219b(m210714w8());
                    return;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: u8 */
    public final synchronized void m210719u8(String str, String str2) {
        Object obj;
        try {
            Activity activityM151506b = this.f194178d.m151506b();
            if (activityM151506b != null && (obj = this.f194175a.get(str)) != null) {
                x6s0 x6s0Var = m7s0.f132322m9;
                if (!((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue() || (obj instanceof uw0) || (obj instanceof a0n) || (obj instanceof s0d0) || (obj instanceof u0d0)) {
                    this.f194175a.remove(str);
                }
                m210722z8(m210715x8(obj), str2);
                if (obj instanceof uw0) {
                    ((uw0) obj).mo139378c(activityM151506b);
                    return;
                }
                if (obj instanceof a0n) {
                    ((a0n) obj).mo94457e(activityM151506b);
                    return;
                }
                if (obj instanceof s0d0) {
                    ((s0d0) obj).mo166697d(activityM151506b, new vg50() { // from class: l.nru0
                        @Override // p149l.vg50
                        /* JADX INFO: renamed from: a */
                        public final void mo137905a(q0d0 q0d0Var) {
                        }
                    });
                    return;
                }
                if (obj instanceof u0d0) {
                    ((u0d0) obj).mo128911c(activityM151506b, new vg50() { // from class: l.oru0
                        @Override // p149l.vg50
                        /* JADX INFO: renamed from: a */
                        public final void mo137905a(q0d0 q0d0Var) {
                        }
                    });
                    return;
                }
                if (((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue() && ((obj instanceof AdView) || (obj instanceof e520))) {
                    Intent intent = new Intent();
                    Context contextM210720v8 = m210720v8();
                    intent.setClassName(contextM210720v8, "com.google.android.gms.ads.OutOfContextTestingActivity");
                    intent.putExtra("adUnit", str);
                    vny0.m199080r();
                    C2075b.m12326s(contextM210720v8, intent);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: v8 */
    public final Context m210720v8() {
        Context context = (Context) this.f194177c.get();
        return context == null ? this.f194176b : context;
    }

    /* JADX INFO: renamed from: y8 */
    public final synchronized void m210721y8(String str, String str2) {
        try {
            jmw0.m142245r(this.f194181g.m113340b(str), new vru0(this, str2), this.f194179e);
        } catch (NullPointerException e) {
            vny0.m199079q().m212290w(e, "OutOfContextTester.setAdAsOutOfContext");
            this.f194178d.m151510f(str2);
        }
    }

    /* JADX INFO: renamed from: z8 */
    public final synchronized void m210722z8(String str, String str2) {
        try {
            jmw0.m142245r(this.f194181g.m113340b(str), new wru0(this, str2), this.f194179e);
        } catch (NullPointerException e) {
            vny0.m199079q().m212290w(e, "OutOfContextTester.setAdAsShown");
            this.f194178d.m151510f(str2);
        }
    }
}
