package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VRecycler_Fixed extends RecyclerView {
    public VRecycler_Fixed(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, PKIFailureInfo.systemUnavail));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public VRecycler_Fixed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VRecycler_Fixed(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
