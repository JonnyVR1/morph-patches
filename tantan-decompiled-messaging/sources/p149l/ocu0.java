package p149l;

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
public final class ocu0 {

    /* JADX INFO: renamed from: a */
    public int f143102a;

    /* JADX INFO: renamed from: b */
    public fgu0 f143103b;

    /* JADX INFO: renamed from: c */
    public nbs0 f143104c;

    /* JADX INFO: renamed from: d */
    public View f143105d;

    /* JADX INFO: renamed from: e */
    public List f143106e;

    /* JADX INFO: renamed from: g */
    public l6v0 f143108g;

    /* JADX INFO: renamed from: h */
    public Bundle f143109h;

    /* JADX INFO: renamed from: i */
    public q9t0 f143110i;

    /* JADX INFO: renamed from: j */
    public q9t0 f143111j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public q9t0 f143112k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public b6w0 f143113l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public gnr f143114m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public n3t0 f143115n;

    /* JADX INFO: renamed from: o */
    public View f143116o;

    /* JADX INFO: renamed from: p */
    public View f143117p;

    /* JADX INFO: renamed from: q */
    public uyl f143118q;

    /* JADX INFO: renamed from: r */
    public double f143119r;

    /* JADX INFO: renamed from: s */
    public ubs0 f143120s;

    /* JADX INFO: renamed from: t */
    public ubs0 f143121t;

    /* JADX INFO: renamed from: u */
    public String f143122u;

    /* JADX INFO: renamed from: x */
    public float f143125x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public String f143126y;

    /* JADX INFO: renamed from: v */
    public final hgf0 f143123v = new hgf0();

    /* JADX INFO: renamed from: w */
    public final hgf0 f143124w = new hgf0();

    /* JADX INFO: renamed from: f */
    public List f143107f = Collections.EMPTY_LIST;

