package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: l.m7 */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC18559m7 implements xh20 {

    /* JADX INFO: renamed from: a */
    public NestedScrollView f135047a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f135048b;

    /* JADX INFO: renamed from: c */
    public View f135049c;

    /* JADX INFO: renamed from: a */
    public abstract NestedScrollView mo109539a();

    /* JADX INFO: renamed from: b */
    public abstract RecyclerView mo109540b();

    /* JADX INFO: renamed from: c */
    public int m157268c() {
        return this.f135047a.getScrollY();
    }

    /* JADX INFO: renamed from: d */
    public void m157269d() {
        if (this.f135047a == null) {
            this.f135047a = mo109539a();
        }
        if (this.f135048b == null) {
            this.f135048b = mo109540b();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m157270e(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f135047a.getChildAt(0);
        if (z) {
            View view = (View) this.f135048b.getParent();
            while (viewGroup.indexOfChild(view) < 0) {
                if (view.getParent() instanceof View) {
                    view = (View) view.getParent();
                }
            }
            if (viewGroup.indexOfChild(view) >= 0) {
                this.f135049c = view;
            }
        }
    }

    @Override // p153l.ei20, android.view.ViewParent
    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // p153l.ei20, android.view.ViewParent
    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return false;
    }

    @Override // p153l.ci20
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        m157269d();
        if (this.f135049c == null) {
            if (this.f135048b == null) {
                return;
            } else {
                m157270e(true);
            }
        }
        if (i2 <= 0) {
            if (this.f135048b.canScrollVertically(1)) {
                return;
            }
            int i4 = -i2;
            iArr[1] = i4;
            this.f135047a.scrollBy(0, i4);
            return;
        }
        if (this.f135049c.getTop() > m157268c()) {
            int top = this.f135049c.getTop() - m157268c();
            if (top > Math.abs(i2)) {
                iArr[1] = Math.abs(i2);
                this.f135047a.scrollBy(0, i2);
            } else {
                int i5 = i2 - top;
                iArr[1] = Math.abs(i5);
                this.f135047a.scrollBy(0, i5);
            }
        }
    }

    @Override // p153l.ci20
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2) {
        m157269d();
        boolean z = this.f135048b != null;
        if (this.f135049c == null) {
            m157270e(z);
        }
        return z;
    }

    @Override // p153l.ei20, android.view.ViewParent
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
    }

    @Override // p153l.ci20
    public void onStopNestedScroll(@NonNull View view, int i) {
    }

    @Override // p153l.ci20
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // p153l.ci20
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i, int i2) {
    }
}
