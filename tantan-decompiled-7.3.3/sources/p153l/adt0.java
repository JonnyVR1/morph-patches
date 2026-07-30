package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.util.C2098b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class adt0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public final Map f70728a = new HashMap();

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public final List f70729b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Context f70730c;

    public adt0(Context context) {
        this.f70730c = context;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m97139b(String str) {
        try {
            if (this.f70728a.containsKey(str)) {
                return;
            }
            boolean zEquals = Objects.equals(str, "__default__");
            Context context = this.f70730c;
            SharedPreferences defaultSharedPreferences = zEquals ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str, 0);
            ubt0 ubt0Var = new ubt0(this, str);
            this.f70728a.put(str, ubt0Var);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(ubt0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m97140c() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168165U9)).booleanValue()) {
            bxy0.m106934r();
            Map mapM12356W = C2098b.m12356W((String) jas0.m144075c().m176505a(sgs0.f168213Y9));
            Iterator it = mapM12356W.keySet().iterator();
            while (it.hasNext()) {
                m97139b((String) it.next());
            }
            m97141d(new lat0(mapM12356W));
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m97141d(lat0 lat0Var) {
        this.f70729b.add(lat0Var);
    }
}
