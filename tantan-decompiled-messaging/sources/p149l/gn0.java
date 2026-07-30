package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes5.dex */
public class gn0 extends LiveMenuDialogHolder<an0> {

    /* JADX INFO: renamed from: k */
    public View f103562k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f103563l;

    /* JADX INFO: renamed from: m */
    public VImage f103564m;

    /* JADX INFO: renamed from: n */
    public TextView f103565n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f103566o;

    /* JADX INFO: renamed from: p */
    public TextView f103567p;

    public gn0(an0 an0Var) {
        super(t6c0.f168526t7, an0Var.act(), an0Var);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m127090G(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m127093L(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m127094M(View view) {
        ((an0) this.f47757b).m97700V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m127095N(View view) {
        ((an0) this.f47757b).m129317w3(ddv.f85630B, t100.m186890d(560.0f), 7005, 24);
    }

    /* JADX INFO: renamed from: J */
    public final void m127096J(View view) {
        hn0.m131809a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public View m127097K(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hn0.m131810b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m127097K(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m71831A(80);
        m127096J(view);
        xdl0.m208329E0(this.f103562k, new View.OnClickListener() { // from class: l.cn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f81635a.m127093L(view2);
            }
        });
        xdl0.m208329E0(this.f103563l, new View.OnClickListener() { // from class: l.dn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                gn0.m127090G(view2);
            }
        });
        xdl0.m208329E0(this.f103567p, new View.OnClickListener() { // from class: l.en0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f92272a.m127094M(view2);
            }
        });
        xdl0.m208329E0(this.f103564m, new View.OnClickListener() { // from class: l.fn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f98395a.m127095N(view2);
            }
        });
        hxs.m133408u("context_livingAct", this.f103566o, ydt.f197636z, t100.m186890d(375.0f), t100.m186890d(81.0f));
        this.f103565n.setText(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? R$string.f47487r0 : R$string.f47465q0);
    }
}
