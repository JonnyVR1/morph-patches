package p153l;

/* JADX INFO: loaded from: classes6.dex */
public abstract class opw0 extends etw0 {

    /* JADX INFO: renamed from: a */
    public Object f148520a;

    /* JADX INFO: renamed from: b */
    public int f148521b = 2;

    /* JADX INFO: renamed from: a */
    public final Object m168775a() {
        this.f148521b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        tow0.m192094i(this.f148521b != 4);
        int i = this.f148521b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            return true;
        }
        if (i2 != 2) {
            this.f148521b = 4;
            this.f148520a = zza();
            if (this.f148521b != 3) {
                this.f148521b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            mor.m159308a();
            return null;
        }
        this.f148521b = 2;
        Object obj = this.f148520a;
        this.f148520a = null;
        return obj;
    }

    public abstract Object zza();
}
