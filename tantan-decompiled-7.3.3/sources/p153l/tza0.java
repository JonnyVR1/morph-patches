package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class tza0 {

    /* JADX INFO: renamed from: b */
    public static tza0 f176749b;

    /* JADX INFO: renamed from: a */
    public List<Boolean> f176750a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static tza0 m193654b() {
        if (f176749b == null) {
            synchronized (tza0.class) {
                try {
                    if (f176749b == null) {
                        f176749b = new tza0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f176749b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m193655a() {
        if (jyb.m147479J(this.f176750a)) {
            return false;
        }
        List<Boolean> list = this.f176750a;
        return list.get(list.size() - 1).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public void m193656c() {
        if (jyb.m147479J(this.f176750a)) {
            return;
        }
        List<Boolean> list = this.f176750a;
        list.set(list.size() - 1, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public void m193657d() {
        if (jyb.m147479J(this.f176750a)) {
            return;
        }
        List<Boolean> list = this.f176750a;
        list.set(list.size() - 1, Boolean.FALSE);
    }
}
