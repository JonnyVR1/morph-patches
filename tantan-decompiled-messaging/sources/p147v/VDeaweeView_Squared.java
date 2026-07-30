package p147v;

import android.content.Context;
import android.util.AttributeSet;
import p149l.djj;
import p149l.ikh0;

/* JADX INFO: loaded from: classes3.dex */
public class VDeaweeView_Squared extends VDraweeView {
    public VDeaweeView_Squared(Context context, djj djjVar) {
        super(context, djjVar);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int iM136799a = ikh0.m136799a(i, i2);
        super.onMeasure(iM136799a, iM136799a);
    }

    public VDeaweeView_Squared(Context context) {
        super(context);
    }

    public VDeaweeView_Squared(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VDeaweeView_Squared(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VDeaweeView_Squared(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
