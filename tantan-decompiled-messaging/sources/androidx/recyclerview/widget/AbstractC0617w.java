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
import p149l.qkq0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0617w extends RecyclerView.AbstractC0580r {

    /* JADX INFO: renamed from: a */
    public RecyclerView f2920a;

    /* JADX INFO: renamed from: b */
    public Scroller f2921b;

    /* JADX INFO: renamed from: c */
    public final RecyclerView.AbstractC0582t f2922c = new a();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.w$a */
    public class a extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public boolean f2923a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f2923a) {
                this.f2923a = false;
                AbstractC0617w.this.m3863l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f2923a = true;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.w$b */
    public class b extends C0608n {
        public b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0608n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0608n, androidx.recyclerview.widget.RecyclerView.AbstractC0587y
        public void onTargetFound(View view, RecyclerView.C0588z c0588z, RecyclerView.AbstractC0587y.a aVar) {
            AbstractC0617w abstractC0617w = AbstractC0617w.this;
            RecyclerView recyclerView = abstractC0617w.f2920a;
            if (recyclerView == null) {
                return;
            }
            int[] iArrMo3810c = abstractC0617w.mo3810c(recyclerView.getLayoutManager(), view);
            int i = iArrMo3810c[0];
            int i2 = iArrMo3810c[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.m3483d(i, i2, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0580r
    /* JADX INFO: renamed from: a */
    public boolean mo3415a(int i, int i2) {
        RecyclerView.AbstractC0577o layoutManager = this.f2920a.getLayoutManager();
        if (layoutManager == null || this.f2920a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f2920a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m3862k(layoutManager, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public void mo3857b(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f2920a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m3860g();
        }
        this.f2920a = recyclerView;
        if (recyclerView != null) {
            m3861j();
            this.f2921b = new Scroller(this.f2920a.getContext(), new DecelerateInterpolator());
            m3863l();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public abstract int[] mo3810c(@NonNull RecyclerView.AbstractC0577o abstractC0577o, @NonNull View view);

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: d */
    public int[] m3858d(int i, int i2) {
        this.f2921b.fling(0, 0, i, i2, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        return new int[]{this.f2921b.getFinalX(), this.f2921b.getFinalY()};
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public RecyclerView.AbstractC0587y mo3848e(@NonNull RecyclerView.AbstractC0577o abstractC0577o) {
        return m3859f(abstractC0577o);
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: f */
    public C0608n m3859f(@NonNull RecyclerView.AbstractC0577o abstractC0577o) {
        if (abstractC0577o instanceof RecyclerView.AbstractC0587y.b) {
            return new b(this.f2920a.getContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m3860g() {
        this.f2920a.removeOnScrollListener(this.f2922c);
        this.f2920a.setOnFlingListener(null);
    }

    @Nullable
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: h */
    public abstract View mo3811h(RecyclerView.AbstractC0577o abstractC0577o);

    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: i */
    public abstract int mo3812i(RecyclerView.AbstractC0577o abstractC0577o, int i, int i2);

    /* JADX INFO: renamed from: j */
    public final void m3861j() throws IllegalStateException {
        if (this.f2920a.getOnFlingListener() != null) {
            qkq0.m175383a("An instance of OnFlingListener already set.");
        } else {
            this.f2920a.addOnScrollListener(this.f2922c);
            this.f2920a.setOnFlingListener(this);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3862k(@NonNull RecyclerView.AbstractC0577o abstractC0577o, int i, int i2) {
        RecyclerView.AbstractC0587y abstractC0587yMo3848e;
        int iMo3812i;
        if (!(abstractC0577o instanceof RecyclerView.AbstractC0587y.b) || (abstractC0587yMo3848e = mo3848e(abstractC0577o)) == null || (iMo3812i = mo3812i(abstractC0577o, i, i2)) == -1) {
            return false;
        }
        abstractC0587yMo3848e.setTargetPosition(iMo3812i);
        abstractC0577o.startSmoothScroll(abstractC0587yMo3848e);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public void m3863l() {
        RecyclerView.AbstractC0577o layoutManager;
        View viewMo3811h;
        RecyclerView recyclerView = this.f2920a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo3811h = mo3811h(layoutManager)) == null) {
            return;
        }
        int[] iArrMo3810c = mo3810c(layoutManager, viewMo3811h);
        int i = iArrMo3810c[0];
        if (i == 0 && iArrMo3810c[1] == 0) {
            return;
        }
        this.f2920a.smoothScrollBy(i, iArrMo3810c[1]);
    }
}
