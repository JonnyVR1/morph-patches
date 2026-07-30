package p149l;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class u5e0 {

    /* JADX INFO: renamed from: a */
    public OverScroller f174697a;

    public u5e0(Context context, Interpolator interpolator) {
        this.f174697a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public static u5e0 m191858c(Context context) {
        return m191859d(context, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static u5e0 m191859d(Context context, Interpolator interpolator) {
        return new u5e0(context, interpolator);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public void m191860a() {
        this.f174697a.abortAnimation();
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public boolean m191861b() {
        return this.f174697a.computeScrollOffset();
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public void m191862e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f174697a.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public int m191863f() {
        return this.f174697a.getCurrX();
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public int m191864g() {
        return this.f174697a.getCurrY();
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public boolean m191865h() {
        return this.f174697a.isFinished();
    }
}
