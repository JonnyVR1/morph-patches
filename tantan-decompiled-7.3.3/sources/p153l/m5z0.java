package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class m5z0 {

    /* JADX INFO: renamed from: a */
    public final t2u0 f134954a;

    /* JADX INFO: renamed from: b */
    public final int[] f134955b;

    public m5z0(t2u0 t2u0Var, int[] iArr, int i) {
        if (iArr.length == 0) {
            y4w0.m214276d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f134954a = t2u0Var;
        this.f134955b = iArr;
    }
}
