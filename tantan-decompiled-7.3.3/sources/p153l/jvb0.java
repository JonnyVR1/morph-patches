package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class jvb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f122780a;

    public jvb0(boolean z) {
        this.f122780a = z;
    }

    /* JADX INFO: renamed from: a */
    public void m147009a(s5d0[] s5d0VarArr) {
        if (!this.f122780a || s5d0VarArr == null || s5d0VarArr.length < 3) {
            return;
        }
        s5d0 s5d0Var = s5d0VarArr[0];
        s5d0VarArr[0] = s5d0VarArr[2];
        s5d0VarArr[2] = s5d0Var;
    }
}
