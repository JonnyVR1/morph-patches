package p153l;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class upd extends qn2 {
    @Override // p153l.qn2
    /* JADX INFO: renamed from: d */
    public int mo98955d() {
        return this.f158456a.m169659n(5.0f);
    }

    @Override // p153l.qn2
    /* JADX INFO: renamed from: g */
    public void mo177171g(int i, int i2, View view, int i3, txl0 txl0Var) {
        int iMo98959r;
        int iMo98961t;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMo98960s = size - (mo98960s() * 2);
        if (mo141295b()) {
            iMo98959r = (size2 - ((mo98958m() - 1) * mo98955d())) - mo98959r();
            iMo98961t = mo98961t();
        } else {
            iMo98959r = size2 - mo98959r();
            iMo98961t = mo98961t();
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(iMo98960s, 1073741824), View.MeasureSpec.makeMeasureSpec(iMo98959r - iMo98961t, 1073741824));
    }

    @Override // p153l.qn2
    /* JADX INFO: renamed from: l */
    public void mo177175l(View view, int i, int i2, int i3, int i4, int i5, boolean z, txl0 txl0Var) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iMo98960s = mo98960s();
        if (mo141296q()) {
            int iMo98959r = (i5 - i3) - mo98959r();
            view.layout(iMo98960s, iMo98959r - measuredHeight, measuredWidth + iMo98960s, iMo98959r);
        } else {
            int iMo98961t = mo98961t();
            view.layout(iMo98960s, iMo98961t, measuredWidth + iMo98960s, measuredHeight + iMo98961t);
        }
    }

    @Override // p153l.qn2
    /* JADX INFO: renamed from: m */
    public int mo98958m() {
        return 4;
    }

    /* JADX INFO: renamed from: r */
    public int mo98959r() {
        return this.f158456a.m169659n(5.0f);
    }

    /* JADX INFO: renamed from: s */
    public int mo98960s() {
        return this.f158456a.m169659n(0.0f);
    }

    /* JADX INFO: renamed from: t */
    public int mo98961t() {
        return this.f158456a.m169659n(0.0f);
    }
}
