package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class miw0 {

    /* JADX INFO: renamed from: a */
    public final Object f134044a;

    /* JADX INFO: renamed from: b */
    public final Object f134045b;

    /* JADX INFO: renamed from: c */
    public final Object f134046c;

    public miw0(Object obj, Object obj2, Object obj3) {
        this.f134044a = obj;
        this.f134045b = obj2;
        this.f134046c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m154763a() {
        Object obj = this.f134046c;
        Object obj2 = this.f134045b;
        Object obj3 = this.f134044a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
