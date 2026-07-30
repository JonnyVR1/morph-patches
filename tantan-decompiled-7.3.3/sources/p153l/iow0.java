package p153l;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class iow0 {

    /* JADX INFO: renamed from: a */
    public final String f116225a;

    /* JADX INFO: renamed from: b */
    public final gow0 f116226b;

    /* JADX INFO: renamed from: c */
    public gow0 f116227c;

    public /* synthetic */ iow0(String str, how0 how0Var) {
        gow0 gow0Var = new gow0();
        this.f116226b = gow0Var;
        this.f116227c = gow0Var;
        str.getClass();
        this.f116225a = str;
    }

    /* JADX INFO: renamed from: a */
    public final iow0 m141357a(Object obj) {
        gow0 gow0Var = new gow0();
        this.f116227c.f105399b = gow0Var;
        this.f116227c = gow0Var;
        gow0Var.f105398a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f116225a);
        sb.append('{');
        gow0 gow0Var = this.f116226b.f105399b;
        String str = "";
        while (gow0Var != null) {
            Object obj = gow0Var.f105398a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            gow0Var = gow0Var.f105399b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
