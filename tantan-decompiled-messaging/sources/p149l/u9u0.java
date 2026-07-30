package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class u9u0 implements p8u0 {

    /* JADX INFO: renamed from: a */
    public final Object f175507a;

    public u9u0(Object obj) {
        this.f175507a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static p8u0 m192663a(Object obj) {
        if (obj != null) {
            return new u9u0(obj);
        }
        jfd0.m141176a("instance cannot be null");
        return null;
    }

    @Override // p149l.veu0
    public final Object zza() {
        return this.f175507a;
    }
}
