package p028v;

import android.content.Context;
import android.util.AttributeSet;
import l.ffx;
import p003l.ikh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VPager_Squared extends VPager {

    /* JADX INFO: renamed from: P0 */
    public float f12897P0;

    public VPager_Squared(Context context) {
        super(context);
    }

    @Override // p028v.VPager
    public void onMeasure(int i, int i2) {
        float f = this.f12897P0;
        if (f <= 0.0f || f >= 1.0f) {
            int iM5155a = ikh0.m5155a(i, i2);
            super.onMeasure(iM5155a, iM5155a);
        } else {
            int iD = ffx.d(i);
            super.onMeasure(ffx.b(iD), ffx.b((int) (iD / this.f12897P0)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWidthHeightRate(float f) {
        boolean z = f != this.f12897P0;
        this.f12897P0 = f;
        if (z) {
            invalidate();
        }
    }

    public VPager_Squared(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
