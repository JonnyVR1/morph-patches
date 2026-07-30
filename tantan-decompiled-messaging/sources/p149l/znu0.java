package p149l;

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
public class znu0 {

    /* JADX INFO: renamed from: c */
    public final Context f204013c;

    /* JADX INFO: renamed from: d */
    public final Executor f204014d;

    /* JADX INFO: renamed from: e */
    public final b3t0 f204015e;

    /* JADX INFO: renamed from: g */
    public final d4w0 f204017g;

    /* JADX INFO: renamed from: a */
    public final String f204011a = (String) m9s0.f132798b.m115379e();

    /* JADX INFO: renamed from: b */
    public final Map f204012b = new HashMap();

    /* JADX INFO: renamed from: j */
    public final AtomicBoolean f204020j = new AtomicBoolean();

    /* JADX INFO: renamed from: k */
    public final AtomicReference f204021k = new AtomicReference(new Bundle());

    /* JADX INFO: renamed from: f */
    public final boolean f204016f = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132122X1)).booleanValue();

    /* JADX INFO: renamed from: h */
    public final boolean f204018h = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132159a2)).booleanValue();

    /* JADX INFO: renamed from: i */
    public final boolean f204019i = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132177b7)).booleanValue();

    public znu0(Executor executor, b3t0 b3t0Var, d4w0 d4w0Var, Context context) {
        this.f204014d = executor;
        this.f204015e = b3t0Var;
        this.f204017g = d4w0Var;
        this.f204013c = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m219488a(Map map, boolean z) {
        if (map.isEmpty()) {
            x2t0.m206864b("Empty paramMap.");
            return;
        }
        if (map.isEmpty()) {
            x2t0.m206864b("Empty or null paramMap.");
        } else {
            if (!this.f204020j.getAndSet(true)) {
                final String str = (String) d1s0.m109677c().m144697a(m7s0.f132154Z9);
                this.f204021k.set(s5r0.m182371a(this.f204013c, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: l.ynu0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        this.f199221a.m219491d(str, sharedPreferences, str2);
                    }
                }));
            }
            Bundle bundle = (Bundle) this.f204021k.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
        }
        final String strM109998a = this.f204017g.m109998a(map);
        xsu0.m210834k(strM109998a);
        boolean z2 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f204016f) {
            if (!z || this.f204018h) {
                if (!z2 || this.f204019i) {
                    this.f204014d.execute(new Runnable() { // from class: l.xnu0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f193758a.f204015e.zza(strM109998a);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m219489b(Map map) {
        return this.f204017g.m109998a(map);
    }

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap m219490c() {
        return new ConcurrentHashMap(this.f204012b);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m219491d(String str, SharedPreferences sharedPreferences, String str2) {
        this.f204021k.set(s5r0.m182372b(this.f204013c, str));
    }

    /* JADX INFO: renamed from: e */
    public final void m219492e(Map map) {
        m219488a(map, true);
    }

    /* JADX INFO: renamed from: f */
    public final void m219493f(Map map) {
        m219488a(map, false);
    }
}
