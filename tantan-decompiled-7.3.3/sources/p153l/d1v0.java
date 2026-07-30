package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.internal.util.C2098b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class d1v0 extends lfu0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final Map f84724a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f84725b;

    /* JADX INFO: renamed from: c */
    public final WeakReference f84726c;

    /* JADX INFO: renamed from: d */
    public final r0v0 f84727d;

    /* JADX INFO: renamed from: e */
    public final xvw0 f84728e;

    /* JADX INFO: renamed from: f */
    public final e1v0 f84729f;

    /* JADX INFO: renamed from: g */
    public j0v0 f84730g;

    public d1v0(Context context, WeakReference weakReference, r0v0 r0v0Var, e1v0 e1v0Var, xvw0 xvw0Var) {
        this.f84725b = context;
        this.f84726c = weakReference;
        this.f84727d = r0v0Var;
        this.f84728e = xvw0Var;
        this.f84729f = e1v0Var;
    }

    /* JADX INFO: renamed from: w8 */
    public static s70 m113637w8() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new s70.C19999a().m179961b(AdMobAdapter.class, bundle).m184941i();
    }

    /* JADX INFO: renamed from: x8 */
    public static String m113638x8(Object obj) {
        n5d0 n5d0VarMo128561g;
        tlu0 tlu0VarM161703f;
        if (obj instanceof jtv) {
            n5d0VarMo128561g = ((jtv) obj).m146920f();
        } else if (obj instanceof bx0) {
            n5d0VarMo128561g = ((bx0) obj).mo106822a();
        } else if (obj instanceof a2n) {
            n5d0VarMo128561g = ((a2n) obj).mo95717a();
        } else if (obj instanceof v8d0) {
            n5d0VarMo128561g = ((v8d0) obj).mo194878a();
        } else if (obj instanceof x8d0) {
            n5d0VarMo128561g = ((x8d0) obj).mo157514a();
        } else if (obj instanceof AdView) {
            n5d0VarMo128561g = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof md20)) {
                return "";
            }
            n5d0VarMo128561g = ((md20) obj).mo128561g();
        }
        if (n5d0VarMo128561g == null || (tlu0VarM161703f = n5d0VarMo128561g.m161703f()) == null) {
            return "";
        }
        try {
            return tlu0VarM161703f.zzh();
        } catch (RemoteException unused) {
            return "";
        }
    }

    @Override // p153l.tgu0
    /* JADX INFO: renamed from: X1 */
    public final void mo113639X1(String str, p1m p1mVar, p1m p1mVar2) {
        Context context = (Context) h950.m134037P2(p1mVar);
        ViewGroup viewGroup = (ViewGroup) h950.m134037P2(p1mVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.f84724a.get(str);
        if (obj != null) {
            this.f84724a.remove(str);
        }
        if (obj instanceof AdView) {
            e1v0.m119025a(context, viewGroup, (AdView) obj);
        } else if (obj instanceof md20) {
            e1v0.m119026b(context, viewGroup, (md20) obj);
        }
    }

    /* JADX INFO: renamed from: r8 */
    public final void m113640r8(j0v0 j0v0Var) {
        this.f84730g = j0v0Var;
    }

    /* JADX INFO: renamed from: s8 */
    public final synchronized void m113641s8(String str, Object obj, String str2) {
        this.f84724a.put(str, obj);
        m113645y8(m113638x8(obj), str2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: t8 */
    public final synchronized void m113642t8(final String str, String str2, final String str3) {
        switch (str2.hashCode()) {
            case -1999289321:
                if (str2.equals("NATIVE")) {
                    f70.C16918a c16918a = new f70.C16918a(m113644v8(), str);
                    c16918a.m124342b(new md20.InterfaceC18591c() { // from class: l.s0v0
                        @Override // p153l.md20.InterfaceC18591c
                        /* JADX INFO: renamed from: a */
                        public final void mo103686a(md20 md20Var) {
                            this.f165735a.m113641s8(str, md20Var, str3);
                        }
                    });
                    c16918a.m124343c(new a1v0(this, str3));
                    c16918a.m124341a().m124338a(m113637w8());
                    return;
                }
                break;
            case -1372958932:
                if (str2.equals("INTERSTITIAL")) {
                    a2n.m95716b(m113644v8(), str, m113637w8(), new x0v0(this, str, str3));
                    return;
                }
                break;
            case -428325382:
                if (str2.equals("APP_OPEN_AD")) {
                    bx0.m106821b(m113644v8(), str, m113637w8(), 1, new v0v0(this, str, str3));
                    return;
                }
                break;
            case 543046670:
                if (str2.equals("REWARDED")) {
                    v8d0.m200297b(m113644v8(), str, m113637w8(), new y0v0(this, str, str3));
                    return;
                }
                break;
            case 1854800829:
                if (str2.equals("REWARDED_INTERSTITIAL")) {
                    x8d0.m209691b(m113644v8(), str, m113637w8(), new z0v0(this, str, str3));
                    return;
                }
                break;
            case 1951953708:
                if (str2.equals("BANNER")) {
                    AdView adView = new AdView(m113644v8());
                    adView.setAdSize(w70.f187681i);
                    adView.setAdUnitId(str);
                    adView.setAdListener(new w0v0(this, str, adView, str3));
                    adView.m12273b(m113637w8());
                    return;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: u8 */
    public final synchronized void m113643u8(String str, String str2) {
        Object obj;
        try {
            Activity activityM179264b = this.f84727d.m179264b();
            if (activityM179264b != null && (obj = this.f84724a.get(str)) != null) {
                dgs0 dgs0Var = sgs0.f168393m9;
                if (!((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue() || (obj instanceof bx0) || (obj instanceof a2n) || (obj instanceof v8d0) || (obj instanceof x8d0)) {
                    this.f84724a.remove(str);
                }
                m113646z8(m113638x8(obj), str2);
                if (obj instanceof bx0) {
                    ((bx0) obj).mo106823c(activityM179264b);
                    return;
                }
                if (obj instanceof a2n) {
                    ((a2n) obj).mo95720e(activityM179264b);
                    return;
                }
                if (obj instanceof v8d0) {
                    ((v8d0) obj).mo194880d(activityM179264b, new bp50() { // from class: l.t0v0
                        @Override // p153l.bp50
                        /* JADX INFO: renamed from: a */
                        public final void mo105787a(t8d0 t8d0Var) {
                        }
                    });
                    return;
                }
                if (obj instanceof x8d0) {
                    ((x8d0) obj).mo157515c(activityM179264b, new bp50() { // from class: l.u0v0
                        @Override // p153l.bp50
                        /* JADX INFO: renamed from: a */
                        public final void mo105787a(t8d0 t8d0Var) {
                        }
                    });
                    return;
                }
                if (((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue() && ((obj instanceof AdView) || (obj instanceof md20))) {
                    Intent intent = new Intent();
                    Context contextM113644v8 = m113644v8();
                    intent.setClassName(contextM113644v8, "com.google.android.gms.ads.OutOfContextTestingActivity");
                    intent.putExtra("adUnit", str);
                    bxy0.m106934r();
                    C2098b.m12380s(contextM113644v8, intent);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: v8 */
    public final Context m113644v8() {
        Context context = (Context) this.f84726c.get();
        return context == null ? this.f84725b : context;
    }

    /* JADX INFO: renamed from: y8 */
    public final synchronized void m113645y8(String str, String str2) {
        try {
            pvw0.m173991r(this.f84730g.m143037b(str), new b1v0(this, str2), this.f84728e);
        } catch (NullPointerException e) {
            bxy0.m106933q().m120275w(e, "OutOfContextTester.setAdAsOutOfContext");
            this.f84727d.m179268f(str2);
        }
    }

    /* JADX INFO: renamed from: z8 */
    public final synchronized void m113646z8(String str, String str2) {
        try {
            pvw0.m173991r(this.f84730g.m143037b(str), new c1v0(this, str2), this.f84728e);
        } catch (NullPointerException e) {
            bxy0.m106933q().m120275w(e, "OutOfContextTester.setAdAsShown");
            this.f84727d.m179268f(str2);
        }
    }
}
