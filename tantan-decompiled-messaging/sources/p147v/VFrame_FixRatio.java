package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public class VFrame_FixRatio extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public float f209094a;

    public VFrame_FixRatio(Context context) {
        super(context);
        this.f209094a = 1.0f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        float fMin;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || size <= 0 || size2 <= 0) {
            if (mode != 1073741824 || size <= 0) {
                if (mode2 != 1073741824 || size2 <= 0) {
                    float f = size;
                    float f2 = size2;
                    float f3 = this.f209094a;
                    if (f >= f2 * f3) {
                        size = (int) (f2 * f3);
                    }
                } else {
                    fMin = size2 * this.f209094a;
                }
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size / this.f209094a), 1073741824));
        }
        fMin = Math.min(size, size2 * this.f209094a);
        size = (int) fMin;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size / this.f209094a), 1073741824));
    }

    public VFrame_FixRatio(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209094a = 1.0f;
    }

    public VFrame_FixRatio(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209094a = 1.0f;
    }
}
