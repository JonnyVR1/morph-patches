package p149l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class q0t0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final String f152083a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r0t0 f152084b;

    public q0t0(r0t0 r0t0Var, String str) {
        this.f152084b = r0t0Var;
        this.f152083a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f152084b) {
            try {
                for (p0t0 p0t0Var : this.f152084b.f157200b) {
                    p0t0Var.f146624a.m177410b(p0t0Var.f146625b, sharedPreferences, this.f152083a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
