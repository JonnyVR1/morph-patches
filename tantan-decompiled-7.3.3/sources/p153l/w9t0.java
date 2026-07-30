package p153l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class w9t0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final String f188063a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x9t0 f188064b;

    public w9t0(x9t0 x9t0Var, String str) {
        this.f188064b = x9t0Var;
        this.f188063a = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f188064b) {
            try {
                for (v9t0 v9t0Var : this.f188064b.f192962b) {
                    v9t0Var.f183042a.m209810b(v9t0Var.f183043b, sharedPreferences, this.f188063a, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
