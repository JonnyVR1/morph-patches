package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class tir0 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f170605e = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f170606a;

    /* JADX INFO: renamed from: b */
    public int f170607b;

    /* JADX INFO: renamed from: c */
    public int f170608c;

    /* JADX INFO: renamed from: d */
    public byte[] f170609d = new byte[128];

    public tir0(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final void m189216a(byte[] bArr, int i, int i2) {
        if (this.f170606a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f170609d;
            int length = bArr2.length;
            int i4 = this.f170607b + i3;
            if (length < i4) {
                this.f170609d = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f170609d, this.f170607b, i3);
            this.f170607b += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m189217b() {
        this.f170606a = false;
        this.f170607b = 0;
        this.f170608c = 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m189218c(int i, int i2) {
        if (this.f170606a) {
            int i3 = this.f170607b - i2;
            this.f170607b = i3;
            if (this.f170608c != 0 || i != 181) {
                this.f170606a = false;
                return true;
            }
            this.f170608c = i3;
        } else if (i == 179) {
            this.f170606a = true;
        }
        m189216a(f170605e, 0, 3);
        return false;
    }
}
