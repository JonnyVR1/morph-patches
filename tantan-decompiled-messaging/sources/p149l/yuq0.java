package p149l;

import com.xiaomi.push.C14784il;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yuq0 {
    /* JADX INFO: renamed from: a */
    public abstract int mo200088a(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: c */
    public abstract void mo200089c(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: d */
    public byte[] mo211179d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public int mo211180e() {
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public int mo211181f() {
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public int m216153g(byte[] bArr, int i, int i2) throws C14784il {
        int i3 = 0;
        while (i3 < i2) {
            int iMo200088a = mo200088a(bArr, i + i3, i2 - i3);
            if (iMo200088a <= 0) {
                throw new C14784il("Cannot read. Remote side has closed. Tried to read " + i2 + " bytes, but only got " + i3 + " bytes.");
            }
            i3 += iMo200088a;
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public void mo211178b(int i) {
    }
}
