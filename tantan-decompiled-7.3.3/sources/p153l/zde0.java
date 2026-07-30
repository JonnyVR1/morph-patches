package p153l;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zde0 {

    /* JADX INFO: renamed from: a */
    public OverScroller f203872a;

    public zde0(Context context, Interpolator interpolator) {
        this.f203872a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static zde0 m219292c(Context context) {
        return m219293d(context, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static zde0 m219293d(Context context, Interpolator interpolator) {
        return new zde0(context, interpolator);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public void m219294a() {
        this.f203872a.abortAnimation();
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public boolean m219295b() {
        return this.f203872a.computeScrollOffset();
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public void m219296e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f203872a.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public int m219297f() {
        return this.f203872a.getCurrX();
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public int m219298g() {
        return this.f203872a.getCurrY();
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public boolean m219299h() {
        return this.f203872a.isFinished();
    }
}
