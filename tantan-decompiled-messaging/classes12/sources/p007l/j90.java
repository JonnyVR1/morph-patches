package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.R$string;
import com.p1.mobile.android.app.Act;
import java.util.List;
import l.a;
import l.e30;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class j90 extends a<k90> {

    /* JADX INFO: renamed from: c */
    public Act f9262c;

    /* JADX INFO: renamed from: d */
    public boolean f9263d = false;

    /* JADX INFO: renamed from: e */
    public List<k90> f9264e = vwb.f0(new k90[]{new k90()});

    /* JADX INFO: renamed from: f */
    public Runnable f9265f;

    /* JADX INFO: renamed from: g */
    public e30<k90> f9266g;

    public j90(Act act) {
        this.f9262c = act;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public void m11096A(List<k90> list, boolean z) {
        this.f9264e = list;
        this.f9263d = z;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: B */
    public void m11097B(Runnable runnable) {
        this.f9265f = runnable;
    }

    /* JADX INFO: renamed from: C */
    public void m11098C(e30<k90> e30Var) {
        this.f9266g = e30Var;
    }

    public int getItemViewType(int i) {
        if (this.f9263d) {
            return i == 0 ? 0 : 2;
        }
        return 1;
    }

    public int getViewTypeCount() {
        return 3;
    }

    /* JADX INFO: renamed from: m */
    public View m11100m(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return this.f9262c.inflater().inflate(o6c0.f11260m4, viewGroup, false);
        }
        Act act = this.f9262c;
        return i == 1 ? act.inflater().inflate(o6c0.f11347z0, viewGroup, false) : act.inflater().inflate(o6c0.f11267n4, viewGroup, false);
    }

    /* JADX INFO: renamed from: p */
    public List<k90> m11101p() {
        return this.f9264e;
    }

    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void m11099j(View view, final k90 k90Var, int i, int i2) {
        if (i == 0) {
            ((TextView) ((ViewGroup) view).getChildAt(0)).setText(R$string.f356F3);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.f90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f8032a.m11103y(view2);
                }
            });
        } else {
            if (i == 1) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            TextView textView = (TextView) viewGroup.findViewById(b5c0.f5972J0);
            TextView textView2 = (TextView) viewGroup.findViewById(b5c0.f5969I0);
            textView.setText(this.f9264e.get(i2).m11398c());
            textView2.setText(this.f9264e.get(i2).m11396a());
            view.setOnClickListener(new View.OnClickListener() { // from class: l.h90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f8631a.m11104z(k90Var, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m11103y(View view) {
        this.f9265f.run();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m11104z(k90 k90Var, View view) {
        this.f9266g.call(k90Var);
    }
}
