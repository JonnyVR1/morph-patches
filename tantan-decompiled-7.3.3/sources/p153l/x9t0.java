package p153l;

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
public final class x9t0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public final Map f192961a = new HashMap();

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public final List f192962b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Context f192963c;

    /* JADX INFO: renamed from: d */
    public final b9t0 f192964d;

    public x9t0(Context context, b9t0 b9t0Var) {
        this.f192963c = context;
        this.f192964d = b9t0Var;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m209810b(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.f192964d.m103139d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m209811c(String str) {
        try {
            if (this.f192961a.containsKey(str)) {
                return;
            }
            boolean zEquals = Objects.equals(str, "__default__");
            Context context = this.f192963c;
            SharedPreferences defaultSharedPreferences = zEquals ? PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences(str, 0);
            w9t0 w9t0Var = new w9t0(this, str);
            this.f192961a.put(str, w9t0Var);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(w9t0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m209812d(v9t0 v9t0Var) {
        this.f192962b.add(v9t0Var);
    }
}
