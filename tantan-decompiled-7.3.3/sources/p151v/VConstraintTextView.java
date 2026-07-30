package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p153l.bnl0;
import p153l.jyb;
import p153l.pf60;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class VConstraintTextView extends VText {

    /* JADX INFO: renamed from: i */
    public y20<pf60<bnl0.C16067g, bnl0.C16067g>> f209992i;

    /* JADX INFO: renamed from: j */
    public View f209993j;

    /* JADX INFO: renamed from: k */
    public bnl0.C16067g f209994k;

    /* JADX INFO: renamed from: l */
    public ViewGroup f209995l;

    public VConstraintTextView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l */
    public void m224250l(View view, y20<pf60<bnl0.C16067g, bnl0.C16067g>> y20Var) {
        this.f209995l = (ViewGroup) getParent();
        this.f209992i = y20Var;
        this.f209993j = view;
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return;
        }
        bnl0.C16067g c16067gM105562j0 = bnl0.m105562j0(view, this.f209995l);
        this.f209994k = c16067gM105562j0;
        y20Var.call(jyb.m147494Y(c16067gM105562j0, bnl0.m105562j0(this, this.f209995l)));
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f209993j;
        if (view == null) {
            return;
        }
        if (this.f209994k == null) {
            bnl0.C16067g c16067gM105562j0 = bnl0.m105562j0(view, this);
            this.f209994k = c16067gM105562j0;
            this.f209992i.call(jyb.m147494Y(c16067gM105562j0, bnl0.m105562j0(this, (View) getParent())));
        } else {
            bnl0.C16067g c16067gM105562j1 = bnl0.m105562j0(view, this);
            if (c16067gM105562j1.equals(this.f209994k)) {
                return;
            }
            this.f209994k = c16067gM105562j1;
            this.f209992i.call(jyb.m147494Y(c16067gM105562j1, bnl0.m105562j0(this, (View) getParent())));
        }
    }

    public VConstraintTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VConstraintTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
