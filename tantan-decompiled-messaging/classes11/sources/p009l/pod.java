package p009l;

import android.view.View;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pod extends jn2 {
    @Override // p009l.jn2
    /* JADX INFO: renamed from: d */
    public int mo12722d() {
        return this.f15230a.m26027n(5.0f);
    }

    @Override // p009l.jn2
    /* JADX INFO: renamed from: g */
    public void mo17168g(int i, int i2, View view, int i3, pol0 pol0Var) {
        int iMo12727r;
        int iMo12729t;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMo12728s = size - (mo12728s() * 2);
        if (mo12721b()) {
            iMo12727r = (size2 - ((mo12725m() - 1) * mo12722d())) - mo12727r();
            iMo12729t = mo12729t();
        } else {
            iMo12727r = size2 - mo12727r();
            iMo12729t = mo12729t();
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(iMo12728s, 1073741824), View.MeasureSpec.makeMeasureSpec(iMo12727r - iMo12729t, 1073741824));
    }

    @Override // p009l.jn2
    /* JADX INFO: renamed from: l */
    public void mo17172l(View view, int i, int i2, int i3, int i4, int i5, boolean z, pol0 pol0Var) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iMo12728s = mo12728s();
        if (mo12726q()) {
            int iMo12727r = (i5 - i3) - mo12727r();
            view.layout(iMo12728s, iMo12727r - measuredHeight, measuredWidth + iMo12728s, iMo12727r);
        } else {
            int iMo12729t = mo12729t();
            view.layout(iMo12728s, iMo12729t, measuredWidth + iMo12728s, measuredHeight + iMo12729t);
        }
    }

    @Override // p009l.jn2
    /* JADX INFO: renamed from: m */
    public int mo12725m() {
        return 4;
    }

    /* JADX INFO: renamed from: r */
    public int mo12727r() {
        return this.f15230a.m26027n(5.0f);
    }

    /* JADX INFO: renamed from: s */
    public int mo12728s() {
        return this.f15230a.m26027n(0.0f);
    }

    /* JADX INFO: renamed from: t */
    public int mo12729t() {
        return this.f15230a.m26027n(0.0f);
    }
}
