package p147v;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.CrashHelper;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class VPager extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public boolean f209232M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f209233N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f209234O0;

    public VPager(Context context) {
        super(context);
        this.f209232M0 = true;
        this.f209233N0 = false;
        this.f209234O0 = true;
        m223139c0(context);
    }

    /* JADX INFO: renamed from: c0 */
    private void m223139c0(Context context) {
        if (xdl0.f192400b) {
            setOverScrollMode(2);
        }
        if ("Lenovo".equalsIgnoreCase(Build.BRAND) && "Lenovo K10e70".equalsIgnoreCase(Build.MODEL)) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m223140b0() {
        this.f209232M0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return this.f209232M0 && super.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            CrashHelper.m81297d(new Exception("VPager dispatchTouchEvent " + e.getMessage(), e), 1000);
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f209233N0 && motionEvent.getPointerCount() == 2) {
            return true;
        }
        if (!this.f209234O0 || m4168C()) {
            return false;
        }
        try {
            return this.f209232M0 && super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            CrashHelper.m81297d(new Exception("VPager onMeasure " + e.getMessage(), e), 50);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f209234O0) {
            return false;
        }
        try {
            return this.f209232M0 && super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            CrashHelper.m81297d(new Exception("VPager onTouchEvent " + e.getMessage(), e), 10);
            return false;
        }
    }

    public void setAllowZoom(boolean z) {
        this.f209233N0 = z;
    }

    public void setScrollble(boolean z) {
        this.f209234O0 = z;
    }

    public VPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209232M0 = true;
        this.f209233N0 = false;
        this.f209234O0 = true;
        m223139c0(context);
    }
}
