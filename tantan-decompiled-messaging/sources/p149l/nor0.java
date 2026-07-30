package p149l;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class nor0 extends onr0 {
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static List m160416a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new mmr0((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }
}
