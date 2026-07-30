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
public class C0615s extends AbstractC0619w {

    /* JADX INFO: renamed from: d */
    @Nullable
    public AbstractC0614r f2915d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public AbstractC0614r f2916e;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.s$a */
    public class a extends C0610n {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0610n
        public float calculateSpeedPerPixel(@NonNull DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0610n
        public int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        @Override // androidx.recyclerview.widget.C0610n, androidx.recyclerview.widget.RecyclerView.AbstractC0590z
        public void onTargetFound(@NonNull View view, @NonNull RecyclerView.C0561a0 c0561a0, @NonNull RecyclerView.AbstractC0590z.a aVar) {
            C0615s c0615s = C0615s.this;
            int[] iArrMo3811c = c0615s.mo3811c(c0615s.f2920a.getLayoutManager(), view);
            int i = iArrMo3811c[0];
            int i2 = iArrMo3811c[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.m3492d(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private int m3845m(@NonNull View view, AbstractC0614r abstractC0614r) {
        return (abstractC0614r.mo3832g(view) + (abstractC0614r.mo3830e(view) / 2)) - (abstractC0614r.mo3838m() + (abstractC0614r.mo3839n() / 2));
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    private View m3846n(RecyclerView.AbstractC0579o abstractC0579o, AbstractC0614r abstractC0614r) {
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
    /* JADX INFO: renamed from: o */
    private AbstractC0614r m3847o(@NonNull RecyclerView.AbstractC0579o abstractC0579o) {
        AbstractC0614r abstractC0614r = this.f2916e;
        if (abstractC0614r == null || abstractC0614r.f2912a != abstractC0579o) {
            this.f2916e = AbstractC0614r.m3826a(abstractC0579o);
        }
        return this.f2916e;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    private AbstractC0614r m3848q(@NonNull RecyclerView.AbstractC0579o abstractC0579o) {
        AbstractC0614r abstractC0614r = this.f2915d;
        if (abstractC0614r == null || abstractC0614r.f2912a != abstractC0579o) {
            this.f2915d = AbstractC0614r.m3828c(abstractC0579o);
        }
        return this.f2915d;
    }

    @Override // androidx.recyclerview.widget.AbstractC0619w
    @Nullable
    /* JADX INFO: renamed from: c */
    public int[] mo3811c(@NonNull RecyclerView.AbstractC0579o abstractC0579o, @NonNull View view) {
        int[] iArr = new int[2];
        if (abstractC0579o.canScrollHorizontally()) {
            iArr[0] = m3845m(view, m3847o(abstractC0579o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0579o.canScrollVertically()) {
            iArr[1] = m3845m(view, m3848q(abstractC0579o));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0619w
    @Nullable
    /* JADX INFO: renamed from: e */
    public RecyclerView.AbstractC0590z mo3849e(@NonNull RecyclerView.AbstractC0579o abstractC0579o) {
        if (abstractC0579o instanceof RecyclerView.AbstractC0590z.b) {
            return new a(this.f2920a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0619w
    @Nullable
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: h */
    public View mo3812h(RecyclerView.AbstractC0579o abstractC0579o) {
        if (abstractC0579o.canScrollVertically()) {
            return m3846n(abstractC0579o, m3848q(abstractC0579o));
        }
        if (abstractC0579o.canScrollHorizontally()) {
            return m3846n(abstractC0579o, m3847o(abstractC0579o));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0619w
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: i */
    public int mo3813i(RecyclerView.AbstractC0579o abstractC0579o, int i, int i2) {
        AbstractC0614r abstractC0614rM3850p;
        int itemCount = abstractC0579o.getItemCount();
        if (itemCount == 0 || (abstractC0614rM3850p = m3850p(abstractC0579o)) == null) {
            return -1;
        }
        int childCount = abstractC0579o.getChildCount();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = abstractC0579o.getChildAt(i5);
            if (childAt != null) {
                int iM3845m = m3845m(childAt, abstractC0614rM3850p);
                if (iM3845m <= 0 && iM3845m > i4) {
                    view2 = childAt;
                    i4 = iM3845m;
                }
                if (iM3845m >= 0 && iM3845m < i3) {
                    view = childAt;
                    i3 = iM3845m;
                }
            }
        }
        boolean zM3851r = m3851r(abstractC0579o, i, i2);
        if (zM3851r && view != null) {
            return abstractC0579o.getPosition(view);
        }
        if (!zM3851r && view2 != null) {
            return abstractC0579o.getPosition(view2);
        }
        if (zM3851r) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = abstractC0579o.getPosition(view) + (m3852s(abstractC0579o) == zM3851r ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final AbstractC0614r m3850p(RecyclerView.AbstractC0579o abstractC0579o) {
        if (abstractC0579o.canScrollVertically()) {
            return m3848q(abstractC0579o);
        }
        if (abstractC0579o.canScrollHorizontally()) {
            return m3847o(abstractC0579o);
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3851r(RecyclerView.AbstractC0579o abstractC0579o, int i, int i2) {
        if (abstractC0579o.canScrollHorizontally()) {
            return i > 0;
        }
        return i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public final boolean m3852s(RecyclerView.AbstractC0579o abstractC0579o) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC0579o.getItemCount();
        if (!(abstractC0579o instanceof RecyclerView.AbstractC0590z.b) || (pointFComputeScrollVectorForPosition = ((RecyclerView.AbstractC0590z.b) abstractC0579o).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }
}
