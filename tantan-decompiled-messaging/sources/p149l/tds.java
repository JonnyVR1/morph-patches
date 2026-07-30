package p149l;

import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class tds extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public int f169751a;

    /* JADX INFO: renamed from: b */
    public int f169752b;

    public tds(int i) {
        this.f169751a = i;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162777n;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(View view) {
        super.mo70566u(view);
        int i = this.f169751a;
        if (i > 0) {
            xdl0.m208325C0(view, i);
        }
        int i2 = this.f169752b;
        if (i2 > 0) {
            xdl0.m208327D0(i2, view);
        }
    }
}
