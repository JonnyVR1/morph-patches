package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.j760;
import l.vwb;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class n90 extends dac0<k90> {

    /* JADX INFO: renamed from: c */
    public List<k90> f10710c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f10711d;

    /* JADX INFO: renamed from: e */
    public Runnable f10712e;

    /* JADX INFO: renamed from: f */
    public e30<k90> f10713f;

    /* JADX INFO: renamed from: g */
    public boolean f10714g;

    public n90(Act act, boolean z) {
        this.f10711d = act;
        this.f10714g = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m12117I(View view) {
        zvf0.r("e_poi_noshow", "p_poi_list_pop");
        this.f10712e.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m12118J(k90 k90Var, View view) {
        zvf0.u("e_poi", "p_poi_list_pop", new j760[]{vwb.Y("poitype", "nearby")});
        this.f10713f.call(k90Var);
    }

    /* JADX INFO: renamed from: C */
    public int m12120C() {
        int size = this.f10710c.size();
        return (size == 0 || this.f10714g) ? size : size - 1;
    }

    /* JADX INFO: renamed from: D */
    public View m12121D(ViewGroup viewGroup, int i) {
        Act act = this.f10711d;
        return i == 0 ? act.inflater().inflate(o6c0.f11260m4, viewGroup, false) : act.inflater().inflate(o6c0.f11267n4, viewGroup, false);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m12119A(View view, final k90 k90Var, int i, int i2) {
        if (i == 0) {
            TextView textView = (TextView) ((ViewGroup) view).getChildAt(0);
            textView.setText(R$string.f356F3);
            if (u2h.m14723h()) {
                textView.setTextColor(view.getResources().getColor(e1c0.f7144i));
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: l.l90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f9955a.m12117I(view2);
                }
            });
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        TextView textView2 = (TextView) viewGroup.findViewById(b5c0.f5972J0);
        textView2.setText(getItem(i2).m11398c());
        TextView textView3 = (TextView) viewGroup.findViewById(b5c0.f5969I0);
        textView3.setText(getItem(i2).m11396a());
        if (u2h.m14723h()) {
            textView2.setTextColor(view.getResources().getColor(e1c0.f7140g));
            textView3.setTextColor(view.getResources().getColor(e1c0.f7142h));
        }
        xdl0.M((TextView) viewGroup.findViewById(b5c0.f5975K0), false);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.m90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f10274a.m12118J(k90Var, view2);
            }
        });
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public k90 getItem(int i) {
        if (!this.f10714g) {
            i++;
        }
        return this.f10710c.get(i);
    }

    /* JADX INFO: renamed from: K */
    public void m12124K(List<k90> list) {
        this.f10710c.clear();
        this.f10710c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m12125L(Runnable runnable) {
        this.f10712e = runnable;
    }

    /* JADX INFO: renamed from: M */
    public void m12126M(e30<k90> e30Var) {
        this.f10713f = e30Var;
    }

    public int getItemViewType(int i) {
        return (this.f10714g && i == 0) ? 0 : 1;
    }
}