    @Nullable
    /* JADX INFO: renamed from: H */
    public static ocu0 m163557H(hos0 hos0Var) {
        try {
            gcu0 gcu0VarM163561L = m163561L(hos0Var.m132253m4(), null);
            nbs0 nbs0VarM132254m5 = hos0Var.m132254m5();
            View view = (View) m163563N(hos0Var.m132251g7());
            String strZzo = hos0Var.zzo();
            List listM132256o8 = hos0Var.m132256o8();
            String strZzm = hos0Var.zzm();
            Bundle bundleZzf = hos0Var.zzf();
            String strZzn = hos0Var.zzn();
            View view2 = (View) m163563N(hos0Var.m132255n8());
            uyl uylVarZzl = hos0Var.zzl();
            String strM132250a = hos0Var.m132250a();
            String strZzp = hos0Var.zzp();
            double dZze = hos0Var.zze();
            ubs0 ubs0VarM132249M6 = hos0Var.m132249M6();
            try {
                ocu0 ocu0Var = new ocu0();
                ocu0Var.f143102a = 2;
                ocu0Var.f143103b = gcu0VarM163561L;
                ocu0Var.f143104c = nbs0VarM132254m5;
                ocu0Var.f143105d = view;
                ocu0Var.m163621z("headline", strZzo);
                ocu0Var.f143106e = listM132256o8;
                ocu0Var.m163621z("body", strZzm);
                ocu0Var.f143109h = bundleZzf;
                ocu0Var.m163621z("call_to_action", strZzn);
                ocu0Var.f143116o = view2;
                ocu0Var.f143118q = uylVarZzl;
                ocu0Var.m163621z(PlaceTypes.STORE, strM132250a);
                ocu0Var.m163621z(FirebaseAnalytics.Param.PRICE, strZzp);
                ocu0Var.f143119r = dZze;
                ocu0Var.f143120s = ubs0VarM132249M6;
                return ocu0Var;
            } catch (RemoteException e) {
                e = e;
                x2t0.m206870h("Failed to get native ad from app install ad mapper", e);
                return 0;
            }
        } catch (RemoteException e2) {
            e = e2;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public static ocu0 m163558I(ios0 ios0Var) {
        try {
            gcu0 gcu0VarM163561L = m163561L(ios0Var.m137380m4(), null);
            nbs0 nbs0VarM137381m5 = ios0Var.m137381m5();
            View view = (View) m163563N(ios0Var.zzi());
            String strZzo = ios0Var.zzo();
            List listM137383o8 = ios0Var.m137383o8();
            String strZzm = ios0Var.zzm();
            Bundle bundleZze = ios0Var.zze();
            String strZzn = ios0Var.zzn();
            View view2 = (View) m163563N(ios0Var.m137379g7());
            uyl uylVarM137382n8 = ios0Var.m137382n8();
            String strZzl = ios0Var.zzl();
            ubs0 ubs0VarM137377M6 = ios0Var.m137377M6();
            ocu0 ocu0Var = new ocu0();
            ocu0Var.f143102a = 1;
            ocu0Var.f143103b = gcu0VarM163561L;
            ocu0Var.f143104c = nbs0VarM137381m5;
            ocu0Var.f143105d = view;
            ocu0Var.m163621z("headline", strZzo);
            ocu0Var.f143106e = listM137383o8;
            ocu0Var.m163621z("body", strZzm);
            ocu0Var.f143109h = bundleZze;
            ocu0Var.m163621z("call_to_action", strZzn);
            ocu0Var.f143116o = view2;
            ocu0Var.f143118q = uylVarM137382n8;
            ocu0Var.m163621z("advertiser", strZzl);
            ocu0Var.f143121t = ubs0VarM137377M6;
            return ocu0Var;
        } catch (RemoteException e) {
            x2t0.m206870h("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: J */
    public static ocu0 m163559J(hos0 hos0Var) {
        try {
            return m163562M(m163561L(hos0Var.m132253m4(), null), hos0Var.m132254m5(), (View) m163563N(hos0Var.m132251g7()), hos0Var.zzo(), hos0Var.m132256o8(), hos0Var.zzm(), hos0Var.zzf(), hos0Var.zzn(), (View) m163563N(hos0Var.m132255n8()), hos0Var.zzl(), hos0Var.m132250a(), hos0Var.zzp(), hos0Var.zze(), hos0Var.m132249M6(), null, 0.0f);
        } catch (RemoteException e) {
            x2t0.m206870h("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: K */
    public static ocu0 m163560K(ios0 ios0Var) {
        try {
            return m163562M(m163561L(ios0Var.m137380m4(), null), ios0Var.m137381m5(), (View) m163563N(ios0Var.zzi()), ios0Var.zzo(), ios0Var.m137383o8(), ios0Var.zzm(), ios0Var.zze(), ios0Var.zzn(), (View) m163563N(ios0Var.m137379g7()), ios0Var.m137382n8(), null, null, -1.0d, ios0Var.m137377M6(), ios0Var.zzl(), 0.0f);
        } catch (RemoteException e) {
            x2t0.m206870h("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: L */
    public static gcu0 m163561L(fgu0 fgu0Var, @Nullable los0 los0Var) {
        if (fgu0Var == null) {
            return null;
        }
        return new gcu0(fgu0Var, los0Var);
    }

    /* JADX INFO: renamed from: M */
    public static ocu0 m163562M(fgu0 fgu0Var, nbs0 nbs0Var, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, uyl uylVar, String str4, String str5, double d, ubs0 ubs0Var, String str6, float f) {
        ocu0 ocu0Var = new ocu0();
        ocu0Var.f143102a = 6;
        ocu0Var.f143103b = fgu0Var;
        ocu0Var.f143104c = nbs0Var;
        ocu0Var.f143105d = view;
        ocu0Var.m163621z("headline", str);
        ocu0Var.f143106e = list;
        ocu0Var.m163621z("body", str2);
        ocu0Var.f143109h = bundle;
        ocu0Var.m163621z("call_to_action", str3);
        ocu0Var.f143116o = view2;
        ocu0Var.f143118q = uylVar;
        ocu0Var.m163621z(PlaceTypes.STORE, str4);
        ocu0Var.m163621z(FirebaseAnalytics.Param.PRICE, str5);
        ocu0Var.f143119r = d;
        ocu0Var.f143120s = ubs0Var;
        ocu0Var.m163621z("advertiser", str6);
        ocu0Var.m163613r(f);
        return ocu0Var;
    }

    /* JADX INFO: renamed from: N */
    public static Object m163563N(@Nullable uyl uylVar) {
        if (uylVar == null) {
            return null;
        }
        return s050.m181847P2(uylVar);
    }

    @Nullable
    /* JADX INFO: renamed from: g0 */
    public static ocu0 m163564g0(los0 los0Var) {
        try {
            return m163562M(m163561L(los0Var.zzj(), los0Var), los0Var.zzk(), (View) m163563N(los0Var.zzm()), los0Var.zzs(), los0Var.mo142528b(), los0Var.mo142527a(), los0Var.zzi(), los0Var.zzr(), (View) m163563N(los0Var.zzn()), los0Var.zzo(), los0Var.zzu(), los0Var.zzt(), los0Var.zze(), los0Var.zzl(), los0Var.zzp(), los0Var.zzf());
        } catch (RemoteException e) {
            x2t0.m206870h("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: A */
    public final synchronized double m163565A() {
        return this.f143119r;
    }

    /* JADX INFO: renamed from: B */
    public final synchronized void m163566B(int i) {
        this.f143102a = i;
    }

    /* JADX INFO: renamed from: C */
    public final synchronized void m163567C(fgu0 fgu0Var) {
        this.f143103b = fgu0Var;
    }

    /* JADX INFO: renamed from: D */
    public final synchronized void m163568D(View view) {
        this.f143116o = view;
    }

    /* JADX INFO: renamed from: E */
    public final synchronized void m163569E(q9t0 q9t0Var) {
        this.f143110i = q9t0Var;
    }

    /* JADX INFO: renamed from: F */
    public final synchronized void m163570F(View view) {
        this.f143117p = view;
    }

    /* JADX INFO: renamed from: G */
    public final synchronized boolean m163571G() {
        return this.f143111j != null;
    }

    /* JADX INFO: renamed from: O */
    public final synchronized float m163572O() {
        return this.f143125x;
    }

    /* JADX INFO: renamed from: P */
    public final synchronized int m163573P() {
        return this.f143102a;
    }

    /* JADX INFO: renamed from: Q */
    public final synchronized Bundle m163574Q() {
        try {
            if (this.f143109h == null) {
                this.f143109h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f143109h;
    }

    /* JADX INFO: renamed from: R */
    public final synchronized View m163575R() {
        return this.f143105d;
    }

    /* JADX INFO: renamed from: S */
    public final synchronized View m163576S() {
        return this.f143116o;
    }

    /* JADX INFO: renamed from: T */
    public final synchronized View m163577T() {
        return this.f143117p;
    }

    /* JADX INFO: renamed from: U */
    public final synchronized hgf0 m163578U() {
        return this.f143123v;
    }

    /* JADX INFO: renamed from: V */
    public final synchronized hgf0 m163579V() {
        return this.f143124w;
    }

    /* JADX INFO: renamed from: W */
    public final synchronized fgu0 m163580W() {
        return this.f143103b;
    }

    @Nullable
    /* JADX INFO: renamed from: X */
    public final synchronized l6v0 m163581X() {
        return this.f143108g;
    }

    /* JADX INFO: renamed from: Y */
    public final synchronized nbs0 m163582Y() {
        return this.f143104c;
    }

    @Nullable
    /* JADX INFO: renamed from: Z */
    public final ubs0 m163583Z() {
        List list = this.f143106e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f143106e.get(0);
        if (obj instanceof IBinder) {
            return tbs0.m187903o8((IBinder) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m163584a() {
        return this.f143122u;
    }

    /* JADX INFO: renamed from: a0 */
    public final synchronized ubs0 m163585a0() {
        return this.f143120s;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized String m163586b() {
        return m163594f("headline");
    }

    /* JADX INFO: renamed from: b0 */
    public final synchronized ubs0 m163587b0() {
        return this.f143121t;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final synchronized String m163588c() {
        return this.f143126y;
    }

    @Nullable
    /* JADX INFO: renamed from: c0 */
    public final synchronized n3t0 m163589c0() {
        return this.f143115n;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized String m163590d() {
        return m163594f(FirebaseAnalytics.Param.PRICE);
    }

    /* JADX INFO: renamed from: d0 */
    public final synchronized q9t0 m163591d0() {
        return this.f143111j;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized String m163592e() {
        return m163594f(PlaceTypes.STORE);
    }

    @Nullable
    /* JADX INFO: renamed from: e0 */
    public final synchronized q9t0 m163593e0() {
        return this.f143112k;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized String m163594f(String str) {
        return (String) this.f143124w.get(str);
    }

    /* JADX INFO: renamed from: f0 */
    public final synchronized q9t0 m163595f0() {
        return this.f143110i;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized List m163596g() {
        return this.f143106e;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized List m163597h() {
        return this.f143107f;
    }

    @Nullable
    /* JADX INFO: renamed from: h0 */
    public final synchronized b6w0 m163598h0() {
        return this.f143113l;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m163599i() {
        try {
            q9t0 q9t0Var = this.f143110i;
            if (q9t0Var != null) {
                q9t0Var.destroy();
                this.f143110i = null;
            }
            q9t0 q9t0Var2 = this.f143111j;
            if (q9t0Var2 != null) {
                q9t0Var2.destroy();
                this.f143111j = null;
            }
            q9t0 q9t0Var3 = this.f143112k;
            if (q9t0Var3 != null) {
                q9t0Var3.destroy();
                this.f143112k = null;
            }
            gnr gnrVar = this.f143114m;
            if (gnrVar != null) {
                gnrVar.cancel(false);
                this.f143114m = null;
            }
            n3t0 n3t0Var = this.f143115n;
            if (n3t0Var != null) {
                n3t0Var.cancel(false);
                this.f143115n = null;
            }
            this.f143113l = null;
            this.f143123v.clear();
            this.f143124w.clear();
            this.f143103b = null;
            this.f143104c = null;
            this.f143105d = null;
            this.f143106e = null;
            this.f143109h = null;
            this.f143116o = null;
            this.f143117p = null;
            this.f143118q = null;
            this.f143120s = null;
            this.f143121t = null;
            this.f143122u = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final synchronized uyl m163600i0() {
        return this.f143118q;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m163601j(nbs0 nbs0Var) {
        this.f143104c = nbs0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: j0 */
    public final synchronized gnr m163602j0() {
        return this.f143114m;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m163603k(String str) {
        this.f143122u = str;
    }

    /* JADX INFO: renamed from: k0 */
    public final synchronized String m163604k0() {
        return m163594f("advertiser");
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m163605l(@Nullable l6v0 l6v0Var) {
        this.f143108g = l6v0Var;
    }

    /* JADX INFO: renamed from: l0 */
    public final synchronized String m163606l0() {
        return m163594f("body");
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m163607m(ubs0 ubs0Var) {
        this.f143120s = ubs0Var;
    }

    /* JADX INFO: renamed from: m0 */
    public final synchronized String m163608m0() {
        return m163594f("call_to_action");
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m163609n(String str, zas0 zas0Var) {
        hgf0 hgf0Var = this.f143123v;
        try {
            if (zas0Var == null) {
                hgf0Var.remove(str);
            } else {
                hgf0Var.put(str, zas0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m163610o(q9t0 q9t0Var) {
        this.f143111j = q9t0Var;
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m163611p(List list) {
        this.f143106e = list;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m163612q(ubs0 ubs0Var) {
        this.f143121t = ubs0Var;
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m163613r(float f) {
        this.f143125x = f;
    }

    /* JADX INFO: renamed from: s */
    public final synchronized void m163614s(List list) {
        this.f143107f = list;
    }

    /* JADX INFO: renamed from: t */
    public final synchronized void m163615t(q9t0 q9t0Var) {
        this.f143112k = q9t0Var;
    }

    /* JADX INFO: renamed from: u */
    public final synchronized void m163616u(gnr gnrVar) {
        this.f143114m = gnrVar;
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m163617v(@Nullable String str) {
        this.f143126y = str;
    }

    /* JADX INFO: renamed from: w */
    public final synchronized void m163618w(b6w0 b6w0Var) {
        this.f143113l = b6w0Var;
    }

    /* JADX INFO: renamed from: x */
    public final synchronized void m163619x(n3t0 n3t0Var) {
        this.f143115n = n3t0Var;
    }

    /* JADX INFO: renamed from: y */
    public final synchronized void m163620y(double d) {
        this.f143119r = d;
    }

    /* JADX INFO: renamed from: z */
    public final synchronized void m163621z(String str, String str2) {
        hgf0 hgf0Var = this.f143124w;
        try {
            if (str2 == null) {
                hgf0Var.remove(str);
            } else {
                hgf0Var.put(str, str2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
