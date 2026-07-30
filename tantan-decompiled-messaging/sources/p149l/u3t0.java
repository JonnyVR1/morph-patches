package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.util.C2075b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class u3t0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public final Map f173647a = new HashMap();

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public final List f173648b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Context f173649c;

    public u3t0(Context context) {
        this.f173649c = context;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m191616b(String str) {
        try {
            if (this.f173647a.containsKey(str)) {
                return;
            }
            boolean zEquals = Objects.equals(str, "__default__");
            Context context = this.f173649c;
            SharedPreferences defaultSharedPreferences = zEquals ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str, 0);
            o2t0 o2t0Var = new o2t0(this, str);
            this.f173647a.put(str, o2t0Var);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(o2t0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m191617c() {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132094U9)).booleanValue()) {
            vny0.m199080r();
            Map mapM12302W = C2075b.m12302W((String) d1s0.m109677c().m144697a(m7s0.f132142Y9));
            Iterator it = mapM12302W.keySet().iterator();
            while (it.hasNext()) {
                m191616b((String) it.next());
            }
            m191618d(new f1t0(mapM12302W));
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m191618d(f1t0 f1t0Var) {
        this.f173648b.add(f1t0Var);
    }
}
