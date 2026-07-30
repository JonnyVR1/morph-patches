package p149l;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class u8n0 extends d1q<FrameLayout> {

    /* JADX INFO: renamed from: a */
    public t8n0 f175146a;

    public u8n0(t8n0 t8n0Var) {
        this.f175146a = t8n0Var;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo70566u(FrameLayout frameLayout) {
        super.mo70566u(frameLayout);
        VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(g5c0.f100710I);
        TextView textView = (TextView) frameLayout.findViewById(g5c0.f100762N6);
        View viewFindViewById = frameLayout.findViewById(g5c0.f100728K);
        View viewFindViewById2 = frameLayout.findViewById(g5c0.f100719J);
        t8n0 t8n0Var = this.f175146a;
        if (t8n0Var != null) {
            boolean zM187558b = t8n0Var.m187558b();
            textView.setText(this.f175146a.m187557a().name);
            hxs.m133406s("context_livingAct", vDraweeView, this.f175146a.m187557a().icon);
            textView.setTextColor(kvc0.m147352a(zM187558b ? h1c0.f105394p0 : h1c0.f105386m1));
            xdl0.m208344M(viewFindViewById, zM187558b);
            xdl0.m208344M(viewFindViewById2, zM187558b);
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168234Wa;
    }
}
