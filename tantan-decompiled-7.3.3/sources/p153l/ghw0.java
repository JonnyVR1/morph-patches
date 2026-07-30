package p153l;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ghw0 implements fgw0 {

    /* JADX INFO: renamed from: i */
    public static final ghw0 f104161i = new ghw0();

    /* JADX INFO: renamed from: j */
    public static final Handler f104162j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k */
    public static Handler f104163k = null;

    /* JADX INFO: renamed from: l */
    public static final Runnable f104164l = new zgw0();

    /* JADX INFO: renamed from: m */
    public static final Runnable f104165m = new dhw0();

    /* JADX INFO: renamed from: b */
    public int f104167b;

    /* JADX INFO: renamed from: h */
    public long f104173h;

    /* JADX INFO: renamed from: a */
    public final List f104166a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f104168c = false;

    /* JADX INFO: renamed from: d */
    public final List f104169d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final wgw0 f104171f = new wgw0();

    /* JADX INFO: renamed from: e */
    public final hgw0 f104170e = new hgw0();

    /* JADX INFO: renamed from: g */
    public final xgw0 f104172g = new xgw0(new jhw0());

    /* JADX INFO: renamed from: d */
    public static ghw0 m130266d() {
        return f104161i;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m130269g(ghw0 ghw0Var) {
        ghw0 ghw0Var2;
        ghw0Var.f104167b = 0;
        ghw0Var.f104169d.clear();
        ghw0Var.f104168c = false;
        for (kfw0 kfw0Var : tfw0.m190995a().m190996b()) {
        }
        ghw0Var.f104173h = System.nanoTime();
        ghw0Var.f104171f.m206280i();
        long jNanoTime = System.nanoTime();
        ggw0 ggw0VarM134972a = ghw0Var.f104170e.m134972a();
        if (ghw0Var.f104171f.m206276e().size() > 0) {
            for (String str : ghw0Var.f104171f.m206276e()) {
                JSONObject jSONObjectMo130196a = ggw0VarM134972a.mo130196a(null);
                View viewM206272a = ghw0Var.f104171f.m206272a(str);
                ggw0 ggw0VarM134973b = ghw0Var.f104170e.m134973b();
                String strM206274c = ghw0Var.f104171f.m206274c(str);
                if (strM206274c != null) {
                    JSONObject jSONObjectMo130196a2 = ggw0VarM134973b.mo130196a(viewM206272a);
                    qgw0.m176522b(jSONObjectMo130196a2, str);
                    try {
                        jSONObjectMo130196a2.put("notVisibleReason", strM206274c);
                    } catch (JSONException e) {
                        rgw0.m181507a("Error with setting not visible reason", e);
                    }
                    qgw0.m176523c(jSONObjectMo130196a, jSONObjectMo130196a2);
                }
                qgw0.m176526f(jSONObjectMo130196a);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                ghw0Var.f104172g.m210963c(jSONObjectMo130196a, hashSet, jNanoTime);
            }
        }
        if (ghw0Var.f104171f.m206277f().size() > 0) {
            JSONObject jSONObjectMo130196a3 = ggw0VarM134972a.mo130196a(null);
            ghw0Var2 = ghw0Var;
            ghw0Var2.m130274k(null, ggw0VarM134972a, jSONObjectMo130196a3, 1, false);
            qgw0.m176526f(jSONObjectMo130196a3);
            ghw0Var2.f104172g.m210964d(jSONObjectMo130196a3, ghw0Var2.f104171f.m206277f(), jNanoTime);
        } else {
            ghw0Var2 = ghw0Var;
            ghw0Var2.f104172g.m210962b();
        }
        ghw0Var2.f104171f.m206278g();
        System.nanoTime();
        if (ghw0Var2.f104166a.size() > 0) {
            for (fhw0 fhw0Var : ghw0Var2.f104166a) {
                fhw0Var.zzb();
                if (fhw0Var instanceof ehw0) {
                    ((ehw0) fhw0Var).zza();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m130270l() {
        Handler handler = f104163k;
        if (handler != null) {
            handler.removeCallbacks(f104165m);
            f104163k = null;
        }
    }

    @Override // p153l.fgw0
    /* JADX INFO: renamed from: a */
    public final void mo125534a(View view, ggw0 ggw0Var, JSONObject jSONObject, boolean z) {
        int iM206282k;
        boolean z2;
        if (ugw0.m195951a(view) != null || (iM206282k = this.f104171f.m206282k(view)) == 3) {
            return;
        }
        JSONObject jSONObjectMo130196a = ggw0Var.mo130196a(view);
        qgw0.m176523c(jSONObject, jSONObjectMo130196a);
        String strM206275d = this.f104171f.m206275d(view);
        if (strM206275d != null) {
            qgw0.m176522b(jSONObjectMo130196a, strM206275d);
            try {
                jSONObjectMo130196a.put("hasWindowFocus", Boolean.valueOf(this.f104171f.m206281j(view)));
            } catch (JSONException e) {
                rgw0.m181507a("Error with setting has window focus", e);
            }
            this.f104171f.m206279h();
            this = this;
        } else {
            vgw0 vgw0VarM206273b = this.f104171f.m206273b(view);
            if (vgw0VarM206273b != null) {
                wfw0 wfw0VarM201244a = vgw0VarM206273b.m201244a();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListM201245b = vgw0VarM206273b.m201245b();
                int size = arrayListM201245b.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) arrayListM201245b.get(i));
                }
                try {
                    jSONObjectMo130196a.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectMo130196a.put("friendlyObstructionClass", wfw0VarM201244a.m206169d());
                    jSONObjectMo130196a.put("friendlyObstructionPurpose", wfw0VarM201244a.m206166a());
                    jSONObjectMo130196a.put("friendlyObstructionReason", wfw0VarM201244a.m206168c());
                } catch (JSONException e2) {
                    rgw0.m181507a("Error with setting friendly obstruction", e2);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            m130274k(view, ggw0Var, jSONObjectMo130196a, iM206282k, z || z2);
        }
        this.f104167b++;
    }

    /* JADX INFO: renamed from: h */
    public final void m130271h() {
        m130270l();
    }

    /* JADX INFO: renamed from: i */
    public final void m130272i() {
        if (f104163k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f104163k = handler;
            handler.post(f104164l);
            f104163k.postDelayed(f104165m, 200L);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m130273j() {
        m130270l();
        this.f104166a.clear();
        f104162j.post(new ygw0(this));
    }

    /* JADX INFO: renamed from: k */
    public final void m130274k(View view, ggw0 ggw0Var, JSONObject jSONObject, int i, boolean z) {
        ggw0Var.mo130197b(view, jSONObject, this, i == 1, z);
    }
}
