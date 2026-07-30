package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class vpx0 implements upx0, kpx0 {

    /* JADX INFO: renamed from: b */
    public static final vpx0 f185311b = new vpx0(null);

    /* JADX INFO: renamed from: a */
    public final Object f185312a;

    public vpx0(Object obj) {
        this.f185312a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static upx0 m202347a(Object obj) {
        cqx0.m111998a(obj, "instance cannot be null");
        return new vpx0(obj);
    }

    /* JADX INFO: renamed from: b */
    public static upx0 m202348b(Object obj) {
        return obj == null ? f185311b : new vpx0(obj);
    }

    @Override // p153l.kqx0
    public final Object zzb() {
        return this.f185312a;
    }
}
