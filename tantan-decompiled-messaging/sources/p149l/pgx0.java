package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class pgx0 implements ogx0, egx0 {

    /* JADX INFO: renamed from: b */
    public static final pgx0 f148836b = new pgx0(null);

    /* JADX INFO: renamed from: a */
    public final Object f148837a;

    public pgx0(Object obj) {
        this.f148837a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static ogx0 m168925a(Object obj) {
        wgx0.m203088a(obj, "instance cannot be null");
        return new pgx0(obj);
    }

    /* JADX INFO: renamed from: b */
    public static ogx0 m168926b(Object obj) {
        return obj == null ? f148836b : new pgx0(obj);
    }

    @Override // p149l.ehx0
    public final Object zzb() {
        return this.f148837a;
    }
}
