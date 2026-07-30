package p149l;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ex00 {

    /* JADX INFO: renamed from: a */
    public hx00.C17423a f93563a;

    /* JADX INFO: renamed from: a */
    public static FrameLayout.LayoutParams m118529a(SurfaceView surfaceView) {
        if (surfaceView != null && surfaceView.getLayoutParams() != null) {
            return (FrameLayout.LayoutParams) surfaceView.getLayoutParams();
        }
        int i = xdl0.f192403e;
        return new FrameLayout.LayoutParams(i, i);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo101817b();

    /* JADX INFO: renamed from: c */
    public abstract void mo101818c();

    /* JADX INFO: renamed from: d */
    public void m118530d() {
        hx00.C17423a c17423a = this.f93563a;
        if (c17423a != null) {
            c17423a.f109821b = null;
            c17423a.f109823d = null;
            ViewGroup viewGroup = c17423a.f109822c;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                xdl0.m208344M(this.f93563a.f109822c, false);
            }
            this.f93563a.f109822c = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo101819e(hx00.C17423a c17423a) {
        this.f93563a = c17423a;
    }
}
