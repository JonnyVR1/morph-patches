package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.ActionPageFormat;
import com.p051p1.mobile.putong.core.data.CardPattern;
import com.p051p1.mobile.putong.core.newui.suggest.SuggesterItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class u2h0 extends jic0<CardPattern> {

    /* JADX INFO: renamed from: c */
    public ArrayList<CardPattern> f177213c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public i3h0 f177214d;

    /* JADX INFO: renamed from: e */
    public Act f177215e;

    /* JADX INFO: renamed from: f */
    public ActionPageFormat f177216f;

    public u2h0(i3h0 i3h0Var) {
        this.f177214d = i3h0Var;
        this.f177215e = i3h0Var.act();
        this.f177216f = i3h0Var.m138292i0();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f177213c.size() + 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        Act act = this.f177215e;
        return i == 0 ? act.inflater().inflate(kec0.f125901jc, viewGroup, false) : act.inflater().inflate(kec0.f125952mc, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final CardPattern cardPattern, int i, int i2) {
        if (i == 0) {
            TextView textView = (TextView) view.findViewById(adc0.f70409je);
            TextView textView2 = (TextView) view.findViewById(adc0.f70061P1);
            textView.setText(this.f177216f.pageSubTitle);
            textView2.setText(this.f177216f.pageContext);
            return;
        }
        if (i == 1) {
            final SuggesterItemView suggesterItemView = (SuggesterItemView) view;
            suggesterItemView.m44771o(cardPattern, new x20() { // from class: l.r2h0
                @Override // p153l.x20
                public final void call() {
                    this.f160942a.m194267J(cardPattern, suggesterItemView);
                }
            }, new x20() { // from class: l.s2h0
                @Override // p153l.x20
                public final void call() {
                    this.f165892a.m194268K(cardPattern, suggesterItemView);
                }
            }, new x20() { // from class: l.t2h0
                @Override // p153l.x20
                public final void call() {
                    this.f171759a.m194269L(cardPattern, suggesterItemView);
                }
            });
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public CardPattern getItem(int i) {
        if (i == 0) {
            return null;
        }
        return this.f177213c.get(i - 1);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m194267J(CardPattern cardPattern, SuggesterItemView suggesterItemView) {
        this.f177214d.m138299q0(cardPattern, suggesterItemView.getUser());
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m194268K(CardPattern cardPattern, SuggesterItemView suggesterItemView) {
        this.f177214d.m138299q0(cardPattern, suggesterItemView.getUser());
        this.f177214d.m138296n0(true);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m194269L(CardPattern cardPattern, SuggesterItemView suggesterItemView) {
        this.f177214d.m138299q0(cardPattern, suggesterItemView.getUser());
        this.f177214d.m138298p0();
    }

    /* JADX INFO: renamed from: M */
    public int m194270M(CardPattern cardPattern) {
        return this.f177213c.indexOf(cardPattern) + 1;
    }

    /* JADX INFO: renamed from: N */
    public int m194271N(CardPattern cardPattern) {
        int iIndexOf = this.f177213c.indexOf(cardPattern);
        if (iIndexOf >= 0) {
            this.f177213c.remove(cardPattern);
        }
        return iIndexOf + 1;
    }

    /* JADX INFO: renamed from: O */
    public void m194272O(List<CardPattern> list) {
        this.f177213c.clear();
        if (!jyb.m147479J(list)) {
            this.f177213c.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
