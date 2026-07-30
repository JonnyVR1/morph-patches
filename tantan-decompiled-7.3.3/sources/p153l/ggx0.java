package p153l;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class ggx0 implements npx0 {

    /* JADX INFO: renamed from: a */
    public final oof0<String, oof0<String, String>> f104053a;

    public ggx0(oof0<String, oof0<String, String>> oof0Var) {
        this.f104053a = oof0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    /* JADX WARN: Code duplicated, block: B:8:0x000e  */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x001b, please report this as an issue */
    @Override // p153l.npx0
    /* JADX INFO: renamed from: a */
    public final String mo130198a(Uri uri, String str, String str2, String str3) {
        oof0<String, String> oof0Var;
        if (uri == null) {
            if (str == null) {
                oof0Var = null;
            }
            if (oof0Var == null) {
                return null;
            }
            if (str2 != null) {
                str3 = str2 + str3;
            }
            return oof0Var.get(str3);
        }
        str = uri.toString();
        oof0<String, oof0<String, String>> oof0Var2 = this.f104053a;
        if (oof0Var2 == null) {
            oof0Var = null;
        } else {
            oof0Var = oof0Var2.get(str);
        }
        if (oof0Var == null) {
            return null;
        }
        if (str2 != null) {
            str3 = str2 + str3;
        }
        return oof0Var.get(str3);
    }
}
