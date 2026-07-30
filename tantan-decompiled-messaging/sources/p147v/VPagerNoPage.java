package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class VPagerNoPage extends ViewPager {
    public VPagerNoPage(Context context) {
        super(context);
        m223146b0(context);
    }

    /* JADX INFO: renamed from: b0 */
    private void m223146b0(Context context) {
        if (xdl0.f192400b) {
            setOverScrollMode(2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public VPagerNoPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223146b0(context);
    }
}
