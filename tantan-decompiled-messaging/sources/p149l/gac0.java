package p149l;

import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public abstract class gac0<T> extends dac0<T> {

    /* JADX INFO: renamed from: c */
    public e30<T> f101661c;

    public gac0(e30<T> e30Var) {
        this.f101661c = e30Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: A */
    public void mo28823A(View view, final T t, int i, int i2) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.fac0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f96591a.m124939F(t, view2);
            }
        });
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m124939F(Object obj, View view) {
        e30<T> e30Var = this.f101661c;
        if (e30Var != null) {
            e30Var.call(obj);
        }
    }
}
