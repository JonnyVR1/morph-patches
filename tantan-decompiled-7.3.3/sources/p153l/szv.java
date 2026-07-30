package p153l;

/* JADX INFO: loaded from: classes7.dex */
public abstract class szv {
    /* JADX INFO: renamed from: a */
    public static szv m188683a(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new ao0(cls.getSimpleName()) : new dsq(cls.getSimpleName());
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo99049b(String str);

    /* JADX INFO: renamed from: c */
    public abstract void mo99050c(String str);
}
