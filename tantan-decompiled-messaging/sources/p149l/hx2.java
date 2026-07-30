package p149l;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class hx2 extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public final int f109824a;

    public hx2(int i) {
        this.f109824a = i;
    }

    /* JADX INFO: renamed from: H */
    public final void m133294H(int i, TextView textView) {
        Resources resources = textView.getResources();
        if (i == -1) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        if (i == 1) {
            textView.setTextColor(resources.getColor(h1c0.f105323N0));
        } else if (i == 2) {
            textView.setTextColor(resources.getColor(h1c0.f105361e0));
        } else if (i != 3) {
            textView.setTextColor(resources.getColor(h1c0.f105345Y0));
        } else {
            textView.setTextColor(resources.getColor(h1c0.f105358d0));
        }
        textView.setText(String.valueOf(i));
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168314d3;
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: u */
    public void mo70566u(View view) {
        super.mo70566u(view);
        m133294H(this.f109824a, (TextView) view.findViewById(g5c0.f100796R4));
    }
}
