package p149l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ee2 {

    /* JADX INFO: renamed from: a */
    public final Map<Integer, Integer> f90662a = new HashMap();

    /* JADX INFO: renamed from: a */
    public int[] m115842a() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (Map.Entry<Integer, Integer> entry : this.f90662a.entrySet()) {
            if (entry.getValue().intValue() > iIntValue) {
                iIntValue = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == iIntValue) {
                arrayList.add(entry.getKey());
            }
        }
        return r060.m177332b(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public void m115843b(int i) {
        Integer num = this.f90662a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f90662a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
