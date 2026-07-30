package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class r0t0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public final Map f157199a = new HashMap();

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public final List f157200b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Context f157201c;

    /* JADX INFO: renamed from: d */
    public final vzs0 f157202d;

    public r0t0(Context context, vzs0 vzs0Var) {
        this.f157201c = context;
        this.f157202d = vzs0Var;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m177410b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f157202d.m200783d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m177411c(String str) {
        try {
            if (this.f157199a.containsKey(str)) {
                return;
            }
            boolean zEquals = Objects.equals(str, "__default__");
            Context context = this.f157201c;
            SharedPreferences defaultSharedPreferences = zEquals ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str, 0);
            q0t0 q0t0Var = new q0t0(this, str);
            this.f157199a.put(str, q0t0Var);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(q0t0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m177412d(p0t0 p0t0Var) {
        this.f157200b.add(p0t0Var);
    }
}
