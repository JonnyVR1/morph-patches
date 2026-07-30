package p153l;

import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes9.dex */
public class ncl0 extends p510 {

    /* JADX INFO: renamed from: b */
    public C18854a f141376b;

    /* JADX INFO: renamed from: c */
    public boolean f141377c;

    /* JADX INFO: renamed from: l.ncl0$a */
    public static class C18854a {

        /* JADX INFO: renamed from: a */
        public long f141378a;

        /* JADX INFO: renamed from: b */
        public SurfaceView f141379b;

        /* JADX INFO: renamed from: c */
        public boolean f141380c = true;

        public C18854a(long j, SurfaceView surfaceView) {
            this.f141378a = j;
            this.f141379b = surfaceView;
        }

        /* JADX INFO: renamed from: a */
        public void m162566a(boolean z) {
            this.f141380c = z;
        }
    }

    public ncl0(boolean z) {
        this.f141377c = z;
    }

    @Override // p153l.p510
    /* JADX INFO: renamed from: a */
    public void mo162561a() {
        if (this.f141376b == null) {
            return;
        }
        this.f150589a.f155654c.removeAllViews();
        this.f150589a.f155654c.addView(this.f141376b.f141379b);
    }

    @Override // p153l.p510
    /* JADX INFO: renamed from: b */
    public void mo162562b() {
        ViewGroup viewGroup = this.f150589a.f155654c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.f150589a.f155653b;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m162563e(long j, SurfaceView surfaceView) {
        if (surfaceView == null) {
            return;
        }
        this.f141376b = new C18854a(j, surfaceView);
        bnl0.m105524M(this.f150589a.f155654c, true);
        this.f141376b.m162566a(true);
        mo162561a();
    }

    /* JADX INFO: renamed from: f */
    public void m162564f() {
        ViewGroup viewGroup;
        this.f141376b = null;
        q510.C19522a c19522a = this.f150589a;
        if (c19522a == null || (viewGroup = c19522a.f155654c) == null) {
            return;
        }
        viewGroup.removeAllViews();
    }

    /* JADX INFO: renamed from: g */
    public void m162565g(Long l2, boolean z) {
        C18854a c18854a;
        if (!this.f141377c || (c18854a = this.f141376b) == null || c18854a.f141378a != l2.longValue()) {
            if (TextUtils.equals(mbs.m157870o0(), String.valueOf(l2))) {
                bnl0.m105524M(this.f150589a.f155653b, z);
                bnl0.m105524M(this.f150589a.f155655d, z);
                return;
            }
            return;
        }
        C18854a c18854a2 = this.f141376b;
        boolean z2 = c18854a2.f141380c;
        c18854a2.m162566a(z);
        if (z != z2) {
            bnl0.m105524M(this.f150589a.f155654c, z);
            bnl0.m105524M(this.f141376b.f141379b, z);
        }
    }
}
