package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.baidu.mapapi.search.sug.SuggestionResult;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.map.MapPoiItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class dvg0 extends AbstractC15503a<SuggestionResult.SuggestionInfo> {

    /* JADX INFO: renamed from: c */
    public List<SuggestionResult.SuggestionInfo> f88058c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f88059d;

    /* JADX INFO: renamed from: e */
    public me3 f88060e;

    /* JADX INFO: renamed from: f */
    public f30<me3, SuggestionResult.SuggestionInfo> f88061f;

    public dvg0(me3 me3Var, Act act, f30<me3, SuggestionResult.SuggestionInfo> f30Var) {
        this.f88059d = act;
        this.f88060e = me3Var;
        this.f88061f = f30Var;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        return this.f88059d.inflater().inflate(f6c0.f95488Nd, viewGroup, false);
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<SuggestionResult.SuggestionInfo> mo20404p() {
        return this.f88058c;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, SuggestionResult.SuggestionInfo suggestionInfo, int i, int i2) {
        ((MapPoiItem) view).m47375S(suggestionInfo, this.f88060e, this.f88061f);
    }

    /* JADX INFO: renamed from: t */
    public void m113779t(List<SuggestionResult.SuggestionInfo> list, e30 e30Var) {
        this.f88058c = list;
        e30Var.call(list);
        notifyDataSetChanged();
    }
}
