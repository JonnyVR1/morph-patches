package p009l;

import com.p000p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class ib1 {

    /* JADX INFO: renamed from: a */
    public static volatile jb1 f14464a;

    /* JADX INFO: renamed from: b */
    public static ib1 m16307b() {
        if (f14464a == null) {
            synchronized (ib1.class) {
                try {
                    if (f14464a == null) {
                        f14464a = new jb1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14464a;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo16308a(String str);

    /* JADX INFO: renamed from: c */
    public abstract AudioBusinessType mo16309c();

    /* JADX INFO: renamed from: d */
    public abstract boolean mo16310d(AudioBusinessType audioBusinessType);

    /* JADX INFO: renamed from: e */
    public abstract void mo16311e(String str);

    /* JADX INFO: renamed from: f */
    public abstract void mo16312f(String str, AudioBusinessType audioBusinessType, z91 z91Var);

    /* JADX INFO: renamed from: g */
    public abstract void mo16313g(String str, AudioBusinessType audioBusinessType, z91 z91Var);
}
