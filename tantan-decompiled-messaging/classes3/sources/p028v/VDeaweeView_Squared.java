package p028v;

import android.content.Context;
import android.util.AttributeSet;
import l.djj;
import p003l.ikh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VDeaweeView_Squared extends VDraweeView {
    public VDeaweeView_Squared(Context context, djj djjVar) {
        super(context, djjVar);
    }

    public void onMeasure(int i, int i2) {
        int iM5155a = ikh0.m5155a(i, i2);
        super/*com.facebook.drawee.view.DraweeView*/.onMeasure(iM5155a, iM5155a);
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
