package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes11.dex */
public class dzb0 {

    /* JADX INFO: renamed from: c */
    public static volatile dzb0 f88463c;

    /* JADX INFO: renamed from: b */
    public C22393b<Integer> f88465b = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public zpd0 f88464a = new zpd0("last_show_entry_red_dot_time" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public static dzb0 m114113a() {
        if (f88463c == null) {
            synchronized (dzb0.class) {
                try {
                    if (f88463c == null) {
                        f88463c = new dzb0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f88463c;
    }

    /* JADX INFO: renamed from: b */
    public void m114114b() {
        this.f88464a.put(Long.valueOf(mqi0.m155944o()));
        this.f88465b.onNext(0);
    }
}
