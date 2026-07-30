package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.xdl0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class f25 extends dac0<String> {

    /* JADX INFO: renamed from: c */
    public final VRecyclerView f10102c;

    /* JADX INFO: renamed from: d */
    public final e30<String> f10103d;

    /* JADX INFO: renamed from: e */
    public final Act f10104e;

    /* JADX INFO: renamed from: f */
    public List<String> f10105f = new ArrayList();

    public f25(Act act, VRecyclerView vRecyclerView, e30<String> e30Var) {
        this.f10104e = act;
        this.f10102c = vRecyclerView;
        this.f10103d = e30Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m12923H(String str, View view) {
        this.f10103d.call(str);
    }

    /* JADX INFO: renamed from: C */
    public int m12925C() {
        return this.f10105f.size();
    }

    /* JADX INFO: renamed from: D */
    public View m12926D(ViewGroup viewGroup, int i) {
        return this.f10104e.inflater().inflate(t6c0.f19807d0, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m12924A(View view, String str, int i, int i2) {
        final String item = getItem(i2);
        ((TextView) view).setText(item);
        view.setOnClickListener(new View.OnClickListener() { // from class: l.e25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9543a.m12923H(item, view2);
            }
        });
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return this.f10105f.get(i);
    }

    /* JADX INFO: renamed from: I */
    public void m12929I(List<String> list) {
        xdl0.M(this.f10102c, !list.isEmpty());
        this.f10105f = list;
        notifyDataSetChanged();
    }
}
