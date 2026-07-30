package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: l.r7 */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC19648r7 implements p920 {

    /* JADX INFO: renamed from: a */
    public NestedScrollView f157997a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f157998b;

    /* JADX INFO: renamed from: c */
    public View f157999c;

    /* JADX INFO: renamed from: a */
    public abstract NestedScrollView mo158988a();

    /* JADX INFO: renamed from: b */
    public abstract RecyclerView mo158989b();

    /* JADX INFO: renamed from: c */
    public int m178110c() {
        return this.f157997a.getScrollY();
    }

    /* JADX INFO: renamed from: d */
    public void m178111d() {
        if (this.f157997a == null) {
            this.f157997a = mo158988a();
        }
        if (this.f157998b == null) {
            this.f157998b = mo158989b();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m178112e(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f157997a.getChildAt(0);
        if (z) {
            View view = (View) this.f157998b.getParent();
            while (viewGroup.indexOfChild(view) < 0) {
                if (view.getParent() instanceof View) {
                    view = (View) view.getParent();
                }
            }
            if (viewGroup.indexOfChild(view) >= 0) {
                this.f157999c = view;
            }
        }
    }

    @Override // p149l.w920, android.view.ViewParent
    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // p149l.w920, android.view.ViewParent
    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return false;
    }

    @Override // p149l.u920
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        m178111d();
        if (this.f157999c == null) {
            if (this.f157998b == null) {
                return;
            } else {
                m178112e(true);
            }
        }
        if (i2 <= 0) {
            if (this.f157998b.canScrollVertically(1)) {
                return;
            }
            int i4 = -i2;
            iArr[1] = i4;
            this.f157997a.scrollBy(0, i4);
            return;
        }
        if (this.f157999c.getTop() > m178110c()) {
            int top = this.f157999c.getTop() - m178110c();
            if (top > Math.abs(i2)) {
                iArr[1] = Math.abs(i2);
                this.f157997a.scrollBy(0, i2);
            } else {
                int i5 = i2 - top;
                iArr[1] = Math.abs(i5);
                this.f157997a.scrollBy(0, i5);
            }
        }
    }

    @Override // p149l.u920
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2) {
        m178111d();
        boolean z = this.f157998b != null;
        if (this.f157999c == null) {
            m178112e(z);
        }
        return z;
    }

    @Override // p149l.w920, android.view.ViewParent
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4) {
    }

    @Override // p149l.u920
    public void onStopNestedScroll(@NonNull View view, int i) {
    }

    @Override // p149l.u920
    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // p149l.u920
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i, int i2) {
    }
}
