package p147v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class VDelegateLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public InterfaceC22536a f209074a;

    /* JADX INFO: renamed from: v.VDelegateLayout$a */
    public interface InterfaceC22536a {
        /* JADX INFO: renamed from: a */
        int[] mo124158a(int i, int i2, int i3, int i4);
    }

    public VDelegateLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!NullChecker.m81303a(this.f209074a) || getChildCount() <= 0) {
            return;
        }
        View childAt = getChildAt(0);
        int[] iArrMo124158a = this.f209074a.mo124158a(i, i2, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        if (NullChecker.m81303a(iArrMo124158a) && iArrMo124158a.length == 2) {
            super.onMeasure(iArrMo124158a[0], iArrMo124158a[1]);
        }
    }

    public void setOnMeasureDelegate(InterfaceC22536a interfaceC22536a) {
        this.f209074a = interfaceC22536a;
    }

    public VDelegateLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VDelegateLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
