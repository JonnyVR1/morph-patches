package p002l;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mo40 extends ex00 {
    @Override // p002l.ex00
    /* JADX INFO: renamed from: b */
    public void mo10326b() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f10037a.f12330c;
        if (viewGroup2 != null) {
            xdl0.M(viewGroup2, false);
        }
        hx00.C0612a c0612a = this.f10037a;
        if (c0612a.f12331d == null || (viewGroup = c0612a.f12329b) == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f10037a.f12329b.getHeight();
        FrameLayout.LayoutParams layoutParamsM12797a = ex00.m12797a(this.f10037a.f12331d);
        layoutParamsM12797a.topMargin = 0;
        layoutParamsM12797a.width = width;
        layoutParamsM12797a.height = height;
        layoutParamsM12797a.leftMargin = 0;
        this.f10037a.f12331d.setLayoutParams(layoutParamsM12797a);
        xdl0.M(this.f10037a.f12331d, true);
        xdl0.M(this.f10037a.f12329b, true);
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: e */
    public void mo10328e(hx00.C0612a c0612a) {
        super.mo10328e(c0612a);
        mo10326b();
    }

    @Override // p002l.ex00
    /* JADX INFO: renamed from: c */
    public void mo10327c() {
    }
}
