package p151v;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p153l.psh0;

/* JADX INFO: loaded from: classes3.dex */
public class VFrame_Squared extends FrameLayout {
    public VFrame_Squared(Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM173642a = psh0.m173642a(i, i2);
        super.onMeasure(iM173642a, iM173642a);
    }

    public VFrame_Squared(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VFrame_Squared(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
