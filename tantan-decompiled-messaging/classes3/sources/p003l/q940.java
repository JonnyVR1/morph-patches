package p003l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class q940 {

    /* JADX INFO: renamed from: a */
    public final int f6607a;

    /* JADX INFO: renamed from: b */
    public List<String> f6608b = new ArrayList();

    public q940(int i) {
        this.f6607a = i;
    }

    /* JADX INFO: renamed from: a */
    public boolean m7014a() {
        return this.f6607a == 1;
    }

    /* JADX INFO: renamed from: b */
    public boolean m7015b(String str) {
        boolean zContains = this.f6608b.contains(str);
        List<String> list = this.f6608b;
        if (zContains) {
            list.remove(str);
            return zContains;
        }
        list.add(str);
        return zContains;
    }
}
