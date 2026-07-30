package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ulu0 {

    /* JADX INFO: renamed from: a */
    public int f179557a;

    /* JADX INFO: renamed from: b */
    public lpu0 f179558b;

    /* JADX INFO: renamed from: c */
    public tks0 f179559c;

    /* JADX INFO: renamed from: d */
    public View f179560d;

    /* JADX INFO: renamed from: e */
    public List f179561e;

    /* JADX INFO: renamed from: g */
    public rfv0 f179563g;

    /* JADX INFO: renamed from: h */
    public Bundle f179564h;

    /* JADX INFO: renamed from: i */
    public wit0 f179565i;

    /* JADX INFO: renamed from: j */
    public wit0 f179566j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public wit0 f179567k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public hfw0 f179568l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public hpr f179569m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public tct0 f179570n;

    /* JADX INFO: renamed from: o */
    public View f179571o;

    /* JADX INFO: renamed from: p */
    public View f179572p;

    /* JADX INFO: renamed from: q */
    public p1m f179573q;

    /* JADX INFO: renamed from: r */
    public double f179574r;

    /* JADX INFO: renamed from: s */
    public als0 f179575s;

    /* JADX INFO: renamed from: t */
    public als0 f179576t;

    /* JADX INFO: renamed from: u */
    public String f179577u;

    /* JADX INFO: renamed from: x */
    public float f179580x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public String f179581y;

    /* JADX INFO: renamed from: v */
    public final oof0 f179578v = new oof0();

    /* JADX INFO: renamed from: w */
    public final oof0 f179579w = new oof0();

    /* JADX INFO: renamed from: f */
    public List f179562f = Collections.EMPTY_LIST;

    @Nullable
    /* JADX INFO: renamed from: H */
    public static ulu0 m196564H(nxs0 nxs0Var) {
        try {
            mlu0 mlu0VarM196568L = m196568L(nxs0Var.m165274m4(), null);
            tks0 tks0VarM165275m5 = nxs0Var.m165275m5();
            View view = (View) m196570N(nxs0Var.m165272g7());
            String strZzo = nxs0Var.zzo();
            List listM165277o8 = nxs0Var.m165277o8();
            String strZzm = nxs0Var.zzm();
            Bundle bundleZzf = nxs0Var.zzf();
            String strZzn = nxs0Var.zzn();
            View view2 = (View) m196570N(nxs0Var.m165276n8());
            p1m p1mVarZzl = nxs0Var.zzl();
            String strM165271a = nxs0Var.m165271a();
            String strZzp = nxs0Var.zzp();
            double dZze = nxs0Var.zze();
            als0 als0VarM165270M6 = nxs0Var.m165270M6();
            try {
                ulu0 ulu0Var = new ulu0();
                ulu0Var.f179557a = 2;
                ulu0Var.f179558b = mlu0VarM196568L;
                ulu0Var.f179559c = tks0VarM165275m5;
                ulu0Var.f179560d = view;
                ulu0Var.m196628z("headline", strZzo);
                ulu0Var.f179561e = listM165277o8;
                ulu0Var.m196628z("body", strZzm);
                ulu0Var.f179564h = bundleZzf;
                ulu0Var.m196628z("call_to_action", strZzn);
                ulu0Var.f179571o = view2;
                ulu0Var.f179573q = p1mVarZzl;
                ulu0Var.m196628z(PlaceTypes.STORE, strM165271a);
                ulu0Var.m196628z(FirebaseAnalytics.Param.PRICE, strZzp);
                ulu0Var.f179574r = dZze;
                ulu0Var.f179575s = als0VarM165270M6;
                return ulu0Var;
            } catch (RemoteException e) {
                e = e;
                dct0.m115299h("Failed to get native ad from app install ad mapper", e);
                return 0;
            }
        } catch (RemoteException e2) {
            e = e2;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public static ulu0 m196565I(oxs0 oxs0Var) {
        try {
            mlu0 mlu0VarM196568L = m196568L(oxs0Var.m169728m4(), null);
            tks0 tks0VarM169729m5 = oxs0Var.m169729m5();
            View view = (View) m196570N(oxs0Var.zzi());
            String strZzo = oxs0Var.zzo();
            List listM169731o8 = oxs0Var.m169731o8();
            String strZzm = oxs0Var.zzm();
            Bundle bundleZze = oxs0Var.zze();
            String strZzn = oxs0Var.zzn();
            View view2 = (View) m196570N(oxs0Var.m169727g7());
            p1m p1mVarM169730n8 = oxs0Var.m169730n8();
            String strZzl = oxs0Var.zzl();
            als0 als0VarM169725M6 = oxs0Var.m169725M6();
            ulu0 ulu0Var = new ulu0();
            ulu0Var.f179557a = 1;
            ulu0Var.f179558b = mlu0VarM196568L;
            ulu0Var.f179559c = tks0VarM169729m5;
            ulu0Var.f179560d = view;
            ulu0Var.m196628z("headline", strZzo);
            ulu0Var.f179561e = listM169731o8;
            ulu0Var.m196628z("body", strZzm);
            ulu0Var.f179564h = bundleZze;
            ulu0Var.m196628z("call_to_action", strZzn);
            ulu0Var.f179571o = view2;
            ulu0Var.f179573q = p1mVarM169730n8;
            ulu0Var.m196628z("advertiser", strZzl);
            ulu0Var.f179576t = als0VarM169725M6;
            return ulu0Var;
        } catch (RemoteException e) {
            dct0.m115299h("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: J */
    public static ulu0 m196566J(nxs0 nxs0Var) {
        try {
            return m196569M(m196568L(nxs0Var.m165274m4(), null), nxs0Var.m165275m5(), (View) m196570N(nxs0Var.m165272g7()), nxs0Var.zzo(), nxs0Var.m165277o8(), nxs0Var.zzm(), nxs0Var.zzf(), nxs0Var.zzn(), (View) m196570N(nxs0Var.m165276n8()), nxs0Var.zzl(), nxs0Var.m165271a(), nxs0Var.zzp(), nxs0Var.zze(), nxs0Var.m165270M6(), null, 0.0f);
        } catch (RemoteException e) {
            dct0.m115299h("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: K */
    public static ulu0 m196567K(oxs0 oxs0Var) {
        try {
            return m196569M(m196568L(oxs0Var.m169728m4(), null), oxs0Var.m169729m5(), (View) m196570N(oxs0Var.zzi()), oxs0Var.zzo(), oxs0Var.m169731o8(), oxs0Var.zzm(), oxs0Var.zze(), oxs0Var.zzn(), (View) m196570N(oxs0Var.m169727g7()), oxs0Var.m169730n8(), null, null, -1.0d, oxs0Var.m169725M6(), oxs0Var.zzl(), 0.0f);
        } catch (RemoteException e) {
            dct0.m115299h("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: L */
    public static mlu0 m196568L(lpu0 lpu0Var, @Nullable rxs0 rxs0Var) {
        if (lpu0Var == null) {
            return null;
        }
        return new mlu0(lpu0Var, rxs0Var);
    }

    /* JADX INFO: renamed from: M */
    public static ulu0 m196569M(lpu0 lpu0Var, tks0 tks0Var, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, p1m p1mVar, String str4, String str5, double d, als0 als0Var, String str6, float f) {
        ulu0 ulu0Var = new ulu0();
        ulu0Var.f179557a = 6;
        ulu0Var.f179558b = lpu0Var;
        ulu0Var.f179559c = tks0Var;
        ulu0Var.f179560d = view;
        ulu0Var.m196628z("headline", str);
        ulu0Var.f179561e = list;
        ulu0Var.m196628z("body", str2);
        ulu0Var.f179564h = bundle;
        ulu0Var.m196628z("call_to_action", str3);
        ulu0Var.f179571o = view2;
        ulu0Var.f179573q = p1mVar;
        ulu0Var.m196628z(PlaceTypes.STORE, str4);
        ulu0Var.m196628z(FirebaseAnalytics.Param.PRICE, str5);
        ulu0Var.f179574r = d;
        ulu0Var.f179575s = als0Var;
        ulu0Var.m196628z("advertiser", str6);
        ulu0Var.m196620r(f);
        return ulu0Var;
    }

    /* JADX INFO: renamed from: N */
    public static Object m196570N(@Nullable p1m p1mVar) {
        if (p1mVar == null) {
            return null;
        }
        return h950.m134037P2(p1mVar);
    }

    @Nullable
    /* JADX INFO: renamed from: g0 */
    public static ulu0 m196571g0(rxs0 rxs0Var) {
        try {
            return m196569M(m196568L(rxs0Var.zzj(), rxs0Var), rxs0Var.zzk(), (View) m196570N(rxs0Var.zzm()), rxs0Var.zzs(), rxs0Var.mo174241b(), rxs0Var.mo174240a(), rxs0Var.zzi(), rxs0Var.zzr(), (View) m196570N(rxs0Var.zzn()), rxs0Var.zzo(), rxs0Var.zzu(), rxs0Var.zzt(), rxs0Var.zze(), rxs0Var.zzl(), rxs0Var.zzp(), rxs0Var.zzf());
        } catch (RemoteException e) {
            dct0.m115299h("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final synchronized double m196572A() {
        return this.f179574r;
    }

    /* JADX INFO: renamed from: B */
    public final synchronized void m196573B(int i) {
        this.f179557a = i;
    }

    /* JADX INFO: renamed from: C */
    public final synchronized void m196574C(lpu0 lpu0Var) {
        this.f179558b = lpu0Var;
    }

    /* JADX INFO: renamed from: D */
    public final synchronized void m196575D(View view) {
        this.f179571o = view;
    }

    /* JADX INFO: renamed from: E */
    public final synchronized void m196576E(wit0 wit0Var) {
        this.f179565i = wit0Var;
    }

    /* JADX INFO: renamed from: F */
    public final synchronized void m196577F(View view) {
        this.f179572p = view;
    }

    /* JADX INFO: renamed from: G */
    public final synchronized boolean m196578G() {
        return this.f179566j != null;
    }

    /* JADX INFO: renamed from: O */
    public final synchronized float m196579O() {
        return this.f179580x;
    }

    /* JADX INFO: renamed from: P */
    public final synchronized int m196580P() {
        return this.f179557a;
    }

    /* JADX INFO: renamed from: Q */
    public final synchronized Bundle m196581Q() {
        try {
            if (this.f179564h == null) {
                this.f179564h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f179564h;
    }

    /* JADX INFO: renamed from: R */
    public final synchronized View m196582R() {
        return this.f179560d;
    }

    /* JADX INFO: renamed from: S */
    public final synchronized View m196583S() {
        return this.f179571o;
    }

    /* JADX INFO: renamed from: T */
    public final synchronized View m196584T() {
        return this.f179572p;
    }

    /* JADX INFO: renamed from: U */
    public final synchronized oof0 m196585U() {
        return this.f179578v;
    }

    /* JADX INFO: renamed from: V */
    public final synchronized oof0 m196586V() {
        return this.f179579w;
    }

    /* JADX INFO: renamed from: W */
    public final synchronized lpu0 m196587W() {
        return this.f179558b;
    }

    @Nullable
    /* JADX INFO: renamed from: X */
    public final synchronized rfv0 m196588X() {
        return this.f179563g;
    }

    /* JADX INFO: renamed from: Y */
    public final synchronized tks0 m196589Y() {
        return this.f179559c;
    }

    @Nullable
    /* JADX INFO: renamed from: Z */
    public final als0 m196590Z() {
        List list = this.f179561e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f179561e.get(0);
        if (obj instanceof IBinder) {
            return zks0.m220161o8((IBinder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m196591a() {
        return this.f179577u;
    }

    /* JADX INFO: renamed from: a0 */
    public final synchronized als0 m196592a0() {
        return this.f179575s;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized String m196593b() {
        return m196601f("headline");
    }

    /* JADX INFO: renamed from: b0 */
    public final synchronized als0 m196594b0() {
        return this.f179576t;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final synchronized String m196595c() {
        return this.f179581y;
    }

    @Nullable
    /* JADX INFO: renamed from: c0 */
    public final synchronized tct0 m196596c0() {
        return this.f179570n;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized String m196597d() {
        return m196601f(FirebaseAnalytics.Param.PRICE);
    }

    /* JADX INFO: renamed from: d0 */
    public final synchronized wit0 m196598d0() {
        return this.f179566j;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized String m196599e() {
        return m196601f(PlaceTypes.STORE);
    }

    @Nullable
    /* JADX INFO: renamed from: e0 */
    public final synchronized wit0 m196600e0() {
        return this.f179567k;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized String m196601f(String str) {
        return (String) this.f179579w.get(str);
    }

    /* JADX INFO: renamed from: f0 */
    public final synchronized wit0 m196602f0() {
        return this.f179565i;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized List m196603g() {
        return this.f179561e;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized List m196604h() {
        return this.f179562f;
    }

    @Nullable
    /* JADX INFO: renamed from: h0 */
    public final synchronized hfw0 m196605h0() {
        return this.f179568l;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m196606i() {
        try {
            wit0 wit0Var = this.f179565i;
            if (wit0Var != null) {
                wit0Var.destroy();
                this.f179565i = null;
            }
            wit0 wit0Var2 = this.f179566j;
            if (wit0Var2 != null) {
                wit0Var2.destroy();
                this.f179566j = null;
            }
            wit0 wit0Var3 = this.f179567k;
            if (wit0Var3 != null) {
                wit0Var3.destroy();
                this.f179567k = null;
            }
            hpr hprVar = this.f179569m;
            if (hprVar != null) {
                hprVar.cancel(false);
                this.f179569m = null;
            }
            tct0 tct0Var = this.f179570n;
            if (tct0Var != null) {
                tct0Var.cancel(false);
                this.f179570n = null;
            }
            this.f179568l = null;
            this.f179578v.clear();
            this.f179579w.clear();
            this.f179558b = null;
            this.f179559c = null;
            this.f179560d = null;
            this.f179561e = null;
            this.f179564h = null;
            this.f179571o = null;
            this.f179572p = null;
            this.f179573q = null;
            this.f179575s = null;
            this.f179576t = null;
            this.f179577u = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final synchronized p1m m196607i0() {
        return this.f179573q;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m196608j(tks0 tks0Var) {
        this.f179559c = tks0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: j0 */
    public final synchronized hpr m196609j0() {
        return this.f179569m;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m196610k(String str) {
        this.f179577u = str;
    }

    /* JADX INFO: renamed from: k0 */
    public final synchronized String m196611k0() {
        return m196601f("advertiser");
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m196612l(@Nullable rfv0 rfv0Var) {
        this.f179563g = rfv0Var;
    }

    /* JADX INFO: renamed from: l0 */
    public final synchronized String m196613l0() {
        return m196601f("body");
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m196614m(als0 als0Var) {
        this.f179575s = als0Var;
    }

    /* JADX INFO: renamed from: m0 */
    public final synchronized String m196615m0() {
        return m196601f("call_to_action");
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m196616n(String str, fks0 fks0Var) {
        oof0 oof0Var = this.f179578v;
        try {
            if (fks0Var == null) {
                oof0Var.remove(str);
            } else {
                oof0Var.put(str, fks0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m196617o(wit0 wit0Var) {
        this.f179566j = wit0Var;
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m196618p(List list) {
        this.f179561e = list;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m196619q(als0 als0Var) {
        this.f179576t = als0Var;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m196620r(float f) {
        this.f179580x = f;
    }

    /* JADX INFO: renamed from: s */
    public final synchronized void m196621s(List list) {
        this.f179562f = list;
    }

    /* JADX INFO: renamed from: t */
    public final synchronized void m196622t(wit0 wit0Var) {
        this.f179567k = wit0Var;
    }

    /* JADX INFO: renamed from: u */
    public final synchronized void m196623u(hpr hprVar) {
        this.f179569m = hprVar;
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m196624v(@Nullable String str) {
        this.f179581y = str;
    }

    /* JADX INFO: renamed from: w */
    public final synchronized void m196625w(hfw0 hfw0Var) {
        this.f179568l = hfw0Var;
    }

    /* JADX INFO: renamed from: x */
    public final synchronized void m196626x(tct0 tct0Var) {
        this.f179570n = tct0Var;
    }

    /* JADX INFO: renamed from: y */
    public final synchronized void m196627y(double d) {
        this.f179574r = d;
    }

    /* JADX INFO: renamed from: z */
    public final synchronized void m196628z(String str, String str2) {
        oof0 oof0Var = this.f179579w;
        try {
            if (str2 == null) {
                oof0Var.remove(str);
            } else {
                oof0Var.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
