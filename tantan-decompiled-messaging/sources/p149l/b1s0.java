package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class b1s0 {

    /* JADX INFO: renamed from: a */
    public final String f72625a;

    /* JADX INFO: renamed from: b */
    public final hyr0 f72626b;

    /* JADX INFO: renamed from: c */
    public hyr0 f72627c;

    public /* synthetic */ b1s0(String str, i2s0 i2s0Var) {
        hyr0 hyr0Var = new hyr0();
        this.f72626b = hyr0Var;
        this.f72627c = hyr0Var;
        str.getClass();
        this.f72625a = str;
    }

    /* JADX INFO: renamed from: a */
    public final b1s0 m99868a(Object obj) {
        hyr0 hyr0Var = new hyr0();
        this.f72627c.f110142b = hyr0Var;
        this.f72627c = hyr0Var;
        hyr0Var.f110141a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f72625a);
        sb.append('{');
        hyr0 hyr0Var = this.f72626b.f110142b;
        String str = "";
        while (hyr0Var != null) {
            Object obj = hyr0Var.f110141a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            hyr0Var = hyr0Var.f110142b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
