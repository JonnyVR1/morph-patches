package p153l;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class yrn extends upd {
    @Override // p153l.upd, p153l.qn2
    /* JADX INFO: renamed from: d */
    public int mo98955d() {
        return 0;
    }

    @Override // p153l.upd, p153l.qn2
    /* JADX INFO: renamed from: g */
    public void mo177171g(int i, int i2, View view, int i3, txl0 txl0Var) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(size - (mo98960s() * 2), 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - mo98959r()) - mo98961t(), 1073741824));
    }

    @Override // p153l.upd, p153l.qn2
    /* JADX INFO: renamed from: m */
    public int mo98958m() {
        return 3;
    }

    @Override // p153l.upd
    /* JADX INFO: renamed from: r */
    public int mo98959r() {
        return 0;
    }
}
