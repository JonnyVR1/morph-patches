package p149l;

/* JADX INFO: loaded from: classes6.dex */
public abstract class igw0 extends yjw0 {

    /* JADX INFO: renamed from: a */
    public Object f113188a;

    /* JADX INFO: renamed from: b */
    public int f113189b = 2;

    /* JADX INFO: renamed from: a */
    public final Object m136179a() {
        this.f113189b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        nfw0.m159287i(this.f113189b != 4);
        int i = this.f113189b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.f113189b = 4;
            this.f113188a = zza();
            if (this.f113189b != 3) {
                this.f113189b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            lmr.m150601a();
            return null;
        }
        this.f113189b = 2;
        Object obj = this.f113188a;
        this.f113188a = null;
        return obj;
    }

    public abstract Object zza();
}
