package p153l;

import com.p051p1.mobile.putong.util.audio.AudioBusinessType;

/* JADX INFO: loaded from: classes10.dex */
public abstract class pb1 {

    /* JADX INFO: renamed from: a */
    public static volatile qb1 f151341a;

    /* JADX INFO: renamed from: b */
    public static pb1 m171472b() {
        if (f151341a == null) {
            synchronized (pb1.class) {
                try {
                    if (f151341a == null) {
                        f151341a = new qb1();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f151341a;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo171473a(String str);

    /* JADX INFO: renamed from: c */
    public abstract AudioBusinessType mo171474c();

    /* JADX INFO: renamed from: d */
    public abstract boolean mo171475d(AudioBusinessType audioBusinessType);

    /* JADX INFO: renamed from: e */
    public abstract void mo171476e(String str);

    /* JADX INFO: renamed from: f */
    public abstract void mo171477f(String str, AudioBusinessType audioBusinessType, ga1 ga1Var);

    /* JADX INFO: renamed from: g */
    public abstract void mo171478g(String str, AudioBusinessType audioBusinessType, ga1 ga1Var);
}
