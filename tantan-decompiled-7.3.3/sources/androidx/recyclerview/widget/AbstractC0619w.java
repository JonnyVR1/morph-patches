package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import p153l.wtq0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0619w extends RecyclerView.AbstractC0582r {

    /* JADX INFO: renamed from: a */
    public RecyclerView f2920a;

    /* JADX INFO: renamed from: b */
    public Scroller f2921b;

    /* JADX INFO: renamed from: c */
    public final RecyclerView.AbstractC0584t f2922c = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.w$a */
    public class a extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public boolean f2923a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f2923a) {
                this.f2923a = false;
                AbstractC0619w.this.m3864l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f2923a = true;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.w$b */
    public class b extends C0610n {
        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0610n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0610n, androidx.recyclerview.widget.RecyclerView.AbstractC0590z
        public void onTargetFound(View view, RecyclerView.C0561a0 c0561a0, RecyclerView.AbstractC0590z.a aVar) {
            AbstractC0619w abstractC0619w = AbstractC0619w.this;
            RecyclerView recyclerView = abstractC0619w.f2920a;
            if (recyclerView == null) {
                return;
            }
            int[] iArrMo3811c = abstractC0619w.mo3811c(recyclerView.getLayoutManager(), view);
            int i = iArrMo3811c[0];
            int i2 = iArrMo3811c[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.m3492d(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582r
    /* JADX INFO: renamed from: a */
    public boolean mo3424a(int i, int i2) {
        RecyclerView.AbstractC0579o layoutManager = this.f2920a.getLayoutManager();
        if (layoutManager == null || this.f2920a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f2920a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m3863k(layoutManager, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public void mo3858b(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f2920a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m3861g();
        }
        this.f2920a = recyclerView;
        if (recyclerView != null) {
            m3862j();
            this.f2921b = new Scroller(this.f2920a.getContext(), new DecelerateInterpolator());
            m3864l();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract int[] mo3811c(@NonNull RecyclerView.AbstractC0579o abstractC0579o, @NonNull View view);

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: d */
    public int[] m3859d(int i, int i2) {
        this.f2921b.fling(0, 0, i, i2, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return new int[]{this.f2921b.getFinalX(), this.f2921b.getFinalY()};
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public RecyclerView.AbstractC0590z mo3849e(@NonNull RecyclerView.AbstractC0579o abstractC0579o) {
        return m3860f(abstractC0579o);
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: f */
    public C0610n m3860f(@NonNull RecyclerView.AbstractC0579o abstractC0579o) {
        if (abstractC0579o instanceof RecyclerView.AbstractC0590z.b) {
            return new b(this.f2920a.getContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m3861g() {
        this.f2920a.removeOnScrollListener(this.f2922c);
        this.f2920a.setOnFlingListener(null);
    }

    @Nullable
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: h */
    public abstract View mo3812h(RecyclerView.AbstractC0579o abstractC0579o);

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: i */
    public abstract int mo3813i(RecyclerView.AbstractC0579o abstractC0579o, int i, int i2);

    /* JADX INFO: renamed from: j */
    public final void m3862j() throws IllegalStateException {
        if (this.f2920a.getOnFlingListener() != null) {
            wtq0.m207906a("An instance of OnFlingListener already set.");
        } else {
            this.f2920a.addOnScrollListener(this.f2922c);
            this.f2920a.setOnFlingListener(this);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3863k(@NonNull RecyclerView.AbstractC0579o abstractC0579o, int i, int i2) {
        RecyclerView.AbstractC0590z abstractC0590zMo3849e;
        int iMo3813i;
        if (!(abstractC0579o instanceof RecyclerView.AbstractC0590z.b) || (abstractC0590zMo3849e = mo3849e(abstractC0579o)) == null || (iMo3813i = mo3813i(abstractC0579o, i, i2)) == -1) {
            return false;
        }
        abstractC0590zMo3849e.setTargetPosition(iMo3813i);
        abstractC0579o.startSmoothScroll(abstractC0590zMo3849e);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public void m3864l() {
        RecyclerView.AbstractC0579o layoutManager;
        View viewMo3812h;
        RecyclerView recyclerView = this.f2920a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo3812h = mo3812h(layoutManager)) == null) {
            return;
        }
        int[] iArrMo3811c = mo3811c(layoutManager, viewMo3812h);
        int i = iArrMo3811c[0];
        if (i == 0 && iArrMo3811c[1] == 0) {
            return;
        }
        this.f2920a.smoothScrollBy(i, iArrMo3811c[1]);
    }
}
