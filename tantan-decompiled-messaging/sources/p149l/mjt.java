package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.external.square.search.LiveSearchAct;
import com.p046p1.mobile.putong.live.external.square.search.history.LiveSearchHistoryItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class mjt extends gac0<njt> {

    /* JADX INFO: renamed from: d */
    public final List<njt> f134248d;

    /* JADX INFO: renamed from: e */
    public e30<njt> f134249e;

    /* JADX INFO: renamed from: f */
    public LiveSearchAct f134250f;

    public mjt(List<njt> list, e30<njt> e30Var, LiveSearchAct liveSearchAct) {
        super(e30Var);
        ArrayList arrayList = new ArrayList();
        this.f134248d = arrayList;
        arrayList.addAll(list);
        this.f134250f = liveSearchAct;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f134248d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return View.inflate(viewGroup.getContext(), s6c0.f162781o0, null);
    }

    @Override // p149l.gac0, p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final njt njtVar, int i, int i2) {
        super.mo28823A(view, njtVar, i, i2);
        LiveSearchHistoryItemView liveSearchHistoryItemView = (LiveSearchHistoryItemView) view;
        liveSearchHistoryItemView.m70835e(njtVar, NullChecker.m81303a(this.f134250f) ? this.f134250f.f46224e : "");
        if (NullChecker.m81303a(this.f134249e)) {
            xdl0.m208329E0(liveSearchHistoryItemView.f46228c, new View.OnClickListener() { // from class: l.ljt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f128404a.m154914J(njtVar, view2);
                }
            });
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public njt getItem(int i) {
        return this.f134248d.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m154914J(njt njtVar, View view) {
        this.f134249e.call(njtVar);
    }

    /* JADX INFO: renamed from: K */
    public void m154915K(e30<njt> e30Var) {
        this.f134249e = e30Var;
    }

    /* JADX INFO: renamed from: L */
    public void m154916L(List<njt> list) {
        this.f134248d.clear();
        this.f134248d.addAll(list);
        notifyDataSetChanged();
    }
}
