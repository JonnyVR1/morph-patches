package p149l;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class pod extends jn2 {
    @Override // p149l.jn2
    /* JADX INFO: renamed from: d */
    public int mo107794d() {
        return this.f118755a.m220545n(5.0f);
    }

    @Override // p149l.jn2
    /* JADX INFO: renamed from: g */
    public void mo142265g(int i, int i2, View view, int i3, pol0 pol0Var) {
        int iMo107799r;
        int iMo107801t;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int iMo107800s = size - (mo107800s() * 2);
        if (mo107793b()) {
            iMo107799r = (size2 - ((mo107797m() - 1) * mo107794d())) - mo107799r();
            iMo107801t = mo107801t();
        } else {
            iMo107799r = size2 - mo107799r();
            iMo107801t = mo107801t();
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(iMo107800s, 1073741824), View.MeasureSpec.makeMeasureSpec(iMo107799r - iMo107801t, 1073741824));
    }

    @Override // p149l.jn2
    /* JADX INFO: renamed from: l */
    public void mo142269l(View view, int i, int i2, int i3, int i4, int i5, boolean z, pol0 pol0Var) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iMo107800s = mo107800s();
        if (mo107798q()) {
            int iMo107799r = (i5 - i3) - mo107799r();
            view.layout(iMo107800s, iMo107799r - measuredHeight, measuredWidth + iMo107800s, iMo107799r);
        } else {
            int iMo107801t = mo107801t();
            view.layout(iMo107800s, iMo107801t, measuredWidth + iMo107800s, measuredHeight + iMo107801t);
        }
    }

    @Override // p149l.jn2
    /* JADX INFO: renamed from: m */
    public int mo107797m() {
        return 4;
    }

    /* JADX INFO: renamed from: r */
    public int mo107799r() {
        return this.f118755a.m220545n(5.0f);
    }

    /* JADX INFO: renamed from: s */
    public int mo107800s() {
        return this.f118755a.m220545n(0.0f);
    }

    /* JADX INFO: renamed from: t */
    public int mo107801t() {
        return this.f118755a.m220545n(0.0f);
    }
}
