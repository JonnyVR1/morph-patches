package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class e90 extends AbstractC15610a<g90> {

    /* JADX INFO: renamed from: c */
    public bh4 f92581c;

    /* JADX INFO: renamed from: d */
    public boolean f92582d = false;

    public e90(bh4 bh4Var) {
        this.f92581c = bh4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m119846y(View view) {
        this.f92581c.m104324v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m119847z(g90 g90Var, View view) {
        this.f92581c.m104309J().m181330u0(g90Var);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (this.f92582d) {
            return i == 0 ? 0 : 2;
        }
        return 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: m */
    public View mo21402m(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return this.f92581c.getAct().inflater().inflate(tec0.f173710m4, viewGroup, false);
        }
        bh4 bh4Var = this.f92581c;
        return i == 1 ? bh4Var.getAct().inflater().inflate(tec0.f173797z0, viewGroup, false) : bh4Var.getAct().inflater().inflate(tec0.f173717n4, viewGroup, false);
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<g90> mo21403p() {
        return this.f92581c.m104309J().m181319h0();
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, final g90 g90Var, int i, int i2) {
        if (i == 0) {
            ((TextView) ((ViewGroup) view).getChildAt(0)).setText(R$string.f39743F3);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.a90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f68977a.m119846y(view2);
                }
            });
        } else {
            if (i == 1) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            TextView textView = (TextView) viewGroup.findViewById(hdc0.f108844J0);
            TextView textView2 = (TextView) viewGroup.findViewById(hdc0.f108841I0);
            textView.setText(mo21403p().get(i2).m129468c());
            textView2.setText(mo21403p().get(i2).m129466a());
            view.setOnClickListener(new View.OnClickListener() { // from class: l.c90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f80277a.m119847z(g90Var, view2);
                }
            });
        }
    }
}
