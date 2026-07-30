package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class has0 {

    /* JADX INFO: renamed from: a */
    public final String f108515a;

    /* JADX INFO: renamed from: b */
    public final n7s0 f108516b;

    /* JADX INFO: renamed from: c */
    public n7s0 f108517c;

    public /* synthetic */ has0(String str, obs0 obs0Var) {
        n7s0 n7s0Var = new n7s0();
        this.f108516b = n7s0Var;
        this.f108517c = n7s0Var;
        str.getClass();
        this.f108515a = str;
    }

    /* JADX INFO: renamed from: a */
    public final has0 m134193a(Object obj) {
        n7s0 n7s0Var = new n7s0();
        this.f108517c.f140626b = n7s0Var;
        this.f108517c = n7s0Var;
        n7s0Var.f140625a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f108515a);
        sb.append('{');
        n7s0 n7s0Var = this.f108516b.f140626b;
        String str = "";
        while (n7s0Var != null) {
            Object obj = n7s0Var.f140625a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            n7s0Var = n7s0Var.f140626b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
