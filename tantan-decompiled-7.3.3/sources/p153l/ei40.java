package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ei40 {

    /* JADX INFO: renamed from: a */
    public final int f94104a;

    /* JADX INFO: renamed from: b */
    public List<String> f94105b = new ArrayList();

    public ei40(int i) {
        this.f94104a = i;
    }

    /* JADX INFO: renamed from: a */
    public boolean m120880a() {
        return this.f94104a == 1;
    }

    /* JADX INFO: renamed from: b */
    public boolean m120881b(String str) {
        boolean zContains = this.f94105b.contains(str);
        List<String> list = this.f94105b;
        if (zContains) {
            list.remove(str);
            return zContains;
        }
        list.add(str);
        return zContains;
    }
}
