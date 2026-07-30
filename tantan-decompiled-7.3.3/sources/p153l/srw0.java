package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class srw0 {

    /* JADX INFO: renamed from: a */
    public final Object f170382a;

    /* JADX INFO: renamed from: b */
    public final Object f170383b;

    /* JADX INFO: renamed from: c */
    public final Object f170384c;

    public srw0(Object obj, Object obj2, Object obj3) {
        this.f170382a = obj;
        this.f170383b = obj2;
        this.f170384c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m187639a() {
        Object obj = this.f170384c;
        Object obj2 = this.f170383b;
        Object obj3 = this.f170382a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
