package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class car0 {

    /* JADX INFO: renamed from: a */
    public final Object f80050a;

    /* JADX INFO: renamed from: b */
    public final Object f80051b;

    /* JADX INFO: renamed from: c */
    public final Object f80052c;

    public car0(Object obj, Object obj2, Object obj3) {
        this.f80050a = obj;
        this.f80051b = obj2;
        this.f80052c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m105934a() {
        Object obj = this.f80052c;
        Object obj2 = this.f80051b;
        Object obj3 = this.f80050a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
