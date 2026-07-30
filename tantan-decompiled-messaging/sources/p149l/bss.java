package p149l;

import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class bss extends d1q<View> {
    private final View.OnClickListener listener;

    public bss(View.OnClickListener onClickListener) {
        this.listener = onClickListener;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return s6c0.f162738c2;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: q */
    public int mo95844q() {
        return 6;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(View view) {
        super.mo70566u(view);
        view.findViewById(f5c0.f95126o1).setOnClickListener(this.listener);
    }
}
