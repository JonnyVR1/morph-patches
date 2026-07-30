package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class zpt0 {

    /* JADX INFO: renamed from: a */
    public final Object f205531a;

    /* JADX INFO: renamed from: b */
    public final Object f205532b;

    /* JADX INFO: renamed from: c */
    public final Object f205533c;

    public zpt0(Object obj, Object obj2, Object obj3) {
        this.f205531a = obj;
        this.f205532b = obj2;
        this.f205533c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m220930a() {
        Object obj = this.f205533c;
        Object obj2 = this.f205532b;
        Object obj3 = this.f205531a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
