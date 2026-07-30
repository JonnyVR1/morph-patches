package p149l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class nhy0 {

    /* JADX INFO: renamed from: a */
    public final String f139045a;

    /* JADX INFO: renamed from: b */
    public final kby0 f139046b;

    /* JADX INFO: renamed from: c */
    public kby0 f139047c;

    public /* synthetic */ nhy0(String str, xey0 xey0Var) {
        kby0 kby0Var = new kby0();
        this.f139046b = kby0Var;
        this.f139047c = kby0Var;
        str.getClass();
        this.f139045a = str;
    }

    /* JADX INFO: renamed from: a */
    public final nhy0 m159483a(String str, Object obj) {
        kby0 kby0Var = new kby0();
        this.f139047c.f122277c = kby0Var;
        this.f139047c = kby0Var;
        kby0Var.f122276b = obj;
        kby0Var.f122275a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f139045a);
        sb.append('{');
        kby0 kby0Var = this.f139046b.f122277c;
        String str = "";
        while (kby0Var != null) {
            Object obj = kby0Var.f122276b;
            sb.append(str);
            String str2 = kby0Var.f122275a;
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
            kby0Var = kby0Var.f122277c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
