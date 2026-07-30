package p153l;

/* JADX INFO: loaded from: classes.dex */
public class bph0 implements pa5 {
    private static final bph0 INSTANCE = new bph0();

    /* JADX INFO: renamed from: a */
    public static bph0 m105843a() {
        return INSTANCE;
    }

    @Override // p153l.pa5
    public long now() {
        return System.currentTimeMillis();
    }
}
