package p028v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import p003l.fih0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VImage_ColorFilter extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    public fih0 f12753c;

    public VImage_ColorFilter(Context context) {
        super(context);
        m11541d(context, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final void m11541d(Context context, AttributeSet attributeSet, int i) {
        fih0 fih0Var = new fih0(this);
        this.f12753c = fih0Var;
        fih0Var.m4380g(context, attributeSet, i);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f12753c.m4551c();
    }

    public VImage_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11541d(context, attributeSet, 0);
    }

    public VImage_ColorFilter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11541d(context, attributeSet, i);
    }
}
