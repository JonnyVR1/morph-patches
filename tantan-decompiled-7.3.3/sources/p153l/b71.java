package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public class b71 extends g4s {

    /* JADX INFO: renamed from: A */
    public TextView f75242A;

    /* JADX INFO: renamed from: B */
    public TextView f75243B;

    /* JADX INFO: renamed from: C */
    public TextView f75244C;

    /* JADX INFO: renamed from: x */
    public View f75245x;

    /* JADX INFO: renamed from: y */
    public View f75246y;

    /* JADX INFO: renamed from: z */
    public TextView f75247z;

    public b71(xzs xzsVar) {
        super(xzsVar, xzsVar.act().inflater().inflate(yec0.f199107i, (ViewGroup) null));
        m102811p0(m72943R());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m102810q0(View view) {
        m102814t0(true);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m102811p0(View view) {
        c71.m108262a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m102812r0(View view) {
        m102814t0(false);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m102813s0(y20 y20Var, View view) {
        y20Var.call(Boolean.valueOf(this.f75242A.isSelected()));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m102814t0(boolean z) {
        this.f75242A.setSelected(z);
        this.f75243B.setSelected(!z);
    }

    /* JADX INFO: renamed from: u0 */
    public void m102815u0(String str, String str2, final y20<Boolean> y20Var) {
        m102814t0(true);
        this.f75242A.setText(str);
        this.f75243B.setText(str2);
        bnl0.m105509E0(this.f75242A, new View.OnClickListener() { // from class: l.y61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197618a.m102810q0(view);
            }
        });
        bnl0.m105509E0(this.f75243B, new View.OnClickListener() { // from class: l.z61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203099a.m102812r0(view);
            }
        });
        show();
        bnl0.m105509E0(this.f75244C, new View.OnClickListener() { // from class: l.a71
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68782a.m102813s0(y20Var, view);
            }
        });
    }
}
