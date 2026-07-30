package p149l;

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
public final class a8w0 implements z6w0 {

    /* JADX INFO: renamed from: i */
    public static final a8w0 f68083i = new a8w0();

    /* JADX INFO: renamed from: j */
    public static final Handler f68084j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k */
    public static Handler f68085k = null;

    /* JADX INFO: renamed from: l */
    public static final Runnable f68086l = new t7w0();

    /* JADX INFO: renamed from: m */
    public static final Runnable f68087m = new x7w0();

    /* JADX INFO: renamed from: b */
    public int f68089b;

    /* JADX INFO: renamed from: h */
    public long f68095h;

    /* JADX INFO: renamed from: a */
    public final List f68088a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public boolean f68090c = false;

    /* JADX INFO: renamed from: d */
    public final List f68091d = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final q7w0 f68093f = new q7w0();

    /* JADX INFO: renamed from: e */
    public final b7w0 f68092e = new b7w0();

    /* JADX INFO: renamed from: g */
    public final r7w0 f68094g = new r7w0(new d8w0());

    /* JADX INFO: renamed from: d */
    public static a8w0 m95375d() {
        return f68083i;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m95378g(a8w0 a8w0Var) {
        a8w0 a8w0Var2;
        a8w0Var.f68089b = 0;
        a8w0Var.f68091d.clear();
        a8w0Var.f68090c = false;
        for (e6w0 e6w0Var : n6w0.m158096a().m158097b()) {
        }
        a8w0Var.f68095h = System.nanoTime();
        a8w0Var.f68093f.m173309i();
        long jNanoTime = System.nanoTime();
        a7w0 a7w0VarM100700a = a8w0Var.f68092e.m100700a();
        if (a8w0Var.f68093f.m173305e().size() > 0) {
            for (String str : a8w0Var.f68093f.m173305e()) {
                JSONObject jSONObjectMo95305a = a7w0VarM100700a.mo95305a(null);
                View viewM173301a = a8w0Var.f68093f.m173301a(str);
                a7w0 a7w0VarM100701b = a8w0Var.f68092e.m100701b();
                String strM173303c = a8w0Var.f68093f.m173303c(str);
                if (strM173303c != null) {
                    JSONObject jSONObjectMo95305a2 = a7w0VarM100701b.mo95305a(viewM173301a);
                    k7w0.m144705b(jSONObjectMo95305a2, str);
                    try {
                        jSONObjectMo95305a2.put("notVisibleReason", strM173303c);
                    } catch (JSONException e) {
                        l7w0.m148830a("Error with setting not visible reason", e);
                    }
                    k7w0.m144706c(jSONObjectMo95305a, jSONObjectMo95305a2);
                }
                k7w0.m144709f(jSONObjectMo95305a);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                a8w0Var.f68094g.m178214c(jSONObjectMo95305a, hashSet, jNanoTime);
            }
        }
        if (a8w0Var.f68093f.m173306f().size() > 0) {
            JSONObject jSONObjectMo95305a3 = a7w0VarM100700a.mo95305a(null);
            a8w0Var2 = a8w0Var;
            a8w0Var2.m95384k(null, a7w0VarM100700a, jSONObjectMo95305a3, 1, false);
            k7w0.m144709f(jSONObjectMo95305a3);
            a8w0Var2.f68094g.m178215d(jSONObjectMo95305a3, a8w0Var2.f68093f.m173306f(), jNanoTime);
        } else {
            a8w0Var2 = a8w0Var;
            a8w0Var2.f68094g.m178213b();
        }
        a8w0Var2.f68093f.m173307g();
        System.nanoTime();
        if (a8w0Var2.f68088a.size() > 0) {
            for (z7w0 z7w0Var : a8w0Var2.f68088a) {
                z7w0Var.zzb();
                if (z7w0Var instanceof y7w0) {
                    ((y7w0) z7w0Var).zza();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m95379l() {
        Handler handler = f68085k;
        if (handler != null) {
            handler.removeCallbacks(f68087m);
            f68085k = null;
        }
    }

    @Override // p149l.z6w0
    /* JADX INFO: renamed from: a */
    public final void mo95380a(View view, a7w0 a7w0Var, JSONObject jSONObject, boolean z) {
        int iM173311k;
        boolean z2;
        if (o7w0.m163068a(view) != null || (iM173311k = this.f68093f.m173311k(view)) == 3) {
            return;
        }
        JSONObject jSONObjectMo95305a = a7w0Var.mo95305a(view);
        k7w0.m144706c(jSONObject, jSONObjectMo95305a);
        String strM173304d = this.f68093f.m173304d(view);
        if (strM173304d != null) {
            k7w0.m144705b(jSONObjectMo95305a, strM173304d);
            try {
                jSONObjectMo95305a.put("hasWindowFocus", Boolean.valueOf(this.f68093f.m173310j(view)));
            } catch (JSONException e) {
                l7w0.m148830a("Error with setting has window focus", e);
            }
            this.f68093f.m173308h();
            this = this;
        } else {
            p7w0 p7w0VarM173302b = this.f68093f.m173302b(view);
            if (p7w0VarM173302b != null) {
                q6w0 q6w0VarM167778a = p7w0VarM173302b.m167778a();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListM167779b = p7w0VarM173302b.m167779b();
                int size = arrayListM167779b.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) arrayListM167779b.get(i));
                }
                try {
                    jSONObjectMo95305a.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectMo95305a.put("friendlyObstructionClass", q6w0VarM167778a.m173178d());
                    jSONObjectMo95305a.put("friendlyObstructionPurpose", q6w0VarM167778a.m173175a());
                    jSONObjectMo95305a.put("friendlyObstructionReason", q6w0VarM167778a.m173177c());
                } catch (JSONException e2) {
                    l7w0.m148830a("Error with setting friendly obstruction", e2);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            m95384k(view, a7w0Var, jSONObjectMo95305a, iM173311k, z || z2);
        }
        this.f68089b++;
    }

    /* JADX INFO: renamed from: h */
    public final void m95381h() {
        m95379l();
    }

    /* JADX INFO: renamed from: i */
    public final void m95382i() {
        if (f68085k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f68085k = handler;
            handler.post(f68086l);
            f68085k.postDelayed(f68087m, 200L);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m95383j() {
        m95379l();
        this.f68088a.clear();
        f68084j.post(new s7w0(this));
    }

    /* JADX INFO: renamed from: k */
    public final void m95384k(View view, a7w0 a7w0Var, JSONObject jSONObject, int i, boolean z) {
        a7w0Var.mo95306b(view, jSONObject, this, i == 1, z);
    }
}
