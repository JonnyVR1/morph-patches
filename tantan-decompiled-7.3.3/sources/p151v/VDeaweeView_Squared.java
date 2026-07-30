package p151v;

import android.content.Context;
import android.util.AttributeSet;
import p153l.psh0;
import p153l.wlj;

/* JADX INFO: loaded from: classes3.dex */
public class VDeaweeView_Squared extends VDraweeView {
    public VDeaweeView_Squared(Context context, wlj wljVar) {
        super(context, wljVar);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int iM173642a = psh0.m173642a(i, i2);
        super.onMeasure(iM173642a, iM173642a);
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
