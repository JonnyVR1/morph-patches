package p009l;

import com.p1.mobile.putong.core.CoreModule;
import l.zpd0;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dzb0 {

    /* JADX INFO: renamed from: c */
    public static volatile dzb0 f12072c;

    /* JADX INFO: renamed from: b */
    public b<Integer> f12074b = b.b();

    /* JADX INFO: renamed from: a */
    public zpd0 f12073a = new zpd0("last_show_entry_red_dot_time" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public static dzb0 m13528a() {
        if (f12072c == null) {
            synchronized (dzb0.class) {
                try {
                    if (f12072c == null) {
                        f12072c = new dzb0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f12072c;
    }

    /* JADX INFO: renamed from: b */
    public void m13529b() {
        this.f12073a.put(Long.valueOf(mqi0.m18550o()));
        this.f12074b.onNext(0);
    }
}
