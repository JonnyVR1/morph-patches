package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes5.dex */
public class cn0 extends LiveMenuDialogHolder<wm0> {

    /* JADX INFO: renamed from: k */
    public View f82671k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f82672l;

    /* JADX INFO: renamed from: m */
    public VImage f82673m;

    /* JADX INFO: renamed from: n */
    public TextView f82674n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f82675o;

    /* JADX INFO: renamed from: p */
    public TextView f82676p;

    public cn0(wm0 wm0Var) {
        super(yec0.f199258t7, wm0Var.act(), wm0Var);
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m111340G(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m111343L(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m111344M(View view) {
        ((wm0) this.f48605b).m207084V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m111345N(View view) {
        ((wm0) this.f48605b).m138876w3(efv.f93823B, qa00.m175859d(560.0f), 7005, 24);
    }

    /* JADX INFO: renamed from: J */
    public final void m111346J(View view) {
        dn0.m117039a(this, view);
    }

    /* JADX INFO: renamed from: K */
    public View m111347K(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dn0.m117040b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m111347K(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m73014A(80);
        m111346J(view);
        bnl0.m105509E0(this.f82671k, new View.OnClickListener() { // from class: l.ym0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f200606a.m111343L(view2);
            }
        });
        bnl0.m105509E0(this.f82672l, new View.OnClickListener() { // from class: l.zm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cn0.m111340G(view2);
            }
        });
        bnl0.m105509E0(this.f82676p, new View.OnClickListener() { // from class: l.an0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f72300a.m111344M(view2);
            }
        });
        bnl0.m105509E0(this.f82673m, new View.OnClickListener() { // from class: l.bn0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f77427a.m111345N(view2);
            }
        });
        izs.m142870u("context_livingAct", this.f82675o, zft.f204231z, qa00.m175859d(375.0f), qa00.m175859d(81.0f));
        this.f82674n.setText(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? R$string.f48335r0 : R$string.f48313q0);
    }
}
