package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p149l.fih0;

/* JADX INFO: loaded from: classes3.dex */
public class VRelative_ColorFilter extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public fih0 f209326a;

    public VRelative_ColorFilter(Context context) {
        super(context);
        m223190a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m223190a(Context context, AttributeSet attributeSet, int i) {
        fih0 fih0Var = new fih0(this);
        this.f209326a = fih0Var;
        fih0Var.m121515g(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void childDrawableStateChanged(View view) {
        super.childDrawableStateChanged(view);
        this.f209326a.m126290b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f209326a.m126291c();
    }

    public VRelative_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223190a(context, attributeSet, 0);
    }
}
