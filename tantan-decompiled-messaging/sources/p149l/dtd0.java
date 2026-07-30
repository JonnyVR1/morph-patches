package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class dtd0 {

    /* JADX INFO: renamed from: a */
    public ctd0[] f87831a;

    /* JADX INFO: renamed from: b */
    public ctd0[] f87832b;

    public String toString() {
        StringBuilder sb = new StringBuilder("ScalingMatrix{ScalingList4x4=");
        ctd0[] ctd0VarArr = this.f87831a;
        sb.append(ctd0VarArr == null ? null : Arrays.asList(ctd0VarArr));
        sb.append("\n, ScalingList8x8=");
        ctd0[] ctd0VarArr2 = this.f87832b;
        sb.append(ctd0VarArr2 != null ? Arrays.asList(ctd0VarArr2) : null);
        sb.append("\n}");
        return sb.toString();
    }
}
