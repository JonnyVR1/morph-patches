package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public class u61 extends f2s {

    /* JADX INFO: renamed from: A */
    public TextView f174785A;

    /* JADX INFO: renamed from: B */
    public TextView f174786B;

    /* JADX INFO: renamed from: C */
    public TextView f174787C;

    /* JADX INFO: renamed from: x */
    public View f174788x;

    /* JADX INFO: renamed from: y */
    public View f174789y;

    /* JADX INFO: renamed from: z */
    public TextView f174790z;

    public u61(wxs wxsVar) {
        super(wxsVar, wxsVar.act().inflater().inflate(t6c0.f168375i, (ViewGroup) null));
        m191894p0(m71760R());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m191893q0(View view) {
        m191897t0(true);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m191894p0(View view) {
        v61.m197185a(this, view);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m191895r0(View view) {
        m191897t0(false);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m191896s0(e30 e30Var, View view) {
        e30Var.call(Boolean.valueOf(this.f174785A.isSelected()));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m191897t0(boolean z) {
        this.f174785A.setSelected(z);
        this.f174786B.setSelected(!z);
    }

    /* JADX INFO: renamed from: u0 */
    public void m191898u0(String str, String str2, final e30<Boolean> e30Var) {
        m191897t0(true);
        this.f174785A.setText(str);
        this.f174786B.setText(str2);
        xdl0.m208329E0(this.f174785A, new View.OnClickListener() { // from class: l.r61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157889a.m191893q0(view);
            }
        });
        xdl0.m208329E0(this.f174786B, new View.OnClickListener() { // from class: l.s61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162610a.m191895r0(view);
            }
        });
        show();
        xdl0.m208329E0(this.f174787C, new View.OnClickListener() { // from class: l.t61
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167918a.m191896s0(e30Var, view);
            }
        });
    }
}
