package p149l;

import com.p046p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ib1 {

    /* JADX INFO: renamed from: a */
    public static volatile jb1 f112343a;

    /* JADX INFO: renamed from: b */
    public static ib1 m135233b() {
        if (f112343a == null) {
            synchronized (ib1.class) {
                try {
                    if (f112343a == null) {
                        f112343a = new jb1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f112343a;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo135234a(String str);

    /* JADX INFO: renamed from: c */
    public abstract AudioBusinessType mo135235c();

    /* JADX INFO: renamed from: d */
    public abstract boolean mo135236d(AudioBusinessType audioBusinessType);

    /* JADX INFO: renamed from: e */
    public abstract void mo135237e(String str);

    /* JADX INFO: renamed from: f */
    public abstract void mo135238f(String str, AudioBusinessType audioBusinessType, z91 z91Var);

    /* JADX INFO: renamed from: g */
    public abstract void mo135239g(String str, AudioBusinessType audioBusinessType, z91 z91Var);
}
