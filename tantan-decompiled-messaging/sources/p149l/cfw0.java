package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class cfw0 {

    /* JADX INFO: renamed from: a */
    public final String f80678a;

    /* JADX INFO: renamed from: b */
    public final afw0 f80679b;

    /* JADX INFO: renamed from: c */
    public afw0 f80680c;

    public /* synthetic */ cfw0(String str, bfw0 bfw0Var) {
        afw0 afw0Var = new afw0();
        this.f80679b = afw0Var;
        this.f80680c = afw0Var;
        str.getClass();
        this.f80678a = str;
    }

    /* JADX INFO: renamed from: a */
    public final cfw0 m106613a(Object obj) {
        afw0 afw0Var = new afw0();
        this.f80680c.f69230b = afw0Var;
        this.f80680c = afw0Var;
        afw0Var.f69229a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f80678a);
        sb.append('{');
        afw0 afw0Var = this.f80679b.f69230b;
        String str = "";
        while (afw0Var != null) {
            Object obj = afw0Var.f69229a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            afw0Var = afw0Var.f69230b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
