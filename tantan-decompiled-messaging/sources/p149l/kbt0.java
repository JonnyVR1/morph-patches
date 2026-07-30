package p149l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class kbt0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static c9t0 m145322a(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length == 1) {
            String strValueOf = String.valueOf(context.getPackageName());
            str2 = strArrSplit[0];
            strConcat = strValueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            strConcat = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (TextUtils.isEmpty(strConcat) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new c9t0(strConcat, str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m145323b(Context context, Set set) {
        jat0 jat0Var = new jat0(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            c9t0 c9t0VarM145322a = m145322a(context, str);
            if (c9t0VarM145322a == null) {
                "clearKeys: unable to process key: ".concat(String.valueOf(str));
            } else {
                jat0Var.m140713d(c9t0VarM145322a.f79969a).remove(c9t0VarM145322a.f79970b);
            }
        }
        jat0Var.m140711b();
    }
}
