package p153l;

import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public abstract class mic0<T> extends jic0<T> {

    /* JADX INFO: renamed from: c */
    public y20<T> f136946c;

    public mic0(y20<T> y20Var) {
        this.f136946c = y20Var;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: A */
    public void mo29822A(View view, final T t, int i, int i2) {
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.lic0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f132208a.m158486F(t, view2);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m158486F(Object obj, View view) {
        y20<T> y20Var = this.f136946c;
        if (y20Var != null) {
            y20Var.call(obj);
        }
    }
}
