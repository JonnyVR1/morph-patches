package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class tqy0 {

    /* JADX INFO: renamed from: a */
    public final String f175790a;

    /* JADX INFO: renamed from: b */
    public final qky0 f175791b;

    /* JADX INFO: renamed from: c */
    public qky0 f175792c;

    public /* synthetic */ tqy0(String str, doy0 doy0Var) {
        qky0 qky0Var = new qky0();
        this.f175791b = qky0Var;
        this.f175792c = qky0Var;
        str.getClass();
        this.f175790a = str;
    }

    /* JADX INFO: renamed from: a */
    public final tqy0 m192381a(String str, Object obj) {
        qky0 qky0Var = new qky0();
        this.f175792c.f158185c = qky0Var;
        this.f175792c = qky0Var;
        qky0Var.f158184b = obj;
        qky0Var.f158183a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f175790a);
        sb.append('{');
        qky0 qky0Var = this.f175791b.f158185c;
        String str = "";
        while (qky0Var != null) {
            Object obj = qky0Var.f158184b;
            sb.append(str);
            String str2 = qky0Var.f158183a;
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
            qky0Var = qky0Var.f158185c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
