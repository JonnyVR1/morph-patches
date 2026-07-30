package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkContributor;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.ContributorItemView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class f26 extends gac0<PkContributor> {

    /* JADX INFO: renamed from: d */
    public List<PkContributor> f94151d;

    public f26(e30<PkContributor> e30Var) {
        super(e30Var);
        this.f94151d = new ArrayList();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int mo28824C() {
        if (this.f94151d.size() > 3) {
            return 3;
        }
        return this.f94151d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return View.inflate(viewGroup.getContext(), t6c0.f168180S4, null);
    }

    @Override // p149l.gac0, p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, PkContributor pkContributor, int i, int i2) {
        super.mo28823A(view, pkContributor, i, i2);
        ((ContributorItemView) view).m76137b(pkContributor);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public PkContributor getItem(int i) {
        return this.f94151d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m119162I(List<PkContributor> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        Collections.sort(list);
        this.f94151d.clear();
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setRank(i);
        }
        this.f94151d.addAll(list);
        notifyDataSetChanged();
    }
}
