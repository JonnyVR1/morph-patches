package p153l;

import android.graphics.PointF;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class rof0 implements xde0 {

    /* JADX INFO: renamed from: a */
    public PointF f164191a;

    /* JADX INFO: renamed from: b */
    public xde0 f164192b;

    /* JADX INFO: renamed from: c */
    public boolean f164193c = true;

    @Override // p153l.xde0
    /* JADX INFO: renamed from: a */
    public boolean mo182408a(View view) {
        xde0 xde0Var = this.f164192b;
        return xde0Var != null ? xde0Var.mo182408a(view) : rsf0.m182957a(view, this.f164191a, this.f164193c);
    }

    @Override // p153l.xde0
    /* JADX INFO: renamed from: b */
    public boolean mo182409b(View view) {
        xde0 xde0Var = this.f164192b;
        return xde0Var != null ? xde0Var.mo182409b(view) : rsf0.m182958b(view, this.f164191a);
    }
}
