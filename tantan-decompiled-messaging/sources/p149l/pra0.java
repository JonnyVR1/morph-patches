package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class pra0 {

    /* JADX INFO: renamed from: b */
    public static pra0 f150863b;

    /* JADX INFO: renamed from: a */
    public List<Boolean> f150864a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public static pra0 m170994b() {
        if (f150863b == null) {
            synchronized (pra0.class) {
                try {
                    if (f150863b == null) {
                        f150863b = new pra0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f150863b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m170995a() {
        if (vwb.m200296J(this.f150864a)) {
            return false;
        }
        List<Boolean> list = this.f150864a;
        return list.get(list.size() - 1).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public void m170996c() {
        if (vwb.m200296J(this.f150864a)) {
            return;
        }
        List<Boolean> list = this.f150864a;
        list.set(list.size() - 1, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public void m170997d() {
        if (vwb.m200296J(this.f150864a)) {
            return;
        }
        List<Boolean> list = this.f150864a;
        list.set(list.size() - 1, Boolean.FALSE);
    }
}
