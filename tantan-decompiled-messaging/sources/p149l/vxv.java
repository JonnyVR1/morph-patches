package p149l;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vxv {
    /* JADX INFO: renamed from: a */
    public static vxv m200598a(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new eo0(cls.getSimpleName()) : new cqq(cls.getSimpleName());
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo108288b(String str);

    /* JADX INFO: renamed from: c */
    public abstract void mo108289c(String str);
}
