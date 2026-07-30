package p153l;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ipx0 {
    /* JADX INFO: renamed from: b */
    public static ipx0 m141544b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new dpx0(cls.getSimpleName()) : new fpx0(cls.getSimpleName());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo117432a(String str);
}
