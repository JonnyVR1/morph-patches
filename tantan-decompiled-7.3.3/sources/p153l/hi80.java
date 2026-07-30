package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p051p1.mobile.putong.core.newui.poi.bifrost.PoiTraceCardStack;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class hi80 extends nx2 {

    /* JADX INFO: renamed from: b */
    public PoiTraceCardStack f109994b;

    /* JADX INFO: renamed from: c */
    public List<ji80> f109995c;

    /* JADX INFO: renamed from: d */
    public FeedPoiTraceFrag f109996d;

    public hi80(FeedPoiTraceFrag feedPoiTraceFrag, PoiTraceCardStack poiTraceCardStack) {
        this.f109996d = feedPoiTraceFrag;
        this.f109994b = poiTraceCardStack;
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: d */
    public void mo105829d(View view, int i) {
        FeedPoiCardItemView feedPoiCardItemView = (FeedPoiCardItemView) view;
        ji80 ji80Var = this.f109995c.get(i);
        feedPoiCardItemView.m44195q(this.f109996d, ji80Var);
        if (i == 0) {
            feedPoiCardItemView.m44192n(ji80Var.f121050b);
            feedPoiCardItemView.m44193o(ji80Var.f121051c);
        }
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: e */
    public View mo105830e(int i, Context context, LayoutInflater layoutInflater) {
        return layoutInflater.inflate(kec0.f125505L8, (ViewGroup) this.f109994b, false);
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: f */
    public int mo105831f() {
        List<ji80> list = this.f109995c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: g */
    public Object mo105832g(int i) {
        return this.f109995c.get(i);
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: h */
    public int mo105833h(int i) {
        return 0;
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: i */
    public String mo105834i(int i) {
        return this.f109995c.get(i).f121050b.f56859id;
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: m */
    public void mo105836m(txl0 txl0Var) {
        this.f109995c.remove(0);
        if (this.f109995c.size() == 0) {
            this.f109996d.m44137R4();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m135110n(ji80 ji80Var) {
        if (this.f109995c == null) {
            this.f109995c = new ArrayList();
        }
        this.f109995c.add(0, ji80Var);
        mo140726a();
    }

    /* JADX INFO: renamed from: o */
    public void m135111o(List<ji80> list) {
        this.f109995c = list;
        mo140726a();
    }

    @Override // p153l.nx2
    /* JADX INFO: renamed from: l */
    public void mo105835l(View view, boolean z) {
    }
}
