package p153l;

/* JADX INFO: loaded from: classes2.dex */
class jiw {

    /* JADX INFO: renamed from: a */
    int[] f121124a;

    /* JADX INFO: renamed from: b */
    long f121125b;

    /* JADX INFO: renamed from: c */
    byte[] f121126c;

    public jiw() {
        this.f121126c = new byte[64];
        this.f121125b = 0L;
        this.f121124a = new int[]{1732584193, -271733879, -1732584194, 271733878};
    }

    public jiw(jiw jiwVar) {
        this();
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f121126c;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = jiwVar.f121126c[i2];
            i2++;
        }
        while (true) {
            int[] iArr = this.f121124a;
            if (i >= iArr.length) {
                this.f121125b = jiwVar.f121125b;
                return;
            } else {
                iArr[i] = jiwVar.f121124a[i];
                i++;
            }
        }
    }
}
