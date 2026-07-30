package p147v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import p149l.fih0;

/* JADX INFO: loaded from: classes3.dex */
public class VImage_ColorFilter extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    public fih0 f209128c;

    public VImage_ColorFilter(Context context) {
        super(context);
        m223061d(context, null, 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m223061d(Context context, AttributeSet attributeSet, int i) {
        fih0 fih0Var = new fih0(this);
        this.f209128c = fih0Var;
        fih0Var.m121515g(context, attributeSet, i);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f209128c.m126291c();
    }

    public VImage_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223061d(context, attributeSet, 0);
    }

    public VImage_ColorFilter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223061d(context, attributeSet, i);
    }
}
