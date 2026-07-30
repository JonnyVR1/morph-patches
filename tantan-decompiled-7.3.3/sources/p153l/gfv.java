package p153l;

import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class gfv {

    /* JADX INFO: renamed from: c */
    public static volatile gfv f103956c;

    /* JADX INFO: renamed from: a */
    public jxd0 f103957a = new jxd0("open_sound_" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public byd0 f103958b = new byd0("live_window_date_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public static gfv m130121a() {
        if (f103956c == null) {
            synchronized (gfv.class) {
                try {
                    if (f103956c == null) {
                        f103956c = new gfv();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f103956c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m130122b() {
        boolean zM174439D = pzi0.m174439D(this.f103958b.get().longValue());
        jxd0 jxd0Var = this.f103957a;
        if (zM174439D) {
            return jxd0Var.get().booleanValue();
        }
        jxd0Var.put(Boolean.FALSE);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m130123c(boolean z) {
        this.f103957a.put(Boolean.valueOf(z));
        if (z) {
            this.f103958b.put(Long.valueOf(pzi0.m174454o()));
        }
    }
}
