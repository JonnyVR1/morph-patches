package p147v;

import android.content.Context;
import android.util.AttributeSet;
import p149l.fih0;

/* JADX INFO: loaded from: classes3.dex */
public class VText_ColorFilter extends VText {

    /* JADX INFO: renamed from: i */
    public fih0 f209442i;

    public VText_ColorFilter(Context context) {
        super(context);
        m223269h(context, null, 0);
    }

    /* JADX INFO: renamed from: h */
    private void m223269h(Context context, AttributeSet attributeSet, int i) {
        fih0 fih0Var = new fih0(this);
        this.f209442i = fih0Var;
        fih0Var.m121515g(context, attributeSet, i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        fih0 fih0Var = this.f209442i;
        if (fih0Var != null) {
            fih0Var.m126291c();
        }
    }

    public VText_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223269h(context, attributeSet, 0);
    }

    public VText_ColorFilter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223269h(context, attributeSet, i);
    }
}
