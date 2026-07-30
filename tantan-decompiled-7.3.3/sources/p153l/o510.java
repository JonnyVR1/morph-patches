package p153l;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o510 {

    /* JADX INFO: renamed from: a */
    public r510.C19765a f145026a;

    /* JADX INFO: renamed from: a */
    public static FrameLayout.LayoutParams m166083a(SurfaceView surfaceView) {
        if (surfaceView != null && surfaceView.getLayoutParams() != null) {
            return (FrameLayout.LayoutParams) surfaceView.getLayoutParams();
        }
        int i = bnl0.f77544e;
        return new FrameLayout.LayoutParams(i, i);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo100754b();

    /* JADX INFO: renamed from: c */
    public abstract void mo100755c();

    /* JADX INFO: renamed from: d */
    public void m166084d() {
        r510.C19765a c19765a = this.f145026a;
        if (c19765a != null) {
            c19765a.f161277b = null;
            c19765a.f161279d = null;
            ViewGroup viewGroup = c19765a.f161278c;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                bnl0.m105524M(this.f145026a.f161278c, false);
            }
            this.f145026a.f161278c = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo100756e(r510.C19765a c19765a) {
        this.f145026a = c19765a;
    }
}
