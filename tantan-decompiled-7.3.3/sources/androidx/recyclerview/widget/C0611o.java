package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: androidx.recyclerview.widget.o */
/* JADX INFO: loaded from: classes.dex */
public class C0611o extends AbstractC0619w {

    /* JADX INFO: renamed from: d */
    @Nullable
    public AbstractC0614r f2908d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public AbstractC0614r f2909e;

    @Override // androidx.recyclerview.widget.AbstractC0619w
    /* JADX INFO: renamed from: c */
    public int[] mo3811c(@NonNull RecyclerView.AbstractC0579o abstractC0579o, @NonNull View view) {
        int[] iArr = new int[2];
        if (abstractC0579o.canScrollHorizontally()) {
            iArr[0] = m3815n(view, m3818q(abstractC0579o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0579o.canScrollVertically()) {
            iArr[1] = m3815n(view, m3819r(abstractC0579o));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0619w
    /* JADX INFO: renamed from: h */
    public View mo3812h(RecyclerView.AbstractC0579o abstractC0579o) {
        if (abstractC0579o.canScrollVertically()) {
            return m3817p(abstractC0579o, m3819r(abstractC0579o));
        }
        if (abstractC0579o.canScrollHorizontally()) {
            return m3817p(abstractC0579o, m3818q(abstractC0579o));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.AbstractC0619w
    /* JADX INFO: renamed from: i */
    public int mo3813i(RecyclerView.AbstractC0579o abstractC0579o, int i, int i2) {
        int itemCount;
        View viewMo3812h;
        int position;
        int i3;
        PointF pointFComputeScrollVectorForPosition;
        int iM3816o;
        int iM3816o2;
        if (!(abstractC0579o instanceof RecyclerView.AbstractC0590z.b) || (itemCount = abstractC0579o.getItemCount()) == 0 || (viewMo3812h = mo3812h(abstractC0579o)) == null || (position = abstractC0579o.getPosition(viewMo3812h)) == -1 || (pointFComputeScrollVectorForPosition = ((RecyclerView.AbstractC0590z.b) abstractC0579o).computeScrollVectorForPosition((i3 = itemCount - 1))) == null) {
            return -1;
        }
        if (abstractC0579o.canScrollHorizontally()) {
            iM3816o = m3816o(abstractC0579o, m3818q(abstractC0579o), i, 0);
            if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                iM3816o = -iM3816o;
            }
        } else {
            iM3816o = 0;
        }
        if (abstractC0579o.canScrollVertically()) {
            iM3816o2 = m3816o(abstractC0579o, m3819r(abstractC0579o), 0, i2);
            if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                iM3816o2 = -iM3816o2;
            }
        } else {
            iM3816o2 = 0;
        }
        if (abstractC0579o.canScrollVertically()) {
            iM3816o = iM3816o2;
        }
        if (iM3816o == 0) {
            return -1;
        }
        int i4 = position + iM3816o;
        int i5 = i4 >= 0 ? i4 : 0;
        return i5 >= itemCount ? i3 : i5;
    }

    /* JADX INFO: renamed from: m */
    public final float m3814m(RecyclerView.AbstractC0579o abstractC0579o, AbstractC0614r abstractC0614r) {
        int childCount = abstractC0579o.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = abstractC0579o.getChildAt(i3);
            int position = abstractC0579o.getPosition(childAt);
            if (position != -1) {
                if (position < i2) {
                    view = childAt;
                    i2 = position;
                }
                if (position > i) {
                    view2 = childAt;
                    i = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int iMax = Math.max(abstractC0614r.mo3829d(view), abstractC0614r.mo3829d(view2)) - Math.min(abstractC0614r.mo3832g(view), abstractC0614r.mo3832g(view2));
        if (iMax == 0) {
            return 1.0f;
        }
        return (iMax * 1.0f) / ((i - i2) + 1);
    }

    /* JADX INFO: renamed from: n */
    public final int m3815n(@NonNull View view, AbstractC0614r abstractC0614r) {
        return (abstractC0614r.mo3832g(view) + (abstractC0614r.mo3830e(view) / 2)) - (abstractC0614r.mo3838m() + (abstractC0614r.mo3839n() / 2));
    }

    /* JADX INFO: renamed from: o */
    public final int m3816o(RecyclerView.AbstractC0579o abstractC0579o, AbstractC0614r abstractC0614r, int i, int i2) {
        int[] iArrM3859d = m3859d(i, i2);
        float fM3814m = m3814m(abstractC0579o, abstractC0614r);
        if (fM3814m <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrM3859d[0]) > Math.abs(iArrM3859d[1]) ? iArrM3859d[0] : iArrM3859d[1]) / fM3814m);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final View m3817p(RecyclerView.AbstractC0579o abstractC0579o, AbstractC0614r abstractC0614r) {
        int childCount = abstractC0579o.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iMo3838m = abstractC0614r.mo3838m() + (abstractC0614r.mo3839n() / 2);
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = abstractC0579o.getChildAt(i2);
            int iAbs = Math.abs((abstractC0614r.mo3832g(childAt) + (abstractC0614r.mo3830e(childAt) / 2)) - iMo3838m);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public final AbstractC0614r m3818q(@NonNull RecyclerView.AbstractC0579o abstractC0579o) {
        AbstractC0614r abstractC0614r = this.f2909e;
        if (abstractC0614r == null || abstractC0614r.f2912a != abstractC0579o) {
            this.f2909e = AbstractC0614r.m3826a(abstractC0579o);
        }
        return this.f2909e;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public final AbstractC0614r m3819r(@NonNull RecyclerView.AbstractC0579o abstractC0579o) {
        AbstractC0614r abstractC0614r = this.f2908d;
        if (abstractC0614r == null || abstractC0614r.f2912a != abstractC0579o) {
            this.f2908d = AbstractC0614r.m3828c(abstractC0579o);
        }
        return this.f2908d;
    }
}
