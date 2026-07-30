package p153l;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public class ax40 extends o510 {
    @Override // p153l.o510
    /* JADX INFO: renamed from: b */
    public void mo100754b() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f145026a.f161278c;
        if (viewGroup2 != null) {
            bnl0.m105524M(viewGroup2, false);
        }
        r510.C19765a c19765a = this.f145026a;
        if (c19765a.f161279d == null || (viewGroup = c19765a.f161277b) == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f145026a.f161277b.getHeight();
        FrameLayout.LayoutParams layoutParamsM166083a = o510.m166083a(this.f145026a.f161279d);
        layoutParamsM166083a.topMargin = 0;
        layoutParamsM166083a.width = width;
        layoutParamsM166083a.height = height;
        layoutParamsM166083a.leftMargin = 0;
        this.f145026a.f161279d.setLayoutParams(layoutParamsM166083a);
        bnl0.m105524M(this.f145026a.f161279d, true);
        bnl0.m105524M(this.f145026a.f161277b, true);
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: e */
    public void mo100756e(r510.C19765a c19765a) {
        super.mo100756e(c19765a);
        mo100754b();
    }

    @Override // p153l.o510
    /* JADX INFO: renamed from: c */
    public void mo100755c() {
    }
}
