package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import l.j760;
import l.vwb;
import l.xdl0;
import p003l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VConstraintTextView extends VText {

    /* JADX INFO: renamed from: i */
    public e30<j760<xdl0.g, xdl0.g>> f12695i;

    /* JADX INFO: renamed from: j */
    public View f12696j;

    /* JADX INFO: renamed from: k */
    public xdl0.g f12697k;

    /* JADX INFO: renamed from: l */
    public ViewGroup f12698l;

    public VConstraintTextView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public void m11477l(View view, e30<j760<xdl0.g, xdl0.g>> e30Var) {
        this.f12698l = (ViewGroup) getParent();
        this.f12695i = e30Var;
        this.f12696j = view;
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return;
        }
        xdl0.g gVarJ0 = xdl0.j0(view, this.f12698l);
        this.f12697k = gVarJ0;
        e30Var.call(vwb.Y(gVarJ0, xdl0.j0(this, this.f12698l)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f12696j;
        if (view == null) {
            return;
        }
        if (this.f12697k == null) {
            xdl0.g gVarJ0 = xdl0.j0(view, this);
            this.f12697k = gVarJ0;
            this.f12695i.call(vwb.Y(gVarJ0, xdl0.j0(this, (View) getParent())));
        } else {
            xdl0.g gVarJ1 = xdl0.j0(view, this);
            if (gVarJ1.equals(this.f12697k)) {
                return;
            }
            this.f12697k = gVarJ1;
            this.f12695i.call(vwb.Y(gVarJ1, xdl0.j0(this, (View) getParent())));
        }
    }

    public VConstraintTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VConstraintTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
