package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class zrr0 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f205789e = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f205790a;

    /* JADX INFO: renamed from: b */
    public int f205791b;

    /* JADX INFO: renamed from: c */
    public int f205792c;

    /* JADX INFO: renamed from: d */
    public byte[] f205793d = new byte[128];

    public zrr0(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final void m221184a(byte[] bArr, int i, int i2) {
        if (this.f205790a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f205793d;
            int length = bArr2.length;
            int i4 = this.f205791b + i3;
            if (length < i4) {
                this.f205793d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f205793d, this.f205791b, i3);
            this.f205791b += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m221185b() {
        this.f205790a = false;
        this.f205791b = 0;
        this.f205792c = 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m221186c(int i, int i2) {
        if (this.f205790a) {
            int i3 = this.f205791b - i2;
            this.f205791b = i3;
            if (this.f205792c != 0 || i != 181) {
                this.f205790a = false;
                return true;
            }
            this.f205792c = i3;
        } else if (i == 179) {
            this.f205790a = true;
        }
        m221184a(f205789e, 0, 3);
        return false;
    }
}
