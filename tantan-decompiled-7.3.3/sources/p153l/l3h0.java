package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.baidu.mapapi.search.sug.SuggestionResult;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.map.MapPoiItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class l3h0 extends AbstractC15610a<SuggestionResult.SuggestionInfo> {

    /* JADX INFO: renamed from: c */
    public List<SuggestionResult.SuggestionInfo> f129879c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f129880d;

    /* JADX INFO: renamed from: e */
    public bf3 f129881e;

    /* JADX INFO: renamed from: f */
    public z20<bf3, SuggestionResult.SuggestionInfo> f129882f;

    public l3h0(bf3 bf3Var, Act act, z20<bf3, SuggestionResult.SuggestionInfo> z20Var) {
        this.f129880d = act;
        this.f129881e = bf3Var;
        this.f129882f = z20Var;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        return this.f129880d.inflater().inflate(kec0.f125654Ud, viewGroup, false);
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<SuggestionResult.SuggestionInfo> mo21403p() {
        return this.f129879c;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, SuggestionResult.SuggestionInfo suggestionInfo, int i, int i2) {
        ((MapPoiItem) view).m48558S(suggestionInfo, this.f129881e, this.f129882f);
    }

    /* JADX INFO: renamed from: t */
    public void m152707t(List<SuggestionResult.SuggestionInfo> list, y20 y20Var) {
        this.f129879c = list;
        y20Var.call(list);
        notifyDataSetChanged();
    }
}
