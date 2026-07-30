package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class j90 extends AbstractC15503a<k90> {

    /* JADX INFO: renamed from: c */
    public Act f116831c;

    /* JADX INFO: renamed from: d */
    public boolean f116832d = false;

    /* JADX INFO: renamed from: e */
    public List<k90> f116833e = vwb.m200324f0(new k90());

    /* JADX INFO: renamed from: f */
    public Runnable f116834f;

    /* JADX INFO: renamed from: g */
    public e30<k90> f116835g;

    public j90(Act act) {
        this.f116831c = act;
    }

    /* JADX INFO: renamed from: A */
    public void m140481A(List<k90> list, boolean z) {
        this.f116833e = list;
        this.f116832d = z;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: B */
    public void m140482B(Runnable runnable) {
        this.f116834f = runnable;
    }

    /* JADX INFO: renamed from: C */
    public void m140483C(e30<k90> e30Var) {
        this.f116835g = e30Var;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        if (this.f116832d) {
            return i == 0 ? 0 : 2;
        }
        return 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return this.f116831c.inflater().inflate(o6c0.f142241m4, viewGroup, false);
        }
        Act act = this.f116831c;
        return i == 1 ? act.inflater().inflate(o6c0.f142328z0, viewGroup, false) : act.inflater().inflate(o6c0.f142248n4, viewGroup, false);
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<k90> mo20404p() {
        return this.f116833e;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, final k90 k90Var, int i, int i2) {
        if (i == 0) {
            ((TextView) ((ViewGroup) view).getChildAt(0)).setText(R$string.f38895F3);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.f90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f96438a.m140485y(view2);
                }
            });
        } else {
            if (i == 1) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            TextView textView = (TextView) viewGroup.findViewById(b5c0.f73491J0);
            TextView textView2 = (TextView) viewGroup.findViewById(b5c0.f73488I0);
            textView.setText(this.f116833e.get(i2).m144984c());
            textView2.setText(this.f116833e.get(i2).m144982a());
            view.setOnClickListener(new View.OnClickListener() { // from class: l.h90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f106500a.m140486z(k90Var, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m140485y(View view) {
        this.f116834f.run();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m140486z(k90 k90Var, View view) {
        this.f116835g.call(k90Var);
    }
}
