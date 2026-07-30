package p149l;

/* JADX INFO: loaded from: classes2.dex */
public final class viq0 {

    /* JADX INFO: renamed from: c */
    public static final viq0 f181631c = new viq0(new byte[0]);

    /* JADX INFO: renamed from: a */
    private final byte[] f181632a;

    /* JADX INFO: renamed from: b */
    private volatile int f181633b = 0;

    private viq0(byte[] bArr) {
        this.f181632a = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static viq0 m198603b(byte[] bArr) {
        return m198604c(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: c */
    public static viq0 m198604c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new viq0(bArr2);
    }

    /* JADX INFO: renamed from: a */
    public int m198605a() {
        return this.f181632a.length;
    }

    /* JADX INFO: renamed from: d */
    public byte[] m198606d() {
        byte[] bArr = this.f181632a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof viq0)) {
            return false;
        }
        byte[] bArr = this.f181632a;
        int length = bArr.length;
        byte[] bArr2 = ((viq0) obj).f181632a;
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
        int i = this.f181633b;
        if (i != 0) {
            return i;
        }
        byte[] bArr = this.f181632a;
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            length = 1;
        }
        this.f181633b = length;
        return length;
    }
}
