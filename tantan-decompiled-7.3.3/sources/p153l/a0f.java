package p153l;

import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes5.dex */
public class a0f extends d3q<LinearLayout> {

    /* JADX INFO: renamed from: a */
    public String f67708a;

    @Override // p153l.d3q
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo71749u(LinearLayout linearLayout) {
        super.mo71749u(linearLayout);
        ((TextView) linearLayout.findViewById(mdc0.f135944G6)).setText(this.f67708a);
    }

    /* JADX INFO: renamed from: I */
    public a0f m95342I(String str) {
        this.f67708a = str;
        return this;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: o */
    public int mo71748o() {
        return yec0.f198707B3;
    }

    @Override // p153l.d3q
    /* JADX INFO: renamed from: r */
    public int mo95343r() {
        return pv70.f154268s;
    }
}
