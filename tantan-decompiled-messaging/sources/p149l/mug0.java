package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.ActionPageFormat;
import com.p046p1.mobile.putong.core.data.CardPattern;
import com.p046p1.mobile.putong.core.newui.suggest.SuggesterItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mug0 extends dac0<CardPattern> {

    /* JADX INFO: renamed from: c */
    public ArrayList<CardPattern> f135785c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public avg0 f135786d;

    /* JADX INFO: renamed from: e */
    public Act f135787e;

    /* JADX INFO: renamed from: f */
    public ActionPageFormat f135788f;

    public mug0(avg0 avg0Var) {
        this.f135786d = avg0Var;
        this.f135787e = avg0Var.act();
        this.f135788f = avg0Var.m99183i0();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f135785c.size() + 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        Act act = this.f135787e;
        return i == 0 ? act.inflater().inflate(f6c0.f95729cc, viewGroup, false) : act.inflater().inflate(f6c0.f95780fc, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final CardPattern cardPattern, int i, int i2) {
        if (i == 0) {
            TextView textView = (TextView) view.findViewById(u4c0.f174268ge);
            TextView textView2 = (TextView) view.findViewById(u4c0.f173973P1);
            textView.setText(this.f135788f.pageSubTitle);
            textView2.setText(this.f135788f.pageContext);
            return;
        }
        if (i == 1) {
            final SuggesterItemView suggesterItemView = (SuggesterItemView) view;
            suggesterItemView.m43585o(cardPattern, new d30() { // from class: l.jug0
                @Override // p149l.d30
                public final void call() {
                    this.f119788a.m156398J(cardPattern, suggesterItemView);
                }
            }, new d30() { // from class: l.kug0
                @Override // p149l.d30
                public final void call() {
                    this.f124687a.m156399K(cardPattern, suggesterItemView);
                }
            }, new d30() { // from class: l.lug0
                @Override // p149l.d30
                public final void call() {
                    this.f130058a.m156400L(cardPattern, suggesterItemView);
                }
            });
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public CardPattern getItem(int i) {
        if (i == 0) {
            return null;
        }
        return this.f135785c.get(i - 1);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m156398J(CardPattern cardPattern, SuggesterItemView suggesterItemView) {
        this.f135786d.m99190q0(cardPattern, suggesterItemView.getUser());
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m156399K(CardPattern cardPattern, SuggesterItemView suggesterItemView) {
        this.f135786d.m99190q0(cardPattern, suggesterItemView.getUser());
        this.f135786d.m99187n0(true);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m156400L(CardPattern cardPattern, SuggesterItemView suggesterItemView) {
        this.f135786d.m99190q0(cardPattern, suggesterItemView.getUser());
        this.f135786d.m99189p0();
    }

    /* JADX INFO: renamed from: M */
    public int m156401M(CardPattern cardPattern) {
        return this.f135785c.indexOf(cardPattern) + 1;
    }

    /* JADX INFO: renamed from: N */
    public int m156402N(CardPattern cardPattern) {
        int iIndexOf = this.f135785c.indexOf(cardPattern);
        if (iIndexOf >= 0) {
            this.f135785c.remove(cardPattern);
        }
        return iIndexOf + 1;
    }

    /* JADX INFO: renamed from: O */
    public void m156403O(List<CardPattern> list) {
        this.f135785c.clear();
        if (!vwb.m200296J(list)) {
            this.f135785c.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }
}
