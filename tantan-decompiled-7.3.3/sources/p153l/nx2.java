package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public abstract class nx2 implements im4 {

    /* JADX INFO: renamed from: a */
    public im4 f144062a;

    @Override // p153l.im4
    /* JADX INFO: renamed from: a */
    public void mo140726a() {
        im4 im4Var = this.f144062a;
        if (im4Var != null) {
            im4Var.mo140726a();
        }
    }

    @Override // p153l.im4
    /* JADX INFO: renamed from: b */
    public String mo140727b() {
        im4 im4Var = this.f144062a;
        if (im4Var != null) {
            return im4Var.mo140727b();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m165054c(im4 im4Var) {
        this.f144062a = im4Var;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo105829d(View view, int i);

    /* JADX INFO: renamed from: e */
    public abstract View mo105830e(int i, Context context, LayoutInflater layoutInflater);

    /* JADX INFO: renamed from: f */
    public abstract int mo105831f();

    /* JADX INFO: renamed from: g */
    public abstract Object mo105832g(int i);

    /* JADX INFO: renamed from: h */
    public abstract int mo105833h(int i);

    /* JADX INFO: renamed from: i */
    public abstract String mo105834i(int i);

    /* JADX INFO: renamed from: l */
    public abstract void mo105835l(View view, boolean z);

    /* JADX INFO: renamed from: m */
    public abstract void mo105836m(txl0 txl0Var);

    /* JADX INFO: renamed from: j */
    public void mo165055j(View view) {
    }

    /* JADX INFO: renamed from: k */
    public void mo165056k(View view) {
    }
}
