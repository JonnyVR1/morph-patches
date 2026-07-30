package p153l;

import com.xiaomi.push.C14932il;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e4r0 {
    /* JADX INFO: renamed from: a */
    public abstract int mo102509a(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: c */
    public abstract void mo102510c(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: d */
    public byte[] mo114230d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public int mo114231e() {
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public int mo114232f() {
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public int m119472g(byte[] bArr, int i, int i2) throws C14932il {
        int i3 = 0;
        while (i3 < i2) {
            int iMo102509a = mo102509a(bArr, i + i3, i2 - i3);
            if (iMo102509a <= 0) {
                throw new C14932il("Cannot read. Remote side has closed. Tried to read " + i2 + " bytes, but only got " + i3 + " bytes.");
            }
            i3 += iMo102509a;
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public void mo114229b(int i) {
    }
}
