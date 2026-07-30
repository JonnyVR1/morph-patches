package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VFrame_MaxWidth extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f12740a;

    public VFrame_MaxWidth(Context context) {
        super(context);
        this.f12740a = 1000000;
    }

    public int getMaxWidth() {
        return this.f12740a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f12740a), View.MeasureSpec.getMode(i)), i2);
    }

    public void setMaxWidth(int i) {
        this.f12740a = i;
    }

    public VFrame_MaxWidth(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12740a = 1000000;
    }

    public VFrame_MaxWidth(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12740a = 1000000;
    }
}
