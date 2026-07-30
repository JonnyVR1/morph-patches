package p149l;

import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes13.dex */
public class i3l0 extends fx00 {

    /* JADX INFO: renamed from: b */
    public C17475a f111341b;

    /* JADX INFO: renamed from: c */
    public boolean f111342c;

    /* JADX INFO: renamed from: l.i3l0$a */
    public static class C17475a {

        /* JADX INFO: renamed from: a */
        public long f111343a;

        /* JADX INFO: renamed from: b */
        public SurfaceView f111344b;

        /* JADX INFO: renamed from: c */
        public boolean f111345c = true;

        public C17475a(long j, SurfaceView surfaceView) {
            this.f111343a = j;
            this.f111344b = surfaceView;
        }

        /* JADX INFO: renamed from: a */
        public void m134266a(boolean z) {
            this.f111345c = z;
        }
    }

    public i3l0(boolean z) {
        this.f111342c = z;
    }

    @Override // p149l.fx00
    /* JADX INFO: renamed from: a */
    public void mo123612a() {
        if (this.f111341b == null) {
            return;
        }
        this.f99718a.f104815c.removeAllViews();
        this.f99718a.f104815c.addView(this.f111341b.f111344b);
    }

    @Override // p149l.fx00
    /* JADX INFO: renamed from: b */
    public void mo123613b() {
        ViewGroup viewGroup = this.f99718a.f104815c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.f99718a.f104814b;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m134263e(long j, SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        this.f111341b = new C17475a(j, surfaceView);
        xdl0.m208344M(this.f99718a.f104815c, true);
        this.f111341b.m134266a(true);
        mo123612a();
    }

    /* JADX INFO: renamed from: f */
    public void m134264f() {
        ViewGroup viewGroup;
        this.f111341b = null;
        gx00.C17185a c17185a = this.f99718a;
        if (c17185a == null || (viewGroup = c17185a.f104815c) == null) {
            return;
        }
        viewGroup.removeAllViews();
    }

    /* JADX INFO: renamed from: g */
    public void m134265g(Long l2, boolean z) {
        C17475a c17475a;
        if (!this.f111342c || (c17475a = this.f111341b) == null || c17475a.f111343a != l2.longValue()) {
            if (TextUtils.equals(l9s.m149093o0(), String.valueOf(l2))) {
                xdl0.m208344M(this.f99718a.f104814b, z);
                xdl0.m208344M(this.f99718a.f104816d, z);
                return;
            }
            return;
        }
        C17475a c17475a2 = this.f111341b;
        boolean z2 = c17475a2.f111345c;
        c17475a2.m134266a(z);
        if (z != z2) {
            xdl0.m208344M(this.f99718a.f104815c, z);
            xdl0.m208344M(this.f111341b.f111344b, z);
        }
    }
}
