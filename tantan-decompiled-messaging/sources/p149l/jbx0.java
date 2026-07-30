package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class jbx0 implements wax0 {

    /* JADX INFO: renamed from: a */
    public final zax0 f117228a;

    /* JADX INFO: renamed from: b */
    public final String f117229b;

    /* JADX INFO: renamed from: c */
    public final Object[] f117230c;

    /* JADX INFO: renamed from: d */
    public final int f117231d;

    public jbx0(zax0 zax0Var, String str, Object[] objArr) {
        this.f117228a = zax0Var;
        this.f117229b = str;
        this.f117230c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f117231d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f117231d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m140829a() {
        return this.f117229b;
    }

    /* JADX INFO: renamed from: b */
    public final Object[] m140830b() {
        return this.f117230c;
    }

    @Override // p149l.wax0
    public final zax0 zza() {
        return this.f117228a;
    }

    @Override // p149l.wax0
    public final boolean zzb() {
        return (this.f117231d & 2) == 2;
    }

    @Override // p149l.wax0
    public final int zzc() {
        int i = this.f117231d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
