package p153l;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class wx2 extends d3q<View> {

    /* JADX INFO: renamed from: a */
    public final int f191357a;

    public wx2(int i) {
        this.f191357a = i;
    }

    /* JADX INFO: renamed from: H */
    public final void m208365H(int i, TextView textView) {
        Resources resources = textView.getResources();
        if (i == -1) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        if (i == 1) {
            textView.setTextColor(resources.getColor(n9c0.f140784N0));
        } else if (i == 2) {
            textView.setTextColor(resources.getColor(n9c0.f140822e0));
        } else if (i != 3) {
            textView.setTextColor(resources.getColor(n9c0.f140806Y0));
        } else {
            textView.setTextColor(resources.getColor(n9c0.f140819d0));
        }
        textView.setText(String.valueOf(i));
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f199046d3;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: u */
    public void mo71749u(View view) {
        super.mo71749u(view);
        m208365H(this.f191357a, (TextView) view.findViewById(mdc0.f136041R4));
    }
}
