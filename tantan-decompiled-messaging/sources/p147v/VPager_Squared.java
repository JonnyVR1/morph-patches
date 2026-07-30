package p147v;

import android.content.Context;
import android.util.AttributeSet;
import p149l.ffx;
import p149l.ikh0;

/* JADX INFO: loaded from: classes3.dex */
public class VPager_Squared extends VPager {

    /* JADX INFO: renamed from: P0 */
    public float f209272P0;

    public VPager_Squared(Context context) {
        super(context);
    }

    @Override // p147v.VPager, androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        float f = this.f209272P0;
        if (f <= 0.0f || f >= 1.0f) {
            int iM136799a = ikh0.m136799a(i, i2);
            super.onMeasure(iM136799a, iM136799a);
        } else {
            int iM121201d = ffx.m121201d(i);
            super.onMeasure(ffx.m121199b(iM121201d), ffx.m121199b((int) (iM121201d / this.f209272P0)));
        }
    }

    public void setWidthHeightRate(float f) {
        boolean z = f != this.f209272P0;
        this.f209272P0 = f;
        if (z) {
            invalidate();
        }
    }

    public VPager_Squared(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
