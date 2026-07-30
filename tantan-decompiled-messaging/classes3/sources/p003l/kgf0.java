package p003l;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class kgf0 implements s5e0 {

    /* JADX INFO: renamed from: a */
    public PointF f4925a;

    /* JADX INFO: renamed from: b */
    public s5e0 f4926b;

    /* JADX INFO: renamed from: c */
    public boolean f4927c = true;

    @Override // p003l.s5e0
    /* JADX INFO: renamed from: a */
    public boolean mo5652a(View view) {
        s5e0 s5e0Var = this.f4926b;
        return s5e0Var != null ? s5e0Var.mo5652a(view) : ikf0.m5144a(view, this.f4925a, this.f4927c);
    }

    @Override // p003l.s5e0
    /* JADX INFO: renamed from: b */
    public boolean mo5653b(View view) {
        s5e0 s5e0Var = this.f4926b;
        return s5e0Var != null ? s5e0Var.mo5653b(view) : ikf0.m5145b(view, this.f4925a);
    }
}
