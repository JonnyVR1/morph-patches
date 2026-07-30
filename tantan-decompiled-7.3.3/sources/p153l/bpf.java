package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.explore.HomeExploreFrag;
import com.p051p1.mobile.putong.core.newui.explore.bifrost.ExploreCardStack;
import com.p051p1.mobile.putong.core.newui.explore.view.ExploreCardItemView;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class bpf extends nx2 {

    /* JADX INFO: renamed from: b */
    public ExploreCardStack f77776b;

    /* JADX INFO: renamed from: c */
    public List<epf> f77777c;

    /* JADX INFO: renamed from: d */
    public HomeExploreFrag f77778d;

    public bpf(HomeExploreFrag homeExploreFrag, ExploreCardStack exploreCardStack) {
        this.f77778d = homeExploreFrag;
        this.f77776b = exploreCardStack;
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: d */
    public void mo105829d(View view, int i) {
        ExploreCardItemView exploreCardItemView = (ExploreCardItemView) view;
        epf epfVar = this.f77777c.get(i);
        exploreCardItemView.m37386X(this.f77778d, epfVar);
        if (i != 0 || epfVar == null) {
            return;
        }
        exploreCardItemView.m37376H(epfVar);
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: e */
    public View mo105830e(int i, Context context, LayoutInflater layoutInflater) {
        return layoutInflater.inflate(kec0.f125740a3, (ViewGroup) this.f77776b, false);
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: f */
    public int mo105831f() {
        List<epf> list = this.f77777c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: g */
    public Object mo105832g(int i) {
        return this.f77777c.get(i);
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: h */
    public int mo105833h(int i) {
        return 0;
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: i */
    public String mo105834i(int i) {
        return this.f77777c.get(i).f95241b.f56859id;
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: m */
    public void mo105836m(txl0 txl0Var) {
        this.f77777c.remove(0);
        if (this.f77777c.size() < 2) {
            this.f77778d.m37362T4();
        }
        if (this.f77777c.size() == 0) {
            this.f77778d.m37358O4();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m105837n(List<epf> list) {
        this.f77777c = list;
        mo140726a();
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: l */
    public void mo105835l(View view, boolean z) {
    }
}
