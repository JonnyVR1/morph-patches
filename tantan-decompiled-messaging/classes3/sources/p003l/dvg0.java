package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.baidu.mapapi.search.sug.SuggestionResult;
import com.p000p1.mobile.putong.core.p001ui.map.MapPoiItem;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class dvg0 extends AbstractC0158a<SuggestionResult.SuggestionInfo> {

    /* JADX INFO: renamed from: c */
    public List<SuggestionResult.SuggestionInfo> f3123c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f3124d;

    /* JADX INFO: renamed from: e */
    public me3 f3125e;

    /* JADX INFO: renamed from: f */
    public f30<me3, SuggestionResult.SuggestionInfo> f3126f;

    public dvg0(me3 me3Var, Act act, f30<me3, SuggestionResult.SuggestionInfo> f30Var) {
        this.f3124d = act;
        this.f3125e = me3Var;
        this.f3126f = f30Var;
    }

    @Override // p003l.wp1
    /* JADX INFO: renamed from: m */
    public View mo1006m(ViewGroup viewGroup, int i) {
        return this.f3124d.inflater().inflate(f6c0.Nd, viewGroup, false);
    }

    @Override // p003l.AbstractC0158a
    /* JADX INFO: renamed from: p */
    public List<SuggestionResult.SuggestionInfo> mo1912p() {
        return this.f3123c;
    }

    @Override // p003l.wp1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo1005j(View view, SuggestionResult.SuggestionInfo suggestionInfo, int i, int i2) {
        ((MapPoiItem) view).m408S(suggestionInfo, this.f3125e, this.f3126f);
    }

    /* JADX INFO: renamed from: t */
    public void m3742t(List<SuggestionResult.SuggestionInfo> list, e30 e30Var) {
        this.f3123c = list;
        e30Var.call(list);
        notifyDataSetChanged();
    }
}
