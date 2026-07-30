package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VDelegateLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public InterfaceC1329a f12699a;

    /* JADX INFO: renamed from: v.VDelegateLayout$a */
    public interface InterfaceC1329a {
        /* JADX INFO: renamed from: a */
        int[] m11478a(int i, int i2, int i3, int i4);
    }

    public VDelegateLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!NullChecker.a(this.f12699a) || getChildCount() <= 0) {
            return;
        }
        View childAt = getChildAt(0);
        int[] iArrM11478a = this.f12699a.m11478a(i, i2, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        if (NullChecker.a(iArrM11478a) && iArrM11478a.length == 2) {
            super.onMeasure(iArrM11478a[0], iArrM11478a[1]);
        }
    }

    public void setOnMeasureDelegate(InterfaceC1329a interfaceC1329a) {
        this.f12699a = interfaceC1329a;
    }

    public VDelegateLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VDelegateLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
