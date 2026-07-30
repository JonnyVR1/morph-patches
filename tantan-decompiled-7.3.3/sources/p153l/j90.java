package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class j90 extends jic0<g90> {

    /* JADX INFO: renamed from: c */
    public List<g90> f118835c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f118836d;

    /* JADX INFO: renamed from: e */
    public Runnable f118837e;

    /* JADX INFO: renamed from: f */
    public y20<g90> f118838f;

    /* JADX INFO: renamed from: g */
    public boolean f118839g;

    public j90(Act act, boolean z) {
        this.f118836d = act;
        this.f118839g = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m143921I(View view) {
        i4g0.m138520r("e_poi_noshow", "p_poi_list_pop");
        this.f118837e.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m143922J(g90 g90Var, View view) {
        i4g0.m138523u("e_poi", "p_poi_list_pop", jyb.m147494Y("poitype", "nearby"));
        this.f118838f.call(g90Var);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        int size = this.f118835c.size();
        return (size == 0 || this.f118839g) ? size : size - 1;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        Act act = this.f118836d;
        return i == 0 ? act.inflater().inflate(tec0.f173710m4, viewGroup, false) : act.inflater().inflate(tec0.f173717n4, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final g90 g90Var, int i, int i2) {
        if (i == 0) {
            TextView textView = (TextView) ((ViewGroup) view).getChildAt(0);
            textView.setText(R$string.f39743F3);
            if (j4h.m143424h()) {
                textView.setTextColor(view.getResources().getColor(k9c0.f124511i));
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: l.h90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f108291a.m143921I(view2);
                }
            });
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        TextView textView2 = (TextView) viewGroup.findViewById(hdc0.f108844J0);
        textView2.setText(getItem(i2).m129468c());
        TextView textView3 = (TextView) viewGroup.findViewById(hdc0.f108841I0);
        textView3.setText(getItem(i2).m129466a());
        if (j4h.m143424h()) {
            textView2.setTextColor(view.getResources().getColor(k9c0.f124507g));
            textView3.setTextColor(view.getResources().getColor(k9c0.f124509h));
        }
        bnl0.m105524M((TextView) viewGroup.findViewById(hdc0.f108847K0), false);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.i90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f113386a.m143922J(g90Var, view2);
            }
        });
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public g90 getItem(int i) {
        if (!this.f118839g) {
            i++;
        }
        return this.f118835c.get(i);
    }

    /* JADX INFO: renamed from: K */
    public void m143925K(List<g90> list) {
        this.f118835c.clear();
        this.f118835c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m143926L(Runnable runnable) {
        this.f118837e = runnable;
    }

    /* JADX INFO: renamed from: M */
    public void m143927M(y20<g90> y20Var) {
        this.f118838f = y20Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (this.f118839g && i == 0) ? 0 : 1;
    }
}
