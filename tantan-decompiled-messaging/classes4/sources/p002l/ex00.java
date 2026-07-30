package p002l;

import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class ex00 {

    /* JADX INFO: renamed from: a */
    public hx00.C0612a f10037a;

    /* JADX INFO: renamed from: a */
    public static FrameLayout.LayoutParams m12797a(SurfaceView surfaceView) {
        if (surfaceView != null && surfaceView.getLayoutParams() != null) {
            return (FrameLayout.LayoutParams) surfaceView.getLayoutParams();
        }
        int i = xdl0.e;
        return new FrameLayout.LayoutParams(i, i);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo10326b();

    /* JADX INFO: renamed from: c */
    public abstract void mo10327c();

    /* JADX INFO: renamed from: d */
    public void m12798d() {
        hx00.C0612a c0612a = this.f10037a;
        if (c0612a != null) {
            c0612a.f12329b = null;
            c0612a.f12331d = null;
            ViewGroup viewGroup = c0612a.f12330c;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                xdl0.M(this.f10037a.f12330c, false);
            }
            this.f10037a.f12330c = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo10328e(hx00.C0612a c0612a) {
        this.f10037a = c0612a;
    }
}
