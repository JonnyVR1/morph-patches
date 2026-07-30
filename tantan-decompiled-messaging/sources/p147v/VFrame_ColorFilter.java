package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p149l.fih0;

/* JADX INFO: loaded from: classes3.dex */
public class VFrame_ColorFilter extends VFrame {

    /* JADX INFO: renamed from: a */
    public fih0 f209093a;

    public VFrame_ColorFilter(Context context) {
        super(context);
        m223028p(context, null, 0);
    }

    /* JADX INFO: renamed from: p */
    private void m223028p(Context context, AttributeSet attributeSet, int i) {
        fih0 fih0Var = new fih0(this);
        this.f209093a = fih0Var;
        fih0Var.m121515g(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void childDrawableStateChanged(View view) {
        super.childDrawableStateChanged(view);
        this.f209093a.m126290b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f209093a.m126291c();
    }

    public VFrame_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223028p(context, attributeSet, 0);
    }
}
