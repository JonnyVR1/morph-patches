package p153l;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class yhn0 extends d3q<FrameLayout> {

    /* JADX INFO: renamed from: a */
    public xhn0 f199979a;

    public yhn0(xhn0 xhn0Var) {
        this.f199979a = xhn0Var;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(FrameLayout frameLayout) {
        super.mo71749u(frameLayout);
        VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(mdc0.f135955I);
        TextView textView = (TextView) frameLayout.findViewById(mdc0.f136007N6);
        View viewFindViewById = frameLayout.findViewById(mdc0.f135973K);
        View viewFindViewById2 = frameLayout.findViewById(mdc0.f135964J);
        xhn0 xhn0Var = this.f199979a;
        if (xhn0Var != null) {
            boolean zM211073b = xhn0Var.m211073b();
            textView.setText(this.f199979a.m211072a().name);
            izs.m142868s("context_livingAct", vDraweeView, this.f199979a.m211072a().icon);
            textView.setTextColor(n3d0.m161277a(zM211073b ? n9c0.f140855p0 : n9c0.f140847m1));
            bnl0.m105524M(viewFindViewById, zM211073b);
            bnl0.m105524M(viewFindViewById2, zM211073b);
        }
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198966Wa;
    }
}
