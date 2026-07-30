package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p000p1.mobile.putong.core.newui.poi.bifrost.PoiTraceCardStack;
import com.p000p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemView;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ba80 extends yw2 {

    /* JADX INFO: renamed from: b */
    public PoiTraceCardStack f9977b;

    /* JADX INFO: renamed from: c */
    public List<da80> f9978c;

    /* JADX INFO: renamed from: d */
    public FeedPoiTraceFrag f9979d;

    public ba80(FeedPoiTraceFrag feedPoiTraceFrag, PoiTraceCardStack poiTraceCardStack) {
        this.f9979d = feedPoiTraceFrag;
        this.f9977b = poiTraceCardStack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.yw2
    /* JADX INFO: renamed from: d */
    public void mo11922d(View view, int i) {
        FeedPoiCardItemView feedPoiCardItemView = (FeedPoiCardItemView) view;
        da80 da80Var = this.f9978c.get(i);
        feedPoiCardItemView.m7399q(this.f9979d, da80Var);
        if (i == 0) {
            feedPoiCardItemView.m7396n(da80Var.f11695b);
            feedPoiCardItemView.m7397o(da80Var.f11696c);
        }
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: e */
    public View mo11923e(int i, Context context, LayoutInflater layoutInflater) {
        return layoutInflater.inflate(f6c0.E8, (ViewGroup) this.f9977b, false);
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: f */
    public int mo11924f() {
        List<da80> list = this.f9978c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: g */
    public Object mo11925g(int i) {
        return this.f9978c.get(i);
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: h */
    public int mo11926h(int i) {
        return 0;
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: i */
    public String mo11927i(int i) {
        return ((DbObject) this.f9978c.get(i).f11695b).id;
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: m */
    public void mo11929m(pol0 pol0Var) {
        this.f9978c.remove(0);
        if (this.f9978c.size() == 0) {
            this.f9979d.m7338R4();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m11930n(da80 da80Var) {
        if (this.f9978c == null) {
            this.f9978c = new ArrayList();
        }
        this.f9978c.add(0, da80Var);
        mo12312a();
    }

    /* JADX INFO: renamed from: o */
    public void m11931o(List<da80> list) {
        this.f9978c = list;
        mo12312a();
    }

    @Override // p009l.yw2
    /* JADX INFO: renamed from: l */
    public void mo11928l(View view, boolean z) {
    }
}
