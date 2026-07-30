package p153l;

import com.cosmos.photon.push.service.PushService;
import com.p051p1.mobile.putong.data.SchemeKey;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class zar0 {

    /* JADX INFO: renamed from: a */
    public final TreeMap<Integer, pxr0> f203589a = new TreeMap<>();

    /* JADX INFO: renamed from: b */
    public final TreeMap<Integer, pxr0> f203590b = new TreeMap<>();

    /* JADX INFO: renamed from: a */
    public static int m219133a(gix0 gix0Var, pxr0 pxr0Var, ewr0 ewr0Var) {
        ewr0 ewr0VarMo107102d = pxr0Var.mo107102d(gix0Var, Collections.singletonList(ewr0Var));
        if (ewr0VarMo107102d instanceof glr0) {
            return tqw0.m192375i(ewr0VarMo107102d.zze().doubleValue());
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m219134b(String str, int i, pxr0 pxr0Var, String str2) {
        TreeMap<Integer, pxr0> treeMap;
        if (PushService.COMMAND_CREATE.equals(str2)) {
            treeMap = this.f203590b;
        } else {
            if (!SchemeKey.edit.equals(str2)) {
                xtq0.m213103a("Unknown callback type: ", str2);
                return;
            }
            treeMap = this.f203589a;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), pxr0Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m219135c(gix0 gix0Var, sdr0 sdr0Var) {
        ygy0 ygy0Var = new ygy0(sdr0Var);
        for (Integer num : this.f203589a.keySet()) {
            efr0 efr0Var = (efr0) sdr0Var.m185506d().clone();
            int iM219133a = m219133a(gix0Var, this.f203589a.get(num), ygy0Var);
            if (iM219133a == 2 || iM219133a == -1) {
                sdr0Var.m185507e(efr0Var);
            }
        }
        Iterator<Integer> it = this.f203590b.keySet().iterator();
        while (it.hasNext()) {
            m219133a(gix0Var, this.f203590b.get(it.next()), ygy0Var);
        }
    }
}
