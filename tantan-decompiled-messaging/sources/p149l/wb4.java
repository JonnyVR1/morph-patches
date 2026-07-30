package p149l;

import android.content.Context;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class wb4 {

    /* JADX INFO: renamed from: a */
    private static List<tif0> f185550a;

    /* JADX INFO: renamed from: a */
    private static boolean m202505a() {
        List<tif0> list = f185550a;
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static List<tif0> m202506b(Context context) {
        if (m202505a()) {
            return f185550a;
        }
        List<tif0> listM106797N = cgw.m106797N(context, 3);
        f185550a = listM106797N;
        m202509e(listM106797N);
        return f185550a;
    }

    /* JADX INFO: renamed from: c */
    public static String m202507c(List<tif0> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            tif0 tif0Var = list.get(i);
            if (tif0Var != null) {
                sb.append(tif0Var.m189184b());
                sb.append(BaseSei.f13930X);
                sb.append(tif0Var.m189183a());
                sb.append(SignParameters.NEW_LINE);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    private static boolean m202508d(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: e */
    private static void m202509e(List<tif0> list) {
        m202508d(m202507c(list));
    }

    /* JADX INFO: renamed from: f */
    public static tif0 m202510f(Context context, tif0 tif0Var, int i, float f) {
        return u84.m192185f(m202506b(context), tif0Var, i, f);
    }
}
