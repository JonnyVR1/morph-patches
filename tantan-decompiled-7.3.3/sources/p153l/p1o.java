package p153l;

import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class p1o {
    /* JADX INFO: renamed from: b */
    public static void m170251b(List<? extends d3q<?>> list) {
        int i = 1;
        for (d3q<?> d3qVar : list) {
            boolean z = d3qVar instanceof e2o;
            if (z) {
                ((e2o) d3qVar).m119129b0(i);
            }
            if ((d3qVar instanceof z0u) || z) {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m170252c(d3q<?> d3qVar, int i, int i2, boolean z, List<d3q<?>> list) {
        if (i == 0) {
            list.add(0, d3qVar);
            return;
        }
        int iMo96608q = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iMo96608q += list.get(i3).mo96608q();
            if (iMo96608q >= i2 * i) {
                list.add(i3 + 1, d3qVar);
                return;
            }
        }
        if (z && iMo96608q % i2 != 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                iMo96608q -= list.get(size).mo96608q();
                list.remove(size);
                if (iMo96608q % i2 == 0) {
                    break;
                }
            }
        }
        list.add(d3qVar);
    }

    /* JADX INFO: renamed from: d */
    public static void m170253d(LiveBaseAdapter liveBaseAdapter) {
        int iM147476G = jyb.m147476G(liveBaseAdapter.m68538J(), new qcj() { // from class: l.o1o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((d3q) obj) instanceof j5o);
            }
        });
        if (iM147476G >= 0) {
            liveBaseAdapter.notifyItemChanged(iM147476G, 2);
        }
    }
}
