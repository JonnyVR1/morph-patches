package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public abstract class yw2 implements jl4 {

    /* JADX INFO: renamed from: a */
    public jl4 f200358a;

    @Override // p149l.jl4
    /* JADX INFO: renamed from: a */
    public void mo104259a() {
        jl4 jl4Var = this.f200358a;
        if (jl4Var != null) {
            jl4Var.mo104259a();
        }
    }

    @Override // p149l.jl4
    /* JADX INFO: renamed from: b */
    public String mo104260b() {
        jl4 jl4Var = this.f200358a;
        if (jl4Var != null) {
            return jl4Var.mo104260b();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m216292c(jl4 jl4Var) {
        this.f200358a = jl4Var;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo100897d(View view, int i);

    /* JADX INFO: renamed from: e */
    public abstract View mo100898e(int i, Context context, LayoutInflater layoutInflater);

    /* JADX INFO: renamed from: f */
    public abstract int mo100899f();

    /* JADX INFO: renamed from: g */
    public abstract Object mo100900g(int i);

    /* JADX INFO: renamed from: h */
    public abstract int mo100901h(int i);

    /* JADX INFO: renamed from: i */
    public abstract String mo100902i(int i);

    /* JADX INFO: renamed from: l */
    public abstract void mo100903l(View view, boolean z);

    /* JADX INFO: renamed from: m */
    public abstract void mo100904m(pol0 pol0Var);

    /* JADX INFO: renamed from: j */
    public void mo184171j(View view) {
    }

    /* JADX INFO: renamed from: k */
    public void mo184172k(View view) {
    }
}
