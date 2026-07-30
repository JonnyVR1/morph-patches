package p153l;

import android.view.View;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;

/* JADX INFO: loaded from: classes4.dex */
public class cqa0 {
    /* JADX INFO: renamed from: a */
    public static void m111886a(View view) {
        if (bnl0.m105592y0() <= 720.0f) {
            bnl0.m105540X(view, 0);
            bnl0.m105537U(view, qa00.m175859d(8.0f));
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m111887b(String str) {
        if (str.matches("[ ]+")) {
            gta.m132210e().m132214d().mo34786Xj(OMSTemplateModeType.space);
            return true;
        }
        if (str.matches("\\d+")) {
            gta.m132210e().m132214d().mo34786Xj("number");
            return true;
        }
        if (str.matches("[\\p{P}+`]+")) {
            gta.m132210e().m132214d().mo34786Xj("symbol");
            return true;
        }
        if (!str.matches("[\\p{P}\\d+`]+")) {
            return false;
        }
        gta.m132210e().m132214d().mo34786Xj("number_symbol");
        return true;
    }
}
