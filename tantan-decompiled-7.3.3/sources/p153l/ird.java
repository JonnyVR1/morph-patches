package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class ird {

    /* JADX INFO: renamed from: a */
    public final CharSequence f116523a;

    /* JADX INFO: renamed from: b */
    public final int f116524b;

    /* JADX INFO: renamed from: c */
    public final int f116525c;

    /* JADX INFO: renamed from: d */
    public final byte[] f116526d;

    public ird(CharSequence charSequence, int i, int i2) {
        this.f116523a = charSequence;
        this.f116525c = i;
        this.f116524b = i2;
        byte[] bArr = new byte[i * i2];
        this.f116526d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* JADX INFO: renamed from: a */
    public final void m141776a(int i) {
        m141782g(this.f116524b - 1, 0, i, 1);
        m141782g(this.f116524b - 1, 1, i, 2);
        m141782g(this.f116524b - 1, 2, i, 3);
        m141782g(0, this.f116525c - 2, i, 4);
        m141782g(0, this.f116525c - 1, i, 5);
        m141782g(1, this.f116525c - 1, i, 6);
        m141782g(2, this.f116525c - 1, i, 7);
        m141782g(3, this.f116525c - 1, i, 8);
    }

    /* JADX INFO: renamed from: b */
    public final void m141777b(int i) {
        m141782g(this.f116524b - 3, 0, i, 1);
        m141782g(this.f116524b - 2, 0, i, 2);
        m141782g(this.f116524b - 1, 0, i, 3);
        m141782g(0, this.f116525c - 4, i, 4);
        m141782g(0, this.f116525c - 3, i, 5);
        m141782g(0, this.f116525c - 2, i, 6);
        m141782g(0, this.f116525c - 1, i, 7);
        m141782g(1, this.f116525c - 1, i, 8);
    }

    /* JADX INFO: renamed from: c */
    public final void m141778c(int i) {
        m141782g(this.f116524b - 3, 0, i, 1);
        m141782g(this.f116524b - 2, 0, i, 2);
        m141782g(this.f116524b - 1, 0, i, 3);
        m141782g(0, this.f116525c - 2, i, 4);
        m141782g(0, this.f116525c - 1, i, 5);
        m141782g(1, this.f116525c - 1, i, 6);
        m141782g(2, this.f116525c - 1, i, 7);
        m141782g(3, this.f116525c - 1, i, 8);
    }

    /* JADX INFO: renamed from: d */
    public final void m141779d(int i) {
        m141782g(this.f116524b - 1, 0, i, 1);
        m141782g(this.f116524b - 1, this.f116525c - 1, i, 2);
        m141782g(0, this.f116525c - 3, i, 3);
        m141782g(0, this.f116525c - 2, i, 4);
        m141782g(0, this.f116525c - 1, i, 5);
        m141782g(1, this.f116525c - 3, i, 6);
        m141782g(1, this.f116525c - 2, i, 7);
        m141782g(1, this.f116525c - 1, i, 8);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m141780e(int i, int i2) {
        return this.f116526d[(i2 * this.f116525c) + i] == 1;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m141781f(int i, int i2) {
        return this.f116526d[(i2 * this.f116525c) + i] >= 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m141782g(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f116524b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f116525c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        m141784i(i2, i, (this.f116523a.charAt(i3) & (1 << (8 - i4))) != 0);
    }

    /* JADX INFO: renamed from: h */
    public final void m141783h() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f116524b && i3 == 0) {
                m141776a(i4);
                i4++;
            }
            if (i5 == this.f116524b - 2 && i3 == 0 && this.f116525c % 4 != 0) {
                m141777b(i4);
                i4++;
            }
            if (i5 == this.f116524b - 2 && i3 == 0 && this.f116525c % 8 == 4) {
                m141778c(i4);
                i4++;
            }
            if (i5 == this.f116524b + 4 && i3 == 2 && this.f116525c % 8 == 0) {
                m141779d(i4);
                i4++;
            }
            while (true) {
                if (i5 < this.f116524b && i3 >= 0 && !m141781f(i3, i5)) {
                    m141785j(i5, i3, i4);
                    i4++;
                }
                int i6 = i5 - 2;
                int i7 = i3 + 2;
                if (i6 < 0 || i7 >= this.f116525c) {
                    break;
                }
                i5 = i6;
                i3 = i7;
            }
            int i8 = i5 - 1;
            int i9 = i3 + 5;
            while (true) {
                if (i8 >= 0 && i9 < this.f116525c && !m141781f(i9, i8)) {
                    m141785j(i8, i9, i4);
                    i4++;
                }
                int i10 = i8 + 2;
                int i11 = i9 - 2;
                i = this.f116524b;
                if (i10 >= i || i11 < 0) {
                    break;
                }
                i8 = i10;
                i9 = i11;
            }
            i5 = i8 + 5;
            i3 = i9 - 1;
            if (i5 >= i && i3 >= (i2 = this.f116525c)) {
                break;
            }
        }
        if (m141781f(i2 - 1, i - 1)) {
            return;
        }
        m141784i(this.f116525c - 1, this.f116524b - 1, true);
        m141784i(this.f116525c - 2, this.f116524b - 2, true);
    }

    /* JADX INFO: renamed from: i */
    public final void m141784i(int i, int i2, boolean z) {
        this.f116526d[(i2 * this.f116525c) + i] = z ? (byte) 1 : (byte) 0;
    }

    /* JADX INFO: renamed from: j */
    public final void m141785j(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m141782g(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m141782g(i4, i6, i3, 2);
        int i7 = i - 1;
        m141782g(i7, i5, i3, 3);
        m141782g(i7, i6, i3, 4);
        m141782g(i7, i2, i3, 5);
        m141782g(i, i5, i3, 6);
        m141782g(i, i6, i3, 7);
        m141782g(i, i2, i3, 8);
    }
}
