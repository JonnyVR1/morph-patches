package p151v;

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
    public InterfaceC22651a f209996a;

    /* JADX INFO: renamed from: v.VDelegateLayout$a */
    public interface InterfaceC22651a {
        /* JADX INFO: renamed from: a */
        int[] mo152702a(int i, int i2, int i3, int i4);
    }

    public VDelegateLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!NullChecker.m82486a(this.f209996a) || getChildCount() <= 0) {
            return;
        }
        View childAt = getChildAt(0);
        int[] iArrMo152702a = this.f209996a.mo152702a(i, i2, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        if (NullChecker.m82486a(iArrMo152702a) && iArrMo152702a.length == 2) {
            super.onMeasure(iArrMo152702a[0], iArrMo152702a[1]);
        }
    }

    public void setOnMeasureDelegate(InterfaceC22651a interfaceC22651a) {
        this.f209996a = interfaceC22651a;
    }

    public VDelegateLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VDelegateLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
