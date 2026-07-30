package p009l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.newui.suggest.SuggesterItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ActionPageFormat;
import com.p1.mobile.putong.core.data.CardPattern;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.dac0;
import l.f6c0;
import l.u4c0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mug0 extends dac0<CardPattern> {

    /* JADX INFO: renamed from: c */
    public ArrayList<CardPattern> f17113c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public avg0 f17114d;

    /* JADX INFO: renamed from: e */
    public Act f17115e;

    /* JADX INFO: renamed from: f */
    public ActionPageFormat f17116f;

    public mug0(avg0 avg0Var) {
        this.f17114d = avg0Var;
        this.f17115e = avg0Var.act();
        this.f17116f = avg0Var.m11664i0();
    }

    /* JADX INFO: renamed from: C */
    public int m18638C() {
        return this.f17113c.size() + 1;
    }

    /* JADX INFO: renamed from: D */
    public View m18639D(ViewGroup viewGroup, int i) {
        Act act = this.f17115e;
        return i == 0 ? act.inflater().inflate(f6c0.cc, viewGroup, false) : act.inflater().inflate(f6c0.fc, viewGroup, false);
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m18637A(View view, final CardPattern cardPattern, int i, int i2) {
        if (i == 0) {
            TextView textView = (TextView) view.findViewById(u4c0.ge);
            TextView textView2 = (TextView) view.findViewById(u4c0.P1);
            textView.setText(this.f17116f.pageSubTitle);
            textView2.setText(this.f17116f.pageContext);
            return;
        }
        if (i == 1) {
            final SuggesterItemView suggesterItemView = (SuggesterItemView) view;
            suggesterItemView.m7831o(cardPattern, new d30() { // from class: l.jug0
                public final void call() {
                    this.f15328a.m18642J(cardPattern, suggesterItemView);
                }
            }, new d30() { // from class: l.kug0
                public final void call() {
                    this.f15858a.m18643K(cardPattern, suggesterItemView);
                }
            }, new d30() { // from class: l.lug0
                public final void call() {
                    this.f16418a.m18644L(cardPattern, suggesterItemView);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public CardPattern getItem(int i) {
        if (i == 0) {
            return null;
        }
        return this.f17113c.get(i - 1);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m18642J(CardPattern cardPattern, SuggesterItemView suggesterItemView) {
        this.f17114d.m11671q0(cardPattern, suggesterItemView.getUser());
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m18643K(CardPattern cardPattern, SuggesterItemView suggesterItemView) {
        this.f17114d.m11671q0(cardPattern, suggesterItemView.getUser());
        this.f17114d.m11668n0(true);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m18644L(CardPattern cardPattern, SuggesterItemView suggesterItemView) {
        this.f17114d.m11671q0(cardPattern, suggesterItemView.getUser());
        this.f17114d.m11670p0();
    }

    /* JADX INFO: renamed from: M */
    public int m18645M(CardPattern cardPattern) {
        return this.f17113c.indexOf(cardPattern) + 1;
    }

    /* JADX INFO: renamed from: N */
    public int m18646N(CardPattern cardPattern) {
        int iIndexOf = this.f17113c.indexOf(cardPattern);
        if (iIndexOf >= 0) {
            this.f17113c.remove(cardPattern);
        }
        return iIndexOf + 1;
    }

    /* JADX INFO: renamed from: O */
    public void m18647O(List<CardPattern> list) {
        this.f17113c.clear();
        if (!vwb.J(list)) {
            this.f17113c.addAll(list);
        }
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
