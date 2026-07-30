package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.explore.HomeExploreFrag;
import com.p000p1.mobile.putong.core.newui.explore.bifrost.ExploreCardStack;
import com.p000p1.mobile.putong.core.newui.explore.view.ExploreCardItemView;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class unf extends yw2 {

    /* JADX INFO: renamed from: b */
    public ExploreCardStack f21265b;

    /* JADX INFO: renamed from: c */
    public List<xnf> f21266c;

    /* JADX INFO: renamed from: d */
    public HomeExploreFrag f21267d;

    public unf(HomeExploreFrag homeExploreFrag, ExploreCardStack exploreCardStack) {
        this.f21267d = homeExploreFrag;
        this.f21265b = exploreCardStack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.yw2
    /* JADX INFO: renamed from: d */
    public void mo11922d(View view, int i) {
        ExploreCardItemView exploreCardItemView = (ExploreCardItemView) view;
        xnf xnfVar = this.f21266c.get(i);
        exploreCardItemView.m312X(this.f21267d, xnfVar);
        if (i != 0 || xnfVar == null) {
            return;
        }
        exploreCardItemView.m302H(xnfVar);
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: e */
    public View mo11923e(int i, Context context, LayoutInflater layoutInflater) {
        return layoutInflater.inflate(f6c0.a3, (ViewGroup) this.f21265b, false);
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: f */
    public int mo11924f() {
        List<xnf> list = this.f21266c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: g */
    public Object mo11925g(int i) {
        return this.f21266c.get(i);
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: h */
    public int mo11926h(int i) {
        return 0;
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: i */
    public String mo11927i(int i) {
        return ((DbObject) this.f21266c.get(i).f22654b).id;
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: m */
    public void mo11929m(pol0 pol0Var) {
        this.f21266c.remove(0);
        if (this.f21266c.size() < 2) {
            this.f21267d.m286T4();
        }
        if (this.f21266c.size() == 0) {
            this.f21267d.m282O4();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m23083n(List<xnf> list) {
        this.f21266c = list;
        mo12312a();
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: l */
    public void mo11928l(View view, boolean z) {
    }
}
