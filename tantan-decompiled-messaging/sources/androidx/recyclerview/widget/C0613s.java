package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: androidx.recyclerview.widget.s */
/* JADX INFO: loaded from: classes.dex */
public class C0613s extends AbstractC0617w {

    /* JADX INFO: renamed from: d */
    @Nullable
    public AbstractC0612r f2915d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public AbstractC0612r f2916e;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.s$a */
    public class a extends C0608n {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0608n
        public float calculateSpeedPerPixel(@NonNull DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0608n
        public int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        @Override // androidx.recyclerview.widget.C0608n, androidx.recyclerview.widget.RecyclerView.AbstractC0587y
        public void onTargetFound(@NonNull View view, @NonNull RecyclerView.C0588z c0588z, @NonNull RecyclerView.AbstractC0587y.a aVar) {
            C0613s c0613s = C0613s.this;
            int[] iArrMo3810c = c0613s.mo3810c(c0613s.f2920a.getLayoutManager(), view);
            int i = iArrMo3810c[0];
            int i2 = iArrMo3810c[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.m3483d(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private int m3844m(@NonNull View view, AbstractC0612r abstractC0612r) {
        return (abstractC0612r.mo3831g(view) + (abstractC0612r.mo3829e(view) / 2)) - (abstractC0612r.mo3837m() + (abstractC0612r.mo3838n() / 2));
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    private View m3845n(RecyclerView.AbstractC0577o abstractC0577o, AbstractC0612r abstractC0612r) {
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
    /* JADX INFO: renamed from: o */
    private AbstractC0612r m3846o(@NonNull RecyclerView.AbstractC0577o abstractC0577o) {
        AbstractC0612r abstractC0612r = this.f2916e;
        if (abstractC0612r == null || abstractC0612r.f2912a != abstractC0577o) {
            this.f2916e = AbstractC0612r.m3825a(abstractC0577o);
        }
        return this.f2916e;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    private AbstractC0612r m3847q(@NonNull RecyclerView.AbstractC0577o abstractC0577o) {
        AbstractC0612r abstractC0612r = this.f2915d;
        if (abstractC0612r == null || abstractC0612r.f2912a != abstractC0577o) {
            this.f2915d = AbstractC0612r.m3827c(abstractC0577o);
        }
        return this.f2915d;
    }

    @Override // androidx.recyclerview.widget.AbstractC0617w
    @Nullable
    /* JADX INFO: renamed from: c */
    public int[] mo3810c(@NonNull RecyclerView.AbstractC0577o abstractC0577o, @NonNull View view) {
        int[] iArr = new int[2];
        if (abstractC0577o.canScrollHorizontally()) {
            iArr[0] = m3844m(view, m3846o(abstractC0577o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0577o.canScrollVertically()) {
            iArr[1] = m3844m(view, m3847q(abstractC0577o));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0617w
    @Nullable
    /* JADX INFO: renamed from: e */
    public RecyclerView.AbstractC0587y mo3848e(@NonNull RecyclerView.AbstractC0577o abstractC0577o) {
        if (abstractC0577o instanceof RecyclerView.AbstractC0587y.b) {
            return new a(this.f2920a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0617w
    @Nullable
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: h */
    public View mo3811h(RecyclerView.AbstractC0577o abstractC0577o) {
        if (abstractC0577o.canScrollVertically()) {
            return m3845n(abstractC0577o, m3847q(abstractC0577o));
        }
        if (abstractC0577o.canScrollHorizontally()) {
            return m3845n(abstractC0577o, m3846o(abstractC0577o));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0617w
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: i */
    public int mo3812i(RecyclerView.AbstractC0577o abstractC0577o, int i, int i2) {
        AbstractC0612r abstractC0612rM3849p;
        int itemCount = abstractC0577o.getItemCount();
        if (itemCount == 0 || (abstractC0612rM3849p = m3849p(abstractC0577o)) == null) {
            return -1;
        }
        int childCount = abstractC0577o.getChildCount();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = abstractC0577o.getChildAt(i5);
            if (childAt != null) {
                int iM3844m = m3844m(childAt, abstractC0612rM3849p);
                if (iM3844m <= 0 && iM3844m > i4) {
                    view2 = childAt;
                    i4 = iM3844m;
                }
                if (iM3844m >= 0 && iM3844m < i3) {
                    view = childAt;
                    i3 = iM3844m;
                }
            }
        }
        boolean zM3850r = m3850r(abstractC0577o, i, i2);
        if (zM3850r && view != null) {
            return abstractC0577o.getPosition(view);
        }
        if (!zM3850r && view2 != null) {
            return abstractC0577o.getPosition(view2);
        }
        if (zM3850r) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = abstractC0577o.getPosition(view) + (m3851s(abstractC0577o) == zM3850r ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final AbstractC0612r m3849p(RecyclerView.AbstractC0577o abstractC0577o) {
        if (abstractC0577o.canScrollVertically()) {
            return m3847q(abstractC0577o);
        }
        if (abstractC0577o.canScrollHorizontally()) {
            return m3846o(abstractC0577o);
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3850r(RecyclerView.AbstractC0577o abstractC0577o, int i, int i2) {
        if (abstractC0577o.canScrollHorizontally()) {
            return i > 0;
        }
        return i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public final boolean m3851s(RecyclerView.AbstractC0577o abstractC0577o) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC0577o.getItemCount();
        if (!(abstractC0577o instanceof RecyclerView.AbstractC0587y.b) || (pointFComputeScrollVectorForPosition = ((RecyclerView.AbstractC0587y.b) abstractC0577o).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }
}
