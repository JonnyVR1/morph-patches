package p151v;

import android.content.Context;
import android.util.AttributeSet;
import p153l.dox;
import p153l.psh0;

/* JADX INFO: loaded from: classes3.dex */
public class VPager_Squared extends VPager {

    /* JADX INFO: renamed from: P0 */
    public float f210194P0;

    public VPager_Squared(Context context) {
        super(context);
    }

    @Override // p151v.VPager, androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        float f = this.f210194P0;
        if (f <= 0.0f || f >= 1.0f) {
            int iM173642a = psh0.m173642a(i, i2);
            super.onMeasure(iM173642a, iM173642a);
        } else {
            int iM117366d = dox.m117366d(i);
            super.onMeasure(dox.m117364b(iM117366d), dox.m117364b((int) (iM117366d / this.f210194P0)));
        }
    }

    public void setWidthHeightRate(float f) {
        boolean z = f != this.f210194P0;
        this.f210194P0 = f;
        if (z) {
            invalidate();
        }
    }

    public VPager_Squared(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
