package p149l;

import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class pzn {
    /* JADX INFO: renamed from: b */
    public static void m172240b(List<? extends d1q<?>> list) {
        int i = 1;
        for (d1q<?> d1qVar : list) {
            boolean z = d1qVar instanceof e0o;
            if (z) {
                ((e0o) d1qVar).m114313b0(i);
            }
            if ((d1qVar instanceof yyt) || z) {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m172241c(d1q<?> d1qVar, int i, int i2, boolean z, List<d1q<?>> list) {
        if (i == 0) {
            list.add(0, d1qVar);
            return;
        }
        int iMo95844q = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iMo95844q += list.get(i3).mo95844q();
            if (iMo95844q >= i2 * i) {
                list.add(i3 + 1, d1qVar);
                return;
            }
        }
        if (z && iMo95844q % i2 != 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                iMo95844q -= list.get(size).mo95844q();
                list.remove(size);
                if (iMo95844q % i2 == 0) {
                    break;
                }
            }
        }
        list.add(d1qVar);
    }

    /* JADX INFO: renamed from: d */
    public static void m172242d(LiveBaseAdapter liveBaseAdapter) {
        int iM200293G = vwb.m200293G(liveBaseAdapter.m67355J(), new w9j() { // from class: l.ozn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((d1q) obj) instanceof j3o);
            }
        });
        if (iM200293G >= 0) {
            liveBaseAdapter.notifyItemChanged(iM200293G, 2);
        }
    }
}
