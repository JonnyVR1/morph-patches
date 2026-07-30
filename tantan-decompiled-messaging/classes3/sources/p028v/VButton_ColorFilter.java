package p028v;

import android.content.Context;
import android.util.AttributeSet;
import p003l.fih0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VButton_ColorFilter extends VButton {

    /* JADX INFO: renamed from: c */
    public fih0 f12671c;

    public VButton_ColorFilter(Context context) {
        super(context);
        m11469c(context, null, 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m11469c(Context context, AttributeSet attributeSet, int i) {
        fih0 fih0Var = new fih0(this);
        this.f12671c = fih0Var;
        fih0Var.m4380g(context, attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f12671c.m4551c();
    }

    public VButton_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11469c(context, attributeSet, 0);
    }

    public VButton_ColorFilter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11469c(context, attributeSet, i);
    }
}
