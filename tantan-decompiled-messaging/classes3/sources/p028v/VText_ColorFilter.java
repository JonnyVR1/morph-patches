package p028v;

import android.content.Context;
import android.util.AttributeSet;
import p003l.fih0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VText_ColorFilter extends VText {

    /* JADX INFO: renamed from: i */
    public fih0 f13067i;

    public VText_ColorFilter(Context context) {
        super(context);
        m11755h(context, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    private void m11755h(Context context, AttributeSet attributeSet, int i) {
        fih0 fih0Var = new fih0(this);
        this.f13067i = fih0Var;
        fih0Var.m4380g(context, attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        fih0 fih0Var = this.f13067i;
        if (fih0Var != null) {
            fih0Var.m4551c();
        }
    }

    public VText_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11755h(context, attributeSet, 0);
    }

    public VText_ColorFilter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11755h(context, attributeSet, i);
    }
}
