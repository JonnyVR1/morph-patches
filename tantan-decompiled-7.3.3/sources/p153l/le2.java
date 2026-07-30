package p153l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class le2 {

    /* JADX INFO: renamed from: a */
    public final Map<Integer, Integer> f131700a = new HashMap();

    /* JADX INFO: renamed from: a */
    public int[] m153864a() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (Map.Entry<Integer, Integer> entry : this.f131700a.entrySet()) {
            if (entry.getValue().intValue() > iIntValue) {
                iIntValue = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == iIntValue) {
                arrayList.add(entry.getKey());
            }
        }
        return w860.m205400b(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public void m153865b(int i) {
        Integer num = this.f131700a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f131700a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
