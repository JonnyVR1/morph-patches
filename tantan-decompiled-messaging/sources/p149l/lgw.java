package p149l;

/* JADX INFO: loaded from: classes2.dex */
class lgw {

    /* JADX INFO: renamed from: a */
    int[] f128021a;

    /* JADX INFO: renamed from: b */
    long f128022b;

    /* JADX INFO: renamed from: c */
    byte[] f128023c;

    public lgw() {
        this.f128023c = new byte[64];
        this.f128022b = 0L;
        this.f128021a = new int[]{1732584193, -271733879, -1732584194, 271733878};
    }

    public lgw(lgw lgwVar) {
        this();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f128023c;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = lgwVar.f128023c[i2];
            i2++;
        }
        while (true) {
            int[] iArr = this.f128021a;
            if (i >= iArr.length) {
                this.f128022b = lgwVar.f128022b;
                return;
            } else {
                iArr[i] = lgwVar.f128021a[i];
                i++;
            }
        }
    }
}
