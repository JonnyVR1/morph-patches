package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class pxx0 implements lvx0 {

    /* JADX INFO: renamed from: a */
    public final yvx0 f154599a;

    /* JADX INFO: renamed from: b */
    public final String f154600b;

    /* JADX INFO: renamed from: c */
    public final Object[] f154601c;

    /* JADX INFO: renamed from: d */
    public final int f154602d;

    public pxx0(yvx0 yvx0Var, String str, Object[] objArr) {
        this.f154599a = yvx0Var;
        this.f154600b = str;
        this.f154601c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f154602d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f154602d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m174253a() {
        return this.f154600b;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m174254b() {
        return this.f154601c;
    }

    @Override // p153l.lvx0
    public final yvx0 zza() {
        return this.f154599a;
    }

    @Override // p153l.lvx0
    public final boolean zzb() {
        return (this.f154602d & 2) == 2;
    }

    @Override // p153l.lvx0
    public final int zzc() {
        int i = this.f154602d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
