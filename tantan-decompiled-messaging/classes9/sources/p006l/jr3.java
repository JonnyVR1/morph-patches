package p006l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.xdl0;
import l.zqb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jr3 extends dac0<zqb> {

    /* JADX INFO: renamed from: c */
    public List<zqb> f15356c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f15357d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0900a f15358e;

    /* JADX INFO: renamed from: l.jr3$a */
    public interface InterfaceC0900a {
        /* JADX INFO: renamed from: a */
        void mo17787a(zqb zqbVar);
    }

    public jr3(Act act) {
        this.f15357d = act;
    }

    /* JADX INFO: renamed from: C */
    public int m17780C() {
        return this.f15356c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m17781D(ViewGroup viewGroup, int i) {
        return this.f15357d.inflater().inflate(c6c0.f9439l, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m17779A(View view, final zqb zqbVar, int i, int i2) {
        ((TextView) view.findViewById(q4c0.f19617m)).setText(zqbVar.a);
        ((TextView) view.findViewById(q4c0.f19615l)).setText("+" + zqbVar.b);
        xdl0.E0(view, new View.OnClickListener() { // from class: l.ir3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14710a.m17784H(zqbVar, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public zqb getItem(int i) {
        if (i < this.f15356c.size()) {
            return this.f15356c.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m17784H(zqb zqbVar, View view) {
        if (NullChecker.a(this.f15358e)) {
            this.f15358e.mo17787a(zqbVar);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m17785I(List<zqb> list) {
        this.f15356c.clear();
        this.f15356c.addAll(list);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m17786J(InterfaceC0900a interfaceC0900a) {
        this.f15358e = interfaceC0900a;
    }
}
