package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import l.p920;

/* JADX INFO: renamed from: l.r7 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class AbstractC2474r7 implements p920 {

    /* JADX INFO: renamed from: a */
    public NestedScrollView f12498a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f12499b;

    /* JADX INFO: renamed from: c */
    public View f12500c;

    /* JADX INFO: renamed from: a */
    public abstract NestedScrollView mo12136a();

    /* JADX INFO: renamed from: b */
    public abstract RecyclerView mo12137b();

    /* JADX INFO: renamed from: c */
    public int m13835c() {
        return this.f12498a.getScrollY();
    }

    /* JADX INFO: renamed from: d */
    public void m13836d() {
        if (this.f12498a == null) {
            this.f12498a = mo12136a();
        }
        if (this.f12499b == null) {
            this.f12499b = mo12137b();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m13837e(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f12498a.getChildAt(0);
        if (z) {
            View view = (View) this.f12499b.getParent();
            while (viewGroup.indexOfChild(view) < 0) {
                if (view.getParent() instanceof View) {
                    view = (View) view.getParent();
                }
            }
            if (viewGroup.indexOfChild(view) >= 0) {
                this.f12500c = view;
            }
        }
    }

    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        m13836d();
        if (this.f12500c == null) {
            if (this.f12499b == null) {
                return;
            } else {
                m13837e(true);
            }
        }
        if (i2 <= 0) {
            if (this.f12499b.canScrollVertically(1)) {
                return;
            }
            int i4 = -i2;
            iArr[1] = i4;
            this.f12498a.scrollBy(0, i4);
            return;
        }
        if (this.f12500c.getTop() > m13835c()) {
            int top = this.f12500c.getTop() - m13835c();
            if (top > Math.abs(i2)) {
                iArr[1] = Math.abs(i2);
                this.f12498a.scrollBy(0, i2);
            } else {
                int i5 = i2 - top;
                iArr[1] = Math.abs(i5);
                this.f12498a.scrollBy(0, i5);
            }
        }
    }

    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2) {
        m13836d();
        boolean z = this.f12499b != null;
        if (this.f12500c == null) {
            m13837e(z);
        }
        return z;
    }

    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
    }

    public void onStopNestedScroll(@NonNull View view, int i) {
    }

    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
    }

    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i, int i2) {
    }
}
