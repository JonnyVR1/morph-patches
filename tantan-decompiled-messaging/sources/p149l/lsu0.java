package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class lsu0 {

    /* JADX INFO: renamed from: a */
    public final String f129896a;

    /* JADX INFO: renamed from: b */
    public final hvt0 f129897b;

    /* JADX INFO: renamed from: c */
    public hvt0 f129898c;

    public /* synthetic */ lsu0(String str, b0s0 b0s0Var) {
        hvt0 hvt0Var = new hvt0(null);
        this.f129897b = hvt0Var;
        this.f129898c = hvt0Var;
        str.getClass();
        this.f129896a = str;
    }

    /* JADX INFO: renamed from: a */
    public final lsu0 m151647a(String str, float f) {
        String strValueOf = String.valueOf(f);
        tws0 tws0Var = new tws0(null);
        this.f129898c.f109700c = tws0Var;
        this.f129898c = tws0Var;
        tws0Var.f109699b = strValueOf;
        tws0Var.f109698a = "confidence";
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final lsu0 m151648b(String str, Object obj) {
        hvt0 hvt0Var = new hvt0(null);
        this.f129898c.f109700c = hvt0Var;
        this.f129898c = hvt0Var;
        hvt0Var.f109699b = obj;
        hvt0Var.f109698a = "languageTag";
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f129896a);
        sb.append('{');
        hvt0 hvt0Var = this.f129897b.f109700c;
        String str = "";
        while (hvt0Var != null) {
            Object obj = hvt0Var.f109699b;
            sb.append(str);
            String str2 = hvt0Var.f109698a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            hvt0Var = hvt0Var.f109700c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
