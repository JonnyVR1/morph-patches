package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p149l.ikh0;

/* JADX INFO: loaded from: classes3.dex */
public class VFrame_Squared extends FrameLayout {
    public VFrame_Squared(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM136799a = ikh0.m136799a(i, i2);
        super.onMeasure(iM136799a, iM136799a);
    }

    public VFrame_Squared(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VFrame_Squared(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
