package p149l;

/* JADX INFO: loaded from: classes9.dex */
public class mr8 {

    /* JADX INFO: renamed from: b */
    public static mr8 f135345b;

    /* JADX INFO: renamed from: a */
    public bs5 f135346a = new bs5();

    /* JADX INFO: renamed from: b */
    public static mr8 m156019b() {
        if (f135345b == null) {
            synchronized (mr8.class) {
                try {
                    if (f135345b == null) {
                        f135345b = new mr8();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f135345b;
    }

    /* JADX INFO: renamed from: a */
    public void m156020a() {
        this.f135346a.m103657c();
    }

    /* JADX INFO: renamed from: c */
    public void m156021c() {
    }
}
