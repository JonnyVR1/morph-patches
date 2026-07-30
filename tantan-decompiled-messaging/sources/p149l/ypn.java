package p149l;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class ypn extends pod {
    @Override // p149l.pod, p149l.jn2
    /* JADX INFO: renamed from: d */
    public int mo107794d() {
        return 0;
    }

    @Override // p149l.pod, p149l.jn2
    /* JADX INFO: renamed from: g */
    public void mo142265g(int i, int i2, View view, int i3, pol0 pol0Var) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(size - (mo107800s() * 2), 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - mo107799r()) - mo107801t(), 1073741824));
    }

    @Override // p149l.pod, p149l.jn2
    /* JADX INFO: renamed from: m */
    public int mo107797m() {
        return 3;
    }

    @Override // p149l.pod
    /* JADX INFO: renamed from: r */
    public int mo107799r() {
        return 0;
    }
}
