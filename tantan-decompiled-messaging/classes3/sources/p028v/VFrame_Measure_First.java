package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VFrame_Measure_First extends FrameLayout {
    public VFrame_Measure_First(@NonNull Context context) {
        super(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        View childAt = getChildAt(0);
        measureChildWithMargins(childAt, i, 0, i2, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int measuredWidth = childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        int childCount = getChildCount();
        for (int i3 = 1; i3 < childCount; i3++) {
            measureChildWithMargins(getChildAt(i3), View.MeasureSpec.makeMeasureSpec(measuredWidth, PKIFailureInfo.systemUnavail), 0, View.MeasureSpec.makeMeasureSpec(measuredHeight, PKIFailureInfo.systemUnavail), 0);
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    public VFrame_Measure_First(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VFrame_Measure_First(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
