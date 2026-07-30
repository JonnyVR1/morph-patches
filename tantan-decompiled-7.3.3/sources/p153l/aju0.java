package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class aju0 implements vhu0 {

    /* JADX INFO: renamed from: a */
    public final Object f71882a;

    public aju0(Object obj) {
        this.f71882a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static vhu0 m98486a(Object obj) {
        if (obj != null) {
            return new aju0(obj);
        }
        mnd0.m159157a("instance cannot be null");
        return null;
    }

    @Override // p153l.bou0
    public final Object zza() {
        return this.f71882a;
    }
}
