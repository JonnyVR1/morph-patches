package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.b9c0;
import l.t0c0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VLine extends View {
    public VLine(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet == null) {
            setBackgroundColor(context.getResources().getColor(t0c0.s));
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.N3, i, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(b9c0.O3);
        typedArrayObtainStyledAttributes.recycle();
        setBackground(drawable == null ? new ColorDrawable(context.getResources().getColor(t0c0.s)) : drawable);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = t100.d;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i3 = 0;
                } else {
                    i3 = size2;
                }
            }
        } else if (size2 < i3) {
            i3 = size2;
        }
        setMeasuredDimension(size, i3);
    }

    public VLine(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VLine(Context context) {
        this(context, null);
    }
}
