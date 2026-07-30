package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p046p1.mobile.putong.core.newui.poi.bifrost.PoiTraceCardStack;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ba80 extends yw2 {

    /* JADX INFO: renamed from: b */
    public PoiTraceCardStack f74657b;

    /* JADX INFO: renamed from: c */
    public List<da80> f74658c;

    /* JADX INFO: renamed from: d */
    public FeedPoiTraceFrag f74659d;

    public ba80(FeedPoiTraceFrag feedPoiTraceFrag, PoiTraceCardStack poiTraceCardStack) {
        this.f74659d = feedPoiTraceFrag;
        this.f74657b = poiTraceCardStack;
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: d */
    public void mo100897d(View view, int i) {
        FeedPoiCardItemView feedPoiCardItemView = (FeedPoiCardItemView) view;
        da80 da80Var = this.f74658c.get(i);
        feedPoiCardItemView.m43184q(this.f74659d, da80Var);
        if (i == 0) {
            feedPoiCardItemView.m43181n(da80Var.f85198b);
            feedPoiCardItemView.m43182o(da80Var.f85199c);
        }
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: e */
    public View mo100898e(int i, Context context, LayoutInflater layoutInflater) {
        return layoutInflater.inflate(f6c0.f95339E8, (ViewGroup) this.f74657b, false);
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: f */
    public int mo100899f() {
        List<da80> list = this.f74658c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: g */
    public Object mo100900g(int i) {
        return this.f74658c.get(i);
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: h */
    public int mo100901h(int i) {
        return 0;
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: i */
    public String mo100902i(int i) {
        return this.f74658c.get(i).f85198b.f56011id;
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: m */
    public void mo100904m(pol0 pol0Var) {
        this.f74658c.remove(0);
        if (this.f74658c.size() == 0) {
            this.f74659d.m43126R4();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m100905n(da80 da80Var) {
        if (this.f74658c == null) {
            this.f74658c = new ArrayList();
        }
        this.f74658c.add(0, da80Var);
        mo104259a();
    }

    /* JADX INFO: renamed from: o */
    public void m100906o(List<da80> list) {
        this.f74658c = list;
        mo104259a();
    }

    @Override // p149l.yw2
    /* JADX INFO: renamed from: l */
    public void mo100903l(View view, boolean z) {
    }
}
