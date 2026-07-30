package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class yw2 implements jl4 {

    /* JADX INFO: renamed from: a */
    public jl4 f23254a;

    @Override // p009l.jl4
    /* JADX INFO: renamed from: a */
    public void mo12312a() {
        jl4 jl4Var = this.f23254a;
        if (jl4Var != null) {
            jl4Var.mo12312a();
        }
    }

    @Override // p009l.jl4
    /* JADX INFO: renamed from: b */
    public String mo12313b() {
        jl4 jl4Var = this.f23254a;
        if (jl4Var != null) {
            return jl4Var.mo12313b();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m25533c(jl4 jl4Var) {
        this.f23254a = jl4Var;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo11922d(View view, int i);

    /* JADX INFO: renamed from: e */
    public abstract View mo11923e(int i, Context context, LayoutInflater layoutInflater);

    /* JADX INFO: renamed from: f */
    public abstract int mo11924f();

    /* JADX INFO: renamed from: g */
    public abstract Object mo11925g(int i);

    /* JADX INFO: renamed from: h */
    public abstract int mo11926h(int i);

    /* JADX INFO: renamed from: i */
    public abstract String mo11927i(int i);

    /* JADX INFO: renamed from: l */
    public abstract void mo11928l(View view, boolean z);

    /* JADX INFO: renamed from: m */
    public abstract void mo11929m(pol0 pol0Var);

    /* JADX INFO: renamed from: j */
    public void mo22190j(View view) {
    }

    /* JADX INFO: renamed from: k */
    public void mo22191k(View view) {
    }
}
