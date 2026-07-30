package p149l;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes6.dex */
public final class rhx0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("PhenotypeConstants.class")
    public static final e01<String, Uri> f159499a = new e01<>();

    /* JADX INFO: renamed from: a */
    public static synchronized Uri m179466a(String str) {
        Uri uri;
        e01<String, Uri> e01Var = f159499a;
        uri = e01Var.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            e01Var.put(str, uri);
        }
        return uri;
    }

    /* JADX INFO: renamed from: b */
    public static String m179467b(Context context, String str) {
        if (str.contains("#")) {
            ig3.m135964a("The passed in package cannot already have a subpackage: ".concat(str));
            return null;
        }
        return str + "#" + context.getPackageName();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m179468c(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
