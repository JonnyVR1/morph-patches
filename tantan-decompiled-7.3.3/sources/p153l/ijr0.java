package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class ijr0 {

    /* JADX INFO: renamed from: a */
    public final Object f115276a;

    /* JADX INFO: renamed from: b */
    public final Object f115277b;

    /* JADX INFO: renamed from: c */
    public final Object f115278c;

    public ijr0(Object obj, Object obj2, Object obj3) {
        this.f115276a = obj;
        this.f115277b = obj2;
        this.f115278c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m140239a() {
        Object obj = this.f115278c;
        Object obj2 = this.f115277b;
        Object obj3 = this.f115276a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
