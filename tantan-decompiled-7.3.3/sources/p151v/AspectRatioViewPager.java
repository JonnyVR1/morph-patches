package p151v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import p153l.hhc0;

/* JADX INFO: loaded from: classes3.dex */
public class AspectRatioViewPager extends VPager {

    /* JADX INFO: renamed from: P0 */
    public float f209859P0;

    public AspectRatioViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109694a);
        this.f209859P0 = typedArrayObtainStyledAttributes.getFloat(hhc0.f109701b, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p151v.VPager, androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.f209859P0 > 0.0f) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size / this.f209859P0), 1073741824));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public AspectRatioViewPager(Context context) {
        this(context, null);
    }
}
