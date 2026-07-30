package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p149l.e30;
import p149l.j760;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class VConstraintTextView extends VText {

    /* JADX INFO: renamed from: i */
    public e30<j760<xdl0.C21104g, xdl0.C21104g>> f209070i;

    /* JADX INFO: renamed from: j */
    public View f209071j;

    /* JADX INFO: renamed from: k */
    public xdl0.C21104g f209072k;

    /* JADX INFO: renamed from: l */
    public ViewGroup f209073l;

    public VConstraintTextView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l */
    public void m223004l(View view, e30<j760<xdl0.C21104g, xdl0.C21104g>> e30Var) {
        this.f209073l = (ViewGroup) getParent();
        this.f209070i = e30Var;
        this.f209071j = view;
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return;
        }
        xdl0.C21104g c21104gM208382j0 = xdl0.m208382j0(view, this.f209073l);
        this.f209072k = c21104gM208382j0;
        e30Var.call(vwb.m200311Y(c21104gM208382j0, xdl0.m208382j0(this, this.f209073l)));
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f209071j;
        if (view == null) {
            return;
        }
        if (this.f209072k == null) {
            xdl0.C21104g c21104gM208382j0 = xdl0.m208382j0(view, this);
            this.f209072k = c21104gM208382j0;
            this.f209070i.call(vwb.m200311Y(c21104gM208382j0, xdl0.m208382j0(this, (View) getParent())));
        } else {
            xdl0.C21104g c21104gM208382j1 = xdl0.m208382j0(view, this);
            if (c21104gM208382j1.equals(this.f209072k)) {
                return;
            }
            this.f209072k = c21104gM208382j1;
            this.f209070i.call(vwb.m200311Y(c21104gM208382j1, xdl0.m208382j0(this, (View) getParent())));
        }
    }

    public VConstraintTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VConstraintTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
