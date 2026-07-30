package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class pkx0 implements ckx0 {

    /* JADX INFO: renamed from: a */
    public final fkx0 f152970a;

    /* JADX INFO: renamed from: b */
    public final String f152971b;

    /* JADX INFO: renamed from: c */
    public final Object[] f152972c;

    /* JADX INFO: renamed from: d */
    public final int f152973d;

    public pkx0(fkx0 fkx0Var, String str, Object[] objArr) {
        this.f152970a = fkx0Var;
        this.f152971b = str;
        this.f152972c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f152973d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f152973d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m172775a() {
        return this.f152971b;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m172776b() {
        return this.f152972c;
    }

    @Override // p153l.ckx0
    public final fkx0 zza() {
        return this.f152970a;
    }

    @Override // p153l.ckx0
    public final boolean zzb() {
        return (this.f152973d & 2) == 2;
    }

    @Override // p153l.ckx0
    public final int zzc() {
        int i = this.f152973d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
