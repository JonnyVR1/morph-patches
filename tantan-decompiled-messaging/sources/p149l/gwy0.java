package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class gwy0 {

    /* JADX INFO: renamed from: a */
    public final ntt0 f104802a;

    /* JADX INFO: renamed from: b */
    public final int[] f104803b;

    public gwy0(ntt0 ntt0Var, int[] iArr, int i) {
        if (iArr.length == 0) {
            svv0.m186109d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f104802a = ntt0Var;
        this.f104803b = iArr;
    }
}
