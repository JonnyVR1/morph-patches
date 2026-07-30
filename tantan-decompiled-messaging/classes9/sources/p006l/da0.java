package p006l;

import com.p000p1.mobile.putong.core.CoreModule;
import l.tpd0;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class da0 {

    /* JADX INFO: renamed from: c */
    public static da0 f10243c;

    /* JADX INFO: renamed from: a */
    public uqd0 f10244a = new uqd0("city" + CoreModule.m1850H().userId(), "");

    /* JADX INFO: renamed from: b */
    public tpd0 f10245b = new tpd0("advanced_swipe_card_times" + CoreModule.m1850H().userId(), 1);

    /* JADX INFO: renamed from: a */
    public static da0 m13862a() {
        if (f10243c == null) {
            synchronized (da0.class) {
                try {
                    if (f10243c == null) {
                        f10243c = new da0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f10243c;
    }

    /* JADX INFO: renamed from: c */
    public static void m13863c() {
        f10243c = null;
    }

    /* JADX INFO: renamed from: b */
    public String m13864b() {
        return (String) this.f10244a.get();
    }

    /* JADX INFO: renamed from: d */
    public void m13865d(String str) {
        this.f10244a.put(str);
    }
}
