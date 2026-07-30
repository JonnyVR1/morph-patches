package p153l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public final class q4s0 extends x5s0 {
    public q4s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2) {
        super(b4s0Var, "nK4MIXXv/sY+coqtAjalB6f9NiJ1zVnlRnfsJ++LIaOoNJXY+cpXhUK9rjjc0N2G", "gziBDgIPHk3UnbqAN9Ta9zRxJ8KBrTfiKBXyCZDQ588=", fzr0Var, i, 5);
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        this.f192522e.m128312n0(-1L);
        this.f192522e.m128311m0(-1L);
        int[] iArr = (int[]) this.f192523f.invoke(null, this.f192519b.m102517b());
        synchronized (this.f192522e) {
            try {
                this.f192522e.m128312n0(iArr[0]);
                this.f192522e.m128311m0(iArr[1]);
                int i = iArr[2];
                if (i != Integer.MIN_VALUE) {
                    this.f192522e.m128310l0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
