package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.square.search.recent.LiveSearchRecentItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class pkt extends gac0<wq2> {

    /* JADX INFO: renamed from: d */
    public final List<wq2> f150029d;

    public pkt(List<wq2> list, e30<wq2> e30Var) {
        super(e30Var);
        ArrayList arrayList = new ArrayList();
        this.f150029d = arrayList;
        arrayList.addAll(list);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f150029d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return View.inflate(viewGroup.getContext(), s6c0.f162784p0, null);
    }

    @Override // p149l.gac0, p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, wq2 wq2Var, int i, int i2) {
        super.mo28823A(view, wq2Var, i, i2);
        ((LiveSearchRecentItemView) view).m70837b(wq2Var);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public wq2 getItem(int i) {
        return this.f150029d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m170058I(List<wq2> list) {
        this.f150029d.clear();
        this.f150029d.addAll(list);
        notifyDataSetChanged();
    }
}
