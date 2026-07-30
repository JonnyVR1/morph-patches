package p149l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class zbj {

    /* JADX INFO: renamed from: a */
    private static HashMap<String, sbj> f202444a;

    /* JADX INFO: renamed from: b */
    private static zbj f202445b = new zbj();

    private zbj() {
        f202444a = new HashMap<>();
    }

    /* JADX INFO: renamed from: b */
    public static zbj m217894b() {
        return f202445b;
    }

    /* JADX INFO: renamed from: a */
    public synchronized sbj m217895a(int i, int i2) {
        sbj sbjVar;
        try {
            String str = i + "_" + i2;
            sbjVar = f202444a.get(str);
            if (sbjVar == null || sbjVar.f163545a) {
                sbjVar = new sbj(i, i2);
                f202444a.put(str, sbjVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return sbjVar;
    }
}
