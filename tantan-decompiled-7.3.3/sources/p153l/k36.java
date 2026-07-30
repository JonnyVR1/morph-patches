package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.bean.PkContributor;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.ContributorItemView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class k36 extends mic0<PkContributor> {

    /* JADX INFO: renamed from: d */
    public List<PkContributor> f123683d;

    public k36(y20<PkContributor> y20Var) {
        super(y20Var);
        this.f123683d = new ArrayList();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int mo29823C() {
        if (this.f123683d.size() > 3) {
            return 3;
        }
        return this.f123683d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return View.inflate(viewGroup.getContext(), yec0.f198912S4, null);
    }

    @Override // p153l.mic0, p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, PkContributor pkContributor, int i, int i2) {
        super.mo29822A(view, pkContributor, i, i2);
        ((ContributorItemView) view).m77320b(pkContributor);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public PkContributor getItem(int i) {
        return this.f123683d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m148001I(List<PkContributor> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        Collections.sort(list);
        this.f123683d.clear();
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setRank(i);
        }
        this.f123683d.addAll(list);
        notifyDataSetChanged();
    }
}
