package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class gjr0 {

    /* JADX INFO: renamed from: f */
    public static final byte[] f103095f = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f103096a;

    /* JADX INFO: renamed from: b */
    public int f103097b;

    /* JADX INFO: renamed from: c */
    public int f103098c;

    /* JADX INFO: renamed from: d */
    public int f103099d;

    /* JADX INFO: renamed from: e */
    public byte[] f103100e = new byte[128];

    public gjr0(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final void m126557a(byte[] bArr, int i, int i2) {
        if (this.f103096a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f103100e;
            int length = bArr2.length;
            int i4 = this.f103098c + i3;
            if (length < i4) {
                this.f103100e = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f103100e, this.f103098c, i3);
            this.f103098c += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m126558b() {
        this.f103096a = false;
        this.f103098c = 0;
        this.f103097b = 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m126559c(int i, int i2) {
        int i3 = this.f103097b;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i == 179 || i == 181) {
                            this.f103098c -= i2;
                            this.f103096a = false;
                            return true;
                        }
                    } else if ((i & 240) != 32) {
                        svv0.m186111f("H263Reader", "Unexpected start code value");
                        m126558b();
                    } else {
                        this.f103099d = this.f103098c;
                        this.f103097b = 4;
                    }
                } else if (i > 31) {
                    svv0.m186111f("H263Reader", "Unexpected start code value");
                    m126558b();
                } else {
                    this.f103097b = 3;
                }
            } else if (i != 181) {
                svv0.m186111f("H263Reader", "Unexpected start code value");
                m126558b();
            } else {
                this.f103097b = 2;
            }
        } else if (i == 176) {
            this.f103097b = 1;
            this.f103096a = true;
        }
        m126557a(f103095f, 0, 3);
        return false;
    }
}
