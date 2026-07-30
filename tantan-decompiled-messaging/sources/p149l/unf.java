package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.explore.HomeExploreFrag;
import com.p046p1.mobile.putong.core.newui.explore.bifrost.ExploreCardStack;
import com.p046p1.mobile.putong.core.newui.explore.view.ExploreCardItemView;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class unf extends yw2 {

    /* JADX INFO: renamed from: b */
    public ExploreCardStack f177358b;

    /* JADX INFO: renamed from: c */
    public List<xnf> f177359c;

    /* JADX INFO: renamed from: d */
    public HomeExploreFrag f177360d;

    public unf(HomeExploreFrag homeExploreFrag, ExploreCardStack exploreCardStack) {
        this.f177360d = homeExploreFrag;
        this.f177358b = exploreCardStack;
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: d */
    public void mo100897d(View view, int i) {
        ExploreCardItemView exploreCardItemView = (ExploreCardItemView) view;
        xnf xnfVar = this.f177359c.get(i);
        exploreCardItemView.m36383X(this.f177360d, xnfVar);
        if (i != 0 || xnfVar == null) {
            return;
        }
        exploreCardItemView.m36373H(xnfVar);
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: e */
    public View mo100898e(int i, Context context, LayoutInflater layoutInflater) {
        return layoutInflater.inflate(f6c0.f95686a3, (ViewGroup) this.f177358b, false);
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: f */
    public int mo100899f() {
        List<xnf> list = this.f177359c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: g */
    public Object mo100900g(int i) {
        return this.f177359c.get(i);
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: h */
    public int mo100901h(int i) {
        return 0;
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: i */
    public String mo100902i(int i) {
        return this.f177359c.get(i).f193672b.f56011id;
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: m */
    public void mo100904m(pol0 pol0Var) {
        this.f177359c.remove(0);
        if (this.f177359c.size() < 2) {
            this.f177360d.m36359T4();
        }
        if (this.f177359c.size() == 0) {
            this.f177360d.m36355O4();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m194421n(List<xnf> list) {
        this.f177359c = list;
        mo104259a();
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: l */
    public void mo100903l(View view, boolean z) {
    }
}
