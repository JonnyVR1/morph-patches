package p153l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class qkt0 {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static iit0 m176969a(Context context, String str) {
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
        return new iit0(strConcat, str2);
    }

    /* JADX INFO: renamed from: b */
    public static void m176970b(Context context, Set set) {
        pjt0 pjt0Var = new pjt0(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            iit0 iit0VarM176969a = m176969a(context, str);
            if (iit0VarM176969a == null) {
                "clearKeys: unable to process key: ".concat(String.valueOf(str));
            } else {
                pjt0Var.m172526d(iit0VarM176969a.f115136a).remove(iit0VarM176969a.f115137b);
            }
        }
        pjt0Var.m172524b();
    }
}
