package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class r1v0 {

    /* JADX INFO: renamed from: a */
    public final String f160857a;

    /* JADX INFO: renamed from: b */
    public final n4u0 f160858b;

    /* JADX INFO: renamed from: c */
    public n4u0 f160859c;

    public /* synthetic */ r1v0(String str, h9s0 h9s0Var) {
        n4u0 n4u0Var = new n4u0(null);
        this.f160858b = n4u0Var;
        this.f160859c = n4u0Var;
        str.getClass();
        this.f160857a = str;
    }

    /* JADX INFO: renamed from: a */
    public final r1v0 m179454a(String str, float f) {
        String strValueOf = String.valueOf(f);
        z5t0 z5t0Var = new z5t0(null);
        this.f160859c.f140258c = z5t0Var;
        this.f160859c = z5t0Var;
        z5t0Var.f140257b = strValueOf;
        z5t0Var.f140256a = "confidence";
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final r1v0 m179455b(String str, Object obj) {
        n4u0 n4u0Var = new n4u0(null);
        this.f160859c.f140258c = n4u0Var;
        this.f160859c = n4u0Var;
        n4u0Var.f140257b = obj;
        n4u0Var.f140256a = "languageTag";
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f160857a);
        sb.append('{');
        n4u0 n4u0Var = this.f160858b.f140258c;
        String str = "";
        while (n4u0Var != null) {
            Object obj = n4u0Var.f140257b;
            sb.append(str);
            String str2 = n4u0Var.f140256a;
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
            n4u0Var = n4u0Var.f140258c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
