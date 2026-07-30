package p002l;

import java.util.ArrayList;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pra0 {

    /* JADX INFO: renamed from: b */
    public static pra0 f17623b;

    /* JADX INFO: renamed from: a */
    public List<Boolean> f17624a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static pra0 m20645b() {
        if (f17623b == null) {
            synchronized (pra0.class) {
                try {
                    if (f17623b == null) {
                        f17623b = new pra0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17623b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m20646a() {
        if (vwb.J(this.f17624a)) {
            return false;
        }
        List<Boolean> list = this.f17624a;
        return list.get(list.size() - 1).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public void m20647c() {
        if (vwb.J(this.f17624a)) {
            return;
        }
        List<Boolean> list = this.f17624a;
        list.set(list.size() - 1, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public void m20648d() {
        if (vwb.J(this.f17624a)) {
            return;
        }
        List<Boolean> list = this.f17624a;
        list.set(list.size() - 1, Boolean.FALSE);
    }
}
