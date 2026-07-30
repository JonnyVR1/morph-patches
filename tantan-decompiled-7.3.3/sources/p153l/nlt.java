package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.square.search.LiveSearchAct;
import com.p051p1.mobile.putong.live.external.square.search.history.LiveSearchHistoryItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class nlt extends mic0<olt> {

    /* JADX INFO: renamed from: d */
    public final List<olt> f142589d;

    /* JADX INFO: renamed from: e */
    public y20<olt> f142590e;

    /* JADX INFO: renamed from: f */
    public LiveSearchAct f142591f;

    public nlt(List<olt> list, y20<olt> y20Var, LiveSearchAct liveSearchAct) {
        super(y20Var);
        ArrayList arrayList = new ArrayList();
        this.f142589d = arrayList;
        arrayList.addAll(list);
        this.f142591f = liveSearchAct;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f142589d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return View.inflate(viewGroup.getContext(), xec0.f193895o0, null);
    }

    @Override // p153l.mic0, p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final olt oltVar, int i, int i2) {
        super.mo29822A(view, oltVar, i, i2);
        LiveSearchHistoryItemView liveSearchHistoryItemView = (LiveSearchHistoryItemView) view;
        liveSearchHistoryItemView.m72018e(oltVar, NullChecker.m82486a(this.f142591f) ? this.f142591f.f47072e : "");
        if (NullChecker.m82486a(this.f142590e)) {
            bnl0.m105509E0(liveSearchHistoryItemView.f47076c, new View.OnClickListener() { // from class: l.mlt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f137446a.m163777J(oltVar, view2);
                }
            });
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public olt getItem(int i) {
        return this.f142589d.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m163777J(olt oltVar, View view) {
        this.f142590e.call(oltVar);
    }

    /* JADX INFO: renamed from: K */
    public void m163778K(y20<olt> y20Var) {
        this.f142590e = y20Var;
    }

    /* JADX INFO: renamed from: L */
    public void m163779L(List<olt> list) {
        this.f142589d.clear();
        this.f142589d.addAll(list);
        notifyDataSetChanged();
    }
}
