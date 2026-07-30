package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class f1e0 {

    /* JADX INFO: renamed from: a */
    public e1e0[] f96784a;

    /* JADX INFO: renamed from: b */
    public e1e0[] f96785b;

    public String toString() {
        StringBuilder sb = new StringBuilder("ScalingMatrix{ScalingList4x4=");
        e1e0[] e1e0VarArr = this.f96784a;
        sb.append(e1e0VarArr == null ? null : Arrays.asList(e1e0VarArr));
        sb.append("\n, ScalingList8x8=");
        e1e0[] e1e0VarArr2 = this.f96785b;
        sb.append(e1e0VarArr2 != null ? Arrays.asList(e1e0VarArr2) : null);
        sb.append("\n}");
        return sb.toString();
    }
}
