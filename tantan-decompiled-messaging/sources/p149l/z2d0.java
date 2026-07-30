package p149l;

import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class z2d0 extends LiveBaseAdapter {

    /* JADX INFO: renamed from: j */
    public a1d0 f201220j;

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ Boolean m216957i0(d1q d1qVar) {
        return Boolean.valueOf(this.f201220j == d1qVar);
    }

    /* JADX INFO: renamed from: j0 */
    public void m216958j0(final p4d0 p4d0Var, boolean z) {
        p4d0Var.f147160i = z;
        int iM200293G = vwb.m200293G(this.f44238a, new w9j() { // from class: l.v2d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((d1q) obj) == p4d0Var);
            }
        });
        List<b1d0> list = p4d0Var.f147156e;
        if (z) {
            if (vwb.m200296J(list) || iM200293G < 0) {
                return;
            }
            int i = iM200293G + 1;
            this.f44238a.addAll(i, s1d0.m181955s(p4d0Var.f147156e));
            notifyItemRangeInserted(i, p4d0Var.f147156e.size());
            return;
        }
        if (vwb.m200296J(list) || iM200293G < 0) {
            return;
        }
        s1d0.m181957u(p4d0Var.f147156e);
        this.f44238a.removeAll(s1d0.m181955s(p4d0Var.f147156e));
        notifyItemRangeRemoved(iM200293G + 1, p4d0Var.f147156e.size());
    }

    /* JADX INFO: renamed from: k0 */
    public void m216959k0(final a1d0 a1d0Var) {
        int iM200293G;
        a1d0 a1d0Var2 = this.f201220j;
        if (a1d0Var2 != null && a1d0Var != a1d0Var2 && (iM200293G = vwb.m200293G(this.f44238a, new w9j() { // from class: l.w2d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f184215a.m216957i0((d1q) obj);
            }
        })) >= 0) {
            this.f201220j.f72585b = false;
            notifyItemChanged(iM200293G, 1);
        }
        int iM200293G2 = vwb.m200293G(this.f44238a, new w9j() { // from class: l.x2d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((d1q) obj) == a1d0Var);
            }
        });
        if (iM200293G2 >= 0) {
            a1d0Var.f72585b = true ^ a1d0Var.f72585b;
            notifyItemChanged(iM200293G2, 1);
        }
        this.f201220j = a1d0Var;
    }

    /* JADX INFO: renamed from: l0 */
    public void m216960l0(List<b1d0> list) {
        ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new u2d0(arrayList));
        m67371Z(arrayList);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: m0 */
    public void m216961m0(final v4d0 v4d0Var) {
        int iM200293G = vwb.m200293G(m67355J(), new w9j() { // from class: l.y2d0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(v4d0Var == ((d1q) obj));
            }
        });
        if (iM200293G >= 0) {
            notifyItemChanged(iM200293G, 3);
        }
    }
}
