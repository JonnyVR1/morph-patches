package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VLinear_MaxWidth extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int f12767a;

    public VLinear_MaxWidth(Context context) {
        super(context);
        this.f12767a = 1000000;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f12767a), View.MeasureSpec.getMode(i)), i2);
    }

    public void setMaxWidth(int i) {
        this.f12767a = i;
    }

    public VLinear_MaxWidth(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12767a = 1000000;
    }

    public VLinear_MaxWidth(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12767a = 1000000;
    }
}
