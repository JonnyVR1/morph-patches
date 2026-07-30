package p147v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import p149l.b9c0;

/* JADX INFO: loaded from: classes3.dex */
public class AspectRatioViewPager extends VPager {

    /* JADX INFO: renamed from: P0 */
    public float f208937P0;

    public AspectRatioViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74385a);
        this.f208937P0 = typedArrayObtainStyledAttributes.getFloat(b9c0.f74392b, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p147v.VPager, androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.f208937P0 > 0.0f) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size / this.f208937P0), 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public AspectRatioViewPager(Context context) {
        this(context, null);
    }
}
