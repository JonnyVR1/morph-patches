package p153l;

import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class cbd0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public d9d0 f80811j;

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ Boolean m108630i0(d3q d3qVar) {
        return Boolean.valueOf(this.f80811j == d3qVar);
    }

    /* JADX INFO: renamed from: j0 */
    public void m108631j0(final scd0 scd0Var, boolean z) {
        scd0Var.f167242i = z;
        int iM147476G = jyb.m147476G(this.f45086a, new qcj() { // from class: l.yad0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((d3q) obj) == scd0Var);
            }
        });
        List<e9d0> list = scd0Var.f167238e;
        if (z) {
            if (jyb.m147479J(list) || iM147476G < 0) {
                return;
            }
            int i = iM147476G + 1;
            this.f45086a.addAll(i, v9d0.m200435s(scd0Var.f167238e));
            notifyItemRangeInserted(i, scd0Var.f167238e.size());
            return;
        }
        if (jyb.m147479J(list) || iM147476G < 0) {
            return;
        }
        v9d0.m200437u(scd0Var.f167238e);
        this.f45086a.removeAll(v9d0.m200435s(scd0Var.f167238e));
        notifyItemRangeRemoved(iM147476G + 1, scd0Var.f167238e.size());
    }

    /* JADX INFO: renamed from: k0 */
    public void m108632k0(final d9d0 d9d0Var) {
        int iM147476G;
        d9d0 d9d0Var2 = this.f80811j;
        if (d9d0Var2 != null && d9d0Var != d9d0Var2 && (iM147476G = jyb.m147476G(this.f45086a, new qcj() { // from class: l.zad0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f203550a.m108630i0((d3q) obj);
            }
        })) >= 0) {
            this.f80811j.f92627b = false;
            notifyItemChanged(iM147476G, 1);
        }
        int iM147476G2 = jyb.m147476G(this.f45086a, new qcj() { // from class: l.abd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((d3q) obj) == d9d0Var);
            }
        });
        if (iM147476G2 >= 0) {
            d9d0Var.f92627b = true ^ d9d0Var.f92627b;
            notifyItemChanged(iM147476G2, 1);
        }
        this.f80811j = d9d0Var;
    }

    /* JADX INFO: renamed from: l0 */
    public void m108633l0(List<e9d0> list) {
        ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new xad0(arrayList));
        m68554Z(arrayList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: m0 */
    public void m108634m0(final ycd0 ycd0Var) {
        int iM147476G = jyb.m147476G(m68538J(), new qcj() { // from class: l.bbd0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ycd0Var == ((d3q) obj));
            }
        });
        if (iM147476G >= 0) {
            notifyItemChanged(iM147476G, 3);
        }
    }
}
