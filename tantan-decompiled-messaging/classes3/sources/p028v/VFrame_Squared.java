package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p003l.ikh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VFrame_Squared extends FrameLayout {
    public VFrame_Squared(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM5155a = ikh0.m5155a(i, i2);
        super.onMeasure(iM5155a, iM5155a);
    }

    public VFrame_Squared(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VFrame_Squared(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
