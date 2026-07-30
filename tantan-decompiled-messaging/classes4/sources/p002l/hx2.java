package p002l;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import l.d1q;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hx2 extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public final int f12332a;

    public hx2(int i) {
        this.f12332a = i;
    }

    /* JADX INFO: renamed from: H */
    public final void m14901H(int i, TextView textView) {
        Resources resources = textView.getResources();
        if (i == -1) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        if (i == 1) {
            textView.setTextColor(resources.getColor(h1c0.f11743N0));
        } else if (i == 2) {
            textView.setTextColor(resources.getColor(h1c0.f11781e0));
        } else if (i != 3) {
            textView.setTextColor(resources.getColor(h1c0.f11765Y0));
        } else {
            textView.setTextColor(resources.getColor(h1c0.f11778d0));
        }
        textView.setText(String.valueOf(i));
    }

    /* JADX INFO: renamed from: o */
    public int m14902o() {
        return t6c0.f19810d3;
    }

    /* JADX INFO: renamed from: u */
    public void m14903u(View view) {
        super.u(view);
        m14901H(this.f12332a, (TextView) view.findViewById(g5c0.f10946R4));
    }
}
