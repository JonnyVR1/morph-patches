package p006l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.p004ui.svip.guide.SvipPrivilegeItem;
import com.p1.mobile.putong.core.data.Privilege;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.k6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class c6h0 extends dac0<Privilege> {

    /* JADX INFO: renamed from: c */
    public List<Privilege> f9462c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public PutongAct f9463d;

    public c6h0(PutongAct putongAct) {
        this.f9463d = putongAct;
    }

    /* JADX INFO: renamed from: C */
    public int m13241C() {
        return this.f9462c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m13242D(ViewGroup viewGroup, int i) {
        return this.f9463d.inflater().inflate(k6c0.L1, viewGroup, false);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m13240A(View view, Privilege privilege, int i, int i2) {
        ((SvipPrivilegeItem) view).m9245b(privilege);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Privilege getItem(int i) {
        return this.f9462c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m13245G(ArrayList<Privilege> arrayList) {
        this.f9462c.clear();
        this.f9462c.addAll(arrayList);
        notifyDataSetChanged();
    }
}
