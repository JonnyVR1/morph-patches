package p147v;

import android.content.Context;
import android.util.AttributeSet;
import p149l.fih0;

/* JADX INFO: loaded from: classes3.dex */
public class VButton_ColorFilter extends VButton {

    /* JADX INFO: renamed from: c */
    public fih0 f209046c;

    public VButton_ColorFilter(Context context) {
        super(context);
        m222996c(context, null, 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m222996c(Context context, AttributeSet attributeSet, int i) {
        fih0 fih0Var = new fih0(this);
        this.f209046c = fih0Var;
        fih0Var.m121515g(context, attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f209046c.m126291c();
    }

    public VButton_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m222996c(context, attributeSet, 0);
    }

    public VButton_ColorFilter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m222996c(context, attributeSet, i);
    }
}
