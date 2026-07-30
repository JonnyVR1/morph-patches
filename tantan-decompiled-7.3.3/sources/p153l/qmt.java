package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.square.search.recent.LiveSearchRecentItemView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class qmt extends mic0<mr2> {

    /* JADX INFO: renamed from: d */
    public final List<mr2> f158417d;

    public qmt(List<mr2> list, y20<mr2> y20Var) {
        super(y20Var);
        ArrayList arrayList = new ArrayList();
        this.f158417d = arrayList;
        arrayList.addAll(list);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f158417d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return View.inflate(viewGroup.getContext(), xec0.f193898p0, null);
    }

    @Override // p153l.mic0, p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, mr2 mr2Var, int i, int i2) {
        super.mo29822A(view, mr2Var, i, i2);
        ((LiveSearchRecentItemView) view).m72020b(mr2Var);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public mr2 getItem(int i) {
        return this.f158417d.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m177146I(List<mr2> list) {
        this.f158417d.clear();
        this.f158417d.addAll(list);
        notifyDataSetChanged();
    }
}
