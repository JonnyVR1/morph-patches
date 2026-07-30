package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class msr0 {

    /* JADX INFO: renamed from: f */
    public static final byte[] f138515f = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f138516a;

    /* JADX INFO: renamed from: b */
    public int f138517b;

    /* JADX INFO: renamed from: c */
    public int f138518c;

    /* JADX INFO: renamed from: d */
    public int f138519d;

    /* JADX INFO: renamed from: e */
    public byte[] f138520e = new byte[128];

    public msr0(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final void m159933a(byte[] bArr, int i, int i2) {
        if (this.f138516a) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f138520e;
            int length = bArr2.length;
            int i4 = this.f138518c + i3;
            if (length < i4) {
                this.f138520e = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.f138520e, this.f138518c, i3);
            this.f138518c += i3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m159934b() {
        this.f138516a = false;
        this.f138518c = 0;
        this.f138517b = 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m159935c(int i, int i2) {
        int i3 = this.f138517b;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i == 179 || i == 181) {
                            this.f138518c -= i2;
                            this.f138516a = false;
                            return true;
                        }
                    } else if ((i & 240) != 32) {
                        y4w0.m214278f("H263Reader", "Unexpected start code value");
                        m159934b();
                    } else {
                        this.f138519d = this.f138518c;
                        this.f138517b = 4;
                    }
                } else if (i > 31) {
                    y4w0.m214278f("H263Reader", "Unexpected start code value");
                    m159934b();
                } else {
                    this.f138517b = 3;
                }
            } else if (i != 181) {
                y4w0.m214278f("H263Reader", "Unexpected start code value");
                m159934b();
            } else {
                this.f138517b = 2;
            }
        } else if (i == 176) {
            this.f138517b = 1;
            this.f138516a = true;
        }
        m159933a(f138515f, 0, 3);
        return false;
    }
}
