package p153l;

/* JADX INFO: loaded from: classes2.dex */
public final class asq0 {

    /* JADX INFO: renamed from: c */
    public static final asq0 f73163c = new asq0(new byte[0]);

    /* JADX INFO: renamed from: a */
    private final byte[] f73164a;

    /* JADX INFO: renamed from: b */
    private volatile int f73165b = 0;

    private asq0(byte[] bArr) {
        this.f73164a = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static asq0 m99965b(byte[] bArr) {
        return m99966c(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: c */
    public static asq0 m99966c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new asq0(bArr2);
    }

    /* JADX INFO: renamed from: a */
    public int m99967a() {
        return this.f73164a.length;
    }

    /* JADX INFO: renamed from: d */
    public byte[] m99968d() {
        byte[] bArr = this.f73164a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof asq0)) {
            return false;
        }
        byte[] bArr = this.f73164a;
        int length = bArr.length;
        byte[] bArr2 = ((asq0) obj).f73164a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f73165b;
        if (i != 0) {
            return i;
        }
        byte[] bArr = this.f73164a;
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            length = 1;
        }
        this.f73165b = length;
        return length;
    }
}
