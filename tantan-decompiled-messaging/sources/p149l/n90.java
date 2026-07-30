package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class n90 extends dac0<k90> {

    /* JADX INFO: renamed from: c */
    public List<k90> f137712c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f137713d;

    /* JADX INFO: renamed from: e */
    public Runnable f137714e;

    /* JADX INFO: renamed from: f */
    public e30<k90> f137715f;

    /* JADX INFO: renamed from: g */
    public boolean f137716g;

    public n90(Act act, boolean z) {
        this.f137713d = act;
        this.f137716g = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m158518I(View view) {
        zvf0.m220396r("e_poi_noshow", "p_poi_list_pop");
        this.f137714e.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m158519J(k90 k90Var, View view) {
        zvf0.m220399u("e_poi", "p_poi_list_pop", vwb.m200311Y("poitype", "nearby"));
        this.f137715f.call(k90Var);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        int size = this.f137712c.size();
        return (size == 0 || this.f137716g) ? size : size - 1;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        Act act = this.f137713d;
        return i == 0 ? act.inflater().inflate(o6c0.f142241m4, viewGroup, false) : act.inflater().inflate(o6c0.f142248n4, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final k90 k90Var, int i, int i2) {
        if (i == 0) {
            TextView textView = (TextView) ((ViewGroup) view).getChildAt(0);
            textView.setText(R$string.f38895F3);
            if (u2h.m191499h()) {
                textView.setTextColor(view.getResources().getColor(e1c0.f88788i));
            }
            view.setOnClickListener(new View.OnClickListener() { // from class: l.l90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f126874a.m158518I(view2);
                }
            });
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        TextView textView2 = (TextView) viewGroup.findViewById(b5c0.f73491J0);
        textView2.setText(getItem(i2).m144984c());
        TextView textView3 = (TextView) viewGroup.findViewById(b5c0.f73488I0);
        textView3.setText(getItem(i2).m144982a());
        if (u2h.m191499h()) {
            textView2.setTextColor(view.getResources().getColor(e1c0.f88784g));
            textView3.setTextColor(view.getResources().getColor(e1c0.f88786h));
        }
        xdl0.m208344M((TextView) viewGroup.findViewById(b5c0.f73494K0), false);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.m90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f132643a.m158519J(k90Var, view2);
            }
        });
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public k90 getItem(int i) {
        if (!this.f137716g) {
            i++;
        }
        return this.f137712c.get(i);
    }

    /* JADX INFO: renamed from: K */
    public void m158522K(List<k90> list) {
        this.f137712c.clear();
        this.f137712c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m158523L(Runnable runnable) {
        this.f137714e = runnable;
    }

    /* JADX INFO: renamed from: M */
    public void m158524M(e30<k90> e30Var) {
        this.f137715f = e30Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return (this.f137716g && i == 0) ? 0 : 1;
    }
}
