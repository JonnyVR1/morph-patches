package p149l;

/* JADX INFO: loaded from: classes7.dex */
public final class fnb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f98413a;

    public fnb0(boolean z) {
        this.f98413a = z;
    }

    /* JADX INFO: renamed from: a */
    public void m122294a(pxc0[] pxc0VarArr) {
        if (!this.f98413a || pxc0VarArr == null || pxc0VarArr.length < 3) {
            return;
        }
        pxc0 pxc0Var = pxc0VarArr[0];
        pxc0VarArr[0] = pxc0VarArr[2];
        pxc0VarArr[2] = pxc0Var;
    }
}
