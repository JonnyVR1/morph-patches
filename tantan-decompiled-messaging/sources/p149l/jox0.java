package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class jox0 implements fmx0 {

    /* JADX INFO: renamed from: a */
    public final smx0 f119020a;

    /* JADX INFO: renamed from: b */
    public final String f119021b;

    /* JADX INFO: renamed from: c */
    public final Object[] f119022c;

    /* JADX INFO: renamed from: d */
    public final int f119023d;

    public jox0(smx0 smx0Var, String str, Object[] objArr) {
        this.f119020a = smx0Var;
        this.f119021b = str;
        this.f119022c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f119023d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f119023d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m142537a() {
        return this.f119021b;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m142538b() {
        return this.f119022c;
    }

    @Override // p149l.fmx0
    public final smx0 zza() {
        return this.f119020a;
    }

    @Override // p149l.fmx0
    public final boolean zzb() {
        return (this.f119023d & 2) == 2;
    }

    @Override // p149l.fmx0
    public final int zzc() {
        int i = this.f119023d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
