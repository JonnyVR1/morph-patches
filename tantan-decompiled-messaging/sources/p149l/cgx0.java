package p149l;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cgx0 {
    /* JADX INFO: renamed from: b */
    public static cgx0 m106844b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new xfx0(cls.getSimpleName()) : new zfx0(cls.getSimpleName());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo106845a(String str);
}
