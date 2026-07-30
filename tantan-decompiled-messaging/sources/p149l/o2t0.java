package p149l;

import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class o2t0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final String f141554a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u3t0 f141555b;

    public o2t0(u3t0 u3t0Var, String str) {
        this.f141555b = u3t0Var;
        this.f141554a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f141555b) {
            try {
                for (f1t0 f1t0Var : this.f141555b.f173648b) {
                    String str2 = this.f141554a;
                    Map map = f1t0Var.f94114a;
                    if (map.containsKey(str2) && ((Set) map.get(str2)).contains(str)) {
                        vny0.m199079q().m212279i().mo96951j(false);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
