package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: androidx.recyclerview.widget.o */
/* JADX INFO: loaded from: classes.dex */
public class C0609o extends AbstractC0617w {

    /* JADX INFO: renamed from: d */
    @Nullable
    public AbstractC0612r f2908d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public AbstractC0612r f2909e;

    @Override // androidx.recyclerview.widget.AbstractC0617w
    /* JADX INFO: renamed from: c */
    public int[] mo3810c(@NonNull RecyclerView.AbstractC0577o abstractC0577o, @NonNull View view) {
        int[] iArr = new int[2];
        if (abstractC0577o.canScrollHorizontally()) {
            iArr[0] = m3814n(view, m3817q(abstractC0577o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0577o.canScrollVertically()) {
            iArr[1] = m3814n(view, m3818r(abstractC0577o));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0617w
    /* JADX INFO: renamed from: h */
    public View mo3811h(RecyclerView.AbstractC0577o abstractC0577o) {
        if (abstractC0577o.canScrollVertically()) {
            return m3816p(abstractC0577o, m3818r(abstractC0577o));
        }
        if (abstractC0577o.canScrollHorizontally()) {
            return m3816p(abstractC0577o, m3817q(abstractC0577o));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.AbstractC0617w
    /* JADX INFO: renamed from: i */
    public int mo3812i(RecyclerView.AbstractC0577o abstractC0577o, int i, int i2) {
        int itemCount;
        View viewMo3811h;
        int position;
        int i3;
        PointF pointFComputeScrollVectorForPosition;
        int iM3815o;
        int iM3815o2;
        if (!(abstractC0577o instanceof RecyclerView.AbstractC0587y.b) || (itemCount = abstractC0577o.getItemCount()) == 0 || (viewMo3811h = mo3811h(abstractC0577o)) == null || (position = abstractC0577o.getPosition(viewMo3811h)) == -1 || (pointFComputeScrollVectorForPosition = ((RecyclerView.AbstractC0587y.b) abstractC0577o).computeScrollVectorForPosition((i3 = itemCount - 1))) == null) {
            return -1;
        }
        if (abstractC0577o.canScrollHorizontally()) {
            iM3815o = m3815o(abstractC0577o, m3817q(abstractC0577o), i, 0);
            if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                iM3815o = -iM3815o;
            }
        } else {
            iM3815o = 0;
        }
        if (abstractC0577o.canScrollVertically()) {
            iM3815o2 = m3815o(abstractC0577o, m3818r(abstractC0577o), 0, i2);
            if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                iM3815o2 = -iM3815o2;
            }
        } else {
            iM3815o2 = 0;
        }
        if (abstractC0577o.canScrollVertically()) {
            iM3815o = iM3815o2;
        }
        if (iM3815o == 0) {
            return -1;
        }
        int i4 = position + iM3815o;
        int i5 = i4 >= 0 ? i4 : 0;
        return i5 >= itemCount ? i3 : i5;
    }

    /* JADX INFO: renamed from: m */
    public final float m3813m(RecyclerView.AbstractC0577o abstractC0577o, AbstractC0612r abstractC0612r) {
        int childCount = abstractC0577o.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = abstractC0577o.getChildAt(i3);
            int position = abstractC0577o.getPosition(childAt);
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
        int iMax = Math.max(abstractC0612r.mo3828d(view), abstractC0612r.mo3828d(view2)) - Math.min(abstractC0612r.mo3831g(view), abstractC0612r.mo3831g(view2));
        if (iMax == 0) {
            return 1.0f;
        }
        return (iMax * 1.0f) / ((i - i2) + 1);
    }

    /* JADX INFO: renamed from: n */
    public final int m3814n(@NonNull View view, AbstractC0612r abstractC0612r) {
        return (abstractC0612r.mo3831g(view) + (abstractC0612r.mo3829e(view) / 2)) - (abstractC0612r.mo3837m() + (abstractC0612r.mo3838n() / 2));
    }

    /* JADX INFO: renamed from: o */
    public final int m3815o(RecyclerView.AbstractC0577o abstractC0577o, AbstractC0612r abstractC0612r, int i, int i2) {
        int[] iArrM3858d = m3858d(i, i2);
        float fM3813m = m3813m(abstractC0577o, abstractC0612r);
        if (fM3813m <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrM3858d[0]) > Math.abs(iArrM3858d[1]) ? iArrM3858d[0] : iArrM3858d[1]) / fM3813m);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final View m3816p(RecyclerView.AbstractC0577o abstractC0577o, AbstractC0612r abstractC0612r) {
        int childCount = abstractC0577o.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iMo3837m = abstractC0612r.mo3837m() + (abstractC0612r.mo3838n() / 2);
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = abstractC0577o.getChildAt(i2);
            int iAbs = Math.abs((abstractC0612r.mo3831g(childAt) + (abstractC0612r.mo3829e(childAt) / 2)) - iMo3837m);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public final AbstractC0612r m3817q(@NonNull RecyclerView.AbstractC0577o abstractC0577o) {
        AbstractC0612r abstractC0612r = this.f2909e;
        if (abstractC0612r == null || abstractC0612r.f2912a != abstractC0577o) {
            this.f2909e = AbstractC0612r.m3825a(abstractC0577o);
        }
        return this.f2909e;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public final AbstractC0612r m3818r(@NonNull RecyclerView.AbstractC0577o abstractC0577o) {
        AbstractC0612r abstractC0612r = this.f2908d;
        if (abstractC0612r == null || abstractC0612r.f2912a != abstractC0577o) {
            this.f2908d = AbstractC0612r.m3827c(abstractC0577o);
        }
        return this.f2908d;
    }
}
