package p149l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class kvr0 extends rwr0 {
    public kvr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2) {
        super(vur0Var, "nK4MIXXv/sY+coqtAjalB6f9NiJ1zVnlRnfsJ++LIaOoNJXY+cpXhUK9rjjc0N2G", "gziBDgIPHk3UnbqAN9Ta9zRxJ8KBrTfiKBXyCZDQ588=", zpr0Var, i, 5);
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        this.f161371e.m219777n0(-1L);
        this.f161371e.m219776m0(-1L);
        int[] iArr = (int[]) this.f161372f.invoke(null, this.f161368b.m200101b());
        synchronized (this.f161371e) {
            try {
                this.f161371e.m219777n0(iArr[0]);
                this.f161371e.m219776m0(iArr[1]);
                int i = iArr[2];
                if (i != Integer.MIN_VALUE) {
                    this.f161371e.m219775l0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
