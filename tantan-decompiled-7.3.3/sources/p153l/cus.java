package p153l;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public class cus extends d3q<View> {
    private final View.OnClickListener listener;

    public cus(View.OnClickListener onClickListener) {
        this.listener = onClickListener;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return xec0.f193852c2;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: q */
    public int mo96608q() {
        return 6;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(View view) {
        super.mo71749u(view);
        view.findViewById(ldc0.f131583o1).setOnClickListener(this.listener);
    }
}
