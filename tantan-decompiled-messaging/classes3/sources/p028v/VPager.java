package p028v;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.tantanapp.common.utils.CrashHelper;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VPager extends ViewPager {

    /* JADX INFO: renamed from: M0 */
    public boolean f12857M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f12858N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f12859O0;

    public VPager(Context context) {
        super(context);
        this.f12857M0 = true;
        this.f12858N0 = false;
        this.f12859O0 = true;
        m11620c0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    private void m11620c0(Context context) {
        if (xdl0.b) {
            setOverScrollMode(2);
        }
        if ("Lenovo".equalsIgnoreCase(Build.BRAND) && "Lenovo K10e70".equalsIgnoreCase(Build.MODEL)) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m11621b0() {
        this.f12857M0 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return this.f12857M0 && super/*android.view.View*/.dispatchTouchEvent(motionEvent);
        } catch (Exception e) {
            CrashHelper.d(new Exception("VPager dispatchTouchEvent " + e.getMessage(), e), 1000);
            return false;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f12858N0 && motionEvent.getPointerCount() == 2) {
            return true;
        }
        if (!this.f12859O0 || C()) {
            return false;
        }
        try {
            return this.f12857M0 && super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
        }
    }

    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            CrashHelper.d(new Exception("VPager onMeasure " + e.getMessage(), e), 50);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f12859O0) {
            return false;
        }
        try {
            return this.f12857M0 && super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            CrashHelper.d(new Exception("VPager onTouchEvent " + e.getMessage(), e), 10);
            return false;
        }
    }

    public void setAllowZoom(boolean z) {
        this.f12858N0 = z;
    }

    public void setScrollble(boolean z) {
        this.f12859O0 = z;
    }

    public VPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12857M0 = true;
        this.f12858N0 = false;
        this.f12859O0 = true;
        m11620c0(context);
    }
}
