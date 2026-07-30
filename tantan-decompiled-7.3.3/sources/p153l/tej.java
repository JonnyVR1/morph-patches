package p153l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class tej {

    /* JADX INFO: renamed from: a */
    private static HashMap<String, mej> f173839a;

    /* JADX INFO: renamed from: b */
    private static tej f173840b = new tej();

    private tej() {
        f173839a = new HashMap<>();
    }

    /* JADX INFO: renamed from: b */
    public static tej m190707b() {
        return f173840b;
    }

    /* JADX INFO: renamed from: a */
    public synchronized mej m190708a(int i, int i2) {
        mej mejVar;
        try {
            String str = i + "_" + i2;
            mejVar = f173839a.get(str);
            if (mejVar == null || mejVar.f136503a) {
                mejVar = new mej(i, i2);
                f173839a.put(str, mejVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return mejVar;
    }
}
