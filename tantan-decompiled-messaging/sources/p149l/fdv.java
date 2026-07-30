package p149l;

import com.p046p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class fdv {

    /* JADX INFO: renamed from: c */
    public static volatile fdv f97079c;

    /* JADX INFO: renamed from: a */
    public hpd0 f97080a = new hpd0("open_sound_" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public zpd0 f97081b = new zpd0("live_window_date_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public static fdv m121007a() {
        if (f97079c == null) {
            synchronized (fdv.class) {
                try {
                    if (f97079c == null) {
                        f97079c = new fdv();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f97079c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m121008b() {
        boolean zM155929D = mqi0.m155929D(this.f97081b.get().longValue());
        hpd0 hpd0Var = this.f97080a;
        if (zM155929D) {
            return hpd0Var.get().booleanValue();
        }
        hpd0Var.put(Boolean.FALSE);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m121009c(boolean z) {
        this.f97080a.put(Boolean.valueOf(z));
        if (z) {
            this.f97081b.put(Long.valueOf(mqi0.m155944o()));
        }
    }
}
