package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class tgt0 {

    /* JADX INFO: renamed from: a */
    public final Object f170128a;

    /* JADX INFO: renamed from: b */
    public final Object f170129b;

    /* JADX INFO: renamed from: c */
    public final Object f170130c;

    public tgt0(Object obj, Object obj2, Object obj3) {
        this.f170128a = obj;
        this.f170129b = obj2;
        this.f170130c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m188825a() {
        Object obj = this.f170130c;
        Object obj2 = this.f170129b;
        Object obj3 = this.f170128a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
