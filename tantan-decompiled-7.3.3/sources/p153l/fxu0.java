package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class fxu0 {

    /* JADX INFO: renamed from: c */
    public final Context f101306c;

    /* JADX INFO: renamed from: d */
    public final Executor f101307d;

    /* JADX INFO: renamed from: e */
    public final hct0 f101308e;

    /* JADX INFO: renamed from: g */
    public final jdw0 f101310g;

    /* JADX INFO: renamed from: a */
    public final String f101304a = (String) sis0.f168866b.m149974e();

    /* JADX INFO: renamed from: b */
    public final Map f101305b = new HashMap();

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f101313j = new AtomicBoolean();

    /* JADX INFO: renamed from: k */
    public final AtomicReference f101314k = new AtomicReference(new Bundle());

    /* JADX INFO: renamed from: f */
    public final boolean f101309f = ((Boolean) jas0.m144075c().m176505a(sgs0.f168193X1)).booleanValue();

    /* JADX INFO: renamed from: h */
    public final boolean f101311h = ((Boolean) jas0.m144075c().m176505a(sgs0.f168230a2)).booleanValue();

    /* JADX INFO: renamed from: i */
    public final boolean f101312i = ((Boolean) jas0.m144075c().m176505a(sgs0.f168248b7)).booleanValue();

    public fxu0(Executor executor, hct0 hct0Var, jdw0 jdw0Var, Context context) {
        this.f101307d = executor;
        this.f101308e = hct0Var;
        this.f101310g = jdw0Var;
        this.f101306c = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m128023a(Map map, boolean z) {
        if (map.isEmpty()) {
            dct0.m115293b("Empty paramMap.");
            return;
        }
        if (map.isEmpty()) {
            dct0.m115293b("Empty or null paramMap.");
        } else {
            if (!this.f101313j.getAndSet(true)) {
                final String str = (String) jas0.m144075c().m176505a(sgs0.f168225Z9);
                this.f101314k.set(yer0.m215442a(this.f101306c, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: l.exu0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        this.f96343a.m128026d(str, sharedPreferences, str2);
                    }
                }));
            }
            Bundle bundle = (Bundle) this.f101314k.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
        }
        final String strM144502a = this.f101310g.m144502a(map);
        d2v0.m113737k(strM144502a);
        boolean z2 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f101309f) {
            if (!z || this.f101311h) {
                if (!z2 || this.f101312i) {
                    this.f101307d.execute(new Runnable() { // from class: l.dxu0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f91113a.f101308e.zza(strM144502a);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m128024b(Map map) {
        return this.f101310g.m144502a(map);
    }

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap m128025c() {
        return new ConcurrentHashMap(this.f101305b);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m128026d(String str, SharedPreferences sharedPreferences, String str2) {
        this.f101314k.set(yer0.m215443b(this.f101306c, str));
    }

    /* JADX INFO: renamed from: e */
    public final void m128027e(Map map) {
        m128023a(map, true);
    }

    /* JADX INFO: renamed from: f */
    public final void m128028f(Map map) {
        m128023a(map, false);
    }
}
