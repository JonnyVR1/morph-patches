package p002l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.messages.question.QuestionItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.f30;
import l.l6c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mob0 extends dac0<job0> {

    /* JADX INFO: renamed from: c */
    public final List<job0> f15505c;

    /* JADX INFO: renamed from: d */
    public f30<Integer, job0> f15506d;

    /* JADX INFO: renamed from: e */
    public f30<Integer, job0> f15507e;

    public mob0(List<job0> list) {
        ArrayList arrayList = new ArrayList();
        this.f15505c = arrayList;
        arrayList.addAll(list);
    }

    /* JADX INFO: renamed from: C */
    public int m18116C() {
        return this.f15505c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m18117D(ViewGroup viewGroup, int i) {
        return View.inflate(viewGroup.getContext(), l6c0.I0, null);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m18115A(View view, final job0 job0Var, int i, final int i2) {
        QuestionItemView questionItemView = (QuestionItemView) view;
        questionItemView.m22b(job0Var);
        xdl0.E0(questionItemView, new View.OnClickListener() { // from class: l.kob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14444a.m18120I(i2, job0Var, view2);
            }
        });
        xdl0.E0(questionItemView.f17b, new View.OnClickListener() { // from class: l.lob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14966a.m18121J(i2, job0Var, view2);
            }
        });
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public job0 getItem(int i) {
        return this.f15505c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m18120I(int i, job0 job0Var, View view) {
        if (NullChecker.a(this.f15506d)) {
            this.f15506d.call(Integer.valueOf(i), job0Var);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m18121J(int i, job0 job0Var, View view) {
        if (NullChecker.a(this.f15507e)) {
            this.f15507e.call(Integer.valueOf(i), job0Var);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m18122K(f30<Integer, job0> f30Var) {
        this.f15507e = f30Var;
    }

    /* JADX INFO: renamed from: L */
    public void m18123L(f30<Integer, job0> f30Var) {
        this.f15506d = f30Var;
    }

    /* JADX INFO: renamed from: M */
    public void m18124M(List<job0> list) {
        this.f15505c.clear();
        this.f15505c.addAll(list);
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        return super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.getItemViewType(i);
    }
}
