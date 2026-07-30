package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.messages.question.QuestionItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class qwb0 extends jic0<nwb0> {

    /* JADX INFO: renamed from: c */
    public final List<nwb0> f159880c;

    /* JADX INFO: renamed from: d */
    public z20<Integer, nwb0> f159881d;

    /* JADX INFO: renamed from: e */
    public z20<Integer, nwb0> f159882e;

    public qwb0(List<nwb0> list) {
        ArrayList arrayList = new ArrayList();
        this.f159880c = arrayList;
        arrayList.addAll(list);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f159880c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return View.inflate(viewGroup.getContext(), qec0.f156868I0, null);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final nwb0 nwb0Var, int i, final int i2) {
        QuestionItemView questionItemView = (QuestionItemView) view;
        questionItemView.m50791b(nwb0Var);
        bnl0.m105509E0(questionItemView, new View.OnClickListener() { // from class: l.owb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f149466a.m178466I(i2, nwb0Var, view2);
            }
        });
        bnl0.m105509E0(questionItemView.f33043b, new View.OnClickListener() { // from class: l.pwb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f154391a.m178467J(i2, nwb0Var, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public nwb0 getItem(int i) {
        return this.f159880c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m178466I(int i, nwb0 nwb0Var, View view) {
        if (NullChecker.m82486a(this.f159881d)) {
            this.f159881d.call(Integer.valueOf(i), nwb0Var);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m178467J(int i, nwb0 nwb0Var, View view) {
        if (NullChecker.m82486a(this.f159882e)) {
            this.f159882e.call(Integer.valueOf(i), nwb0Var);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m178468K(z20<Integer, nwb0> z20Var) {
        this.f159882e = z20Var;
    }

    /* JADX INFO: renamed from: L */
    public void m178469L(z20<Integer, nwb0> z20Var) {
        this.f159881d = z20Var;
    }

    /* JADX INFO: renamed from: M */
    public void m178470M(List<nwb0> list) {
        this.f159880c.clear();
        this.f159880c.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return super.getItemViewType(i);
    }
}
