package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import l.b9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AspectRatioViewPager extends VPager {

    /* JADX INFO: renamed from: P0 */
    public float f12562P0;

    public AspectRatioViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.a);
        this.f12562P0 = typedArrayObtainStyledAttributes.getFloat(b9c0.b, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p028v.VPager
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.f12562P0 > 0.0f) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size / this.f12562P0), 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public AspectRatioViewPager(Context context) {
        this(context, null);
    }
}
