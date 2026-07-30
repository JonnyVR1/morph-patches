package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class q940 {

    /* JADX INFO: renamed from: a */
    public final int f153369a;

    /* JADX INFO: renamed from: b */
    public List<String> f153370b = new ArrayList();

    public q940(int i) {
        this.f153369a = i;
    }

    /* JADX INFO: renamed from: a */
    public boolean m173598a() {
        return this.f153369a == 1;
    }

    /* JADX INFO: renamed from: b */
    public boolean m173599b(String str) {
        boolean zContains = this.f153370b.contains(str);
        List<String> list = this.f153370b;
        if (zContains) {
            list.remove(str);
            return zContains;
        }
        list.add(str);
        return zContains;
    }
}
