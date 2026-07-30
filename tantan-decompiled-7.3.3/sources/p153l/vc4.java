package p153l;

import android.content.Context;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class vc4 {

    /* JADX INFO: renamed from: a */
    private static List<crf0> f183318a;

    /* JADX INFO: renamed from: a */
    private static boolean m200757a() {
        List<crf0> list = f183318a;
        return (list == null || list.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static List<crf0> m200758b(Context context) {
        if (m200757a()) {
            return f183318a;
        }
        List<crf0> listM98168N = aiw.m98168N(context, 3);
        f183318a = listM98168N;
        m200761e(listM98168N);
        return f183318a;
    }

    /* JADX INFO: renamed from: c */
    public static String m200759c(List<crf0> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            crf0 crf0Var = list.get(i);
            if (crf0Var != null) {
                sb.append(crf0Var.m112050b());
                sb.append(BaseSei.f14624X);
                sb.append(crf0Var.m112049a());
                sb.append(SignParameters.NEW_LINE);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    private static boolean m200760d(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: e */
    private static void m200761e(List<crf0> list) {
        m200760d(m200759c(list));
    }

    /* JADX INFO: renamed from: f */
    public static crf0 m200762f(Context context, crf0 crf0Var, int i, float f) {
        return t94.m189733f(m200758b(context), crf0Var, i, f);
    }
}
