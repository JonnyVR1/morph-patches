package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VPagerNoPage extends ViewPager {
    public VPagerNoPage(Context context) {
        super(context);
        m11627b0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    private void m11627b0(Context context) {
        if (xdl0.b) {
            setOverScrollMode(2);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public VPagerNoPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11627b0(context);
    }
}
