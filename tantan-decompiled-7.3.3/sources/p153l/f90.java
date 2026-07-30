package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class f90 extends AbstractC15610a<g90> {

    /* JADX INFO: renamed from: c */
    public Act f97794c;

    /* JADX INFO: renamed from: d */
    public boolean f97795d = false;

    /* JADX INFO: renamed from: e */
    public List<g90> f97796e = jyb.m147507f0(new g90());

    /* JADX INFO: renamed from: f */
    public Runnable f97797f;

    /* JADX INFO: renamed from: g */
    public y20<g90> f97798g;

    public f90(Act act) {
        this.f97794c = act;
    }

    /* JADX INFO: renamed from: A */
    public void m124580A(List<g90> list, boolean z) {
        this.f97796e = list;
        this.f97795d = z;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: B */
    public void m124581B(Runnable runnable) {
        this.f97797f = runnable;
    }

    /* JADX INFO: renamed from: C */
    public void m124582C(y20<g90> y20Var) {
        this.f97798g = y20Var;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (this.f97795d) {
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
            return this.f97794c.inflater().inflate(tec0.f173710m4, viewGroup, false);
        }
        Act act = this.f97794c;
        return i == 1 ? act.inflater().inflate(tec0.f173797z0, viewGroup, false) : act.inflater().inflate(tec0.f173717n4, viewGroup, false);
    }

    @Override // p153l.AbstractC15610a
    /* JADX INFO: renamed from: p */
    public List<g90> mo21403p() {
        return this.f97796e;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo21401j(View view, final g90 g90Var, int i, int i2) {
        if (i == 0) {
            ((TextView) ((ViewGroup) view).getChildAt(0)).setText(R$string.f39743F3);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.b90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f75498a.m124584y(view2);
                }
            });
        } else {
            if (i == 1) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            TextView textView = (TextView) viewGroup.findViewById(hdc0.f108844J0);
            TextView textView2 = (TextView) viewGroup.findViewById(hdc0.f108841I0);
            textView.setText(this.f97796e.get(i2).m129468c());
            textView2.setText(this.f97796e.get(i2).m129466a());
            view.setOnClickListener(new View.OnClickListener() { // from class: l.d90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f85700a.m124585z(g90Var, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m124584y(View view) {
        this.f97797f.run();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m124585z(g90 g90Var, View view) {
        this.f97798g.call(g90Var);
    }
}
