package p009l;

import com.p1.mobile.putong.core.CoreModule;
import l.hpd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fdv {

    /* JADX INFO: renamed from: c */
    public static volatile fdv f12957c;

    /* JADX INFO: renamed from: a */
    public hpd0 f12958a = new hpd0("open_sound_" + CoreModule.H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public zpd0 f12959b = new zpd0("live_window_date_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public static fdv m14408a() {
        if (f12957c == null) {
            synchronized (fdv.class) {
                try {
                    if (f12957c == null) {
                        f12957c = new fdv();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12957c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m14409b() {
        boolean zM18535D = mqi0.m18535D(((Long) this.f12959b.get()).longValue());
        hpd0 hpd0Var = this.f12958a;
        if (zM18535D) {
            return ((Boolean) hpd0Var.get()).booleanValue();
        }
        hpd0Var.put(Boolean.FALSE);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m14410c(boolean z) {
        this.f12958a.put(Boolean.valueOf(z));
        if (z) {
            this.f12959b.put(Long.valueOf(mqi0.m18550o()));
        }
    }
}
