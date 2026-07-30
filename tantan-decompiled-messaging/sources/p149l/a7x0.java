package p149l;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public final class a7x0 implements hgx0 {

    /* JADX INFO: renamed from: a */
    public final hgf0<String, hgf0<String, String>> f67964a;

    public a7x0(hgf0<String, hgf0<String, String>> hgf0Var) {
        this.f67964a = hgf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    /* JADX WARN: Code duplicated, block: B:8:0x000e  */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x001b, please report this as an issue */
    @Override // p149l.hgx0
    /* JADX INFO: renamed from: a */
    public final String mo95307a(Uri uri, String str, String str2, String str3) {
        hgf0<String, String> hgf0Var;
        if (uri == null) {
            if (str == null) {
                hgf0Var = null;
            }
            if (hgf0Var == null) {
                return null;
            }
            if (str2 != null) {
                str3 = str2 + str3;
            }
            return hgf0Var.get(str3);
        }
        str = uri.toString();
        hgf0<String, hgf0<String, String>> hgf0Var2 = this.f67964a;
        if (hgf0Var2 == null) {
            hgf0Var = null;
        } else {
            hgf0Var = hgf0Var2.get(str);
        }
        if (hgf0Var == null) {
            return null;
        }
        if (str2 != null) {
            str3 = str2 + str3;
        }
        return hgf0Var.get(str3);
    }
}
