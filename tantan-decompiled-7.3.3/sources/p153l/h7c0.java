package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes11.dex */
public class h7c0 {

    /* JADX INFO: renamed from: c */
    public static volatile h7c0 f108107c;

    /* JADX INFO: renamed from: b */
    public C22508b<Integer> f108109b = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public byd0 f108108a = new byd0("last_show_entry_red_dot_time" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: a */
    public static h7c0 m133769a() {
        if (f108107c == null) {
            synchronized (h7c0.class) {
                try {
                    if (f108107c == null) {
                        f108107c = new h7c0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f108107c;
    }

    /* JADX INFO: renamed from: b */
    public void m133770b() {
        this.f108108a.put(Long.valueOf(pzi0.m174454o()));
        this.f108109b.onNext(0);
    }
}
