package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import p149l.ikh0;

/* JADX INFO: loaded from: classes3.dex */
public class VRelative_Squared extends RelativeLayout {
    public VRelative_Squared(Context context) {
        super(context);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM136799a = ikh0.m136799a(i, i2);
        super.onMeasure(iM136799a, iM136799a);
    }

    public VRelative_Squared(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VRelative_Squared(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
