package p149l;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class mo40 extends ex00 {
    @Override // p149l.ex00
    /* JADX INFO: renamed from: b */
    public void mo101817b() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f93563a.f109822c;
        if (viewGroup2 != null) {
            xdl0.m208344M(viewGroup2, false);
        }
        hx00.C17423a c17423a = this.f93563a;
        if (c17423a.f109823d == null || (viewGroup = c17423a.f109821b) == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f93563a.f109821b.getHeight();
        FrameLayout.LayoutParams layoutParamsM118529a = ex00.m118529a(this.f93563a.f109823d);
        layoutParamsM118529a.topMargin = 0;
        layoutParamsM118529a.width = width;
        layoutParamsM118529a.height = height;
        layoutParamsM118529a.leftMargin = 0;
        this.f93563a.f109823d.setLayoutParams(layoutParamsM118529a);
        xdl0.m208344M(this.f93563a.f109823d, true);
        xdl0.m208344M(this.f93563a.f109821b, true);
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: e */
    public void mo101819e(hx00.C17423a c17423a) {
        super.mo101819e(c17423a);
        mo101817b();
    }

    @Override // p149l.ex00
    /* JADX INFO: renamed from: c */
    public void mo101818c() {
    }
}
