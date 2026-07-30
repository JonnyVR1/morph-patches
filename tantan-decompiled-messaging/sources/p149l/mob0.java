package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.messages.question.QuestionItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class mob0 extends dac0<job0> {

    /* JADX INFO: renamed from: c */
    public final List<job0> f134879c;

    /* JADX INFO: renamed from: d */
    public f30<Integer, job0> f134880d;

    /* JADX INFO: renamed from: e */
    public f30<Integer, job0> f134881e;

    public mob0(List<job0> list) {
        ArrayList arrayList = new ArrayList();
        this.f134879c = arrayList;
        arrayList.addAll(list);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f134879c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return View.inflate(viewGroup.getContext(), l6c0.f126312I0, null);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final job0 job0Var, int i, final int i2) {
        QuestionItemView questionItemView = (QuestionItemView) view;
        questionItemView.m49608b(job0Var);
        xdl0.m208329E0(questionItemView, new View.OnClickListener() { // from class: l.kob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f123975a.m155663I(i2, job0Var, view2);
            }
        });
        xdl0.m208329E0(questionItemView.f32195b, new View.OnClickListener() { // from class: l.lob0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f129083a.m155664J(i2, job0Var, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public job0 getItem(int i) {
        return this.f134879c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m155663I(int i, job0 job0Var, View view) {
        if (NullChecker.m81303a(this.f134880d)) {
            this.f134880d.call(Integer.valueOf(i), job0Var);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m155664J(int i, job0 job0Var, View view) {
        if (NullChecker.m81303a(this.f134881e)) {
            this.f134881e.call(Integer.valueOf(i), job0Var);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m155665K(f30<Integer, job0> f30Var) {
        this.f134881e = f30Var;
    }

    /* JADX INFO: renamed from: L */
    public void m155666L(f30<Integer, job0> f30Var) {
        this.f134880d = f30Var;
    }

    /* JADX INFO: renamed from: M */
    public void m155667M(List<job0> list) {
        this.f134879c.clear();
        this.f134879c.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return super.getItemViewType(i);
    }
}
