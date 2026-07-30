package p153l;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ubt0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final String f178355a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ adt0 f178356b;

    public ubt0(adt0 adt0Var, String str) {
        this.f178356b = adt0Var;
        this.f178355a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f178356b) {
            try {
                for (lat0 lat0Var : this.f178356b.f70729b) {
                    String str2 = this.f178355a;
                    Map map = lat0Var.f130734a;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        bxy0.m106933q().m120264i().mo131900j(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
