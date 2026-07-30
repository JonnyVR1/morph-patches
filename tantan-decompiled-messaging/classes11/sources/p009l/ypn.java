package p009l;

import android.view.View;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ypn extends pod {
    @Override // p009l.pod, p009l.jn2
    /* JADX INFO: renamed from: d */
    public int mo12722d() {
        return 0;
    }

    @Override // p009l.pod, p009l.jn2
    /* JADX INFO: renamed from: g */
    public void mo17168g(int i, int i2, View view, int i3, pol0 pol0Var) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        view.measure(View.MeasureSpec.makeMeasureSpec(size - (mo12728s() * 2), 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - mo12727r()) - mo12729t(), 1073741824));
    }

    @Override // p009l.pod, p009l.jn2
    /* JADX INFO: renamed from: m */
    public int mo12725m() {
        return 3;
    }

    @Override // p009l.pod
    /* JADX INFO: renamed from: r */
    public int mo12727r() {
        return 0;
    }
}
